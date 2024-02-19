package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * A single film.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Film(
  /**
   * The title of this film.
   */
  @JsonProperty("title")
  public val title: String? = null,
  /**
   * The episode number of this film.
   */
  @JsonProperty("episodeID")
  public val episodeID: Int? = null,
  /**
   * The opening paragraphs at the beginning of this film.
   */
  @JsonProperty("openingCrawl")
  public val openingCrawl: String? = null,
  /**
   * The name of the director of this film.
   */
  @JsonProperty("director")
  public val director: String? = null,
  /**
   * The name(s) of the producer(s) of this film.
   */
  @JsonProperty("producers")
  public val producers: List<String?>? = null,
  /**
   * The ISO 8601 date format of film release at original creator country.
   */
  @JsonProperty("releaseDate")
  public val releaseDate: String? = null,
  @JsonProperty("speciesConnection")
  public val speciesConnection: FilmSpeciesConnection? = null,
  @JsonProperty("starshipConnection")
  public val starshipConnection: FilmStarshipsConnection? = null,
  @JsonProperty("vehicleConnection")
  public val vehicleConnection: FilmVehiclesConnection? = null,
  @JsonProperty("characterConnection")
  public val characterConnection: FilmCharactersConnection? = null,
  @JsonProperty("planetConnection")
  public val planetConnection: FilmPlanetsConnection? = null,
  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  @JsonProperty("created")
  public val created: String? = null,
  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  @JsonProperty("edited")
  public val edited: String? = null,
  /**
   * The ID of an object
   */
  @JsonProperty("id")
  override val id: String,
) : Node {
  public companion object
}
