package org.platypus.module.blog.tests

import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldEqualTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.platypus.v2.env.Platypus
import org.platypus.newTestBlog
import org.platypus.security.ROOT_USER

object LazyDataSpek : Spek({
    describe("Creating user Jane with related Profile and Posts and Tags then query it") {
        given("An environement") {
            Platypus.newTestBlog {
                assertNoDMLRunned()
                it("Should lazy load the ROOT_USER from the persistence layer") {
                    val user = ROOT_USER.getData(env)
                    env.internal.cr.stat.nbSelect shouldEqualTo 0
                    user.empty.shouldBeFalse()
                    user.id shouldEqualTo 1
                    env.internal.cr.stat.nbSelect shouldEqualTo 1
                }
                it("Should lazy load the ROOT_USER from the persistence layer") {
                    env.internal.cr.stat.reset()
                    val user = ROOT_USER.getData(env)
                    env.internal.cr.stat.nbSelect shouldEqualTo 0
                    user.empty.shouldBeFalse()
                    user.id shouldEqualTo 1
                    env.internal.cr.stat.nbSelect shouldEqualTo 0
                }
            }
        }
    }
})