package com.sample.graphql.datasource.problemz.repository

import com.sample.graphql.datasource.problemz.entity.Userz
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserzRepository : CrudRepository<Userz, UUID> {
    fun findByUsernameIgnoreCase(username: String): Userz?

    @Query(
        nativeQuery = true,
        value = """
            select u.*
            from userz u inner join userz_token ut
            on u.id = ut.user_id
            where ut.auth_token = ?
              and ut.expiry_timestamp > current_timestamp
        """
    )
    fun findUserByToken(authToken: String): Userz?

    @Transactional
    @Modifying
    @Query(
        nativeQuery = true,
        value = "update userz set active = :isActive where upper(username) = upper(:username)"
    )
    fun activateUser(
        @Param("username") username: String,
        @Param("isActive") isActive: Boolean
    )
}
