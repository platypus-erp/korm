package org.platypus.orm.sql.ddl

import org.platypus.model.Alias
import org.platypus.model.LinkModel
import org.platypus.model.MixinModel
import org.platypus.model.Model
import org.platypus.model.ModelVisitor
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.sql.Index

object IndiceVisitor : ModelVisitor<PersistenceDialect, Set<Index>> {

    override fun visit(m: Model<*>, p: PersistenceDialect): Set<Index> =
            m.fields.groupBy {
                it.index
            }.map { (key, value) ->
                val allUnque = value.all { it.unique }
                val name = "idx_${key}_${if (allUnque) "unique" else "no_unique"}"
                Index(name, m.modelName, value.map { it.fieldName }, allUnque)
            }.toSet()


    override fun visit(m: LinkModel<*, *>, p: PersistenceDialect): Set<Index> =
            m.fields.groupBy {
                it.index
            }.map { (key, value) ->
                val allUnque = value.all { it.unique }
                val name = "idx_${key}_${if (allUnque) "unique" else "no_unique"}"
                Index(name, m.modelName, value.map { it.fieldName }, allUnque)
            }.toSet()

    override fun visit(m: MixinModel<*>, p: PersistenceDialect): Set<Index> {
        TODO("not implemented")
    }

    override fun visit(m: Alias<*>, p: PersistenceDialect): Set<Index> {
        TODO("not implemented")
    }
}
