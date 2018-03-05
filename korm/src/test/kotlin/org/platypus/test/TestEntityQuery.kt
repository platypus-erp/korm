package org.platypus.test

import org.amshove.kluent.`should equal`
import org.amshove.kluent.shouldNotBeNull
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.platypus.Platypus
import org.platypus.PlatypusEnvironment
import org.platypus.entity.EntityState
import org.platypus.orm.sql.dml.StatementType
import org.platypus.struct.BlogPostModel.title
import org.platypus.struct.UserMokModel
import org.platypus.struct.age
import org.platypus.struct.bestPost
import org.platypus.struct.blogPostRepo
import org.platypus.struct.email
import org.platypus.struct.nums
import org.platypus.struct.posts
import org.platypus.struct.profile
import org.platypus.struct.tagRepo
import org.platypus.struct.tags
import org.platypus.struct.title
import org.platypus.struct.userMokRepo

class TestEntityQuery {
    lateinit var env: PlatypusEnvironment

    @BeforeEach
    fun before() {
        val tmpEnv = Platypus.newTest().newEnv()
        createData(tmpEnv)
        tmpEnv.flush()
        tmpEnv.close()
        env = Platypus.newTest().newEnv()
    }

    @AfterEach
    fun after() {
        env.close()
        dropDb()
    }

    @Test
    fun testQueryUserJane() {
        val userJanes = env.userMokRepo.search { where { UserMokModel.name eq "Jane Smith" } }
        userJanes.first().internalState `should equal` EntityState.MANAGED
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        val userJane = userJanes.first()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        userJane.email `should equal` "jane.smith@example.com"
        userJane.nums `should equal` 2
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
    }

    @Test
    fun testQueryUserJaneProfile() {
        val userJane = env.userMokRepo.search { where { UserMokModel.name eq "Jane Smith" }}.first()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        userJane.internalState `should equal` EntityState.MANAGED
        val profileJaneNullable = userJane.profile
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 2
        profileJaneNullable.shouldNotBeNull()
        val profileJane = profileJaneNullable!!
        profileJane.internalState `should equal` EntityState.MANAGED
        profileJane.age `should equal` 23
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 2
    }

    @Test
    fun testQueryUserJaneProfileBlog() {
        val userJane = env.userMokRepo.search { UserMokModel.name eq "Jane Smith" }.first()
        val postsJane = userJane.posts
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        for (post in postsJane) {
            env.internal.cr.stat.map[StatementType.SELECT] `should equal` 2
        }
        postsJane.size `should equal` 2
        val bestPost = userJane.profile!!.bestPost!!
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 3
        bestPost.title `should equal` "1st Post"
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 3
    }

    @Test
    fun testQueryPost1Tags() {
        val post1 = env.blogPostRepo.search { title eq "1st Post" }.first()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        val tags = post1.tags
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        tags.size `should equal` 2
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 2
        for (tag in tags) {
            println(tag.name)
            env.internal.cr.stat.map[StatementType.SELECT] `should equal` 3
        }
        val trendinTags = tags.filter { it.name == "Tendings" }
        tags.first { it.name == "Trending" }
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 3
        trendinTags.size `should equal` 1
    }

    @Test
    fun testQueryTagTrendingPost() {
        val janesTag = env.tagRepo.search { where { UserMokModel.name eq "Jane 's" }}.first()
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 1
        val posts = janesTag.posts
        posts.size `should equal` 2
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 2
        for (post in posts) {
            println(post.title)
            env.internal.cr.stat.map[StatementType.SELECT] `should equal` 3
        }
        val firstPost = posts.filter { it.title == "1st Post" }
        env.internal.cr.stat.map[StatementType.SELECT] `should equal` 3
        firstPost.size `should equal` 1
    }
}