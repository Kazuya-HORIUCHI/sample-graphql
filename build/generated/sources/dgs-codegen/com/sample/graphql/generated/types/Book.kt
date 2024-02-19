package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class Book(
  @JsonProperty("title")
  public val title: String,
  @JsonProperty("publisher")
  public val publisher: String,
  @JsonProperty("author")
  public val author: Author,
  @JsonProperty("released")
  public val released: ReleaseHistory? = null,
) {
  public companion object
}
