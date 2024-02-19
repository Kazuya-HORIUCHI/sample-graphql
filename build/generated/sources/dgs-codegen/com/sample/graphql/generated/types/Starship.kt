package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * A single transport craft that has hyperdrive capability.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Starship(
  /**
   * The name of this starship. The common name, such as "Death Star".
   */
  @JsonProperty("name")
  public val name: String? = null,
  /**
   * The model or official name of this starship. Such as "T-65 X-wing" or "DS-1
   * Orbital Battle Station".
   */
  @JsonProperty("model")
  public val model: String? = null,
  /**
   * The class of this starship, such as "Starfighter" or "Deep Space Mobile
   * Battlestation"
   */
  @JsonProperty("starshipClass")
  public val starshipClass: String? = null,
  /**
   * The manufacturers of this starship.
   */
  @JsonProperty("manufacturers")
  public val manufacturers: List<String?>? = null,
  /**
   * The cost of this starship new, in galactic credits.
   */
  @JsonProperty("costInCredits")
  public val costInCredits: Double? = null,
  /**
   * The length of this starship in meters.
   */
  @JsonProperty("length")
  public val length: Double? = null,
  /**
   * The number of personnel needed to run or pilot this starship.
   */
  @JsonProperty("crew")
  public val crew: String? = null,
  /**
   * The number of non-essential people this starship can transport.
   */
  @JsonProperty("passengers")
  public val passengers: String? = null,
  /**
   * The maximum speed of this starship in atmosphere. null if this starship is
   * incapable of atmosphering flight.
   */
  @JsonProperty("maxAtmospheringSpeed")
  public val maxAtmospheringSpeed: Int? = null,
  /**
   * The class of this starships hyperdrive.
   */
  @JsonProperty("hyperdriveRating")
  public val hyperdriveRating: Double? = null,
  /**
   * The Maximum number of Megalights this starship can travel in a standard hour.
   * A "Megalight" is a standard unit of distance and has never been defined before
   * within the Star Wars universe. This figure is only really useful for measuring
   * the difference in speed of starships. We can assume it is similar to AU, the
   * distance between our Sun (Sol) and Earth.
   */
  @JsonProperty("MGLT")
  public val MGLT: Int? = null,
  /**
   * The maximum number of kilograms that this starship can transport.
   */
  @JsonProperty("cargoCapacity")
  public val cargoCapacity: Double? = null,
  /**
   * The maximum length of time that this starship can provide consumables for its
   * entire crew without having to resupply.
   */
  @JsonProperty("consumables")
  public val consumables: String? = null,
  @JsonProperty("pilotConnection")
  public val pilotConnection: StarshipPilotsConnection? = null,
  @JsonProperty("filmConnection")
  public val filmConnection: StarshipFilmsConnection? = null,
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
