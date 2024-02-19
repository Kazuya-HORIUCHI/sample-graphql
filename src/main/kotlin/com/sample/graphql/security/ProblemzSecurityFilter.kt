package com.sample.graphql.security

import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter


class ProblemzSecurityFilter(
    private val authenticationManager: AuthenticationManager,
) : OncePerRequestFilter() {
    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        var authToken = request.getHeader("authToken")

        if (authToken.isEmpty()) {
            authToken = ""
        }

        val authentication = UsernamePasswordAuthenticationToken(null, authToken)

        val authenticated = authenticationManager.authenticate(authentication)
        SecurityContextHolder.getContext().authentication = authenticated

        filterChain.doFilter(request, response)
    }
}
