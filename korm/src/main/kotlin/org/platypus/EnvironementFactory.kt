package org.platypus

import org.platypus.PlatypusEnvironment
import org.platypus.ReadOnlyPlatypusEnvironment
import org.platypus.context.PlatypusContext
import org.platypus.module.base.entities.User

interface EnvironementFactory {

    fun newEnv(user:User? = null, ctx: PlatypusContext? = null): PlatypusEnvironment

    fun newReadOnlyEnv(user:User? = null, ctx: PlatypusContext? = null): ReadOnlyPlatypusEnvironment

    fun newFakeEnv(user:User? = null, ctx: PlatypusContext? = null): PlatypusEnvironment
}