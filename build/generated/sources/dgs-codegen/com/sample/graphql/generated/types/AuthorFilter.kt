package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class AuthorFilter(
  @JsonProperty("name")
  public val name: String? = null,
) {
  public companion object
}
