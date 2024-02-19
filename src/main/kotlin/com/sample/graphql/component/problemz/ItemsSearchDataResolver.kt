package com.sample.graphql.component.problemz

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import com.netflix.graphql.dgs.exceptions.DgsEntityNotFoundException
import com.sample.graphql.generated.DgsConstants
import com.sample.graphql.generated.types.SearchItemFilter
import com.sample.graphql.generated.types.SearchableItem
import com.sample.graphql.service.query.ProblemzQueryService
import com.sample.graphql.service.query.SolutionQueryService
import com.sample.graphql.util.mapToGraphql

@DgsComponent
class ItemsSearchDataResolver(
    private val problemzQueryService: ProblemzQueryService,
    private val solutionQueryService: SolutionQueryService,
) {
    @DgsQuery(field = DgsConstants.QUERY.ItemSearch)
    fun searchItems(
        @InputArgument(name = "filter") filter: SearchItemFilter,
    ): List<SearchableItem> {
        val keyword = filter.keyword
        val problemzByKeyword = problemzQueryService.problemzByKeyword(keyword).map { it.mapToGraphql() }
        val solutionzByKeyword = solutionQueryService.solutionzByKeyword(keyword).map { it.mapToGraphql() }
        val result = listOf(problemzByKeyword, solutionzByKeyword).flatten()
        if (result.isEmpty()) {
            throw DgsEntityNotFoundException("No item with keyword: $keyword")
        }
        return result.sortedBy { it.createDateTime }.reversed()
    }
}
