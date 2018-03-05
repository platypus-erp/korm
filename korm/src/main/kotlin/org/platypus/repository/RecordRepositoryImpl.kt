package org.platypus.repository

import org.platypus.PlatypusEnvironment
import org.platypus.bag.ArrayBag
import org.platypus.bag.Bag
import org.platypus.bag.MutableBag
import org.platypus.cache.CacheState
import org.platypus.cache.ModelID
import org.platypus.cache.ModelIDS
import org.platypus.cache.of
import org.platypus.context.ContextKey
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.entity.RecordImpl
import org.platypus.model.Model
import org.platypus.module.base.entities.User
import org.platypus.orm.sql.SizedCollection
import org.platypus.orm.sql.SizedIterable
import org.platypus.orm.sql.dml.FieldSet
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.Query
import org.platypus.orm.sql.query.ResultRow
import org.platypus.orm.sql.query.SmartQueryBuilder
import org.platypus.utils.EntityNotFoundById
import org.platypus.utils.EntityNotFoundByRef

class RecordRepositoryImpl<M : Model<M>>(override val env: PlatypusEnvironment, override val model: M) : RecordRepository<M> {

    override val datas: DataRef<M>
        get() = DataRef(env)

    override fun browse(id: Int): Record<M> = (model of id).testCache() ?: model.getById.call(this, id).result

    override fun browse(ids: Collection<Int>): Bag<M> {
        val needLoad = ids.filter { (model of it).needSearch() }
        if (needLoad.isNotEmpty()) {
            search {
                where { model.id inList needLoad }
            }
        }
        return ArrayBag(env, model, ids)
    }

    private fun ModelID.needSearch(): Boolean {
        return env.internal.cache.isInDB(this) && env.internal.cache.state(this) == CacheState.NONE
    }

    override fun byRef(ref: String): Record<M> {
        return byRefOrNull(ref) ?: throw EntityNotFoundByRef(ref, model.modelName)
    }

    override fun get(ref: String): Record<M> = byRef(ref)

    override fun byRefOrNull(ref: String): Record<M>? {
        val id: Int? = env.internal.cache[model to ref]?.id
        return if (id != null) {
            RecordImpl(id, env, model)
        } else {
            search {
                where { model.externalRef eq ref }
            }.firstOrNull()
        }
    }

    override fun fetch(id: Int): Record<M> {
        return fetchOrNull(id) ?: throw EntityNotFoundById(id, model.modelName)
    }

    override fun fetchOrNull(id: Int): Record<M>? = search {
        where { model.id eq id }
    }.firstOrNull()

    override fun bagOf(ids: Collection<Int>): Bag<M> {
        loadInCache(model of ids.toList())
        return ArrayBag(this.env, this.model, ids)
    }

    override fun bagOf(query: Query): Bag<M> {
        return ArrayBag(this.env, this.model, wrapRowsIds(query))
    }

    override fun mutableBagOf(ids: Collection<Int>): MutableBag<M> {
        loadInCache(model of ids.toList())
        return ArrayBag(this.env, this.model, ids)
    }

    override fun mutableBagOf(query: Query): MutableBag<M> {
        return ArrayBag(this.env, this.model, wrapRowsIds(query))
    }

    private fun loadInCache(modelID: ModelIDS) {
        val idsPartition = modelID.ids.partition { (modelID.model of it).testCache() == null }
        if (idsPartition.first.isNotEmpty()) {
            search {
                where { model.id inList idsPartition.first.map { it } }
            }
        }
    }

    private fun ModelID.testCache(): Record<M>? = if (this in env.internal.cache) RecordImpl(this.id, env, this@RecordRepositoryImpl.model) else null

    override fun find(where: M.() -> Expression<Boolean>): Bag<M> {
        TODO("not implemented")
    }

    override fun new(useDefault: Boolean, init: Record<M>.() -> Unit): Record<M> = create(newTmpWithId(useDefault, null, true, init))

    override fun create(entity: Record<M>): Record<M> = model.create.call(entity).result

    override fun newTmp(useDefault: Boolean, init: Record<M>.() -> Unit) = newTmpWithId(useDefault, null, true, init)


    override fun findFirstOrNull(op: M.() -> Expression<Boolean>): Record<M>? {
        return search {
            limit(limit = 1)
            where { model.op() }
        }.firstOrNull()
    }

    override fun findFirst(op: M.() -> Expression<Boolean>): Record<M> {
        return search {
            limit(1)
            where {
                model.op()
            }
        }.first()
    }

    override fun search(query: SmartQueryBuilder<M>.(M) -> Unit) = model.otherSearch.call(this, query).result


    private fun wrapRowsIds(query: Query): List<Int> {
        val ids = ArrayList<Int>()
        for (row in query) {
            env.internal.cache.store(row)
            ids.add(row[model.id])
        }
        return ids
    }

    private fun wrapRows(query: Query): SizedIterable<Record<M>> {
        val col = ArrayList<Record<M>>()
        for (row in query) {
            col.add(wrapRow(row, query.fieldSet))
        }
        return SizedCollection(col)
    }

    private fun wrapRow(row: ResultRow, fs: FieldSet): Record<M> {
        env.internal.cache.store(model of row[model.id], fs.fieldsExpression, row)
        return RecordImpl(row[model.id], env, model)
    }

    override fun delete(id: Int) {
        model.delete.call(newTmp(false) {}).result
    }

    override fun delete(id: Record<M>) {
        model.delete.call(id).result
    }


    override fun withContext(vararg vals: ContextKey.Value<*>): RecordRepository<M> {
        return RecordRepositoryImpl(env.withContext(*vals), model)
    }

    override fun sudo(user: User): RecordRepository<M> {
        return RecordRepositoryImpl(env.sudo(user), model)
    }

    private fun ModelID.emptyEntity(): Record<M> = RecordImpl(this.id, env, this@RecordRepositoryImpl.model)
}
