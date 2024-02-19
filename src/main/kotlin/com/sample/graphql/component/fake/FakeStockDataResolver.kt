package com.sample.graphql.component.fake

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsSubscription
import com.sample.graphql.datasource.fake.FaceStockDataSource
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.Stock
import org.reactivestreams.Publisher
import reactor.core.publisher.Flux
import java.time.Duration

@DgsComponent
class FakeStockDataResolver {
    @DgsSubscription(field = DgsConstants.SUBSCRIPTION.RandomStock)
    fun randomStock(): Publisher<Stock> {
        return Flux.interval(Duration.ofSeconds(3)).map { FaceStockDataSource.randomStock() }
    }
}

data class HogeResponse(
    val id: Int,
    val name: String,
    val fuga: Fuga,
)

data class Fuga(
    val title: String,
    val description: String,
)
