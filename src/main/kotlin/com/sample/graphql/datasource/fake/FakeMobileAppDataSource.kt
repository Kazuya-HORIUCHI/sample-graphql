package com.sample.graphql.datasource.fake

import com.sample.graphql.common.faker
import com.sample.graphql.generated.types.Address
import com.sample.graphql.generated.types.Author
import com.sample.graphql.generated.types.MobileApp
import com.sample.graphql.generated.types.MobileAppCategory
import java.net.URL
import java.time.LocalDate
import java.util.*
import java.util.concurrent.ThreadLocalRandom

class FakeMobileAppDataSource {
    companion object {
        val MOBILE_APP_LIST = (1..20).map {
            val addresses = (0 until ThreadLocalRandom.current().nextInt(1, 3)).map {
                Address(
                    country = faker.address().country(),
                    city = faker.address().cityName(),
                    street = faker.address().streetAddress(),
                    zipCode = faker.address().zipCode()
                )
            }
            val author = Author(
                addresses = addresses,
                name = faker.app().author(),
                originCountry = faker.country().name()
            )
            MobileApp(
                name = faker.app().name(),
                author = author,
                version = faker.app().version(),
                platform = randomMobileAppPlatform(),
                appId = UUID.randomUUID().toString(),
                releaseDate = LocalDate.now().minusDays(faker.random().nextInt(365).toLong()),
                downloaded = faker.number().numberBetween(1, 1_500_000),
                homepage = URL("https://" + faker.internet().url()),
                category = MobileAppCategory.entries[faker.random().nextInt(MobileAppCategory.entries.size)]
            )
        }

        private fun randomMobileAppPlatform(): List<String> {
            return when (ThreadLocalRandom.current().nextInt(10) % 3) {
                0 -> listOf("android")
                1 -> listOf("ios")
                else -> listOf("ios", "android")
            }
        }
    }
}
