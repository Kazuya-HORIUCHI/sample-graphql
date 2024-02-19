package com.sample.graphql.service.query

import com.sample.graphql.datasource.problemz.repository.SolutionzRepository
import org.springframework.stereotype.Service

@Service
class SolutionQueryService(
    private val repository: SolutionzRepository,
) {
    fun solutionzByKeyword(keyword: String) = repository.findByKeyword("%$keyword")
}
