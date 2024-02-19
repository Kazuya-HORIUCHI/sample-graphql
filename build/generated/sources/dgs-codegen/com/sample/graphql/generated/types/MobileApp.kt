package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import java.net.URL
import java.time.LocalDate
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class MobileApp(
  @JsonProperty("name")
  public val name: String,
  @JsonProperty("version")
  public val version: String? = null,
  @JsonProperty("platform")
  public val platform: List<String?>? = null,
  @JsonProperty("author")
  public val author: Author? = null,
  @JsonProperty("appId")
  public val appId: String,
  @JsonProperty("releaseDate")
  public val releaseDate: LocalDate? = null,
  @JsonProperty("downloaded")
  public val downloaded: Int,
  @JsonProperty("homepage")
  public val homepage: URL? = null,
  @JsonProperty("category")
  public val category: MobileAppCategory? = null,
) {
  public companion object
}
