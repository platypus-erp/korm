package org.platypus

import org.platypus.cache.CacheState
import org.platypus.cache.ModelID
import org.platypus.cache.PlatypusCache
import org.platypus.cache.modelID
import org.platypus.cache.of
import org.platypus.config.PlatypusConf
import org.platypus.config.PlatypusConf.Companion.mode
import org.platypus.context.ContextKey
import org.platypus.context.PlatypusContext
import org.platypus.context.newContext
import org.platypus.model.field.api.ModelFieldType.MANY_TO_MANY
import org.platypus.model.field.api.ModelFieldType.MANY_TO_ONE
import org.platypus.model.field.api.ModelFieldType.ONE_TO_ONE
import org.platypus.model.field.api.ModelFieldType.PK
import org.platypus.model.field.api.ModelFieldType.REV_ONE_TO_ONE
import org.platypus.model.field.api.isRelationalField
import org.platypus.module.base.entities.Language
import org.platypus.module.base.entities.User
import org.platypus.module.base.entities.users
import org.platypus.module.base.models.Users
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.dml.statements.InsertStatement
import org.platypus.orm.sql.dml.statements.UpdateStatement
import org.platypus.orm.sql.dml.storeFields
import org.platypus.orm.sql.query.buildSelect
import org.platypus.orm.sql.select
import org.platypus.orm.transaction.TransactionApi
import org.platypus.orm.transaction.TransactionExecutor
import org.platypus.orm.transaction.TransactionMode
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.repository.newTmpWithId
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.sql.SQLException
import java.time.LocalDateTime
import java.time.ZoneId



class BaseEnvironment(
        override val envUser: User,
        override val sudoUser: User,
        override val conf: PlatypusConf,
        override val context: PlatypusContext,
        override val internal: PlatypusEnvironmentInternal
) : PlatypusEnvironment {

    internal companion object {
        fun create(user: User?, conf: PlatypusConf, context: PlatypusContext, newTransaction: TransactionApi): BaseEnvironment {
            val fakeEnv = FirstStartEnv(conf, newTransaction)

            val userUsed = user
                    ?: fakeEnv.users.bagOf(Users.select(fakeEnv) { Users.externalRef eq conf.adminUserRef }).firstOrNull()
                    ?: fakeEnv.envUser
            return BaseEnvironment(userUsed, userUsed, conf, context, fakeEnv.internal)
        }
    }

    override fun connect(user: User): PlatypusEnvironment {
        return BaseEnvironment(user, user, conf, context, internal)
    }

    override val lang: Language? = null
    override val timezone: ZoneId
        get() = ZoneId.systemDefault()
    override val debug: Boolean = conf.debug

    override val logger: Logger = LoggerFactory.getLogger("${envUser.id} as ${sudoUser.id}, ${lang?.name}")
    private val cache
        get() = internal.cache

    override fun withContext(vararg vals: ContextKey.Value<*>): PlatypusEnvironment {
        return BaseEnvironment(envUser, sudoUser, conf, context.copy(vals), internal)
    }

    override fun sudo(user: User): PlatypusEnvironment {
        return BaseEnvironment(envUser, user, conf, context.copy(), internal)
    }


    override fun flush() {
        flushCache()
    }

    private fun flushCache() {
        for (toinsert in cache.toInsert) {
            createInsert(toinsert)
        }
        for ((model, toUpdate) in cache.toUpdate) {
            for ((id, fieldsToUpdate) in toUpdate) {
                model.storeFields
                val realId = cache.realID(model of id)
                val updateStatement = UpdateStatement(this, model, model.id eq realId.id)
                for (fieldToUpdate in fieldsToUpdate) {
                    val value = if (fieldToUpdate.type.typeEnum.isRelationalField()) {
                        val cacheValue = cache.getValue(model, id, fieldToUpdate).second as ModelID?
                        if (cacheValue != null) {
                            cache.realID(cacheValue)
                        } else {
                            null
                        }
                    } else {
                        cache.getValue(model, id, fieldToUpdate).second
                    }
                    updateStatement.forceSet(fieldToUpdate, value)
                }
                updateStatement.execute()
            }
        }
//        cache.toDelete.groupBy({ it.models }, { it.id }).forEach {
//            val op = if (it.value.size > 1) {
//                it.key.id inList it.value
//            } else {
//                it.key.id eq it.value[0]
//            }
//            DeleteStatement(this, it.key, op).execute()
//        }
        cache.reset()
    }

    private fun createInsert(toinsert: ModelID) {
        if (cache.isInDB(toinsert)) {
            return
        }
        val values = cache[toinsert]
        val insertStmt = InsertStatement<Int>(this, toinsert.model)
        for ((k, v) in values) {
            when (k.type.typeEnum) {
                MANY_TO_ONE, ONE_TO_ONE -> {
                    if (v != null) {
                        if (cache.isNotInDB(v as ModelID)) {
                            if (!cache.isToUpdate(toinsert, k)) {
                                createInsert(v)
                                insertStmt.forceSet(k, cache.realID(v).id)
                            }
                        } else {
                            insertStmt.forceSet(k, cache.realID(v).id)
                        }
                    } else {
                        insertStmt.forceSet(k, k.defaultValueFun?.invoke(this))
                    }
                }
                REV_ONE_TO_ONE, MANY_TO_MANY -> {

                }
                PK -> {
                    if (toinsert.model == Users && v == 1) {
                        insertStmt.forceSet(k, v)
                    }
                }
                else ->
                    if (k.store) {
                        if (v == null) {
                            insertStmt.forceSet(k, k.defaultValueFun?.invoke(this))
                        } else {
                            insertStmt.forceSet(k, v)
                        }
                    }
            }
        }
        insertStmt.execute()
        val newId = insertStmt[toinsert.model.id]
        println("ID=$newId")
        cache.addnewId(toinsert, newId)
    }

    override fun close() {
        println("Close Env $mode")
        flush()
        internal.cr.close()
    }
}

internal class BaseInternalEnvironment(trApi: TransactionApi, private val initialCache: PlatypusCache = PlatypusCache()) : PlatypusEnvironmentInternal {
    override val dbName: String = trApi.dbName
    override var cache: PlatypusCache = initialCache
        private set
    override val dialect: PersistenceDialect = trApi.dialect
    override val cr: TransactionExecutor = TransactionExecutor(trApi)

    override fun resetCache() {
        cache = initialCache
    }

    override fun close() {
        cr.closeExecutedStatements()
        cr.close()
        cache.close()
    }
}

fun initUser(conf: PlatypusConf, newTransaction: TransactionApi) {
    val fake = FirstStartEnv(conf, newTransaction)
    val env = BaseEnvironment(fake.adminUser, fake.adminUser, conf, newContext(), fake.internal)
    val q = env.buildSelect(Users) {
        where {
            it.externalRef eq conf.adminUserRef
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
        insertStmt.forceSet(Users.externalRef, conf.adminUserRef)
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
    override val envUser: User
        get() = adminUser
    override val sudoUser: User
        get() = adminUser

    val adminUser = RecordRepositoryImpl(this, Users).newTmpWithId(false, 1, false) {}

    init {
        internal.cache.forceSet(adminUser.modelID, Users.id, 1, CacheState.FETCHED)
        internal.cache.forceSet(adminUser.modelID, Users.externalRef, conf.adminUserRef, CacheState.FETCHED)
        internal.cache.forceSet(adminUser.modelID, Users.name, "Root", CacheState.FETCHED)
        internal.cache.forceSet(adminUser.modelID, Users.createUid, adminUser.modelID.id, CacheState.FETCHED)
        internal.cache.forceSet(adminUser.modelID, Users.createDate, LocalDateTime.now(), CacheState.FETCHED)
        this.users.newTmpWithId(true, 1, false) {}
    }

    override fun withContext(vararg vals: ContextKey.Value<*>): PlatypusEnvironment {
        throw UnsupportedOperationException()
    }

    override fun sudo(user: User): PlatypusEnvironment {
        throw UnsupportedOperationException()
    }

    override fun connect(user: User): PlatypusEnvironment {
        throw UnsupportedOperationException()
    }

    override fun flush() {
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