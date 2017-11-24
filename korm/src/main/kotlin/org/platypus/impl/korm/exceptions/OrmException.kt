package org.platypus.impl.korm.exceptions

import org.platypus.api.env.PlatypusEnvironement


abstract class OrmException(message: String, env: PlatypusEnvironement, cause: Throwable? = null) : RuntimeException(message, cause)

