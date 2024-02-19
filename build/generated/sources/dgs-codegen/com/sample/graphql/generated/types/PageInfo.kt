package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean
import kotlin.String

/**
 * Information about pagination in a connection.
 */
public data class PageInfo(
  /**
   * When paginating forwards, are there more items?
   */
  @JsonProperty("hasNextPage")
  public val hasNextPage: Boolean,
  /**
   * When paginating backwards, are there more items?
   */
  @JsonProperty("hasPreviousPage")
  public val hasPreviousPage: Boolean,
  /**
   * When paginating backwards, the cursor to continue.
   */
  @JsonProperty("startCursor")
  public val startCursor: String? = null,
  /**
   * When paginating forwards, the cursor to continue.
   */
  @JsonProperty("endCursor")
  public val endCursor: String? = null,
) {
  public companion object
}
