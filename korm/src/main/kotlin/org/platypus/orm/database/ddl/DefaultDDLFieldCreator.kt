package org.platypus.orm.database.ddl

import org.platypus.model.IModel
import org.platypus.model.field.api.FieldVisitor
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.impl.ArchivedModelField
import org.platypus.model.field.impl.BinaryField
import org.platypus.model.field.impl.BooleanField
import org.platypus.model.field.impl.CreateDateModelField
import org.platypus.model.field.impl.CreateUID
import org.platypus.model.field.impl.DateField
import org.platypus.model.field.impl.DateTimeField
import org.platypus.model.field.impl.DecimalField
import org.platypus.model.field.impl.ExternalRefModelField
import org.platypus.model.field.impl.FieldAlias
import org.platypus.model.field.impl.IntField
import org.platypus.model.field.impl.Many2ManyField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.model.field.impl.Many2OneFieldLink
import org.platypus.model.field.impl.NameModelField
import org.platypus.model.field.impl.One2ManyField
import org.platypus.model.field.impl.One2OneField
import org.platypus.model.field.impl.PKModelField
import org.platypus.model.field.impl.ReferenceField
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID
import org.platypus.orm.OrmConstraint
import org.platypus.orm.database.vendors.DDL_MODE
import org.platypus.orm.sql.QueryBuilder
import org.platypus.utils.comma
import org.platypus.utils.space
import org.platypus.utils.token

data class FieldDDL(val fieldDef: String, val constraint: Set<String>)

abstract class DefaultDDLFieldCreator(
        private val inlineConstraint: Set<InlineConstraintType> = setOf(*InlineConstraintType.values())) : FieldVisitor<DDL_MODE, FieldDDL> {

    abstract fun identity(mod: IModelField<*, *>): String
    abstract fun identity(mod: IModel<*>): String
    abstract fun String.inProperCase(): String

    override fun visit(field: PKModelField<*>, p: DDL_MODE): FieldDDL {
        return FieldDDL(
                buildString {
                    token(identity(field))
                    token("SERIAL")
                    token("PRIMARY KEY")
                },
                emptySet()
        )
    }

    private fun StringBuilder.NotNull(field: IModelField<*, *>) =
            if (field.required && InlineConstraintType.NOT_NULL in inlineConstraint) {
                this.space().append("NOT NULL")
            } else this


    private fun StringBuilder.check(ck: OrmConstraint<*>): StringBuilder {
        if (InlineConstraintType.CHECK in inlineConstraint) {
            space()
            append("CONSTRAINT")
            space()
            append(ck.name)
            space()
            append("CHECK(")
            append(ck.toSQL(QueryBuilder(false)))
            append(")")
        }
        return this
    }

    private fun StringBuilder.unique(field: IModelField<*, *>) =
            if (field.unique == true && InlineConstraintType.UNIQ in inlineConstraint) {
                space().append("CONSTRAINT").space().append(field.fieldName).append("_uniq").space().append("UNIQUE")
            } else this


    private fun IModelField<*, *>.createFieldDDL(p: DDL_MODE, fieldType: StringBuilder.() -> StringBuilder): FieldDDL {
        return FieldDDL(buildString {
            token(identity(this@createFieldDDL))
            fieldType()
            NotNull(this@createFieldDDL)
            unique(this@createFieldDDL)
        }, this.constraint.map { StringBuilder().check(it).toString() }.toSet())
    }

    override fun visit(field: StringField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("VARCHAR").append("(").append(field.length).append(")") }
    }

    override fun visit(field: DateField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("DATE") }
    }

    override fun visit(field: DateTimeField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("TIMESTAMP") }
    }

    override fun visit(field: TimeField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("TIME") }
    }

    override fun visit(field: BooleanField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("BOOLEAN") }
    }

    override fun visit(field: TextField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("TEXT") }
    }

    override fun visit(field: DecimalField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) {
            append("NUMERIC(")
                    .append(field.precision.precision)
                    .comma()
                    .append(field.precision.scale)
                    .append(")")
        }
    }

    override fun visit(field: IntField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("INTEGER") }
    }

    override fun visit(field: BinaryField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("BYTEA") }
    }

    override fun visit(field: One2ManyField<*, *>, p: DDL_MODE): FieldDDL = FieldDDL("", emptySet())


    override fun visit(field: Many2OneField<*, *>, p: DDL_MODE): FieldDDL {
        return visitReference(field, p)
    }

    override fun visit(field: One2OneField<*, *>, p: DDL_MODE): FieldDDL {
        return visitReference(field, p)
    }

    fun visitReference(field: ReferenceField<*, *>, p: DDL_MODE): FieldDDL {
        val ddl = field.createFieldDDL(p) { append("INTEGER") }
        val refConstraint = when (p) {
            DDL_MODE.CREATE -> buildString {
                token("ALTER TABLE")
                token(identity(field.model))
                token("ADD")
                token("CONSTRAINT")
                append(field.fieldName).append("_").append(field.target.tableName.inProperCase()).append("_fk").space()
                token("FOREIGN KEY")
                append("(").append(identity(field)).token(")")
                token("REFERENCES")
                token(field.target.tableName.inProperCase())
                append("(").append(field.target.id.fieldName.inProperCase()).append(")").space()
                append(field.onDelete.toSQL(QueryBuilder()))
            }

            DDL_MODE.DROP -> buildString {
                token("ALTER TABLE")
                token(identity(field.model))
                token("DROP")
                token("CONSTRAINT")
                append(field.fieldName).append("_").append(field.target.tableName.inProperCase()).append("_fk")
            }
            DDL_MODE.ALTER -> TODO()
        }
        return FieldDDL(ddl.fieldDef, ddl.constraint + refConstraint)
    }

    override fun visit(field: RevOne2OneField<*, *>, p: DDL_MODE): FieldDDL = FieldDDL("", emptySet())

    override fun visit(field: Many2ManyField<*, *>, p: DDL_MODE): FieldDDL = FieldDDL("", emptySet())

    override fun visit(field: Many2OneFieldLink<*, *>, p: DDL_MODE): FieldDDL {
        val ddl = field.createFieldDDL(p) { append("INTEGER") }
        val refConstraint = when (p) {
            DDL_MODE.CREATE -> buildString {
                token("ALTER TABLE")
                token(identity(field.model))
                token("ADD")
                token("CONSTRAINT")
                append(field.fieldName).append("_").append(field.target.tableName.inProperCase()).append("_fk").space()
                token("FOREIGN KEY")
                append("(").append(identity(field)).token(")")
                token("REFERENCES")
                token(field.target.tableName.inProperCase())
                append("(").append(field.target.id.fieldName.inProperCase()).append(")").space()
                append(field.onDelete.toSQL(QueryBuilder()))
            }

            DDL_MODE.DROP -> buildString {
                token("ALTER TABLE")
                token(identity(field.model))
                token("DROP")
                token("CONSTRAINT")
                append(field.fieldName).append("_").append(field.target.tableName.inProperCase()).append("_fk")
            }
            DDL_MODE.ALTER -> TODO()
        }
        return FieldDDL(ddl.fieldDef, ddl.constraint + refConstraint)
    }

    override fun visit(field: SelectionField<*, *>, p: DDL_MODE): FieldDDL {
//        TODO Replace with enum
        return field.createFieldDDL(p) { append("VARCHAR") }
    }

    override fun visit(field: NameModelField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("VARCHAR") }
    }

    override fun visit(field: ExternalRefModelField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("VARCHAR") }
    }

    override fun visit(field: WriteDateModelField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("TIMESTAMP") }
    }

    override fun visit(field: CreateDateModelField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("TIMESTAMP") }
    }

    override fun visit(field: ArchivedModelField<*>, p: DDL_MODE): FieldDDL {
        return field.createFieldDDL(p) { append("BOOLEAN") }
    }

    override fun visit(field: FieldAlias<*, *>, p: DDL_MODE): FieldDDL {
        TODO("not implemented")
    }

    override fun visit(field: CreateUID<*>, p: DDL_MODE): FieldDDL {
        return visitReference(field, p)
    }

    override fun visit(field: WriteUID<*>, p: DDL_MODE): FieldDDL {
        return visitReference(field, p)
    }
}


