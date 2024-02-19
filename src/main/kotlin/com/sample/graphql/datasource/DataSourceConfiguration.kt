package com.sample.graphql.datasource

import net.datafaker.Faker
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DataSourceConfiguration {
    @Bean
    fun fake(): Faker = Faker()
}
