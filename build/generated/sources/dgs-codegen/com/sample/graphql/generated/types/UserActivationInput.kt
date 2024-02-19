package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean
import kotlin.String

public data class UserActivationInput(
  @JsonProperty("username")
  public val username: String,
  @JsonProperty("active")
  public val active: Boolean,
) {
  public companion object
}
