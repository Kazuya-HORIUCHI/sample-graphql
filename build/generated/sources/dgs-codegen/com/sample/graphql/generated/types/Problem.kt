package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.String
import kotlin.collections.List

@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Problem(
  @JsonProperty("id")
  override val id: String,
  @JsonProperty("createDateTime")
  override val createDateTime: OffsetDateTime,
  @JsonProperty("prettyCreateDateTime")
  override val prettyCreateDateTime: String? = null,
  @JsonProperty("title")
  public val title: String,
  @JsonProperty("content")
  override val content: String,
  @JsonProperty("tags")
  public val tags: List<String>,
  @JsonProperty("solutionCount")
  public val solutionCount: Int,
  @JsonProperty("author")
  override val author: User,
  @JsonProperty("solutions")
  public val solutions: List<Solution>? = null,
) : SearchableItem {
  public companion object
}
