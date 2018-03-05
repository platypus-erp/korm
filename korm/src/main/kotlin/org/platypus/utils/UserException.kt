package org.platypus.utils

import org.platypus.PlatypusEnvironment

sealed class PlatypusException(message: String, env: PlatypusEnvironment, cause: Throwable? = null) : RuntimeException(message, cause) {

}

class EntityNotFoundById(id: Int, modelName: String) : RuntimeException("$modelName with id=$id not found")
class EntityNotFoundByRef(ref: String, modelName: String) : RuntimeException("$modelName with reference=$ref not found")
class EntityPartialyLoaded : RuntimeException()
class UnautorizedAction(env: PlatypusEnvironment) : PlatypusException("You can't execute this action", env)

class UserError(msg: String) : RuntimeException(msg)