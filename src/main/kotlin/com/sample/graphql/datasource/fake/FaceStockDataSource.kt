package com.sample.graphql.datasource.fake

import com.sample.graphql.common.faker
import com.sample.graphql.generated.types.Stock
import java.time.OffsetDateTime


class FaceStockDataSource {
    companion object {
        fun randomStock(): Stock {
            return Stock(
                lastTradeDateTime = OffsetDateTime.now(),
                price = faker.random().nextInt(100, 1000),
                symbol = faker.stock().nyseSymbol(),
            )
        }
    }
}
