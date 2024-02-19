package com.sample.graphql.exception.detail

import com.netflix.graphql.types.errors.ErrorDetail
import com.netflix.graphql.types.errors.ErrorType

class ProblemzErrorDetail : ErrorDetail {
    override fun getErrorType(): ErrorType {
        return ErrorType.UNAUTHENTICATED
    }

    override fun toString(): String {
        return "User validation failed. Check that user name & password combination match (both are case sensitive)."
    }
}
