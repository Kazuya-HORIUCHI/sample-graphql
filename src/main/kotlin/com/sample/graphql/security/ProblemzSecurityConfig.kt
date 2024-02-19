package com.sample.graphql.security

import com.sample.graphql.datasource.problemz.repository.UserzRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain


@Configuration
@EnableMethodSecurity(securedEnabled = true)
class ProblemzSecurityConfig(
    private val userzRepository: UserzRepository,
) {
    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        val authProvider = ProblemzAuthenticationProvider(userzRepository)

        http.apply(ProblemzHttpConfigurer.newInstance())
        http.authenticationProvider(authProvider)
        http.csrf().disable().authorizeHttpRequests { auth ->
            auth.anyRequest().authenticated()
        }

        return http.build()
    }
}
