package org.platypus

import org.platypus.api.env.PlatypusEnvironement

sealed class PlatypusException(message: String, env: PlatypusEnvironement, cause: Throwable? = null) : RuntimeException(message, cause) {

}

class EntityNotFoundById(id: Long, modelName: String) : RuntimeException("$modelName with id=$id not found")
class EntityNotFoundByRef(ref: String, modelName: String) : RuntimeException("$modelName with reference=$ref not found")
class EntityPartialyLoaded : RuntimeException()
class UnautorizedAction(env: PlatypusEnvironement) : PlatypusException("You can't execute this action", env)

class UserError(msg: String) : RuntimeException(msg)