package com.sample.graphql.security

import com.sample.graphql.datasource.problemz.entity.Userz
import com.sample.graphql.datasource.problemz.repository.UserzRepository
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import java.time.LocalDateTime
import java.util.*


class ProblemzAuthenticationProvider(
    private val userzRepository: UserzRepository,
) : AuthenticationProvider {
    override fun authenticate(auth: Authentication): Authentication {
        val user = userzRepository.findUserByToken(auth.credentials.toString())
            ?: Userz(
                id = UUID.randomUUID(),
                username = "",
                email = "",
                hashedPassword = "",
                avatar = null,
                creationTimestamp = LocalDateTime.MIN,
                displayName = null,
                active = false,
                userRole = "",
            )

        return UsernamePasswordAuthenticationToken(
            user,
            auth.credentials.toString(),
            getAuthorities(user.userRole)
        )
    }

    override fun supports(authentication: Class<*>): Boolean {
        return authentication == UsernamePasswordAuthenticationToken::class.java
    }

    private fun getAuthorities(userRole: String): Collection<GrantedAuthority> {
        val authorities = ArrayList<GrantedAuthority>()

        if (userRole.isNotEmpty()) {
            authorities.add(SimpleGrantedAuthority(userRole))
        }

        return authorities
    }
}
