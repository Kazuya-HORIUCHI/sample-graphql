package com.sample.graphql.generated.types

import com.fasterxml.jackson.`annotation`.JsonProperty
import com.fasterxml.jackson.`annotation`.JsonTypeInfo
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * A single transport craft that does not have hyperdrive capability
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public data class Vehicle(
  /**
   * The name of this vehicle. The common name, such as "Sand Crawler" or "Speeder
   * bike".
   */
  @JsonProperty("name")
  public val name: String? = null,
  /**
   * The model or official name of this vehicle. Such as "All-Terrain Attack
   * Transport".
   */
  @JsonProperty("model")
  public val model: String? = null,
  /**
   * The class of this vehicle, such as "Wheeled" or "Repulsorcraft".
   */
  @JsonProperty("vehicleClass")
  public val vehicleClass: String? = null,
  /**
   * The manufacturers of this vehicle.
   */
  @JsonProperty("manufacturers")
  public val manufacturers: List<String?>? = null,
  /**
   * The cost of this vehicle new, in Galactic Credits.
   */
  @JsonProperty("costInCredits")
  public val costInCredits: Double? = null,
  /**
   * The length of this vehicle in meters.
   */
  @JsonProperty("length")
  public val length: Double? = null,
  /**
   * The number of personnel needed to run or pilot this vehicle.
   */
  @JsonProperty("crew")
  public val crew: String? = null,
  /**
   * The number of non-essential people this vehicle can transport.
   */
  @JsonProperty("passengers")
  public val passengers: String? = null,
  /**
   * The maximum speed of this vehicle in atmosphere.
   */
  @JsonProperty("maxAtmospheringSpeed")
  public val maxAtmospheringSpeed: Int? = null,
  /**
   * The maximum number of kilograms that this vehicle can transport.
   */
  @JsonProperty("cargoCapacity")
  public val cargoCapacity: Double? = null,
  /**
   * The maximum length of time that this vehicle can provide consumables for its
   * entire crew without having to resupply.
   */
  @JsonProperty("consumables")
  public val consumables: String? = null,
  @JsonProperty("pilotConnection")
  public val pilotConnection: VehiclePilotsConnection? = null,
  @JsonProperty("filmConnection")
  public val filmConnection: VehicleFilmsConnection? = null,
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
