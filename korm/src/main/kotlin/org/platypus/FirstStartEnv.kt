package org.platypus

import org.platypus.cache.CacheState
import org.platypus.cache.of
import org.platypus.config.PlatypusConf
import org.platypus.context.ContextKey
import org.platypus.context.PlatypusContext
import org.platypus.context.newContext
import org.platypus.model.Model
import org.platypus.module.base.entities.Language
import org.platypus.module.base.models.Users
import org.platypus.orm.sql.dml.statements.InsertStatement
import org.platypus.orm.sql.expression.eq
import org.platypus.orm.sql.query.buildSelect
import org.platypus.orm.transaction.TransactionApi
import org.platypus.orm.transaction.TransactionMode
import org.platypus.security.PlatypusUser
import org.platypus.security.ROOT_USER
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.sql.SQLException
import java.time.LocalDateTime
import java.time.ZoneId

fun initUser(conf: PlatypusConf, newTransaction: TransactionApi) {
    val fake = FirstStartEnv(conf, newTransaction)
    val env = BaseEnvironment(fake.envUser, fake.sudoUser, conf, newContext(), fake.internal)
    val q = env.buildSelect(Users) {
        where {
            it.externalRef eq ROOT_USER.externalRef
        }
        limit(1)
    }
    if (q.firstOrNull() == null) {
        val id = (env.internal.cr.native("SELECT nextval('${Users.tableName}_${Users.id.fieldName}_seq')") {
            it.next()
            it.getInt(1)
        })
        val insertStmt = InsertStatement<Int>(env, Users, false)
        insertStmt.forceSet(Users.id, id)
        insertStmt.forceSet(Users.externalRef, PLATYPUS_ROOT_USER_REF)
        insertStmt.forceSet(Users.createUid, id)
        insertStmt.forceSet(Users.createDate, LocalDateTime.now())
        insertStmt.forceSet(Users.name, "Root")
        insertStmt.execute()

        env.close()
    }
}

private class FirstStartEnv(override val conf: PlatypusConf, newTransaction: TransactionApi) : PlatypusEnvironment {


    override val lang: Language? = null
    override val timezone: ZoneId = ZoneId.systemDefault()
    override val debug: Boolean = false
    override val logger: Logger = LoggerFactory.getLogger("FirstStartEnv")
    override val internal: PlatypusEnvironmentInternal = BaseInternalEnvironment(newTransaction)
    override val context: PlatypusContext = PlatypusContext()
    override val envUser: PlatypusUser
        get() = ROOT_USER
    override val sudoUser: PlatypusUser
        get() = ROOT_USER


    init {
        val modelId = Users of 1
        internal.cache.forceSet(modelId, Users.id, 1, CacheState.FETCHED)
        internal.cache.forceSet(modelId, Users.externalRef, "ROOT_USER", CacheState.FETCHED)
        internal.cache.forceSet(modelId, Users.name, "Root", CacheState.FETCHED)
        internal.cache.forceSet(modelId, Users.createUid, 1, CacheState.FETCHED)
        internal.cache.forceSet(modelId, Users.createDate, LocalDateTime.now(), CacheState.FETCHED)
//        TODO when the domain can be evaluate in cache then call this method
//        this.users.newTmpWithId(true, 1, false) {}
    }

    override fun withContext(vararg vals: ContextKey.Value<*>): PlatypusEnvironment {
        throw UnsupportedOperationException()
    }

    override fun sudo(user: PlatypusUser): PlatypusEnvironment {
        throw UnsupportedOperationException()
    }

    override fun connect(user: PlatypusUser): PlatypusEnvironment {
        throw UnsupportedOperationException()
    }

    override fun flush() {
        throw UnsupportedOperationException("You can't flush a Fake Environment")
    }

    override fun flush(model: Model<*>) {
        throw UnsupportedOperationException("You can't flush a Fake Environment")
    }

    override fun close() {
        println("Close Env")
        flush()
        try {
            if (PlatypusConf.mode == TransactionMode.NORMAL) {
                internal.cr.commit()
            } else {
                internal.cr.rollback()
            }
        } catch (e: SQLException) {
            internal.cr.rollback()
        }
    }
}