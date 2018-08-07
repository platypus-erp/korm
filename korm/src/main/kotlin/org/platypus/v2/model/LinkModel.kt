package org.platypus.v2.model

import org.platypus.cache.ModelID
import org.platypus.cache.ModelIDS
import org.platypus.cache.of
import org.platypus.model.IModel
import org.platypus.model.Model
import org.platypus.model.ModelVisitor
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.Many2OneFieldLink
import org.platypus.model.field.impl.PKModelField
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.predicate.eq
import org.platypus.orm.sql.select
import org.platypus.v2.env.PlatypusEnvironment
import org.platypus.v2.model.field.Many2OneFieldImpl
import org.platypus.v2.model.field.magic.IdField
import org.platypus.v2.model.field.magic.IdFieldImpl
import kotlin.reflect.KProperty

infix fun <M1 : BaseModel<M1>,M2 : BaseModel<M2>> M1.many2manyLink(m2: M2) = LinkModelDelegate(this, m2)
data class LinkModelDelegate<M1 : BaseModel<M1>, M2 : BaseModel<M2>>(val m1: M1, val m2: M2)
object ModelMany2Many {

    val m2mLink = HashMap<String, LinkModel<*, *>>()

    operator fun <M1 : BaseModel<M1>, M2 : BaseModel<M2>>
            LinkModelDelegate<M1, M2>.getValue(obj: ModelMany2Many?, kProperty: KProperty<*>): LinkModel<M1, M2> {
        val res = m2mLink.getOrPut(kProperty.name, { LinkModel(kProperty.name, { this.m1 }, { this.m2 }) })
        return res as LinkModel<M1, M2>
    }
}

class LinkModel<M1 : BaseModel<M1>, M2 : BaseModel<M2>>(
        override val modelName: String,
        private val m1: () -> M1,
        private val m2: () -> M2,
        val onDelete: ReferenceOption = ReferenceOption.SET_NULL
) : BaseModel<LinkModel<M1, M2>> {

    override val id: IdField<LinkModel<M1, M2>> = IdFieldImpl(this)
    override val fields: Set<IModelField<*, *>>
        get() = setOf(id, m1M2O, m2M2O)

    override fun targetTables(): List<IModel<*>> = listOf(this, m1M2O.model, m2M2O.model)

    internal val m1M2O by lazy { Many2OneFieldImpl("${m1().tableName}_id", this, m1(), ReferenceOption.CASCADE, null) }
    internal val m2M2O by lazy { Many2OneFieldLink("${m2().tableName}_id", this, m2(), ReferenceOption.CASCADE, null) }


    override fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN = visitor.visit(this, p)
    val reverse: LinkModel<M2, M1> by lazy { LinkModel(modelName, m2, m1) }

    @JvmName("findIdsR")
    fun findIds(env: PlatypusEnvironment, prop: Many2ManyField<M2, M1>, modelID: ModelID): ModelIDS {
        return if (env.internal.cache.isInDB(modelID)) {
            val id = env.internal.cache.realID(modelID)
            val q = this.slice(m1M2O).select(env) { m2M2O eq id.id }
            m1M2O.target of q.map { it.get(m1M2O)!!.id }
        } else {
            m1M2O.target of emptyList()
        }
    }

    fun findIds(env: PlatypusEnvironment, prop: Many2ManyField<M1, M2>, modelID: ModelID): ModelIDS {
        return if (env.internal.cache.isInDB(modelID)) {
            val id = env.internal.cache.realID(modelID)
            val query = this.slice(this.id, this.m1M2O, this.m2M2O).select(env) { m1M2O eq id.id }
            val ids = ArrayList<Int>()
            for (row in query) {
                env.internal.cache.store(this of row.get(this.id), setOf(this.id, this.m1M2O, this.m2M2O), row)
                ids.add(row.get(m2M2O)!!.id)
            }
            m2M2O.target of ids
        } else {
            m2M2O.model of emptyList()
        }
    }



    override fun hashCode(): Int {
        return modelName.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LinkModel<*, *>

        if (modelName != other.modelName) return false

        return true
    }
}