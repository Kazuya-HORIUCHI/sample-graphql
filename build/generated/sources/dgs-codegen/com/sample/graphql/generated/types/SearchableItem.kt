package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonSubTypes
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import java.time.OffsetDateTime
import kotlin.String

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "__typename",
)
@JsonSubTypes(value = [
  JsonSubTypes.Type(value = Problem::class, name = "Problem"),
  JsonSubTypes.Type(value = Solution::class, name = "Solution")
])
public interface SearchableItem {
  public val id: String

  public val createDateTime: OffsetDateTime

  public val prettyCreateDateTime: String?

  public val content: String

  public val author: User

  public companion object
}
