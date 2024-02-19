package com.sample.graphql.security

import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter


class ProblemzHttpConfigurer : AbstractHttpConfigurer<ProblemzHttpConfigurer, HttpSecurity>() {
    override fun configure(http: HttpSecurity) {
        val authenticationManager = http.getSharedObject(AuthenticationManager::class.java)
        http.addFilterBefore(
            ProblemzSecurityFilter(authenticationManager),
            UsernamePasswordAuthenticationFilter::class.java
        )
    }

    companion object {
        @JvmStatic
        fun newInstance(): ProblemzHttpConfigurer {
            return ProblemzHttpConfigurer()
        }
    }
}
