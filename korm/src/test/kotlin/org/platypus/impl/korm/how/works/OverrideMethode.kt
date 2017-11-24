package org.platypus.impl.korm.how.works

import org.junit.Assert
import org.junit.Test
import org.platypus.BaseTest
import org.platypus.api.context.ContextKeyNonNull
import org.platypus.api.context.ContextKeyNull
import org.platypus.impl.korm.how.works.modelentity.Post
import org.platypus.impl.korm.model.functions.one.ApiOneNoParamStacker

class OverrideMethode : BaseTest(BlogModule) {

    @Test
    fun test_call_super_first() {
        val methode1 = ApiOneNoParamStacker(
                fun(p: Post): List<String> {
                    return listOf("Original")
                }
        )
        methode1.addExtend { p ->
            val superList = p.callSuper()
            val l = superList.toMutableList()
            l.add("Extends1")
            l
        }

        methode1.addExtend { p ->
            val superList = p.callSuper()
            val l = superList.toMutableList()
            l.add("Extends2")
            l
        }

        val p = env.Post.newTmp {
            name = "Temp"
        }
        val res = methode1.call(p)
        val expected = listOf("Original", "Extends1", "Extends2")
        Assert.assertTrue("$expected != $res", expected == res)
    }

    @Test
    fun test_call_super_last() {
        val methode1 = ApiOneNoParamStacker(
                fun(p: Post): List<String> {
                    return listOf("Original")
                }
        )
        methode1.addExtend { p ->
            val l = mutableListOf("Extends1")
            l.addAll(p.callSuper())
            l
        }

        methode1.addExtend { p ->
            val l = mutableListOf("Extends2")
            l.addAll(p.callSuper())
            l
        }

        val p = env.Post.newTmp {
            name = "Temp"
        }
        val res = methode1.call(p)
        val expected = listOf("Extends2", "Extends1", "Original")
        Assert.assertTrue("$expected != $res", expected == res)
    }

    @Test
    fun test_passing_context() {
        val intCtx = ContextKeyNonNull("intCtx", 0)

        val strCtx = ContextKeyNull<String?>("strCtx")

        val methode1 = ApiOneNoParamStacker(
                fun(p: Post): List<String> {
                    Assert.assertEquals("My context", p.env.context[strCtx])
                    Assert.assertEquals(25, p.env.context[intCtx])
                    return listOf("Original")
                }
        )
        methode1.addExtend { p ->
            val l = mutableListOf("Extends1")
            Assert.assertEquals("My context", p.env.context[strCtx])
            l.addAll(p.withContext(intCtx of 25).callSuper())
            Assert.assertEquals(0, p.env.context[intCtx])
            l
        }

        methode1.addExtend { p ->
            val l = mutableListOf("Extends2")
            Assert.assertEquals(0, p.env.context[intCtx])
            Assert.assertNull(p.env.context[strCtx])
            l.addAll(p.withContext(strCtx of "My context").callSuper())
            Assert.assertEquals(0, p.env.context[intCtx])
            Assert.assertNull(p.env.context[strCtx])
            l
        }

        val p = env.Post.newTmp {
            name = "Temp"
        }
        val res = methode1.call(p)
        val expected = listOf("Extends2", "Extends1", "Original")
        Assert.assertTrue("$expected != $res", expected == res)
    }
}