package org.platypus.test

import org.amshove.kluent.`should equal`
import org.amshove.kluent.shouldBeNull
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.cache.CacheState
import org.platypus.cache.of
import org.platypus.entity.EntityState
import org.platypus.orm.sql.dml.StatementType
import org.platypus.struct.BlogPostModel.title
import org.platypus.struct.UserMokModel
import org.platypus.struct.blogPostRepo
import org.platypus.struct.email
import org.platypus.struct.tags
import org.platypus.struct.userMokRepo

class TestEntityUpdate {
    lateinit var env: PlatypusEnvironment

    @BeforeEach
    fun before() {
        val tmpEnv = Platypus.newTest().newEnv()
        createData(tmpEnv)
        tmpEnv.flush()
        tmpEnv.close()
        env = Platypus.newTest().newFakeEnv()
    }

    @AfterEach
    fun after() {
        env.close()
        dropDb()
    }

    @Test
    fun testQueryUserJaneUpdateEmail() {
        val userJanes = env.userMokRepo.search { where { UserMokModel.name eq "Jane Smith" }}
        userJanes.first().internalState `should equal` EntityState.MANAGED
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        val userJane = userJanes.first()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        userJane.email = "jane.smith2@example.com"
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        env.internal.cr.stat.map[StatementType.UPDATE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.DELETE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.INSERT].shouldBeNull()
        userJane.email `should equal` "jane.smith2@example.com"
        env.internal.cache.state(userJane.model of userJane.id, UserMokModel.email) `should equal` CacheState.UPDATED
        env.flush()
        env.internal.cr.stat.map[StatementType.UPDATE] `should equal` 1
    }

    @Test
    fun testUpdateMany2Many() {
        val post1 = env.blogPostRepo.search { title eq "1st Post" }.first()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        val tags = post1.tags
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        tags.size `should equal` 2
        tags.toMutableBag().removeIf { it.name == "Tendings" }
        env.internal.cr.stat.map[StatementType.DELETE] `should equal` 1
        tags.size `should equal` 1
        post1.tags.size `should equal` 1
        val janeTag = tags.first()
        janeTag.name `should equal` "Jane 's"
        env.flush()
        env.internal.cr.stat.map[StatementType.UPDATE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.DELETE] `should equal` 1
    }

    @Test
    fun testUpdateMany2ManyWithFilter() {
        val post1 = env.blogPostRepo.search { title eq "1st Post" }.first()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        val tags = post1.tags
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        tags.size `should equal` 2
        tags.toMutableBag().remove(tags.first { it.name == "Tendings" })
        tags.size `should equal` 1
        post1.tags.size `should equal` 1
        val janeTag = tags.first()
        janeTag.name `should equal` "Jane 's"
        env.flush()
        env.internal.cr.stat.map[StatementType.UPDATE].shouldBeNull()
        env.internal.cr.stat.map[StatementType.DELETE] `should equal` 1

    }


}

