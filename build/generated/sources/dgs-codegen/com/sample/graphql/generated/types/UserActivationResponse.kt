package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean

public data class UserActivationResponse(
  @JsonProperty("isActive")
  public val isActive: Boolean,
) {
  public companion object
}
