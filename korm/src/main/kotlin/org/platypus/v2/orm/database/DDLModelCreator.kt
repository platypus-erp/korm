package org.platypus.v2.orm.database

import org.platypus.model.Alias
import org.platypus.model.IModel
import org.platypus.model.LinkModel
import org.platypus.model.MixinModel
import org.platypus.model.Model
import org.platypus.model.ModelVisitor
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.IModelField
import org.platypus.orm.database.ddl.FieldDDL
import org.platypus.orm.database.ddl.TableDDL
import org.platypus.orm.database.vendors.DDL_MODE
import org.platypus.utils.appendIf
import org.platypus.utils.comma
import org.platypus.utils.space
import org.platypus.utils.token
import org.platypus.v2.model.field.api.BaseField
import org.platypus.v2.visitor.BaseFieldVisitor

interface DDLModelCreator : ModelVisitor<DDL_MODE, TableDDL>, BaseFieldVisitor<DDL_MODE, FieldDDL> {
    val pretty: Boolean
    val acceptIfNotExist: Boolean

    fun identity(mod: BaseField<*, *>): String
    fun identity(mod: IModel<*>): String
    fun String.inProperCase(): String

    override fun visit(m: Model<*>, p: DDL_MODE): TableDDL {
        return when (p) {
            DDL_MODE.CREATE -> m.createStatement()
            DDL_MODE.DROP -> m.dropStatement()
            DDL_MODE.ALTER -> TODO()
        }

    }

    override fun visit(m: LinkModel<*, *>, p: DDL_MODE): TableDDL {
        return when (p) {
            DDL_MODE.CREATE -> m.createStatement()
            DDL_MODE.DROP -> m.dropStatement()
            DDL_MODE.ALTER -> TODO()
        }
    }

    private fun LinkModel<*, *>.createStatement(): TableDDL {
        val builder = StringBuilder("CREATE TABLE")
        val constraint = HashSet<String>()
        builder.appendIf(acceptIfNotExist, " IF NOT EXISTS ")
        builder.append(identity(this))
        builder.space().append("(")
        val pk = this.id.accept(this@DDLModelCreator, DDL_MODE.CREATE)
        constraint.addAll(pk.constraint)
        builder.appendIf(pretty, "\n\t")
        builder.append(pk.fieldDef)
        builder.comma()
        val fieldDDl1 = this.m1M2O.accept(this@DDLModelCreator, DDL_MODE.CREATE)
        constraint.addAll(fieldDDl1.constraint)
        builder.appendIf(pretty, "\n\t")
        builder.append(fieldDDl1.fieldDef)
        builder.comma()
        val fieldDDl2 = this.m2M2O.accept(this@DDLModelCreator, DDL_MODE.CREATE)
        constraint.addAll(fieldDDl2.constraint)
        builder.appendIf(pretty, "\n\t")
        builder.append(fieldDDl2.fieldDef)
        builder.appendIf(pretty, "\n").append(")")
        return TableDDL(builder.toString(), constraint)
    }

    private fun LinkModel<*, *>.dropStatement(): TableDDL {
        val builder = StringBuilder("DROP TABLE")
        val constraint = HashSet<String>()
        builder.appendIf(acceptIfNotExist, " IF EXISTS ")
        builder.append(identity(this))
        val fieldDDl1 = this.m1M2O.accept(this@DDLModelCreator, DDL_MODE.DROP)
        constraint.addAll(fieldDDl1.constraint)
        val fieldDDl2 = this.m2M2O.accept(this@DDLModelCreator, DDL_MODE.DROP)
        constraint.addAll(fieldDDl2.constraint)
        return TableDDL(builder.toString(), constraint)
    }

    private fun Model<*>.createStatement(): TableDDL {
        val builder = StringBuilder("CREATE TABLE")
        builder.appendIf(acceptIfNotExist, " IF NOT EXISTS ")
        builder.append(identity(this))
        val fIterator = storeFields.iterator()
        val constraint = HashSet<String>()
        if (fIterator.hasNext()) {
            builder.space().append("(")
            while (fIterator.hasNext()) {
                val field = fIterator.next()
                val fieldDDl = field.accept(this@DDLModelCreator, DDL_MODE.CREATE)
                constraint.addAll(fieldDDl.constraint)
                if (fieldDDl.fieldDef.isNotBlank()) {
                    builder.appendIf(pretty, "\n\t")
                    builder.append(fieldDDl.fieldDef)
                    if (fIterator.hasNext()) {
                        builder.comma()
                    }
                }

            }
            builder.appendIf(pretty, "\n").append(")")
        }
        return TableDDL(builder.toString(), constraint)
    }

    private fun Model<*>.dropStatement(): TableDDL = TableDDL(
            buildString {
                token("DROP TABLE")
                appendIf(acceptIfNotExist, " IF EXISTS ")
                append(identity(this@dropStatement))
            },
            storeFields.map { it.accept(this@DDLModelCreator, DDL_MODE.DROP) }
                    .flatMap { it.constraint }
                    .toSet())

    override fun visit(m: MixinModel<*>, p: DDL_MODE): TableDDL {
        TODO("not implemented")
    }

    override fun visit(m: Alias<*>, p: DDL_MODE): TableDDL = TableDDL("", emptySet())
}

abstract class DefaultDDLModelCreator(fieldVisitor: FieldVisitor<DDL_MODE, FieldDDL>) : DDLModelCreator, FieldVisitor<DDL_MODE, FieldDDL> by fieldVisitor