package com.sample.graphql.component.fake

import com.netflix.graphql.dgs.DgsQueryExecutor
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.client.BooksByReleasedGraphQLQuery
import com.sample.graphql.generated.client.BooksGraphQLQuery
import com.sample.graphql.generated.client.BooksProjectionRoot
import com.sample.graphql.generated.types.ReleaseHistoryInput
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import net.datafaker.Faker
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FakeBookDataResolverTest(
    private val dgsQueryExecutor: DgsQueryExecutor,
    private val faker: Faker,
) : FunSpec({
    context(DgsConstants.QUERY.Books) {
        test("basic test") {
            val query = GraphQLQueryRequest(
                BooksGraphQLQuery.Builder().author("").build(),
                BooksProjectionRoot<Nothing, Nothing>()
                    .title()
                    .author().name().originCountry()
                    .root.released().year()
            ).serialize()
            val result = dgsQueryExecutor.executeAndExtractJsonPath<List<Map<String, Any>>>(query, "data.books")

            result.any { (it["title"] as String).isEmpty() } shouldBe false
        }
    }

    context(DgsConstants.QUERY.BooksByReleased) {
        test("with input") {
            val expectedYear = faker.number().numberBetween(2019, 2021);
            val expectedPrintedEdition = faker.bool().bool()

            val releaseHistoryInput = ReleaseHistoryInput(expectedYear, expectedPrintedEdition)
            val query = GraphQLQueryRequest(
                BooksByReleasedGraphQLQuery.Builder()
                    .releasedInput(ReleaseHistoryInput(expectedYear, expectedPrintedEdition))
                    .build(),
                BooksProjectionRoot<Nothing, Nothing>()
                    .released().year().printedEdition()
            ).serialize()
            val result =
                dgsQueryExecutor.executeAndExtractJsonPath<List<Int>>(query, "data.booksByReleased[*].released.year")
            result.any { it < 2019 || 2022 < it } shouldBe false
        }
    }
})
