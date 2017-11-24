package org.platypus.api.env

import org.platypus.api.context.KeyContextValue
import org.platypus.api.context.PlatypusContext
import org.platypus.base.Administrator
import org.platypus.base.entities.User
import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.sql.Transaction


class PlatypusEnvironement(
        private val transaction: Transaction,
        initCtx: PlatypusContext = PlatypusContext(),
        private val initUser: User? = null,
        private val sudoUser: User? = null
) : AutoCloseable {
    private val entityByName: MutableMap<String, PlatypusEntityGetter<*, *>> = HashMap()


    internal fun <T : Entity<T, M>, M : BaseModel<M, T>> register(m: M, e: PlatypusEntityGetter<T, M>) {
        entityByName[m.tableName] = e
    }

    fun closeEnv(): Map<ModelID, ModelID> {
        cr.commit()
        return cr.cache.mapFakeInserted
    }

    override fun close() {
        cr.commit()
    }

    private val envUser: User
        get() = initUser ?: User.dataRef.Administrator

    val context: PlatypusContext = initCtx

    val currentUser: User
        get() = sudoUser ?: envUser

    internal val cr: Transaction
        get() = transaction
    val logger
        get() = cr.logger

    internal fun replaceContext(ctx: PlatypusContext): PlatypusEnvironement {
        return PlatypusEnvironement(transaction, ctx.copy(), initUser, sudoUser)
    }

    fun withContext(vararg newCtx: KeyContextValue<*>): PlatypusEnvironement {
        return replaceContext(PlatypusContext(newCtx).update(context))
    }

    internal fun sudo(user: User): PlatypusEnvironement {
        return PlatypusEnvironement(transaction, context.copy(), envUser, user)
    }
}