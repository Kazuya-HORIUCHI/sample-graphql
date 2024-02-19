package com.sample.graphql.exception

class ProblemzPermissionException(m: String = "You are not allowed to access this operation.") : Exception(m)
