package com.sample.graphql.util

import com.sample.graphql.datasource.problemz.entity.Problemz
import com.sample.graphql.datasource.problemz.entity.Solutionz
import com.sample.graphql.datasource.problemz.entity.Userz
import com.sample.graphql.datasource.problemz.entity.UserzToken
import com.sample.graphql.generated.types.Problem
import com.sample.graphql.generated.types.Solution
import com.sample.graphql.generated.types.SolutionCategory
import com.sample.graphql.generated.types.User
import com.sample.graphql.generated.types.UserAuthToken
import org.ocpsoft.prettytime.PrettyTime
import java.time.ZoneOffset

val prettyTime = PrettyTime()

// TODO zoneOffset の設定をミスってたのがログで全くわからなかった。
//      あとで原因調査したい。
val zoneOffset = ZoneOffset.ofHours(9)
//val zoneOffset = ZoneOffset.of("Hoge")

fun Userz.mapToGraphql() = User(
    id = id.toString(),
    username = username,
    avatar = avatar,
    createDateTime = creationTimestamp.atOffset(zoneOffset),
    displayName = displayName,
    email = email,
)

fun Problemz.mapToGraphql(): Problem {
    val createDateTime = creationTimestamp.atOffset(zoneOffset)
    return Problem(
        id = id.toString(),
        createDateTime = createDateTime,
        prettyCreateDateTime = prettyTime.format(createDateTime),
        title = title,
        content = content,
        tags = tags.split(",").toList(),
        author = createdBy.mapToGraphql(),
        solutionCount = solutions.size,
        solutions = solutions.map { it.mapToGraphql() },
    )
}

fun Solutionz.mapToGraphql(): Solution {
    val createDateTime = creationTimestamp.atOffset(zoneOffset)
    return Solution(
        id = id.toString(),
        createDateTime = createDateTime,
        prettyCreateDateTime = prettyTime.format(createDateTime),
        content = content,
        category = SolutionCategory.valueOf(category),
        voteAsGoodCount = voteGoodCount,
        voteAsBadCount = voteBadCount,
        author = createdBy.mapToGraphql(),
    )
}

fun UserzToken.mapToGraphql() = UserAuthToken(
    authToken = authToken,
    expiryTime = expiryTimestamp.atOffset(zoneOffset),
)
