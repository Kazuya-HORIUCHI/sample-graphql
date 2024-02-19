package com.sample.graphql.exception

import com.netflix.graphql.types.errors.ErrorDetail

// TODO これ整えたい
abstract class MyGraphQLException(errorDetail: ErrorDetail) : Exception()
