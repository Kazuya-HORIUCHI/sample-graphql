package com.sample.graphql.component.problemz

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsMutation
import com.netflix.graphql.dgs.DgsSubscription
import com.netflix.graphql.dgs.InputArgument
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException
import com.sample.graphql.exception.ProblemzAuthenticationException
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.Solution
import com.sample.graphql.generated.types.SolutionCreateInput
import com.sample.graphql.generated.types.SolutionResponse
import com.sample.graphql.generated.types.SolutionVoteInput
import com.sample.graphql.service.command.SolutionCommandService
import com.sample.graphql.service.query.ProblemzQueryService
import com.sample.graphql.service.query.UserzQueryService
import com.sample.graphql.util.mapToGraphql
import com.sample.graphql.util.mapToSolutionz
import org.springframework.web.bind.annotation.RequestHeader
import reactor.core.publisher.Flux
import java.util.*

@DgsComponent
class SolutionDataResolver(
    private val userzQueryService: UserzQueryService,
    private val problemzQueryService: ProblemzQueryService,
    private val solutionCommandService: SolutionCommandService,
) {
    @DgsMutation(field = DgsConstants.MUTATION.SolutionCreate)
    fun createSolution(
        @RequestHeader(name = "authToken", required = true) authToken: String,
        @InputArgument(name = "solution") input: SolutionCreateInput,
    ): SolutionResponse {
        val userz = userzQueryService.findUserzByAuthToken(authToken) ?: throw ProblemzAuthenticationException()
        val problemzId = UUID.fromString(input.problemId)
        val problemz = problemzQueryService.problemDetail(problemzId) ?: throw DgsEntityNotFoundException()
        val solutionz = input.mapToSolutionz(userz, problemz)
        val created = solutionCommandService.createSolutionz(solutionz)
        return SolutionResponse(created.mapToGraphql())
    }

    @DgsMutation(field = DgsConstants.MUTATION.SolutionVote)
    fun createSolutionVote(
        @RequestHeader(name = "authToken", required = true) authToken: String,
        @InputArgument(name = "vote") input: SolutionVoteInput,
    ): SolutionResponse {
        userzQueryService.findUserzByAuthToken(authToken) ?: throw ProblemzAuthenticationException()

        val solutionzId = UUID.fromString(input.solutionId)
        val updated = if (input.voteAsGood) {
            solutionCommandService.voteGood(solutionzId)
        } else {
            solutionCommandService.voteBad(solutionzId)
        }

        if (updated == null) {
            throw DgsEntityNotFoundException("Solution ${input.solutionId} not found")
        }

        return SolutionResponse(updated.mapToGraphql())
    }

    @DgsSubscription(field = DgsConstants.SUBSCRIPTION.SolutionVoteChanged)
    fun subscribeSolutionVote(
        @InputArgument(name = "solutionId") solutionId: String,
    ): Flux<Solution> {
        return solutionCommandService.solutionFlux().map { it.mapToGraphql() }
    }
}
