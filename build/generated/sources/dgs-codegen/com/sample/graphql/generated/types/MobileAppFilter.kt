package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import java.time.LocalDate
import kotlin.Int
import kotlin.String

public data class MobileAppFilter(
  @JsonProperty("name")
  public val name: String? = null,
  @JsonProperty("version")
  public val version: String? = null,
  @JsonProperty("platform")
  public val platform: String? = null,
  @JsonProperty("author")
  public val author: AuthorFilter? = null,
  @JsonProperty("releasedAfter")
  public val releasedAfter: LocalDate? = null,
  @JsonProperty("minimumDownload")
  public val minimumDownload: Int? = null,
  @JsonProperty("category")
  public val category: MobileAppCategory? = null,
) {
  public companion object
}
