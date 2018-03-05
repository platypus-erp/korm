package org.platypus.test

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.platypus.Platypus
import org.platypus.orm.sql.dml.StatementType
import org.platypus.struct.*

//fun main(args: Array<String>) {
//    dropDb()
//}


object CreatingJohnSmith : Spek({
    given("An environement") {
        Platypus.newTest().withNewEnv {
            on("Creating a new user") {
                val john = env.userMokRepo.new {
                    name = "John Smith"
                    email = "jsmith@example.com"
                    isStaff = true
                    nums = 1
                }
                it("Should be containt only the given value and a negative id") {
                    john.id shouldBeLessThan 0
                    john.name shouldBe "John Smith"
                    john.email shouldBe "jsmith@example.com"
                    john.isStaff shouldBe true
                    john.nums shouldBe 1
                    john.password.shouldBeNull()
                    john.age.shouldBeNull()
                }
                it("No CRUD statement is executed") {
                    env.internal.cr.stat.map[StatementType.SELECT].shouldBeNull()
                    env.internal.cr.stat.map[StatementType.INSERT].shouldBeNull()
                    env.internal.cr.stat.map[StatementType.DELETE].shouldBeNull()
                    env.internal.cr.stat.map[StatementType.UPDATE].shouldBeNull()
                }
                it("Never a DDL statement is executed") {
                    assertNoDDLRuned()
                }
                test("On flush") {
                    env.flush()
                    it("On Insert is trigger") {
                        env.internal.cr.stat.map[StatementType.SELECT].shouldBeNull()
                        env.internal.cr.stat.map[StatementType.INSERT].shouldNotBeNull().shouldEqualTo(1)
                        env.internal.cr.stat.map[StatementType.DELETE].shouldBeNull()
                        env.internal.cr.stat.map[StatementType.UPDATE].shouldBeNull()
                    }
                    it("Never a DDL statement is executed") {
                        assertNoDDLRuned()
                    }
                    it("The id no longer negative") {
                        john.id shouldBeGreaterThan 0
                    }
                }

            }
        }

    }
})


object CreateJaneDoe : Spek({
    describe("Creating user Jane with related Profile and Posts and Tags then query it") {
        dropDb()
        given("An environement") {
            Platypus.newTest().withNewEnv {
                assertNoDMLRunned()
                on("Creatin Jane User") {
                    val obj = createData(env)

                    it("The cache should containt all the value") {
                        obj.userJane.profile `should equal` obj.janeProfile
                        obj.post1.user `should equal` obj.userJane
                        obj.post2.user `should equal` obj.userJane
                        obj.userJane.posts.size `should equal` 2
                    }
                    it("The cache is always valid") {
                        obj.post1.tags.size `should equal` 2
                        obj.post2.tags.size `should equal` 2
                    }
                    it("The cache keep the order of insert") {
                        obj.post1.tags.first() `should equal` obj.tag1
                        obj.post1.tags.last() `should equal` obj.tag3
                        obj.post2.tags.first() `should equal` obj.tag2
                        obj.post2.tags.last() `should equal` obj.tag3
                    }
                    it("No Sql action is trigered until flush") {
                        assertNoDMLRunned()
                        assertNoDDLRuned()
                        env.flush()
                        env.internal.cr.stat.map[StatementType.SELECT].shouldBeNull()
                        env.internal.cr.stat.map[StatementType.INSERT] `should equal` 11
                        env.internal.cr.stat.map[StatementType.DELETE].shouldBeNull()
                        env.internal.cr.stat.map[StatementType.UPDATE] `should equal` 3
                        assertNoDDLRuned()
                    }
                }
            }
        }
    }

})



