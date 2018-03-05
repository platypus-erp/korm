package org.platypus.orm.exceptions

import org.platypus.PlatypusEnvironment


abstract class OrmException(message: String, env: PlatypusEnvironment, cause: Throwable? = null) : RuntimeException(message, cause)

