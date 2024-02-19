package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.String

@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Solution(
  @JsonProperty("id")
  override val id: String,
  @JsonProperty("createDateTime")
  override val createDateTime: OffsetDateTime,
  @JsonProperty("prettyCreateDateTime")
  override val prettyCreateDateTime: String? = null,
  @JsonProperty("content")
  override val content: String,
  @JsonProperty("category")
  public val category: SolutionCategory,
  @JsonProperty("voteAsGoodCount")
  public val voteAsGoodCount: Int? = null,
  @JsonProperty("voteAsBadCount")
  public val voteAsBadCount: Int? = null,
  @JsonProperty("author")
  override val author: User,
) : SearchableItem {
  public companion object
}
