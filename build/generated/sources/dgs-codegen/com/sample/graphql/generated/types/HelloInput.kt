package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Int
import kotlin.String

public data class HelloInput(
  @JsonProperty("text")
  public val text: String,
  @JsonProperty("number")
  public val number: Int,
) {
  public companion object
}
