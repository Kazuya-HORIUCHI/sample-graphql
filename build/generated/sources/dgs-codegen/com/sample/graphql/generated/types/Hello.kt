package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Int
import kotlin.String

public data class Hello(
  @JsonProperty("text")
  public val text: String,
  @JsonProperty("randomNumber")
  public val randomNumber: Int? = null,
) {
  public companion object
}
