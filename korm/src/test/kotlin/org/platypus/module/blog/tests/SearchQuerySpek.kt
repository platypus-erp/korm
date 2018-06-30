package org.platypus.module.blog.tests

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldContainNone
import org.amshove.kluent.shouldEqualTo
import org.amshove.kluent.shouldNotBeEmpty
import org.amshove.kluent.shouldNotBeNull
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.api.dsl.xon
import org.platypus.Platypus
import org.platypus.cache.CacheState
import org.platypus.cache.of
import org.platypus.module.base.entities.dateFormat
import org.platypus.module.base.entities.installed
import org.platypus.module.base.entities.isoCode
import org.platypus.module.base.entities.languageRepo
import org.platypus.module.base.models.Languages
import org.platypus.module.blog.BaseBlogModule
import org.platypus.module.blog.BlogModel
import org.platypus.module.blog.UserMokModel
import org.platypus.module.blog.blogRepo
import org.platypus.newTest
import org.platypus.orm.sql.QueryBuilder
import org.platypus.orm.sql.ilike
import org.platypus.orm.sql.or
import org.platypus.orm.sql.query.ORDERBY_TYPE
import org.platypus.orm.sql.query.SearchQueryImpl
import org.platypus.orm.sql.query.SearchQuerySelectPart
import org.platypus.orm.sql.query.SearchQuerySelectPartImpl

fun test() {
    val platy = Platypus.newTest(BaseBlogModule)
    platy.newEnv().use { env ->
        env.blogRepo.search {
            adjustSelect {
                it.co_creator.select { email }
                it.co_creator.join { resume }.select { leisure }
                it.co_creator.join { resume }.select { education }
                it.co_creator.join { resume }.select { experience }
            }

            where {
                (it.name ilike "dkf")
                        .or(it.co_creator.select { email } ilike "dfk")
                        .or(it.co_creator.join { resume }.select { experience } ilike "fkdj")
            }
        }

    }
}

object SelectSpek : Spek({
    describe("SearchQueryImpl class") {
        given("The blog Module") {
            val platy = Platypus.newTest(BaseBlogModule)
            on("Search All the blog") {
                platy.newEnv().use { env ->
                    val nbQ = { env.internal.cr.stat.nbSelect }
                    val nbQuery = env.internal.cr.stat.nbSelect
                    val search = SearchQueryImpl(BlogModel, env)
                    it("Should contains the ids and only one query is executed") {
                        val ids = search.execute()
                        ids.shouldNotBeEmpty()
                        ids.size shouldEqualTo 2
                        nbQ() shouldEqualTo nbQuery + 1

                    }
                    it("If execute is called again then a new Query is executed") {
                        val ids = search.execute()
                        ids.shouldNotBeEmpty()
                        ids.size shouldEqualTo 2
                        nbQ() shouldEqualTo nbQuery + 2
                        for (id in ids) {
                            env.internal.cache.state(BlogModel of id) shouldBe CacheState.FETCHED
                            for (f in BlogModel.storeFields) {
                                env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.FETCHED
                            }
                        }
                    }
                }
            }
            on("Select a Many2One Field") {
                platy.newEnv().use { env ->
                    val nbQ = { env.internal.cr.stat.nbSelect }
                    val nbQuery = env.internal.cr.stat.nbSelect
                    it("Should contains the ids and only one query is executed, only the name is fetched") {
                        val search = SearchQueryImpl(BlogModel, env).adjustSelect {
                            it.name.select()
                        }
                        val ids = search.execute()
                        ids.shouldNotBeEmpty()
                        ids.size shouldEqualTo 2
                        nbQ() shouldEqualTo nbQuery + 1
                        for (id in ids) {
                            env.internal.cache.state(BlogModel of id) shouldBe CacheState.PARTIALLY
                            for (f in BlogModel.storeFields) {
                                if (f != BlogModel.name) {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.NONE
                                } else {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.FETCHED
                                }
                            }
                        }

                    }
                }
            }
            on("Select field of a Many2One Field") {
                platy.newEnv().use { env ->
                    val nbQ = { env.internal.cr.stat.nbSelect }
                    val nbQuery = env.internal.cr.stat.nbSelect
                    it("Should contains the ids and only one query is executed, only the name is fetched") {
                        val search = SearchQueryImpl(BlogModel, env).adjustSelect {
                            it.name
                            it.co_creator.select { nums }
                        }
                        val ids = search.execute()
                        ids.shouldNotBeEmpty()
                        ids.size shouldEqualTo 2
                        nbQ() shouldEqualTo nbQuery + 1
                        for (id in ids) {
                            env.internal.cache.state(BlogModel of id) shouldBe CacheState.PARTIALLY
                            for (f in BlogModel.storeFields.filter { it != BlogModel.id }) {
                                if (f != BlogModel.name || f != BlogModel.co_creator) {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.NONE
                                } else {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.FETCHED
                                }
                            }
                            val userCache = env.internal.cache[BlogModel of id, BlogModel.co_creator]
                            userCache.first shouldBe CacheState.FETCHED
                            userCache.second.shouldNotBeNull()
                            env.internal.cache.state(userCache.second!!, UserMokModel.id) shouldBe CacheState.PARTIALLY
                            val userNulCache = env.internal.cache[userCache.second!!, UserMokModel.nums]
                            for (f in UserMokModel.storeFields.filter { it != UserMokModel.id }) {
                                if (f != UserMokModel.nums) {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.NONE
                                    userNulCache.second.shouldBeNull()
                                } else {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.FETCHED
                                    userNulCache.second.shouldNotBeNull()
                                }
                            }
                        }

                    }
                }
            }
            xon("Select a One2Many Field") {
                platy.newEnv().use { env ->
                    val nbQ = { env.internal.cr.stat.nbSelect }
                    val nbQuery = env.internal.cr.stat.nbSelect
                    it("Should contains the ids and only one query is executed, only the name is fetched") {
                        val search = SearchQueryImpl(BlogModel, env).adjustSelect {
                            it.name.select()
                            it.posts.select()
                        }
                        val ids = search.execute()
                        ids.shouldNotBeEmpty()
                        ids.size shouldEqualTo 2
                        nbQ() shouldEqualTo nbQuery + 1
                        for (id in ids) {
                            env.internal.cache.state(BlogModel of id) shouldBe CacheState.PARTIALLY
                            for (f in BlogModel.storeFields) {
                                if (f != BlogModel.name) {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.NONE
                                } else {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.FETCHED
                                }
                            }
                        }

                    }
                }
            }
            xon("Select a Many2Many Field") {
                platy.newEnv().use { env ->
                    val nbQ = { env.internal.cr.stat.nbSelect }
                    // I doing that to not load this id in the cache
                    val nbQuery = env.internal.cr.stat.nbSelect
                    it("Should contains the ids and only one query is executed, only the name is fetched") {
                        val search = SearchQueryImpl(BlogModel, env).adjustSelect {
                            it.name.select()
                            it.posts.select()
                        }
                        val ids = search.execute()
                        ids.shouldNotBeEmpty()
                        ids.size shouldEqualTo 2
                        nbQ() shouldEqualTo nbQuery + 1
                        for (id in ids) {
                            env.internal.cache.state(BlogModel of id) shouldBe CacheState.PARTIALLY
                            for (f in BlogModel.storeFields) {
                                if (f != BlogModel.name) {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.NONE
                                } else {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.FETCHED
                                }
                            }
                        }

                    }
                }
            }
        }
    }
})

object OrderBySpek : Spek({
    describe("SearchQueryImpl class") {
        given("A platypus Instance") {
            val platy = Platypus.newTest(BaseBlogModule)
            on("Search All the Language with default order") {
                platy.newEnv().use { env ->
                    val search = SearchQueryImpl(Languages, env)
                    val languages = env.languageRepo.bagOf(search)
                    val newLanguage = languages.sortedBy { it.installed }.sortedBy { it.isoCode }
                    it("languages and newLanguages is in the same order") {
                        for (i in 0..languages.size) {
                            languages[i].id shouldEqualTo newLanguage[i].id
                        }
                    }
                }
            }
            on("Search All the Language with default order") {
                platy.newEnv().use { env ->
                    val search = SearchQueryImpl(Languages, env).orderBy(Languages.dateFormat, ORDERBY_TYPE.DESC)
                    val languages = env.languageRepo.bagOf(search)
                    val newLanguage = languages.sortedByDescending { it.dateFormat }
                    it("languages and newLanguages is in the same order") {
                        for (i in 0..languages.size) {
                            languages[i].id shouldEqualTo newLanguage[i].id
                        }
                    }
                }
            }
        }
    }
})

object LimitSpek : Spek({
    describe("SearchQueryImpl class") {
        given("A platypus Instance") {
            val platy = Platypus.newTest(BaseBlogModule)
            on("Search All the Language with default order") {
                platy.newEnv().use { env ->
                    val search = SearchQueryImpl(Languages, env).limit(10)
                    it("Should containt only 10 element") {
                        search.execute().size shouldEqualTo 10
                    }
                }
            }
            on("Search All the Language with default order") {
                platy.newEnv().use { env ->
                    val search = SearchQueryImpl(Languages, env).limit(10, 1)
                    val idsPage1 = search.execute()
                    it("Should containt only 10 element") {
                        idsPage1.size shouldEqualTo 10
                    }
                    val search2 = SearchQueryImpl(Languages, env).limit(10, 2)
                    val idsPage2 = search.execute()
                    it("Should containt only 10 element") {
                        idsPage2.size shouldEqualTo 10
                        idsPage2 shouldContainNone idsPage1
                        idsPage1 shouldContainNone idsPage2
                    }
                }
            }
        }
    }
})

object WhereSpek : Spek({
    describe("SearchQueryImpl class") {
        given("A platypus Instance") {
            val platy = Platypus.newTest(BaseBlogModule)
            on("Search All the Language with default order") {
                platy.newEnv().use { env ->
                    val search = SearchQueryImpl(Languages, env).limit(10)
                    it("Should containt only 10 element") {
                        search.execute().size shouldEqualTo 10
                    }
                }
            }
            on("Search All the Language with default order") {
                platy.newEnv().use { env ->
                    val search = SearchQueryImpl(Languages, env).limit(10, 1)
                    val idsPage1 = search.execute()
                    it("Should containt only 10 element") {
                        idsPage1.size shouldEqualTo 10
                    }
                    val search2 = SearchQueryImpl(Languages, env).limit(10, 2)
                    val idsPage2 = search.execute()
                    it("Should containt only 10 element") {
                        idsPage2.size shouldEqualTo 10
                        idsPage2 shouldContainNone idsPage1
                        idsPage1 shouldContainNone idsPage2
                    }
                }
            }
        }
    }
})


fun main(args: Array<String>) {
    val platy = Platypus.newTest(BaseBlogModule)
    val query = platy.newEnv().use { env ->
        val selector: SearchQuerySelectPart<BlogModel>.(BlogModel) -> Unit = {
            it.name.select()
            it.co_creator.select()
            it.co_creator join { lastPost } join { blog } select { maintainer }
            val join4 = it.co_creator join { lastPost } join { blog }
            join4 select { posts }
            join4 select { tags }
        }

        val sel = SearchQuerySelectPartImpl(BlogModel)
        sel.selector(BlogModel)
        sel.prepareSQL(env.internal.dialect, QueryBuilder(false))
    }
    println(query)
}


