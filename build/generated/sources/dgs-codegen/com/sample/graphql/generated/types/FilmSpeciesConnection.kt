package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Int
import kotlin.collections.List

/**
 * A connection to a list of items.
 */
public data class FilmSpeciesConnection(
  /**
   * Information to aid in pagination.
   */
  @JsonProperty("pageInfo")
  public val pageInfo: PageInfo,
  /**
   * A list of edges.
   */
  @JsonProperty("edges")
  public val edges: List<FilmSpeciesEdge?>? = null,
  /**
   * A count of the total number of objects in this connection, ignoring pagination.
   * This allows a client to fetch the first five objects by passing "5" as the
   * argument to "first", then fetch the total count so it could display "5 of 83",
   * for example.
   */
  @JsonProperty("totalCount")
  public val totalCount: Int? = null,
  /**
   * A list of all of the objects returned in the connection. This is a convenience
   * field provided for quickly exploring the API; rather than querying for
   * "{ edges { node } }" when no edge data is needed, this field can be be used
   * instead. Note that when clients like Relay need to fetch the "cursor" field on
   * the edge to enable efficient pagination, this shortcut cannot be used, and the
   * full "{ edges { node } }" version should be used instead.
   */
  @JsonProperty("species")
  public val species: List<Species?>? = null,
) {
  public companion object
}
