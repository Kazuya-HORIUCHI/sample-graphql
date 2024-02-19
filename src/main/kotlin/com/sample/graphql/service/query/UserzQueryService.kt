package com.sample.graphql.service.query

import com.sample.graphql.datasource.problemz.repository.UserzRepository
import org.springframework.stereotype.Service

@Service
class UserzQueryService(
    private val userzRepository: UserzRepository,
) {
    fun findUserzByAuthToken(authToken: String) = userzRepository.findUserByToken(authToken)
}
