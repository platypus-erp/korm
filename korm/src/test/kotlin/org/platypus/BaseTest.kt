package org.platypus

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.sql.transactions.transaction
import org.platypus.impl.module.ModuleDef
import org.slf4j.LoggerFactory
import kotlin.properties.Delegates

abstract class BaseTest(val module: ModuleDef) {

    open fun setUp() {}

    @Rule
    @JvmField
    var watchman: TestWatcher = object : TestWatcher() {
        override fun starting(description: Description) {
            logger = LoggerFactory.getLogger(description.methodName)
            logger.info("----------------------------------------")
        }

        override fun finished(description: Description) {
            super.finished(description)
            logger.info("----------------------------------------")
        }
    }

    val server
        get() = _server

    val env
        get() = _env

    private var _server by Delegates.notNull<Platypus>()
    private var _env by Delegates.notNull<PlatypusEnvironement>()

    var logger = LoggerFactory.getLogger("Test")


    protected fun assertStat(nbInsert: Int = 0, nbUpdate: Int = 0, nbDelete: Int = 0, nbSelect: Int = 0) {
        assertEquals(nbInsert, env.cr.stat.nbInsert)
        assertEquals(nbSelect, env.cr.stat.nbSelect)
        assertEquals(nbDelete, env.cr.stat.nbDelete)
        assertEquals(nbUpdate, env.cr.stat.nbUpdate)
    }

    protected fun assertCacheScheduled(nbInsert: Int = 0, nbUpdate: Int = 0) {
        assertEquals(nbInsert, env.cr.cache.toInsert.size)
        assertEquals(nbUpdate, env.cr.cache.toUpdate.size)
    }

    @Before
    open fun before() {
        _server = Platypus.create { dbName = "platypus-test" }
        _server.init(module.getModule())
        _env = _server.newEnv()
        assertTrue(env.cr.cache.isEmpty())
        setUp()
    }

    @After
    open fun after() {
        _env.cr.flushCache()
        _env.cr.rollback()
    }


}

private fun deleteAll() {
    transaction {
        //        UserModel.internalTable.deleteAll()
//        RoleModel.groups.relationTable.deleteAll()
//        RoleModel.internalTable.deleteAll()
//        GroupModel.internalTable.deleteAll()
    }
}