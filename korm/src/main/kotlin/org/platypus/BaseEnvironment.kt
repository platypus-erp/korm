package org.platypus

import org.platypus.cache.ModelID
import org.platypus.cache.PlatypusCache
import org.platypus.cache.of
import org.platypus.config.PlatypusConf
import org.platypus.config.PlatypusConf.Companion.mode
import org.platypus.context.ContextKey
import org.platypus.context.PlatypusContext
import org.platypus.entity.Record
import org.platypus.entity.RecordImpl
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ModelFieldType.MANY_TO_MANY
import org.platypus.model.field.api.ModelFieldType.MANY_TO_ONE
import org.platypus.model.field.api.ModelFieldType.ONE_TO_ONE
import org.platypus.model.field.api.ModelFieldType.PK
import org.platypus.model.field.api.ModelFieldType.REV_ONE_TO_ONE
import org.platypus.model.field.api.isRelationalField
import org.platypus.module.base.entities.Language
import org.platypus.module.base.models.Users
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.dml.statements.InsertStatement
import org.platypus.orm.sql.dml.statements.UpdateStatement
import org.platypus.orm.sql.dml.storeFields
import org.platypus.orm.sql.predicate.eq
import org.platypus.orm.transaction.TransactionApi
import org.platypus.orm.transaction.TransactionExecutor
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.security.PlatypusUser
import org.platypus.security.ROOT_USER
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.time.ZoneId


class BaseEnvironment(
        override val envUser: PlatypusUser,
        override val sudoUser: PlatypusUser,
        override val conf: PlatypusConf,
        override val context: PlatypusContext,
        override val internal: PlatypusEnvironmentInternal
) : PlatypusEnvironment {

    internal companion object {
        fun create(user: PlatypusUser?, conf: PlatypusConf, context: PlatypusContext, newTransaction: TransactionApi): BaseEnvironment {
            val userUsed = user ?: ROOT_USER
            return BaseEnvironment(userUsed, userUsed, conf, context, BaseInternalEnvironment(newTransaction, PlatypusCache()))
        }
    }

    init {
        envUser.getData(this).fetch()
        sudoUser.getData(this).fetch()
        internal.cr.stat.reset()
    }

    override fun connect(user: PlatypusUser): PlatypusEnvironment {
        return BaseEnvironment(user, user, conf, context, internal)
    }

    override val lang: Language? = null
    override val timezone: ZoneId
        get() = ZoneId.systemDefault()
    override val debug: Boolean = conf.debug

    override val logger: Logger = LoggerFactory.getLogger("${envUser.externalRef} as ${sudoUser.externalRef}, ${lang?.name}")
    private val cache
        get() = internal.cache

    fun models(name:String):Model<*>{
        TODO()
    }

    override fun <M : Model<M>> repoOf(model: M): RecordRepository<M> {
        return RecordRepositoryImpl(this, model)
    }

    override fun <M : Model<M>> emptyRecordOf(model: M): Record<M> {
        return RecordImpl.empty(this, model)
    }

    override fun withContext(vararg vals: ContextKey.Value<*>): PlatypusEnvironment {
        return BaseEnvironment(envUser, sudoUser, conf, context.copy(vals), internal)
    }

    override fun sudo(user: PlatypusUser): PlatypusEnvironment {
        return BaseEnvironment(envUser, user, conf, context.copy(), internal)
    }


    override fun flush() {
        flushCache()
    }

    override fun flush(model: Model<*>) {
        for (toinsert in cache.toInsert.filter { it.model == model }) {
            flushInsert(toinsert)
        }
        for (toUpdate in cache.toUpdate.filter { it.key == model }.values) {
            flushUpdate(toUpdate, model)
        }

    }

    private fun flushCache() {
        for (toinsert in cache.toInsert) {
            flushInsert(toinsert)
        }
        for ((model, toUpdate) in cache.toUpdate) {
            flushUpdate(toUpdate, model)
        }
        cache.reset()
    }

    private fun flushUpdate(toUpdate: Map<Int, Set<IModelField<*, *>>>, model: IModel<*>) {
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

    private fun flushInsert(toinsert: ModelID) {
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
                                flushInsert(v)
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
        cache.addnewId(toinsert, newId)
    }

    override fun close() {
        println("Close Env in mode $mode")
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