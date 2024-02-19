package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * A large mass, planet or planetoid in the Star Wars Universe, at the time of
 * 0 ABY.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Planet(
  /**
   * The name of this planet.
   */
  @JsonProperty("name")
  public val name: String? = null,
  /**
   * The diameter of this planet in kilometers.
   */
  @JsonProperty("diameter")
  public val diameter: Int? = null,
  /**
   * The number of standard hours it takes for this planet to complete a single
   * rotation on its axis.
   */
  @JsonProperty("rotationPeriod")
  public val rotationPeriod: Int? = null,
  /**
   * The number of standard days it takes for this planet to complete a single orbit
   * of its local star.
   */
  @JsonProperty("orbitalPeriod")
  public val orbitalPeriod: Int? = null,
  /**
   * A number denoting the gravity of this planet, where "1" is normal or 1 standard
   * G. "2" is twice or 2 standard Gs. "0.5" is half or 0.5 standard Gs.
   */
  @JsonProperty("gravity")
  public val gravity: String? = null,
  /**
   * The average population of sentient beings inhabiting this planet.
   */
  @JsonProperty("population")
  public val population: Double? = null,
  /**
   * The climates of this planet.
   */
  @JsonProperty("climates")
  public val climates: List<String?>? = null,
  /**
   * The terrains of this planet.
   */
  @JsonProperty("terrains")
  public val terrains: List<String?>? = null,
  /**
   * The percentage of the planet surface that is naturally occurring water or bodies
   * of water.
   */
  @JsonProperty("surfaceWater")
  public val surfaceWater: Double? = null,
  @JsonProperty("residentConnection")
  public val residentConnection: PlanetResidentsConnection? = null,
  @JsonProperty("filmConnection")
  public val filmConnection: PlanetFilmsConnection? = null,
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
