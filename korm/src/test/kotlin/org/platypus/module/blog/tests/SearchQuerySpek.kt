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
import org.platypus.v2.env.Platypus
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
import org.platypus.module.blog.gen.blog.blog.blogRepo
import org.platypus.module.blog.gen.blog.blog.user
import org.platypus.module.blog.gen.blog.resume.education
import org.platypus.module.blog.gen.blog.resume.experience
import org.platypus.module.blog.gen.blog.resume.leisure
import org.platypus.module.blog.gen.blog.user.email
import org.platypus.module.blog.gen.blog.user.resume
import org.platypus.newTest
import org.platypus.orm.sql.predicate.ilike
import org.platypus.orm.sql.predicate.or
import org.platypus.orm.sql.query.ORDERBY_TYPE
import org.platypus.orm.sql.query.SearchQueryImpl

fun test() {
    val platy = Platypus.newTest(BaseBlogModule)
    platy.newEnv().use { env ->
        env.blogRepo.search {
            adjustSelect {
                it.user.select { email }
                it.user.join { resume }.select { leisure }
                it.user.join { resume }.select { education }
                it.user.join { resume }.select { experience }
            }

            where {
                (it.name ilike "dkf")
                        .or(it.user.predicate { email ilike "dfk" })
                        .or(it.user.join { resume }.predicate { experience ilike "fkdj" })
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
            on("Select a Many2OneField Field") {
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
            on("Select field of a Many2OneField Field") {
                platy.newEnv().use { env ->
                    val nbQ = { env.internal.cr.stat.nbSelect }
                    val nbQuery = env.internal.cr.stat.nbSelect
                    it("Should contains the ids and only one query is executed, only the name is fetched") {
                        val search = SearchQueryImpl(BlogModel, env).adjustSelect {
                            it.name
                            it.user.select { nums }
                        }
                        val ids = search.execute()
                        ids.shouldNotBeEmpty()
                        ids.size shouldEqualTo 2
                        nbQ() shouldEqualTo nbQuery + 1
                        for (id in ids) {
                            env.internal.cache.state(BlogModel of id) shouldBe CacheState.PARTIALLY
                            for (f in BlogModel.storeFields.filter { it != BlogModel.id }) {
                                if (f != BlogModel.name || f != BlogModel.user) {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.NONE
                                } else {
                                    env.internal.cache.state(BlogModel of id, f) shouldBe CacheState.FETCHED
                                }
                            }
                            val userCache = env.internal.cache[BlogModel of id, BlogModel.user]
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
            xon("Select a One2ManyField Field") {
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
            xon("Select a Many2ManyField Field") {
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

object AutoJoinSpek : Spek({
    describe("SearchQueryImpl class") {
        given("A platypus Instance") {
            val platy = Platypus.newTest(BaseBlogModule)
            on("Search All the Language with default order") {
                platy.newEnv().use { env ->
                    val bag = env.blogRepo.search {
                        adjustSelect {
                            it.user.select { email }
                            it.user.join { resume }.select { leisure }
                            it.user.join { resume }.select { education }
                            it.user.join { resume }.select { experience }
                        }
                    }
                    env.internal.cr.stat.nbSelect shouldEqualTo 0
                    for (blog in bag){
                        println(blog.user.email)
                        println(blog.user.resume.leisure)
                        println(blog.user.resume.education)
                        println(blog.user.resume.experience)
                    }
                    env.internal.cr.stat.nbSelect shouldEqualTo 1

                }
            }
        }
    }

})


//fun main(args: Array<String>) {
//    val platy = Platypus.newTest(BaseBlogModule)
////    val query = platy.newEnv().use { env ->
////        val selector: SearchQuerySelectPart<BlogModel>.(BlogModel) -> Unit = {
////            it.maintainer.select()
////            val j = it.parent join { parent }
////            j join { parent } select { maintainer }
////            j join { user } select { email }
////        }
////
////        val sel = SearchQuerySelectPartImpl(BlogModel)
////        sel.selector(BlogModel)
////        val query = SearchQueryImplV2(env, BlogModel, sel)
////        query.prepareSQL(QueryBuilder(false))
////    }
////    println(query)
//
//
//    val query2 = platy.newEnv().use { env ->
//        val fromTable = Alias(BlogModel, "from_table")
//        val parent = Alias(BlogModel, "parent")
//        val parentParent = Alias(BlogModel, "parent_parent")
//        val parentParentParent = Alias(BlogModel, "parent_parent_parent")
//        val joins = fromTable
//                .join(parent, Join.JoinType.LEFT, fromTable[BlogModel.parent], parent.id)
//                .join(parentParent, Join.JoinType.LEFT, parent[BlogModel.parent], parentParent.id)
//                .join(parentParentParent, Join.JoinType.LEFT, parentParent[BlogModel.parent], parentParentParent.id)
//
//        joins.alreadyInJoin(parentParent)
//
//        joins.joinParts
//        Query(env, joins
//                .slice(fromTable[BlogModel.id], fromTable[BlogModel.parent],
//                        parent[BlogModel.id], parent[BlogModel.parent],
//                        parentParent[BlogModel.id], parentParent[BlogModel.parent],
//                        parentParentParent[BlogModel.id], parentParentParent[BlogModel.parent])
//                , null)
//    }
//    println("=======")
//    println(query2.prepareSQL(QueryBuilder(false)))
//    println("=======")
//
//    val query = platy.newEnv().use { env ->
//        val query = env.blogRepo.buildQuery().adjustSelect {
//            it.maintainer.select()
//            it.parent join { parent } select { user }
//            it.parent join { parent } join {parent} select { maintainer }
//        }.where {
//            (it.parent join { maintainer } predicate { user eq 3 }) and (it.archived eq true)
//        }.limit(3)
//        query.execute()
//    }
//    println("=======")
//    println(query)
//    println("=======")
//
//
//}


