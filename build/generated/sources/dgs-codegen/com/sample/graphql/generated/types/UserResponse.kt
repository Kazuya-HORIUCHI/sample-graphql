package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty

public data class UserResponse(
  @JsonProperty("user")
  public val user: User? = null,
  @JsonProperty("authToken")
  public val authToken: UserAuthToken? = null,
) {
  public companion object
}
