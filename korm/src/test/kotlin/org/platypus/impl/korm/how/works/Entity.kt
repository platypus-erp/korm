package org.platypus.impl.korm.how.works

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.platypus.BaseTest
import org.platypus.impl.korm.how.works.modelentity.Post
import org.platypus.impl.korm.how.works.modelentity.PostComment
import org.platypus.impl.korm.how.works.modelentity.PostTag
import org.platypus.impl.korm.how.works.modelentity.body
import org.platypus.impl.korm.how.works.modelentity.comments
import org.platypus.impl.korm.how.works.modelentity.post
import org.platypus.impl.korm.how.works.modelentity.posts
import org.platypus.impl.korm.how.works.modelentity.tags


class TestSelectEntity : BaseTest(BlogModule) {


    @Test
    fun testGetByRef() {
        val postComment1 = env.PostComment["post1_comment1"]
        assertEquals("Inline data", postComment1.name)
        assertEquals("platypus_user", postComment1.externalRef)
        assertNotNull(postComment1.post)
        assertStat(nbSelect = 1)
        assertCacheScheduled()
    }

    @Test
    fun testGetByRefMany2OneAutoQuery() {
        val postComment1 = env.PostComment["post1_comment1"]
        assertStat(nbSelect = 1)
        assertEquals("Inline data", postComment1.name)
        assertEquals("platypus_user", postComment1.externalRef)
        assertNotNull(postComment1.post)
        assertEquals("My first Post", postComment1.post.name)
        assertEquals("post1", postComment1.post.externalRef)
        assertStat(nbSelect = 1)
        assertCacheScheduled()
    }

    @Test
    fun testGetByRefOne2ManyAutoQuery() {
        val post = env.Post["post1"]
        assertEquals("My first Post", post.name)
        assertEquals("post1", post.externalRef)
        assertEquals(post.comments.size, 2)
        assertStat(nbSelect = 2)
        assertCacheScheduled()
    }

    @Test
    fun testGetByRefMany2ManyAutoQuery() {
        val post = env.Post["post1_comment1"]
        assertStat(nbSelect = 1)
        assertEquals("Manager", post.name)
        assertEquals("manager_user", post.externalRef)
        assertEquals(2, post.tags.size)
        assertStat(nbSelect = 2)

        val tag = env.PostTag["tag_platypus"]
        assertStat(nbSelect = 3)
        for (g in tag.posts) {
            logger.info(g.name)
            logger.info(g.externalRef)
        }
        assertStat(nbSelect = 5)
    }

}

class InsertEntity : BaseTest(BlogModule) {

    @Test
    fun testNewEntity() {
        val newPost = env.Post.newTmp {
            name = "PostTest"
            body = "Content"
            comments += env.PostComment["manager_role"]
        }
        assertCacheScheduled(nbInsert = 0, nbUpdate = 0)
        assertStat(nbSelect = 1)
        assertNotNull(newPost.id)
        assertTrue(newPost.id < 0)
        newPost.name = "PostTest2"
        assertStat(nbSelect = 1)
        assertCacheScheduled(nbInsert = 0, nbUpdate = 0)
    }

    @Test
    fun testNewEntityAndPersist() {
        val newUser = env.Post.newTmp {
            name = "PostTest"
            body = "Content"
        }
        assertStat(nbSelect = 1)
        assertNotNull(newUser.id)
        assertTrue(newUser.id < 0)
        assertCacheScheduled(nbInsert = 0)
        newUser.store()
        assertCacheScheduled(nbInsert = 1)
        assertEquals(newUser.id, env.cr.cache.toInsert.toList()[0].id)
        assertStat(nbSelect = 1, nbInsert = 0)
        env.cr.flushCache()
        assertStat(nbSelect = 1, nbInsert = 1)
        assertCacheScheduled(nbInsert = 0)
        assertTrue(newUser.id > 0)
    }

}