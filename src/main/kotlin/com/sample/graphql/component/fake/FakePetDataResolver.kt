package com.sample.graphql.component.fake

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import com.sample.graphql.datasource.fake.FakePetDataSource
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.Cat
import com.sample.graphql.generated.types.Dog
import com.sample.graphql.generated.types.Pet
import com.sample.graphql.generated.types.PetFilter

@DgsComponent
class FakePetDataResolver {
    @DgsQuery(field = DgsConstants.QUERY.Pets)
    fun getPets(@InputArgument(name = "petFilter") filter: PetFilter?): List<Pet> {
        if (filter == null) {
            return FakePetDataSource.PET_LIST
        }

        return FakePetDataSource.PET_LIST.filter {
            matchFilter(it, filter)
        }
    }

    private fun matchFilter(pet: Pet, filter: PetFilter): Boolean {
        if (filter.petType.isNullOrEmpty()) {
            return true
        }

        return if (filter.petType.equals(Dog::class.simpleName, true)) {
            pet is Dog
        } else if (filter.petType.equals(Cat::class.simpleName, true)) {
            pet is Cat
        } else {
            false
        }
    }
}
