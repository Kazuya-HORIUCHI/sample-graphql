package com.sample.graphql.exception.handler

import com.netflix.graphql.dgs.exceptions.DefaultDataFetcherExceptionHandler
import com.netflix.graphql.types.errors.ErrorDetail
import com.netflix.graphql.types.errors.ErrorType
import com.netflix.graphql.types.errors.TypedGraphQLError
import com.sample.graphql.exception.ProblemzAuthenticationException
import com.sample.graphql.exception.ProblemzPermissionException
import com.sample.graphql.exception.detail.ProblemzErrorDetail
import graphql.execution.DataFetcherExceptionHandler
import graphql.execution.DataFetcherExceptionHandlerParameters
import graphql.execution.DataFetcherExceptionHandlerResult
import mu.KotlinLogging
import org.springframework.stereotype.Component
import java.util.concurrent.CompletableFuture

val log = KotlinLogging.logger { }

@Component
class ProblemzGraphqlExceptionHandler : DataFetcherExceptionHandler {
    override fun handleException(handlerParameters: DataFetcherExceptionHandlerParameters): CompletableFuture<DataFetcherExceptionHandlerResult> {
        val e = handlerParameters.exception

        if (e is ProblemzAuthenticationException) {
            return CompletableFuture.completedFuture(handlerParameters.buildGraphQLErrorResult(ProblemzErrorDetail()))
        } else if (e is ProblemzPermissionException) {
            return CompletableFuture.completedFuture(handlerParameters.buildGraphQLErrorResult { ErrorType.PERMISSION_DENIED })
        }

        return defaultHandler.handleException(handlerParameters)
    }

    fun DataFetcherExceptionHandlerParameters.buildGraphQLErrorResult(errorDetail: ErrorDetail): DataFetcherExceptionHandlerResult {
        return DataFetcherExceptionHandlerResult.newResult()
            .error(
                TypedGraphQLError.newBuilder()
                    .message(exception.message)
                    .path(path)
                    // TODO 環境によって type だけにするか detail まで出すかを処理できると良さそう
//                    .errorType(errorType)
                    .errorDetail(errorDetail)
                    .build()
            ).build()
    }

    companion object {
        val defaultHandler = DefaultDataFetcherExceptionHandler()
    }
}
