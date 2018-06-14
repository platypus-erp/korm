package org.platypus.module.blog.tests

import org.amshove.kluent.`should equal`
import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldBeLessThan
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldEqualTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.platypus.Platypus
import org.platypus.module.blog.age
import org.platypus.module.blog.blogRepo
import org.platypus.module.blog.blogs
import org.platypus.module.blog.comments
import org.platypus.module.blog.dataBlogJane
import org.platypus.module.blog.email
import org.platypus.module.blog.isStaff
import org.platypus.module.blog.nums
import org.platypus.module.blog.password
import org.platypus.module.blog.posts
import org.platypus.module.blog.profile
import org.platypus.module.blog.profileRepo
import org.platypus.module.blog.tagRepo
import org.platypus.module.blog.tags
import org.platypus.module.blog.user
import org.platypus.module.blog.userMokRepo
import org.platypus.newTestBlog
import org.platypus.orm.sql.dml.StatementType

object CacheReadSpek : Spek({
    describe("Creating user Jane with related Profile and Posts and Tags then query it") {
        given("An environement") {
            Platypus.newTestBlog {
                assertNoDMLRunned()
                on("Creating Jane User") {
                    val userJane = env.userMokRepo["user_jane"]
                    it("The cache should containt all the value") {
                        userJane.profile `should equal` env.profileRepo["jane_profile"]
                        env.blogRepo["blog1"].user `should equal` userJane
                        env.blogRepo["blog2"].user `should equal` userJane
                    }
                    it("The cache manage many2Many") {
                        env.blogRepo["blog1"].tags.size `should equal` 2
                        env.blogRepo["blog2"].tags.size `should equal` 2
                    }
                    it("The cache keep the order of insert") {
                        env.blogRepo["blog1"].tags.first() `should equal` env.tagRepo["tag1"]
                        env.blogRepo["blog1"].tags.last() `should equal` env.tagRepo["tag2"]
                        env.blogRepo["blog2"].tags.first() `should equal` env.tagRepo["tag2"]
                        env.blogRepo["blog2"].tags.last() `should equal` env.tagRepo["tag3"]
                    }
                    it("No Sql action is trigered until flush") {
                        assertNoDMLWriteRunned()
                        assertNoDDLRuned()
                        env.flush()
                        env.internal.cr.stat.map[StatementType.INSERT] `should equal` 11
                        env.internal.cr.stat.map[StatementType.DELETE].shouldBeNull()
                        env.internal.cr.stat.map[StatementType.UPDATE] `should equal` 3
                        assertNoDDLRuned()
                    }
                    it("You can travers object") {
                        var nbRecord = 0
                        for (blog in userJane.blogs) {
                            nbRecord++
                            for (tag in blog.tags) {
                                nbRecord++
                            }
                            for (post in blog.posts) {
                                nbRecord++
                                for (comment in post.comments) {
                                    nbRecord++
                                }
                                for (tag in post.tags) {
                                    nbRecord++
                                }
                            }
                        }
                        nbRecord shouldEqualTo 16
                    }
                }
            }
        }
    }

})

object CacheCreateUpdateSpek : Spek({
    given("An environement without data") {
        on("Creating a new user") {
            Platypus.newTestBlog {
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
            }
        }
        on("Creating a new blog And changing the user for Many 2 One relation") {
            Platypus.newTestBlog {
                val john1 = env.userMokRepo.new {
                    name = "John Smith 1"
                    email = "jsmith@example.com"
                    isStaff = true
                    nums = 1
                }
                val john2 = env.userMokRepo.new {
                    name = "John Smith 2"
                    email = "jsmith@example.com"
                    isStaff = true
                    nums = 1
                }
                val newBlog = env.blogRepo.new {
                    name = "My New Blog"
                    user = john1
                }
                it("Jane should have one blog") {
                    john1.blogs.size shouldEqualTo 1
                    newBlog.user shouldEqual john1
                    john2.blogs.shouldBeEmpty()
                }
                it("The blog should change automaticaly of user") {
                    john2.blogs.add(newBlog)
                    john2.blogs.size shouldEqualTo 1
                    newBlog.user shouldEqual john2
                    john1.blogs.shouldBeEmpty()

                }
            }
        }

        on("Creating a new blog And changing the user for One 2 One relation") {
            Platypus.newTestBlog {
                val john1 = env.userMokRepo.new {
                    name = "John Smith 1"
                    email = "jsmith@example.com"
                    isStaff = true
                    nums = 1
                }
                val john2 = env.userMokRepo.new {
                    name = "John Smith 2"
                    email = "jsmith@example.com"
                    isStaff = true
                    nums = 1
                }
                val profileJohn = env.profileRepo.new {
                    name = "Profile John"
                    user = john1
                }
                it("Jane should have one blog") {
                    john1.profile shouldEqual profileJohn
                    profileJohn.user shouldEqual john1
                    john2.profile.shouldBeNull()
                }
                it("The profile should change automaticaly of user") {
                    john2.profile = profileJohn
                    john2.profile shouldEqual profileJohn
                    profileJohn.user shouldEqual john2
                    john1.profile.shouldBeNull()
                }
            }
        }

    }
})

object CacheDeleteSpek : Spek({
    describe("Only work with the cache and the delete work") {
        given("An environement") {
            Platypus.newTestBlog {
                assertNoDMLRunned()
                on("Creatin Jane User") {
                    dataBlogJane.loadData(env)
                }
            }
        }
    }
})