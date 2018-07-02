package org.platypus.repository

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.bag.BagSearchQuery
import org.platypus.cache.ModelID
import org.platypus.cache.ModelIDS
import org.platypus.cache.of
import org.platypus.context.ContextKey
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.entity.RecordImpl
import org.platypus.model.Model
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.eq
import org.platypus.orm.sql.expression.inList
import org.platypus.orm.sql.query.FieldGetter
import org.platypus.orm.sql.query.Query
import org.platypus.orm.sql.query.SearchQuery
import org.platypus.orm.sql.query.SearchQueryImpl
import org.platypus.security.PlatypusUser
import org.platypus.utils.EntityNotFoundById

class RecordRepositoryImpl<M : Model<M>>(override val env: PlatypusEnvironment, override val model: M) : RecordRepository<M> {

    override val datas: DataRef<M>
        get() = DataRef(env)


    override fun byId(id: Int): Record<M> {
        val modelId = (model of id)
        if (id == 0) {
            return RecordImpl.empty(this.env, this.model)
        } else if (modelId.exist()) {
            return model.getById.call(this, id).result
        }
        throw EntityNotFoundById(id, this.model.modelName)
    }


    override fun byIds(ids: Collection<Int>): Bag<M> {
        val partition = ids.filter { it != 0 }.partition { it > 0 }
        val positiveIds = partition.first.filterInDb()
        val negativeIds = partition.second.filterInCache()
        return when {
            positiveIds.isEmpty() && negativeIds.isEmpty() -> model.getByIds.call(this, emptyList()).result
            positiveIds.isEmpty() -> model.getByIds.call(this, negativeIds).result
            negativeIds.isEmpty() -> model.getByIds.call(this, positiveIds).result
            else -> model.getByIds.call(this, positiveIds + negativeIds).result
        }

    }

    private fun Collection<Int>.filterInDb(): List<Int> = if (isNotEmpty()) {
        val (inCache, notInCache) = partition { (model of it).testCache() }
        inCache + if (notInCache.isNotEmpty()) {
            SearchQueryImpl(model, env).where {
                it.id inList notInCache
            }.execute()
        } else {
            emptyList()
        }
    } else {
        emptyList()
    }

    private fun Collection<Int>.filterInCache(): List<Int> = if (isNotEmpty()) {
        filter { (model of it).testCache() }
    } else {
        emptyList()
    }

    override fun byRef(ref: String, throwError: Boolean): Record<M> {
        val id: Int? = env.internal.cache[model to ref]?.id
        return if (id != null) {
            RecordImpl(id, env, model)
        } else {
            whereFirst { model.externalRef eq ref }
        }
    }

    override fun where(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): Bag<M> {
        return BagSearchQuery(SearchQueryImpl(model, env).where(predicate), env, model)
    }

    override fun whereFirst(predicate: FieldGetter<M>.(M) -> Expression<Boolean>): Record<M> {
        return RecordImpl(SearchQueryImpl(model, env).where(predicate).limit(1), env, model)
    }


    override fun new(init: Record<M>.() -> Unit): Record<M> = create(newTmp(init))

    override fun newWithDefault(init: Record<M>.() -> Unit): Record<M> = create(newTmpWithDefault(init))

    override fun newTmp(init: Record<M>.() -> Unit): Record<M> = newTmpWithId(false, true, init)

    override fun newTmpWithDefault(init: Record<M>.() -> Unit): Record<M> = newTmpWithId(true, true, init)

    override fun create(entity: Record<M>): Record<M> = model.create.call(entity).result

    private fun loadInCache(modelID: ModelIDS) {
        val idsPartition = modelID.ids.partition { (modelID.model of it).testCache() }
        if (idsPartition.first.isNotEmpty()) {
            search {
                where { model.id inList idsPartition.first.map { it } }
            }
        }
    }

    override fun bagOf(query: Query): Bag<M> {
        TODO()
    }

    override fun bagOf(query: SearchQuery<M>): Bag<M> = BagSearchQuery(query, env, model)

    override fun recordOf(query: SearchQuery<M>): Record<M> = RecordImpl(query.limit(1), env, model)

    override fun buildQuery(): SearchQuery<M> = SearchQueryImpl(model, env)

    override fun searchFirst(init: SearchQuery<M>.(M) -> Unit): Record<M> {
        return recordOf(buildQuery().limit(1).apply { init(model) })
    }

    private fun ModelID.testCache(): Boolean = this in env.internal.cache

    private fun ModelID.exist(): Boolean {
        if (id < 0) {
            return testCache()
        }
        if (id > 0) {
            return search {
                where {
                    it.id eq id
                }
            }.isNotEmpty()
        }
        return false
    }


    override fun search(query: SearchQuery<M>.(M) -> Unit) = model.search.call(this, query)


    private fun PlatypusEnvironment.empty(): Record<M> {
        return RecordImpl(0, this, model)
    }

    override fun delete(id: Int): Boolean {
        model.delete.call(RecordImpl(id, env, model)).result
        return true
    }

    override fun delete(id: Record<M>): Boolean {
        model.delete.call(id).result
        return true
    }


    override fun withContext(vararg vals: ContextKey.Value<*>): RecordRepository<M> {
        return RecordRepositoryImpl(env.withContext(*vals), model)
    }

    override fun sudo(user: PlatypusUser): RecordRepository<M> {
        return RecordRepositoryImpl(env.sudo(user), model)
    }

    private fun ModelID.emptyEntity(): Record<M> = RecordImpl(this.id, env, this@RecordRepositoryImpl.model)
}
