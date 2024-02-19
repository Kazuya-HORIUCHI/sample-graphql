package com.sample.graphql.component.problemz

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsMutation
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException
import com.sample.graphql.exception.ProblemzAuthenticationException
import com.sample.graphql.exception.ProblemzPermissionException
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.User
import com.sample.graphql.generated.types.UserActivationInput
import com.sample.graphql.generated.types.UserActivationResponse
import com.sample.graphql.generated.types.UserCreateInput
import com.sample.graphql.generated.types.UserLoginInput
import com.sample.graphql.generated.types.UserResponse
import com.sample.graphql.service.command.UserzCommandService
import com.sample.graphql.service.query.UserzQueryService
import com.sample.graphql.util.mapToGraphql
import com.sample.graphql.util.mapToUserz
import mu.KotlinLogging
import org.springframework.security.access.annotation.Secured
import org.springframework.web.bind.annotation.RequestHeader

private val log = KotlinLogging.logger { }

@DgsComponent
class UserDataResolver(
    private val userzCommandService: UserzCommandService,
    private val userzQueryService: UserzQueryService,
) {
    @DgsQuery(field = DgsConstants.QUERY.Me)
    fun accountInfo(
        @RequestHeader(name = "authToken", required = true) authToken: String,
    ): User {
        return userzQueryService.findUserzByAuthToken(authToken)?.mapToGraphql() ?: throw DgsEntityNotFoundException()
    }

    @Secured("ROLE_ADMIN")
    @DgsMutation(field = DgsConstants.MUTATION.UserCreate)
    fun createUser(
        @InputArgument(name = "user") input: UserCreateInput,
        @RequestHeader(name = "authToken", required = true) authToken: String,
    ): UserResponse {
//        val userAuth = userzQueryService.findUserzByAuthToken(authToken) ?: throw ProblemzAuthenticationException()
//
//        if (userAuth.userRole != "ROLE_ADMIN") {
//            throw ProblemzPermissionException()
//        }

        val saved = userzCommandService.createUserz(input.mapToUserz())
        return UserResponse(saved.mapToGraphql())
    }

    @DgsMutation(field = DgsConstants.MUTATION.UserLogin)
    fun userLogin(
        @InputArgument(name = "user") input: UserLoginInput,
    ): UserResponse {
        val generatedToken = userzCommandService.login(input.username, input.password)
        val userAuthToken = generatedToken.mapToGraphql()
        val userInfo = accountInfo(userAuthToken.authToken.orEmpty())
        return UserResponse(
            authToken = userAuthToken,
            user = userInfo,
        )
    }

    @Secured("ROLE_ADMIN")
    @DgsMutation(field = DgsConstants.MUTATION.UserActivation)
    fun userActivation(
        @InputArgument(name = "user") input: UserActivationInput,
        @RequestHeader(name = "authToken", required = true) authToken: String,
    ): UserActivationResponse {
//        val userAuth = userzQueryService.findUserzByAuthToken(authToken) ?: throw ProblemzAuthenticationException()
//
//        if (userAuth.userRole != "ROLE_ADMIN") {
//            throw ProblemzPermissionException()
//        }

        val updated = userzCommandService.activateUser(input.username, input.active)
            ?: throw DgsEntityNotFoundException()
        return UserActivationResponse(updated.active)
    }
}
