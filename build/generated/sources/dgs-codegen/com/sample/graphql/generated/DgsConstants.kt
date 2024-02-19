package com.sample.graphql.generated

import kotlin.String

public object DgsConstants {
  public const val QUERY_TYPE: String = "Query"

  public const val Mutation_TYPE: String = "Mutation"

  public const val Subscription_TYPE: String = "Subscription"

  public object QUERY {
    public const val TYPE_NAME: String = "Query"

    public const val AllHellos: String = "allHellos"

    public const val OneHello: String = "oneHello"

    public const val Books: String = "books"

    public const val BooksByReleased: String = "booksByReleased"

    public const val MobileApps: String = "mobileApps"

    public const val Pets: String = "pets"

    public const val AdditionalOnRequest: String = "additionalOnRequest"

    public const val Me: String = "me"

    public const val ProblemLatestList: String = "problemLatestList"

    public const val ItemSearch: String = "itemSearch"

    public const val ProblemDetail: String = "problemDetail"

    public object BOOKS_INPUT_ARGUMENT {
      public const val Author: String = "author"
    }

    public object BOOKSBYRELEASED_INPUT_ARGUMENT {
      public const val ReleasedInput: String = "releasedInput"
    }

    public object MOBILEAPPS_INPUT_ARGUMENT {
      public const val MobileAppFilter: String = "mobileAppFilter"
    }

    public object PETS_INPUT_ARGUMENT {
      public const val PetFilter: String = "petFilter"
    }

    public object ITEMSEARCH_INPUT_ARGUMENT {
      public const val Filter: String = "filter"
    }

    public object PROBLEMDETAIL_INPUT_ARGUMENT {
      public const val Id: String = "id"
    }
  }

  public object MUTATION {
    public const val TYPE_NAME: String = "Mutation"

    public const val AddHello: String = "addHello"

    public const val ReplaceHelloText: String = "replaceHelloText"

    public const val DeleteHello: String = "deleteHello"

    public const val UserCreate: String = "userCreate"

    public const val UserLogin: String = "userLogin"

    public const val UserActivation: String = "userActivation"

    public const val ProblemCreate: String = "problemCreate"

    public const val SolutionCreate: String = "solutionCreate"

    public const val SolutionVote: String = "solutionVote"

    public object ADDHELLO_INPUT_ARGUMENT {
      public const val HelloInput: String = "helloInput"
    }

    public object REPLACEHELLOTEXT_INPUT_ARGUMENT {
      public const val HelloInput: String = "helloInput"
    }

    public object DELETEHELLO_INPUT_ARGUMENT {
      public const val Number: String = "number"
    }

    public object USERCREATE_INPUT_ARGUMENT {
      public const val User: String = "user"
    }

    public object USERLOGIN_INPUT_ARGUMENT {
      public const val User: String = "user"
    }

    public object USERACTIVATION_INPUT_ARGUMENT {
      public const val User: String = "user"
    }

    public object PROBLEMCREATE_INPUT_ARGUMENT {
      public const val Problem: String = "problem"
    }

    public object SOLUTIONCREATE_INPUT_ARGUMENT {
      public const val Solution: String = "solution"
    }

    public object SOLUTIONVOTE_INPUT_ARGUMENT {
      public const val Vote: String = "vote"
    }
  }

  public object SUBSCRIPTION {
    public const val TYPE_NAME: String = "Subscription"

    public const val RandomStock: String = "randomStock"

    public const val ProblemAdded: String = "problemAdded"

    public const val SolutionVoteChanged: String = "solutionVoteChanged"

    public object SOLUTIONVOTECHANGED_INPUT_ARGUMENT {
      public const val SolutionId: String = "solutionId"
    }
  }

  public object USER {
    public const val TYPE_NAME: String = "User"

    public const val Id: String = "id"

    public const val Username: String = "username"

    public const val Email: String = "email"

    public const val Avatar: String = "avatar"

    public const val CreateDateTime: String = "createDateTime"

    public const val DisplayName: String = "displayName"

    public const val Problems: String = "problems"
  }

  public object PROBLEM {
    public const val TYPE_NAME: String = "Problem"

    public const val Id: String = "id"

    public const val CreateDateTime: String = "createDateTime"

    public const val PrettyCreateDateTime: String = "prettyCreateDateTime"

    public const val Title: String = "title"

    public const val Content: String = "content"

    public const val Tags: String = "tags"

    public const val SolutionCount: String = "solutionCount"

    public const val Author: String = "author"

    public const val Solutions: String = "solutions"
  }

  public object SOLUTION {
    public const val TYPE_NAME: String = "Solution"

    public const val Id: String = "id"

    public const val CreateDateTime: String = "createDateTime"

    public const val PrettyCreateDateTime: String = "prettyCreateDateTime"

    public const val Content: String = "content"

    public const val Category: String = "category"

    public const val VoteAsGoodCount: String = "voteAsGoodCount"

    public const val VoteAsBadCount: String = "voteAsBadCount"

    public const val Author: String = "author"
  }

  public object USERAUTHTOKEN {
    public const val TYPE_NAME: String = "UserAuthToken"

    public const val AuthToken: String = "authToken"

    public const val ExpiryTime: String = "expiryTime"
  }

  public object USERRESPONSE {
    public const val TYPE_NAME: String = "UserResponse"

    public const val User: String = "user"

    public const val AuthToken: String = "authToken"
  }

  public object PROBLEMRESPONSE {
    public const val TYPE_NAME: String = "ProblemResponse"

    public const val Problem: String = "problem"
  }

  public object SOLUTIONRESPONSE {
    public const val TYPE_NAME: String = "SolutionResponse"

    public const val Solution: String = "solution"
  }

  public object USERACTIVATIONRESPONSE {
    public const val TYPE_NAME: String = "UserActivationResponse"

    public const val IsActive: String = "isActive"
  }

  public object MOBILEAPP {
    public const val TYPE_NAME: String = "MobileApp"

    public const val Name: String = "name"

    public const val Version: String = "version"

    public const val Platform: String = "platform"

    public const val Author: String = "author"

    public const val AppId: String = "appId"

    public const val ReleaseDate: String = "releaseDate"

    public const val Downloaded: String = "downloaded"

    public const val Homepage: String = "homepage"

    public const val Category: String = "category"
  }

  public object STOCK {
    public const val TYPE_NAME: String = "Stock"

    public const val Symbol: String = "symbol"

    public const val Price: String = "price"

    public const val LastTradeDateTime: String = "lastTradeDateTime"
  }

  public object HELLO {
    public const val TYPE_NAME: String = "Hello"

    public const val Text: String = "text"

    public const val RandomNumber: String = "randomNumber"
  }

  public object DOG {
    public const val TYPE_NAME: String = "Dog"

    public const val Name: String = "name"

    public const val Food: String = "food"

    public const val Breed: String = "breed"

    public const val Size: String = "size"

    public const val CoatLength: String = "coatLength"
  }

  public object CAT {
    public const val TYPE_NAME: String = "Cat"

    public const val Name: String = "name"

    public const val Food: String = "food"

    public const val Breed: String = "breed"

    public const val Registry: String = "registry"
  }

  public object ADDRESS {
    public const val TYPE_NAME: String = "Address"

    public const val Street: String = "street"

    public const val City: String = "city"

    public const val ZipCode: String = "zipCode"

    public const val Country: String = "country"
  }

  public object AUTHOR {
    public const val TYPE_NAME: String = "Author"

    public const val Name: String = "name"

    public const val OriginCountry: String = "originCountry"

    public const val Addresses: String = "addresses"
  }

  public object RELEASEHISTORY {
    public const val TYPE_NAME: String = "ReleaseHistory"

    public const val Year: String = "year"

    public const val PrintedEdition: String = "printedEdition"

    public const val ReleasedCountry: String = "releasedCountry"
  }

  public object BOOK {
    public const val TYPE_NAME: String = "Book"

    public const val Title: String = "title"

    public const val Publisher: String = "publisher"

    public const val Author: String = "author"

    public const val Released: String = "released"
  }

  public object ROOT {
    public const val TYPE_NAME: String = "Root"

    public const val AllFilms: String = "allFilms"

    public const val Film: String = "film"

    public const val AllPeople: String = "allPeople"

    public const val Person: String = "person"

    public const val AllPlanets: String = "allPlanets"

    public const val Planet: String = "planet"

    public const val AllSpecies: String = "allSpecies"

    public const val Species: String = "species"

    public const val AllStarships: String = "allStarships"

    public const val Starship: String = "starship"

    public const val AllVehicles: String = "allVehicles"

    public const val Vehicle: String = "vehicle"

    public const val Node: String = "node"

    public object ALLFILMS_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object FILM_INPUT_ARGUMENT {
      public const val Id: String = "id"

      public const val FilmID: String = "filmID"
    }

    public object ALLPEOPLE_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object PERSON_INPUT_ARGUMENT {
      public const val Id: String = "id"

      public const val PersonID: String = "personID"
    }

    public object ALLPLANETS_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object PLANET_INPUT_ARGUMENT {
      public const val Id: String = "id"

      public const val PlanetID: String = "planetID"
    }

    public object ALLSPECIES_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object SPECIES_INPUT_ARGUMENT {
      public const val Id: String = "id"

      public const val SpeciesID: String = "speciesID"
    }

    public object ALLSTARSHIPS_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object STARSHIP_INPUT_ARGUMENT {
      public const val Id: String = "id"

      public const val StarshipID: String = "starshipID"
    }

    public object ALLVEHICLES_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object VEHICLE_INPUT_ARGUMENT {
      public const val Id: String = "id"

      public const val VehicleID: String = "vehicleID"
    }

    public object NODE_INPUT_ARGUMENT {
      public const val Id: String = "id"
    }
  }

  public object FILMSCONNECTION {
    public const val TYPE_NAME: String = "FilmsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Films: String = "films"
  }

  public object PAGEINFO {
    public const val TYPE_NAME: String = "PageInfo"

    public const val HasNextPage: String = "hasNextPage"

    public const val HasPreviousPage: String = "hasPreviousPage"

    public const val StartCursor: String = "startCursor"

    public const val EndCursor: String = "endCursor"
  }

  public object FILMSEDGE {
    public const val TYPE_NAME: String = "FilmsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object FILM {
    public const val TYPE_NAME: String = "Film"

    public const val Title: String = "title"

    public const val EpisodeID: String = "episodeID"

    public const val OpeningCrawl: String = "openingCrawl"

    public const val Director: String = "director"

    public const val Producers: String = "producers"

    public const val ReleaseDate: String = "releaseDate"

    public const val SpeciesConnection: String = "speciesConnection"

    public const val StarshipConnection: String = "starshipConnection"

    public const val VehicleConnection: String = "vehicleConnection"

    public const val CharacterConnection: String = "characterConnection"

    public const val PlanetConnection: String = "planetConnection"

    public const val Created: String = "created"

    public const val Edited: String = "edited"

    public const val Id: String = "id"

    public object SPECIESCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object STARSHIPCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object VEHICLECONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object CHARACTERCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object PLANETCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }
  }

  public object FILMSPECIESCONNECTION {
    public const val TYPE_NAME: String = "FilmSpeciesConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Species: String = "species"
  }

  public object FILMSPECIESEDGE {
    public const val TYPE_NAME: String = "FilmSpeciesEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object SPECIES {
    public const val TYPE_NAME: String = "Species"

    public const val Name: String = "name"

    public const val Classification: String = "classification"

    public const val Designation: String = "designation"

    public const val AverageHeight: String = "averageHeight"

    public const val AverageLifespan: String = "averageLifespan"

    public const val EyeColors: String = "eyeColors"

    public const val HairColors: String = "hairColors"

    public const val SkinColors: String = "skinColors"

    public const val Language: String = "language"

    public const val Homeworld: String = "homeworld"

    public const val PersonConnection: String = "personConnection"

    public const val FilmConnection: String = "filmConnection"

    public const val Created: String = "created"

    public const val Edited: String = "edited"

    public const val Id: String = "id"

    public object PERSONCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object FILMCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }
  }

  public object PLANET {
    public const val TYPE_NAME: String = "Planet"

    public const val Name: String = "name"

    public const val Diameter: String = "diameter"

    public const val RotationPeriod: String = "rotationPeriod"

    public const val OrbitalPeriod: String = "orbitalPeriod"

    public const val Gravity: String = "gravity"

    public const val Population: String = "population"

    public const val Climates: String = "climates"

    public const val Terrains: String = "terrains"

    public const val SurfaceWater: String = "surfaceWater"

    public const val ResidentConnection: String = "residentConnection"

    public const val FilmConnection: String = "filmConnection"

    public const val Created: String = "created"

    public const val Edited: String = "edited"

    public const val Id: String = "id"

    public object RESIDENTCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object FILMCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }
  }

  public object PLANETRESIDENTSCONNECTION {
    public const val TYPE_NAME: String = "PlanetResidentsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Residents: String = "residents"
  }

  public object PLANETRESIDENTSEDGE {
    public const val TYPE_NAME: String = "PlanetResidentsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object PERSON {
    public const val TYPE_NAME: String = "Person"

    public const val Name: String = "name"

    public const val BirthYear: String = "birthYear"

    public const val EyeColor: String = "eyeColor"

    public const val Gender: String = "gender"

    public const val HairColor: String = "hairColor"

    public const val Height: String = "height"

    public const val Mass: String = "mass"

    public const val SkinColor: String = "skinColor"

    public const val Homeworld: String = "homeworld"

    public const val FilmConnection: String = "filmConnection"

    public const val Species: String = "species"

    public const val StarshipConnection: String = "starshipConnection"

    public const val VehicleConnection: String = "vehicleConnection"

    public const val Created: String = "created"

    public const val Edited: String = "edited"

    public const val Id: String = "id"

    public object FILMCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object STARSHIPCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object VEHICLECONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }
  }

  public object PERSONFILMSCONNECTION {
    public const val TYPE_NAME: String = "PersonFilmsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Films: String = "films"
  }

  public object PERSONFILMSEDGE {
    public const val TYPE_NAME: String = "PersonFilmsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object PERSONSTARSHIPSCONNECTION {
    public const val TYPE_NAME: String = "PersonStarshipsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Starships: String = "starships"
  }

  public object PERSONSTARSHIPSEDGE {
    public const val TYPE_NAME: String = "PersonStarshipsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object STARSHIP {
    public const val TYPE_NAME: String = "Starship"

    public const val Name: String = "name"

    public const val Model: String = "model"

    public const val StarshipClass: String = "starshipClass"

    public const val Manufacturers: String = "manufacturers"

    public const val CostInCredits: String = "costInCredits"

    public const val Length: String = "length"

    public const val Crew: String = "crew"

    public const val Passengers: String = "passengers"

    public const val MaxAtmospheringSpeed: String = "maxAtmospheringSpeed"

    public const val HyperdriveRating: String = "hyperdriveRating"

    public const val MGLT: String = "MGLT"

    public const val CargoCapacity: String = "cargoCapacity"

    public const val Consumables: String = "consumables"

    public const val PilotConnection: String = "pilotConnection"

    public const val FilmConnection: String = "filmConnection"

    public const val Created: String = "created"

    public const val Edited: String = "edited"

    public const val Id: String = "id"

    public object PILOTCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object FILMCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }
  }

  public object STARSHIPPILOTSCONNECTION {
    public const val TYPE_NAME: String = "StarshipPilotsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Pilots: String = "pilots"
  }

  public object STARSHIPPILOTSEDGE {
    public const val TYPE_NAME: String = "StarshipPilotsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object STARSHIPFILMSCONNECTION {
    public const val TYPE_NAME: String = "StarshipFilmsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Films: String = "films"
  }

  public object STARSHIPFILMSEDGE {
    public const val TYPE_NAME: String = "StarshipFilmsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object PERSONVEHICLESCONNECTION {
    public const val TYPE_NAME: String = "PersonVehiclesConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Vehicles: String = "vehicles"
  }

  public object PERSONVEHICLESEDGE {
    public const val TYPE_NAME: String = "PersonVehiclesEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object VEHICLE {
    public const val TYPE_NAME: String = "Vehicle"

    public const val Name: String = "name"

    public const val Model: String = "model"

    public const val VehicleClass: String = "vehicleClass"

    public const val Manufacturers: String = "manufacturers"

    public const val CostInCredits: String = "costInCredits"

    public const val Length: String = "length"

    public const val Crew: String = "crew"

    public const val Passengers: String = "passengers"

    public const val MaxAtmospheringSpeed: String = "maxAtmospheringSpeed"

    public const val CargoCapacity: String = "cargoCapacity"

    public const val Consumables: String = "consumables"

    public const val PilotConnection: String = "pilotConnection"

    public const val FilmConnection: String = "filmConnection"

    public const val Created: String = "created"

    public const val Edited: String = "edited"

    public const val Id: String = "id"

    public object PILOTCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }

    public object FILMCONNECTION_INPUT_ARGUMENT {
      public const val After: String = "after"

      public const val First: String = "first"

      public const val Before: String = "before"

      public const val Last: String = "last"
    }
  }

  public object VEHICLEPILOTSCONNECTION {
    public const val TYPE_NAME: String = "VehiclePilotsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Pilots: String = "pilots"
  }

  public object VEHICLEPILOTSEDGE {
    public const val TYPE_NAME: String = "VehiclePilotsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object VEHICLEFILMSCONNECTION {
    public const val TYPE_NAME: String = "VehicleFilmsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Films: String = "films"
  }

  public object VEHICLEFILMSEDGE {
    public const val TYPE_NAME: String = "VehicleFilmsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object PLANETFILMSCONNECTION {
    public const val TYPE_NAME: String = "PlanetFilmsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Films: String = "films"
  }

  public object PLANETFILMSEDGE {
    public const val TYPE_NAME: String = "PlanetFilmsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object SPECIESPEOPLECONNECTION {
    public const val TYPE_NAME: String = "SpeciesPeopleConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val People: String = "people"
  }

  public object SPECIESPEOPLEEDGE {
    public const val TYPE_NAME: String = "SpeciesPeopleEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object SPECIESFILMSCONNECTION {
    public const val TYPE_NAME: String = "SpeciesFilmsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Films: String = "films"
  }

  public object SPECIESFILMSEDGE {
    public const val TYPE_NAME: String = "SpeciesFilmsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object FILMSTARSHIPSCONNECTION {
    public const val TYPE_NAME: String = "FilmStarshipsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Starships: String = "starships"
  }

  public object FILMSTARSHIPSEDGE {
    public const val TYPE_NAME: String = "FilmStarshipsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object FILMVEHICLESCONNECTION {
    public const val TYPE_NAME: String = "FilmVehiclesConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Vehicles: String = "vehicles"
  }

  public object FILMVEHICLESEDGE {
    public const val TYPE_NAME: String = "FilmVehiclesEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object FILMCHARACTERSCONNECTION {
    public const val TYPE_NAME: String = "FilmCharactersConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Characters: String = "characters"
  }

  public object FILMCHARACTERSEDGE {
    public const val TYPE_NAME: String = "FilmCharactersEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object FILMPLANETSCONNECTION {
    public const val TYPE_NAME: String = "FilmPlanetsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Planets: String = "planets"
  }

  public object FILMPLANETSEDGE {
    public const val TYPE_NAME: String = "FilmPlanetsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object PEOPLECONNECTION {
    public const val TYPE_NAME: String = "PeopleConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val People: String = "people"
  }

  public object PEOPLEEDGE {
    public const val TYPE_NAME: String = "PeopleEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object PLANETSCONNECTION {
    public const val TYPE_NAME: String = "PlanetsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Planets: String = "planets"
  }

  public object PLANETSEDGE {
    public const val TYPE_NAME: String = "PlanetsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object SPECIESCONNECTION {
    public const val TYPE_NAME: String = "SpeciesConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Species: String = "species"
  }

  public object SPECIESEDGE {
    public const val TYPE_NAME: String = "SpeciesEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object STARSHIPSCONNECTION {
    public const val TYPE_NAME: String = "StarshipsConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Starships: String = "starships"
  }

  public object STARSHIPSEDGE {
    public const val TYPE_NAME: String = "StarshipsEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object VEHICLESCONNECTION {
    public const val TYPE_NAME: String = "VehiclesConnection"

    public const val PageInfo: String = "pageInfo"

    public const val Edges: String = "edges"

    public const val TotalCount: String = "totalCount"

    public const val Vehicles: String = "vehicles"
  }

  public object VEHICLESEDGE {
    public const val TYPE_NAME: String = "VehiclesEdge"

    public const val Node: String = "node"

    public const val Cursor: String = "cursor"
  }

  public object SEARCHITEMFILTER {
    public const val TYPE_NAME: String = "SearchItemFilter"

    public const val Keyword: String = "keyword"
  }

  public object USERCREATEINPUT {
    public const val TYPE_NAME: String = "UserCreateInput"

    public const val Username: String = "username"

    public const val Email: String = "email"

    public const val Password: String = "password"

    public const val DisplayName: String = "displayName"

    public const val Avatar: String = "avatar"
  }

  public object USERLOGININPUT {
    public const val TYPE_NAME: String = "UserLoginInput"

    public const val Username: String = "username"

    public const val Password: String = "password"
  }

  public object USERACTIVATIONINPUT {
    public const val TYPE_NAME: String = "UserActivationInput"

    public const val Username: String = "username"

    public const val Active: String = "active"
  }

  public object PROBLEMCREATEINPUT {
    public const val TYPE_NAME: String = "ProblemCreateInput"

    public const val Title: String = "title"

    public const val Content: String = "content"

    public const val Tags: String = "tags"
  }

  public object SOLUTIONCREATEINPUT {
    public const val TYPE_NAME: String = "SolutionCreateInput"

    public const val Content: String = "content"

    public const val Category: String = "category"

    public const val ProblemId: String = "problemId"
  }

  public object SOLUTIONVOTEINPUT {
    public const val TYPE_NAME: String = "SolutionVoteInput"

    public const val SolutionId: String = "solutionId"

    public const val VoteAsGood: String = "voteAsGood"
  }

  public object MOBILEAPPFILTER {
    public const val TYPE_NAME: String = "MobileAppFilter"

    public const val Name: String = "name"

    public const val Version: String = "version"

    public const val Platform: String = "platform"

    public const val Author: String = "author"

    public const val ReleasedAfter: String = "releasedAfter"

    public const val MinimumDownload: String = "minimumDownload"

    public const val Category: String = "category"
  }

  public object AUTHORFILTER {
    public const val TYPE_NAME: String = "AuthorFilter"

    public const val Name: String = "name"
  }

  public object HELLOINPUT {
    public const val TYPE_NAME: String = "HelloInput"

    public const val Text: String = "text"

    public const val Number: String = "number"
  }

  public object PETFILTER {
    public const val TYPE_NAME: String = "PetFilter"

    public const val PetType: String = "petType"
  }

  public object RELEASEHISTORYINPUT {
    public const val TYPE_NAME: String = "ReleaseHistoryInput"

    public const val Year: String = "year"

    public const val PrintedEdition: String = "printedEdition"
  }

  public object SEARCHABLEITEM {
    public const val TYPE_NAME: String = "SearchableItem"

    public const val Id: String = "id"

    public const val CreateDateTime: String = "createDateTime"

    public const val PrettyCreateDateTime: String = "prettyCreateDateTime"

    public const val Content: String = "content"

    public const val Author: String = "author"
  }

  public object PET {
    public const val TYPE_NAME: String = "Pet"

    public const val Name: String = "name"

    public const val Food: String = "food"

    public const val Breed: String = "breed"
  }

  public object NODE {
    public const val TYPE_NAME: String = "Node"

    public const val Id: String = "id"
  }
}
