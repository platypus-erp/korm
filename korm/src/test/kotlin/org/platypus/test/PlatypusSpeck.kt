package org.platypus.test

import org.platypus.v2.env.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.module.ModuleBuilder
import org.platypus.newTest
import org.platypus.security.PlatypusUser
import org.platypus.security.ROOT_USER

/**
 * Calls the specified function [block] with the given [receiver] as its receiver and returns its result.
 */
public inline fun <R> ModuleBuilder.inNewTestEnvironement(user: PlatypusUser = ROOT_USER, block: PlatypusEnvironment.() -> R): R {
    return with(Platypus.newTest(this).newEnv(user)) {
        block()
    }
}