package com.sample.graphql.service.command

import com.sample.graphql.datasource.problemz.entity.Userz
import com.sample.graphql.datasource.problemz.entity.UserzToken
import com.sample.graphql.datasource.problemz.repository.UserzRepository
import com.sample.graphql.datasource.problemz.repository.UserzTokenRepository
import com.sample.graphql.exception.ProblemzAuthenticationException
import com.sample.graphql.util.HashUtil
import org.apache.commons.lang3.RandomStringUtils
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class UserzCommandService(
    private val userzRepository: UserzRepository,
    private val userzTokenRepository: UserzTokenRepository,
) {
    fun login(username: String, password: String): UserzToken {
        val userzQueryResult = userzRepository.findByUsernameIgnoreCase(username)

        if (userzQueryResult == null || !HashUtil.isBcryptMatch(password, userzQueryResult.hashedPassword)) {
            throw ProblemzAuthenticationException()
        }

        val randomAuthToken = RandomStringUtils.randomAlphanumeric(40)
        return refreshToken(userzQueryResult.id, randomAuthToken)
    }

    fun createUserz(userz: Userz) = userzRepository.save(userz)

    fun activateUser(username: String, isActive: Boolean): Userz? {
        userzRepository.activateUser(username, isActive)
        return userzRepository.findByUsernameIgnoreCase(username)
    }

    private fun refreshToken(userId: UUID, authToken: String): UserzToken {
        val now = LocalDateTime.now()
        return userzTokenRepository.save(
            UserzToken(
                userId = userId,
                authToken = authToken,
                creationTimestamp = now,
                expiryTimestamp = now.plusHours(2),
            )
        )
    }
}
