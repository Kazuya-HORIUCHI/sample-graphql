package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

/**
 * An edge in a connection.
 */
public data class PersonStarshipsEdge(
  /**
   * The item at the end of the edge
   */
  @JsonProperty("node")
  public val node: Starship? = null,
  /**
   * A cursor for use in pagination
   */
  @JsonProperty("cursor")
  public val cursor: String,
) {
  public companion object
}
