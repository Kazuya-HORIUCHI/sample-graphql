package com.sample.graphql.component.problemz

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsMutation
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.DgsSubscription
import com.netflix.graphql.dgs.InputArgument
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException
import com.sample.graphql.exception.ProblemzAuthenticationException
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.Problem
import com.sample.graphql.generated.types.ProblemCreateInput
import com.sample.graphql.generated.types.ProblemResponse
import com.sample.graphql.service.command.ProblemzCommandService
import com.sample.graphql.service.query.ProblemzQueryService
import com.sample.graphql.service.query.UserzQueryService
import com.sample.graphql.util.mapToGraphql
import com.sample.graphql.util.mapToProblemz
import mu.KotlinLogging
import org.springframework.web.bind.annotation.RequestHeader
import reactor.core.publisher.Flux
import java.util.*

private val log = KotlinLogging.logger { }

@DgsComponent
class ProblemDataResolver(
    private val queryService: ProblemzQueryService,
    private val commandService: ProblemzCommandService,
    private val userzQueryService: UserzQueryService,
) {
    @DgsQuery(field = DgsConstants.QUERY.ProblemLatestList)
    fun getProblemLatestList(): List<Problem> {
        return queryService.problemzLatestList().map { it.mapToGraphql() }
    }

    @DgsQuery(field = DgsConstants.QUERY.ProblemDetail)
    fun getProblemDetail(
        @InputArgument(name = "id") id: String
    ): Problem {
        return queryService.problemDetail(UUID.fromString(id))?.mapToGraphql() ?: throw DgsEntityNotFoundException()
    }

    @DgsMutation(field = DgsConstants.MUTATION.ProblemCreate)
    fun createProblem(
        @RequestHeader(name = "authToken", required = true) authToken: String,
        @InputArgument(name = "problem") input: ProblemCreateInput,
    ): ProblemResponse {
        val userz = userzQueryService.findUserzByAuthToken(authToken) ?: throw ProblemzAuthenticationException()
        val problemz = input.mapToProblemz(userz)
        val created = commandService.createProblemz(problemz)
        return ProblemResponse(
            problem = created.mapToGraphql()
        )
    }

    @DgsSubscription(field = DgsConstants.SUBSCRIPTION.ProblemAdded)
    fun subscribeProblemAdded(): Flux<Problem> {
        return commandService.problemzFlux().map { it.mapToGraphql() }
    }
}
