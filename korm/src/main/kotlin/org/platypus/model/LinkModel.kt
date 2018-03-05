package org.platypus.model

import org.platypus.PlatypusEnvironment
import org.platypus.cache.ModelID
import org.platypus.cache.ModelIDS
import org.platypus.cache.of
import org.platypus.entity.RecordImpl
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.Many2OneFieldLink
import org.platypus.model.field.impl.PKModelField
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.select
import kotlin.reflect.KProperty

infix fun <
        M1 : Model<M1>,
        M2 : Model<M2>> M1.many2manyLink(m2: M2) = LinkModelDelegate(this, m2)

data class LinkModelDelegate<M1 : Model<M1>, M2 : Model<M2>>(val m1: M1, val m2: M2)

object ModelMany2Many {

    val m2mLink = HashMap<String, LinkModel<*, *>>()

    operator fun <M1 : Model<M1>, M2 : Model<M2>>
            LinkModelDelegate<M1, M2>.getValue(obj: ModelMany2Many?, kProperty: KProperty<*>): LinkModel<M1, M2> {
        val res = m2mLink.getOrPut(kProperty.name, { LinkModel(kProperty.name, { this.m1 }, { this.m2 }) })
        return res as LinkModel<M1, M2>
    }
}

class LinkModel<M1 : Model<M1>, M2 : Model<M2>>(
        override val modelName: String,
        private val m1: () -> M1,
        private val m2: () -> M2,
        val onDelete: ReferenceOption = ReferenceOption.SET_NULL
) : IModel<LinkModel<M1, M2>> {

    override val id: PKModelField<LinkModel<M1, M2>> = PKModelField(this)
    override val slots: ModelSlots = ModelSlotsImpl(ModelType.LINK_MODEL)
    override val fields: Set<IModelField<*, *>>
        get() = setOf(id, m1M2O, m2M2O)

    override fun targetTables(): List<IModel<*>> = listOf(this, m1M2O.model, m2M2O.model)


    internal val m1M2O by lazy { Many2OneFieldLink("${m1().tableName}_id", this, m1(), ReferenceOption.CASCADE, null) }
    internal val m2M2O by lazy { Many2OneFieldLink("${m2().tableName}_id", this, m2(), ReferenceOption.CASCADE, null) }


    override fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN = visitor.visit(this, p)
    val reverse: LinkModel<M2, M1> by lazy { LinkModel(modelName, m2, m1) }

    @JvmName("findIdsR")
    fun findIds(env: PlatypusEnvironment, prop: Many2ManyField<M2, M1>, modelID: ModelID): ModelIDS {
        return if (env.internal.cache.isInDB(modelID)) {
            val id = env.internal.cache.realID(modelID)
            val q = this.slice(m1M2O).select(env) { m2M2O eq RecordImpl(id.id, env, m2M2O.target) }
            m1M2O.target of q.map { it[m1M2O].id }
        } else {
            m1M2O.target of emptyList()
        }
    }

    fun findIds(env: PlatypusEnvironment, prop: Many2ManyField<M1, M2>, modelID: ModelID): ModelIDS {
        return if (env.internal.cache.isInDB(modelID)) {
            val id = env.internal.cache.realID(modelID)
            val query = this.slice(this.id, this.m1M2O, this.m2M2O).select(env) { m1M2O eq RecordImpl(id.id, env, m1M2O.target) }
            val ids = ArrayList<Int>()
            for (row in query) {
                env.internal.cache.store(this of row[this.id], query.fieldSet.fieldsExpression, row)
                ids.add(row[m2M2O].id)
            }
            m2M2O.target of ids
        } else {
            m2M2O.model of emptyList()
        }
    }
}