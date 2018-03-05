package org.platypus.orm.sql.ddl.schema

import org.platypus.PlatypusEnvironmentInternal
import org.platypus.model.IModel
import org.platypus.orm.database.ddl.TableDDL
import org.platypus.orm.database.vendors.DDL_MODE
import org.platypus.orm.sql.ddl.IndiceVisitor
import org.platypus.orm.sql.dml.RefereeFinder
import java.sql.DatabaseMetaData

class SchemaCreator(val internal: PlatypusEnvironmentInternal) {

    val dialect = internal.dialect

    private val metadata: DatabaseMetaData = internal.cr.connection.metaData

    private val utils = SchemaCreatorUtils(internal.dbName, metadata)

    companion object {
        fun create(internal: PlatypusEnvironmentInternal): SchemaCreator = SchemaCreator(internal)
    }

    private fun findDependsModel(models: Set<IModel<*>>): Set<IModel<*>> {
        val set = HashSet<IModel<*>>(models)
        for (model in models) {
            set.addAll(dddd(model, set))
        }
        return set
    }

    private fun dddd(m: IModel<*>, n: HashSet<IModel<*>>): Set<IModel<*>> {
        for (f in m.fields) {
            val ref = f.accept(RefereeFinder, Unit)
            if (ref != null && ref !in n) {
                n.add(ref)
                n.addAll(dddd(ref, n))
            }
        }
        return n
    }

    fun createStatements(tables: Collection<IModel<*>>): Set<TableDDL> {
        val statements = HashSet<TableDDL>()
        val allModels = findDependsModel(tables.toSet())

        if (allModels.isEmpty())
            return statements


        for (table in allModels) {
            if (utils.modelExist(table)) continue
            // create models
            statements.add(table.accept(dialect.dialectDDL.modelTypeProvider, DDL_MODE.CREATE))
        }

        return statements
    }

    fun dropStatement(tables: Collection<IModel<*>>): Set<TableDDL> {
        val statements = HashSet<TableDDL>()
        val allModels = findDependsModel(tables.toSet())
        if (allModels.isEmpty())
            return statements

        for (table in allModels) {
            statements.add(table.accept(dialect.dialectDDL.modelTypeProvider, DDL_MODE.DROP))
        }

        return statements
    }

    private fun createIndiceStatement(tables: Collection<IModel<*>>): Set<String> = tables
            .filter { utils.modelExist(it) }
            .flatMap { it.accept(IndiceVisitor, dialect) }
            .map { it.accept(dialect.dialectDDL.constraintVisitor, Unit) }
            .toSet()


    fun drop(tables: List<IModel<*>>) {
        val statements = dropStatement(tables)

        //        for (indice in createIndiceStatement(tables)) {
//            env.internal.cr.native(env, indice)
//        }
        for (statement in statements) {
            for (alter in statement.alter) {
                internal.cr.native(alter)
            }
        }
        for (statement in statements) {
            internal.cr.native(statement.struc)
        }

    }

    fun create(tables: List<IModel<*>>) {
        val statements = createStatements(tables)
        for (statement in statements) {
            internal.cr.native(statement.struc)
        }
        for (statement in statements) {
            for (alter in statement.alter) {
                internal.cr.native(alter)
            }
        }
//        for (indice in createIndiceStatement(tables)) {
//            env.internal.cr.native(env, indice)
//        }
    }
}