package org.platypus.module.blog.tests

import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.amshove.kluent.shouldEqualTo
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.jupiter.api.assertThrows
import org.platypus.Platypus
import org.platypus.module.blog.BlogModel
import org.platypus.module.blog.blogRepo
import org.platypus.newTestBlog
import org.platypus.orm.sql.query.SmartQueryBuilder
import org.platypus.orm.sql.select
import org.platypus.utils.EntityNotFoundById

/**
 * This test assert the [RecordRepository.browse] method
 */
object BrowseSingleSpek : Spek({
    describe("Testing the browse method") {
        given("The blog Module") {
            Platypus.newTestBlog {
                on("Giving an existing positive id NOT IN cache") {
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    q.limit(1, 0)
                    val idFirstBlog = q.first().get(BlogModel.id)
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a valid record") {
                        val rec = env.blogRepo.browse(idFirstBlog)
                        rec.empty.shouldBeFalse()
                        rec.id shouldEqualTo idFirstBlog
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
                on("Giving an existing positive id IN cache") {
                    val idFirstBlog = env.blogRepo.executeFirst(SmartQueryBuilder(BlogModel)).id
                    env.internal.cr.stat.reset()
                    it("Should return a valid record") {
                        val rec = env.blogRepo.browse(idFirstBlog)
                        rec.empty.shouldBeFalse()
                        rec.id shouldEqualTo idFirstBlog
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving a non existing positive id") {
                    val idFirstBlog = Int.MAX_VALUE
                    it("Should throw an EntityNotFoundById exeption") {
                        val error = assertThrows<EntityNotFoundById> {
                            env.blogRepo.browse(idFirstBlog)
                        }
                        error.id shouldEqualTo idFirstBlog
                        error.modelName shouldBeEqualTo BlogModel.modelName
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }

                on("Giving id equal to 0") {
                    it("Should return an empty Record") {
                        val rec = env.blogRepo.browse(0)
                        rec.empty.shouldBeTrue()
                        rec.id shouldEqualTo 0
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }

                on("Giving a non existing negative id") {
                    it("Should throw an EntityNotFoundById exeption") {
                        val error = assertThrows<EntityNotFoundById> {
                            env.blogRepo.browse(-1)
                        }
                        error.id shouldEqualTo -1
                        error.modelName shouldBeEqualTo BlogModel.modelName
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving an existing negative id") {
                    val idFirstBlog = env.blogRepo.new {
                        name = "TestBlog"
                    }.id
                    it("Should return a valid record") {
                        val rec = env.blogRepo.browse(idFirstBlog)
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
 * This test assert the [RecordRepository.browse] method
 */
object BrowseMultiSpek : Spek({
    describe("Testing the browse method") {
        given("The blog Module") {
            Platypus.newTestBlog {
                on("Giving existing only positive ids NOT IN cache") {
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) }
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
                on("Giving existing only positive ids NOT IN cache and an id equal to 0") {
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) } + 0
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 1
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
                on("Giving existing only positive ids NOT IN cache four id equal to 0") {
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) } + listOf(0, 0, 0, 0)
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }

                on("Giving existing only positive ids IN cache") {
                    val ids = env.blogRepo.execute(SmartQueryBuilder(BlogModel)).ids
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 1
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving existing only positive ids IN cache and an id equal to 0") {
                    val ids = env.blogRepo.execute(SmartQueryBuilder(BlogModel)).ids + 0
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving existing only positive ids IN cache four id equal to 0") {
                    val ids = env.blogRepo.execute(SmartQueryBuilder(BlogModel)).ids + listOf(0, 0, 0, 0)
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }

                on("Giving non existing only positive ids") {
                    it("Should return a empty bag") {
                        val recs = env.blogRepo.browse(listOf(1000, 1001, 1011, 1010))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving non existing only positive ids and an id equal to 0") {
                    val recs = env.blogRepo.browse(listOf(0, 1000, 1001, 1011, 1010))
                    recs.shouldBeEmpty()
                    recs.ids.shouldBeEmpty()
                    env.internal.cr.stat.nbSelect shouldEqualTo 0
                }
                on("Giving non existing only positive ids four id equal to 0") {
                    val recs = env.blogRepo.browse(listOf(0, 1000, 0, 1001, 0, 1011, 0, 1010))
                    recs.shouldBeEmpty()
                    recs.ids.shouldBeEmpty()
                    env.internal.cr.stat.nbSelect shouldEqualTo 0
                }

                on("Giving only ids equal to 0") {
                    it("Should return an empty Record") {
                        val recs = env.blogRepo.browse(listOf(0, 0, 0, 0, 0))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }

                on("Giving existing only negative ids") {
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving existing only negative ids and an id equal to 0") {
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + 0
                    it("Should return a filled bag without the 0 id") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 1
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving existing only negative ids and four id equal to 0") {
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + listOf(0, 0, 0, 0)
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }

                on("Giving non existing only negative ids") {
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.browse(listOf(-1000, -1001, -1010, -1011))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving non existing only negative ids and an id equal to 0") {
                    it("Should return a filled bag") {
                        val recs = env.blogRepo.browse(listOf(0, -1000, -1001, -1010, -1011))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving non existing only negative ids and four id equal to 0") {
                    it("Should return a filled bag without the 0 ids") {
                        val recs = env.blogRepo.browse(listOf(0, -1000, 0, -1001, 0, -1010, 0, -1011))
                        recs.shouldBeEmpty()
                        recs.ids.shouldBeEmpty()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }

                on("Giving an ids containing existing positive id NOT IN CACHE, non existing negative id") {
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = q.map { it.get(BlogModel.id) } + listOf(-1000, -1001, -1010, -1011)
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with only positive id") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        recs.ids.all { it > 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving an ids containing existing positive id IN CACHE, non existing negative id") {
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = env.blogRepo.bagOf(q).ids + listOf(-1000, -1001, -1010, -1011)
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with only positive id") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        recs.ids.all { it > 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
                on("Giving an ids containing existing positive id NOT IN CACHE, existing negative id") {
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
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving an ids containing existing positive id IN CACHE, existing negative id") {
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = (env.blogRepo.bagOf(q) + env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with all the ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving an ids containing existing positive id NOT IN CACHE, existing negative id, a 0 id") {
                    // I doing that to not load this id in the cache
                    val q = BlogModel.select(env)
                    val ids = (env.blogRepo.bagOf(q) + env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + 0
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with all the ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 1
                        recs.ids.all { it != 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 1
                    }
                }
                on("Giving an ids containing non existing positive id, existing negative id") {
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + listOf(1000, 1001, 1010, 1011)
                    it("Should return a filled bag with only positive id") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 4
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
                on("Giving an ids containing non existing positive id, existing negative id, a 0 id") {
                    // I doing that to not load this id in the cache
                    val ids = (env.blogRepo.new {
                        name = "TestBlog"
                    } + env.blogRepo.new {
                        name = "TestBlog2"
                    }).ids + listOf(1000, 1001, 1010, 1011) + 0
                    //reset the stat to test only one Select is done
                    env.internal.cr.stat.reset()
                    it("Should return a filled bag with all the ids") {
                        val recs = env.blogRepo.browse(ids)
                        recs.isEmpty().shouldBeFalse()
                        recs.size shouldEqualTo ids.size - 5
                        recs.ids.all { it < 0 }.shouldBeTrue()
                        env.internal.cr.stat.nbSelect shouldEqualTo 0
                    }
                }
            }
        }
    }
})