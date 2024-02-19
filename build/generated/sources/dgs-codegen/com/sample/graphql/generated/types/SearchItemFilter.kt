package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class SearchItemFilter(
  @JsonProperty("keyword")
  public val keyword: String,
) {
  public companion object
}
