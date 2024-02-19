package com.sample.graphql.component.fake

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import com.sample.graphql.common.getInputParams
import com.sample.graphql.datasource.fake.FakeBookDataSource
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.Book
import com.sample.graphql.generated.types.ReleaseHistory
import com.sample.graphql.generated.types.ReleaseHistoryInput

@DgsComponent
class FakeBookDataResolver {
    @DgsQuery(field = DgsConstants.QUERY.Books)
    fun booksWrittenBy(@InputArgument("author") authorName: String?): List<Book> {
        if (authorName.isNullOrBlank()) {
            return FakeBookDataSource.BOOK_LIST
        }
        return FakeBookDataSource.BOOK_LIST.filter { it.author.name.contains(authorName, true) }
    }

    @DgsQuery(field = DgsConstants.QUERY.BooksByReleased)
    fun getBooksByReleased(dataFetchingEnvironment: DgsDataFetchingEnvironment): List<Book> {
        val input =
            dataFetchingEnvironment.getInputParams<ReleaseHistoryInput>(DgsConstants.QUERY.BOOKSBYRELEASED_INPUT_ARGUMENT.ReleasedInput)
        return FakeBookDataSource.BOOK_LIST.filter { matchReleaseHistory(input, it.released) }
    }

    private fun matchReleaseHistory(input: ReleaseHistoryInput, element: ReleaseHistory?): Boolean {
        if (element == null) {
            return input.printedEdition == null && input.year == null
        }
        return input.printedEdition == element.printedEdition && input.year == element.year
    }
}
