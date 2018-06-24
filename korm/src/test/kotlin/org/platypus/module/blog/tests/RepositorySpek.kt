package org.platypus.module.blog.tests

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeGreaterThan
import org.amshove.kluent.shouldBeIn
import org.amshove.kluent.shouldBeLessThan
import org.amshove.kluent.shouldBeTrue
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldEqualTo
import org.amshove.kluent.shouldNotBeIn
import org.amshove.kluent.shouldNotBeNull
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.assertThrows
import org.platypus.Platypus
import org.platypus.entity.EntityState
import org.platypus.entity.EntityValidateMode
import org.platypus.module.blog.BaseBlogModule
import org.platypus.module.blog.BlogModel
import org.platypus.module.blog.blogRepo
import org.platypus.newTest
import org.platypus.newTestBlog
import org.platypus.orm.sql.expression.eq
import org.platypus.orm.sql.select
import org.platypus.utils.EntityNotFoundById
import org.platypus.utils.EntityNotFoundByRef

/**
 * This test assert the [RecordRepository.byId] method
 */
object ByIdSingleSpek : Spek({
    describe("Testing the browse method") {
        given("The blog Module") {
            val platy = Platypus.newTest(BaseBlogModule)
            on("Giving an existing positive id NOT IN cache") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    q.limit(1, 0)
                    val idFirstBlog = q.first().get(BlogModel.id)
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a valid record") {
                        val rec = env.blogRepo.byId(idFirstBlog)
                        rec.empty.shouldBeFalse()
                        rec.id shouldEqualTo idFirstBlog
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }

            }
            on("Giving an existing positive id IN cache") {
                platy.newEnv().use { env ->
                    val idFirstBlog = env.blogRepo.recordOf(env.blogRepo.buildQuery()).id
                    env.internal.cr.stat.reset()
                    it("Should return a valid record") {
                        val rec = env.blogRepo.byId(idFirstBlog)
                        rec.empty.shouldBeFalse()
                        rec.id shouldEqualTo idFirstBlog
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }
            on("Giving a non existing positive id") {
                platy.newEnv().use { env ->

                    val idFirstBlog = Int.MAX_VALUE
                    env.internal.cr.stat.reset()
                    it("Should throw an EntityNotFoundById exeption") {
                        val error = assertThrows<EntityNotFoundById> {
                            env.blogRepo.byId(idFirstBlog)
                        }
                        error.id shouldEqualTo idFirstBlog
                        error.modelName shouldBeEqualTo BlogModel.modelName
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }

            on("Giving id equal to 0") {
                platy.newEnv().use { env ->
                    it("Should return an empty Record") {
                        val rec = env.blogRepo.byId(0)
                        rec.empty.shouldBeTrue()
                        rec.id shouldEqualTo 0
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }

            on("Giving a non existing negative id") {
                platy.newEnv().use { env ->
                    env.internal.cache.reset()
                    it("Should throw an EntityNotFoundById exeption") {
                        val error = assertThrows<EntityNotFoundById> {
                            env.blogRepo.byId(-1)
                        }
                        error.id shouldEqualTo -1
                        error.modelName shouldBeEqualTo BlogModel.modelName
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving an existing negative id") {
                platy.newEnv().use { env ->
                    //Pre load of the ROOT_USER id
                    val idFirstBlog = env.blogRepo.new {
                        name = "TestBlog"
                    }.id
                    it("Should return a valid record") {
                        val rec = env.blogRepo.byId(idFirstBlog)
                        rec.empty.shouldBeFalse()
                        rec.id shouldEqualTo idFirstBlog
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
        }
    }
})

/**
 * This test assert the [RecordRepository.byIds] method
 */
object ByIdsMultiSpek : Spek({
    describe("Testing the byIds method") {
        given("The blog Module") {
            val platy = Platypus.newTest(BaseBlogModule)
            on("Giving existing only positive ids NOT IN cache") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) }
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        recs.first().empty.shouldBeFalse()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        recs.first().loaded.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        for (r in recs){
                            r.id in ids
                            r.name.shouldNotBeNull()
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }

            }
            on("Giving existing only positive ids NOT IN cache and an id equal to 0") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) } + 0
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 1
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        recs.first().empty.shouldBeFalse()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        recs.first().loaded.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        for (r in recs){
                            r.id in ids
                            r.name.shouldNotBeNull()
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }
            on("Giving existing only positive ids NOT IN cache four id equal to 0") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) } + listOf(0, 0, 0, 0)
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        recs.first().empty.shouldBeFalse()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        recs.first().loaded.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                        for (r in recs){
                            r.id in ids
                            r.name.shouldNotBeNull()
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }

            on("Giving existing only positive ids IN cache") {
                platy.newEnv().use { env ->
                    val ids = env.blogRepo.bagOf(env.blogRepo.buildQuery()).ids
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without any new Query") {
                        val recs = env.blogRepo.byIds(ids)
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        recs.first().empty.shouldBeFalse()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        recs.first().loaded.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        for (r in recs){
                            r.id in ids
                            r.name.shouldNotBeNull()
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving existing only positive ids IN cache and an id equal to 0") {
                platy.newEnv().use { env ->
                    val ids = env.blogRepo.bagOf(env.blogRepo.buildQuery()).ids + 0
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without the 0 id and no query is trigger") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size -1
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        recs.first().empty.shouldBeFalse()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        recs.first().loaded.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        for (r in recs){
                            r.id in ids
                            r.name.shouldNotBeNull()
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving existing only positive ids IN cache four id equal to 0") {
                platy.newEnv().use { env ->
                    val ids = env.blogRepo.bagOf(env.blogRepo.buildQuery()).ids + listOf(0, 0, 0, 0)
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without the 0 ids and no Query is needed") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        recs.first().empty.shouldBeFalse()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        recs.first().loaded.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        for (r in recs){
                            r.id in ids
                            r.name.shouldNotBeNull()
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }

            on("Giving non existing only positive ids") {
                platy.newEnv().use { env ->
                    it("Should return a empty bag") {
                        val recs = env.blogRepo.byIds(listOf(1000, 1001, 1011, 1010))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }
            on("Giving non existing only positive ids and an id equal to 0") {
                platy.newEnv().use { env ->
                    val recs = env.blogRepo.byIds(listOf(0, 1000, 1001, 1011, 1010))
                    recs.shouldBeEmpty()
                    recs.ids.shouldBeEmpty()
                    env.internal.cr.stat.nbSelect shouldEqualTo 1
                }
            }
            on("Giving non existing only positive ids four id equal to 0") {
                platy.newEnv().use { env ->
                    val recs = env.blogRepo.byIds(listOf(0, 1000, 0, 1001, 0, 1011, 0, 1010))
                    recs.shouldBeEmpty()
                    recs.ids.shouldBeEmpty()
                    env.internal.cr.stat.nbSelect shouldEqualTo 1
                }
            }

            on("Giving only ids equal to 0") {
                platy.newEnv().use { env ->
                    it("Should return an empty Record") {
                        val recs = env.blogRepo.byIds(listOf(0, 0, 0, 0, 0))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }

            on("Giving existing only negative ids") {
                platy.newEnv().use { env ->
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving existing only negative ids and an id equal to 0") {
                platy.newEnv().use { env ->
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + 0
                    it("Should return a filled bag without the 0 id") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 1
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving existing only negative ids and four id equal to 0") {
                platy.newEnv().use { env ->
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + listOf(0, 0, 0, 0)
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }

            on("Giving non existing only negative ids") {
                platy.newEnv().use { env ->
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.byIds(listOf(-1000, -1001, -1010, -1011))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving non existing only negative ids and an id equal to 0") {
                platy.newEnv().use { env ->
                    it("Should return a filled bag") {
                        val recs = env.blogRepo.byIds(listOf(0, -1000, -1001, -1010, -1011))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving non existing only negative ids and four id equal to 0") {
                platy.newEnv().use { env ->
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.byIds(listOf(0, -1000, 0, -1001, 0, -1010, 0, -1011))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }

            on("Giving an ids containing existing positive id NOT IN CACHE, non existing negative id") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) } + listOf(-1000, -1001, -1010, -1011)
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with only positive id") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        recs.ids.all { it > 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }
            on("Giving an ids containing existing positive id IN CACHE, non existing negative id") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val ids = env.blogRepo.bagOf(env.blogRepo.buildQuery()).ids + listOf(-1000, -1001, -1010, -1011)
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with only positive id") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        recs.ids.all { it > 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving an ids containing existing positive id NOT IN CACHE, existing negative id") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) } + (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with all the ids") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }
            on("Giving an ids containing existing positive id IN CACHE, existing negative id") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val ids = (env.blogRepo.bagOf(env.blogRepo.buildQuery()) + env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with all the ids") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
            on("Giving an ids containing existing positive id NOT IN CACHE, existing negative id, a 0 id") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val ids = BlogModel.select(env).map { it.get(BlogModel.id) } + (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + 0
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with all the ids") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 1
                        recs.ids.all { it != 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }
            on("Giving an ids containing non existing positive id, existing negative id") {
                platy.newEnv().use { env ->
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + listOf(1000, 1001, 1010, 1011)
                    it("Should return a filled bag with only negative id") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }
            on("Giving an ids containing non existing positive id, existing negative id, a 0 id") {
                platy.newEnv().use { env ->
                    // I doing that to not load this id in the cache
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + listOf(1000, 1001, 1010, 1011) + 0
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with all the ids") {
                        val recs = env.blogRepo.byIds(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo 2
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
            }
        }
    }
})

object ByRefSpek : Spek({
    describe("Testing the browse method") {
        given("The blog Module") {
            val platy = Platypus.newTest(BaseBlogModule)
            on("Giving an existing ref NOT IN cache") {
                platy.newEnv().use { env ->
                    it("Should return a valid record") {
                        val rec = env.blogRepo.byRef("blog1")
                        rec.empty.shouldBeFalse()
                        rec.id shouldBeGreaterThan 0
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }

            }
            on("Giving an existing ref IN cache") {
                platy.newEnv().use { env ->
                    // I doing that to load this ref in the cache
                    val blog1Id = env.blogRepo.byRef("blog1").id
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a valid record") {
                        val rec = env.blogRepo.byRef("blog1")
                        rec.empty.shouldBeFalse()
                        rec.id shouldEqualTo blog1Id
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving a non existing ref") {
                    platy.newEnv().use { env ->
                        it("Should return an empty record") {
                            val rec = env.blogRepo.byRef("fake_ref")
                            rec.empty.shouldBeTrue()
                            rec.id shouldEqualTo 0
                            env.internal.cr.stat.nbSelect shouldEqualTo 1
                        }
                        it("Should throw an exception") {
                            val error = assertThrows<EntityNotFoundByRef> {
                                env.blogRepo.byRef("fake_ref", throwError = true)
                            }
                            error.ref shouldBeEqualTo "fake_ref"
                            error.modelName shouldBeEqualTo BlogModel.modelName
                        }
                    }
                }
            }
        }
    }
})

object CreatingBagSpek : Spek({
    describe("Testing the browse method") {
        given("The blog Module") {
            Platypus.newTestBlog {
                afterEachTest {
                    env.internal.resetCache()
                }
                on("Creating a new Bag, No query is executed") {
                    it("From bagOf function") {
                        val bag = env.blogRepo.bagOf(env.blogRepo.buildQuery())
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        bag.loaded.shouldBeFalse()

                    }
                    it("From search function") {
                        val bag = env.blogRepo.search {
                            where {
                                it.user eq 3
                            }
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        bag.loaded.shouldBeFalse()
                    }
                    it("From where function") {
                        val bag = env.blogRepo.where {
                            it.user eq 3

                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        bag.loaded.shouldBeFalse()
                    }
                }
            }
        }
    }
})

object CreatingRecordSpek : Spek({
    describe("Testing the browse method") {
        given("The blog Module") {
            Platypus.newTestBlog {
                afterEachTest {
                    env.internal.resetCache()
                }
                on("Creating a new Record from a query, No Selec is executed") {
                    it("From recordOf function") {
                        val bag = env.blogRepo.recordOf(env.blogRepo.buildQuery())
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        bag.loaded.shouldBeFalse()

                    }
                    it("From searchFirst function") {
                        val bag = env.blogRepo.searchFirst {
                            where {
                                it.user eq 3
                            }
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        bag.loaded.shouldBeFalse()
                    }
                    it("From whereFirst function") {
                        val bag = env.blogRepo.whereFirst {
                            it.user eq 3

                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        bag.loaded.shouldBeFalse()
                    }
                }
                on("Creating a new Record without query") {
                    it("From new function") {
                        val rec = env.blogRepo.new {
                            name = "NAME BLOG"
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        rec.id shouldBeLessThan 0
                        rec.internalState shouldBe EntityState.MANAGED
                        rec.validateMode shouldBe EntityValidateMode.AUTO
                        rec.name shouldEqual "NAME BLOG"
                        rec.id shouldBeIn env.internal.cache.toInsert

                    }
                    it("From newTmp function") {
                        val rec = env.blogRepo.newTmp {
                            name = "NAME BLOG"
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        rec.id shouldBeLessThan 0
                        rec.internalState shouldBe EntityState.DETACH
                        rec.validateMode shouldBe EntityValidateMode.AUTO
                        rec.name shouldEqual "NAME BLOG"
                        rec.id shouldNotBeIn env.internal.cache.toInsert
                    }
                    it("From new function") {
                        val rec = env.blogRepo.newWithDefault { }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        rec.id shouldBeLessThan 0
                        rec.internalState shouldBe EntityState.MANAGED
                        rec.validateMode shouldBe EntityValidateMode.AUTO
                        rec.name shouldEqual "Blog of Administrator"
                        rec.id shouldBeIn env.internal.cache.toInsert

                    }
                    it("From newTmp function") {
                        val rec = env.blogRepo.newTmpWithDefault { }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        rec.id shouldBeLessThan 0
                        rec.internalState shouldBe EntityState.DETACH
                        rec.validateMode shouldBe EntityValidateMode.AUTO
                        rec.name shouldEqual "Blog of Administrator"
                        rec.id shouldNotBeIn env.internal.cache.toInsert
                    }
                }
            }
        }
    }
})

object DeleteSpek : Spek({
    describe("Testing the browse method") {
        given("The blog Module") {
            Platypus.newTestBlog {
                afterEachTest {
                    env.internal.resetCache()
                }
                on("Deleteing Record depending of the creation origin") {
                    it("From recordOf function") {
                        val rec = env.blogRepo.recordOf(env.blogRepo.buildQuery())
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        env.blogRepo.delete(rec)
                        env.internal.cr.stat.nbDelete shouldEqualTo 1
                        rec.internalState shouldBe EntityState.DELETED

                    }
                    it("From new function") {
                        val rec = env.blogRepo.new {
                            name = "NAME BLOG"
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        rec.id shouldBeLessThan 0
                        rec.internalState shouldBe EntityState.MANAGED
                        rec.validateMode shouldBe EntityValidateMode.AUTO
                        rec.name shouldEqual "NAME BLOG"
                        rec.id shouldBeIn env.internal.cache.toInsert

                        env.blogRepo.delete(rec)

                        env.internal.cr.stat.nbDelete shouldEqualTo 0
                        rec.id shouldNotBeIn env.internal.cache.toInsert
                        rec.internalState shouldBe EntityState.DELETED
                    }

                    it("From newWithDefault function") {
                        val rec = env.blogRepo.newWithDefault {
                            name = "NAME BLOG"
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        rec.id shouldBeLessThan 0
                        rec.internalState shouldBe EntityState.MANAGED
                        rec.validateMode shouldBe EntityValidateMode.AUTO
                        rec.name shouldEqual "NAME BLOG"
                        rec.id shouldBeIn env.internal.cache.toInsert

                        env.blogRepo.delete(rec)

                        env.internal.cr.stat.nbDelete shouldEqualTo 0
                        rec.id shouldNotBeIn env.internal.cache.toInsert
                        rec.internalState shouldBe EntityState.DELETED
                    }

                    it("From newTmp function") {
                        val rec = env.blogRepo.newTmp {
                            name = "NAME BLOG"
                        }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        rec.id shouldBeLessThan 0
                        rec.internalState shouldBe EntityState.DETACH
                        rec.validateMode shouldBe EntityValidateMode.AUTO
                        rec.name shouldEqual "NAME BLOG"
                        rec.id shouldNotBeIn env.internal.cache.toInsert

                        env.blogRepo.delete(rec)

                        //Nothing append because is not a managed entity
                        env.internal.cr.stat.nbDelete shouldEqualTo 0
                        rec.id shouldNotBeIn env.internal.cache.toInsert
                        rec.internalState shouldBe EntityState.DETACH
                    }

                    it("From newTmpWithDefault function") {
                        val rec = env.blogRepo.newTmpWithDefault { }
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                        rec.loaded.shouldBeFalse()
                        rec.id shouldBeLessThan 0
                        rec.internalState shouldBe EntityState.DETACH
                        rec.validateMode shouldBe EntityValidateMode.AUTO
                        rec.name shouldEqual "NAME BLOG"
                        rec.id shouldNotBeIn env.internal.cache.toInsert

                        env.blogRepo.delete(rec)

                        //Nothing append because is not a managed entity
                        env.internal.cr.stat.nbDelete shouldEqualTo 0
                        rec.id shouldNotBeIn env.internal.cache.toInsert
                        rec.internalState shouldBe EntityState.DETACH
                    }
                }
            }
        }
    }
})