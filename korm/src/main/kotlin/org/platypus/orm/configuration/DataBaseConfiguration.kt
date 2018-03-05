package org.platypus.orm.configuration

import java.sql.Connection

abstract class DataBaseConfiguration(
        override val dialectName: String? = null,
        override val url: String,
        override val driver: String,
        override val user: String = "",
        override val password: String = "",
        override val onOpenConnection: (Connection) -> Unit = {}
) : KormConfiguration

interface KormConfiguration {
    val dialectName: String?
    val url: String
    val driver: String
    val user: String
    val password: String
    val onOpenConnection: (Connection) -> Unit

}