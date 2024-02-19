package com.sample.graphql.util

import org.bouncycastle.crypto.generators.OpenBSDBCrypt
import java.nio.charset.StandardCharsets

class HashUtil {
    companion object {
        fun isBcryptMatch(original: String, hashValue: String): Boolean {
            return OpenBSDBCrypt.checkPassword(hashValue, original.toByteArray())
        }

        fun hashBcrypt(org: String) = OpenBSDBCrypt.generate(
            org.toByteArray(StandardCharsets.UTF_8),
            BCRYPT_SALT.toByteArray(StandardCharsets.UTF_8),
            5
        )

        private const val BCRYPT_SALT = "dontDoThisOnProd"
    }
}
