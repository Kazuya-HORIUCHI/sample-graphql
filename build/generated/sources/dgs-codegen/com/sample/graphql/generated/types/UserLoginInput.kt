package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class UserLoginInput(
  @JsonProperty("username")
  public val username: String,
  @JsonProperty("password")
  public val password: String,
) {
  public companion object
}
