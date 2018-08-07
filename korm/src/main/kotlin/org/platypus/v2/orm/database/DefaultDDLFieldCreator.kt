package org.platypus.v2.orm.database

import org.platypus.model.IModel
import org.platypus.orm.OrmConstraint
import org.platypus.orm.database.ddl.FieldDDL
import org.platypus.orm.database.ddl.InlineConstraintType
import org.platypus.orm.database.vendors.DDL_MODE
import org.platypus.orm.sql.QueryBuilder
import org.platypus.utils.comma
import org.platypus.utils.space
import org.platypus.utils.token
import org.platypus.v2.model.field.BinaryField
import org.platypus.v2.model.field.BooleanField
import org.platypus.v2.model.field.DateField
import org.platypus.v2.model.field.DateTimeField
import org.platypus.v2.model.field.DecimalField
import org.platypus.v2.model.field.IntField
import org.platypus.v2.model.field.Many2ManyField
import org.platypus.v2.model.field.Many2OneField
import org.platypus.v2.model.field.One2ManyField
import org.platypus.v2.model.field.SelectionField
import org.platypus.v2.model.field.StringField
import org.platypus.v2.model.field.TextField
import org.platypus.v2.model.field.TimeField
import org.platypus.v2.model.field.api.BaseField
import org.platypus.v2.model.field.api.ReferenceField
import org.platypus.v2.model.field.magic.CreateDateField
import org.platypus.v2.model.field.magic.CreateUserField
import org.platypus.v2.model.field.magic.ExternalRefField
import org.platypus.v2.model.field.magic.IdField
import org.platypus.v2.model.field.magic.WriteDateField
import org.platypus.v2.model.field.magic.WriteUserField
import org.platypus.v2.visitor.BaseFieldVisitor

interface DDLFieldCreator : BaseFieldVisitor<DDL_MODE, FieldDDL> {

    val inlineConstraint: Set<InlineConstraintType>

    fun identity(mod: BaseField<*, *>): String
    fun identity(mod: IModel<*>): String
    fun String.inProperCase(): String


    override fun visit(field: IdField<*>, p: DDL_MODE) = FieldDDL(
            buildString {
                token(identity(field))
                token("SERIAL")
                token("PRIMARY KEY")
            },
            emptySet()
    )
    override fun visit(field: StringField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("VARCHAR").append("(").append(field.length).append(")") }
    override fun visit(field: DateField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("DATE") }
    override fun visit(field: DateTimeField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("TIMESTAMP") }
    override fun visit(field: TimeField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("TIME") }
    override fun visit(field: BooleanField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("BOOLEAN") }
    override fun visit(field: TextField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("TEXT") }
    override fun visit(field: DecimalField<*>, p: DDL_MODE) = field.createFieldDDL(p) {
        append("NUMERIC(")
                .append(field.decimalPrecision.precision)
                .comma()
                .append(field.decimalPrecision.scale)
                .append(")")
    }

    override fun visit(field: IntField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("INTEGER") }
    override fun visit(field: BinaryField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("BYTEA") }

    override fun visit(field: One2ManyField<*, *>, p: DDL_MODE) = throw IllegalStateException("You can't create a One2Many field in databse")

    override fun visit(field: Many2OneField<*, *>, p: DDL_MODE) = visitReference(field, p)
    override fun visit(field: Many2ManyField<*, *>, p: DDL_MODE) = throw IllegalStateException("You can't create a Many2Many field in databse")
    override fun visit(field: SelectionField<*, *>, p: DDL_MODE) = field.createFieldDDL(p) { append("VARCHAR") }
    override fun visit(field: ExternalRefField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("VARCHAR") }
    override fun visit(field: WriteDateField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("TIMESTAMP") }
    override fun visit(field: CreateDateField<*>, p: DDL_MODE) = field.createFieldDDL(p) { append("TIMESTAMP") }
    override fun visit(field: CreateUserField<*>, p: DDL_MODE) = visitReference(field, p)
    override fun visit(field: WriteUserField<*>, p: DDL_MODE) = visitReference(field, p)

    private fun visitReference(field: ReferenceField<*, *>, p: DDL_MODE): FieldDDL {
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
                append(field.referenceOption.toSQL(QueryBuilder()))
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

    private fun StringBuilder.check(ck: OrmConstraint<*>): StringBuilder =
            if (InlineConstraintType.CHECK in inlineConstraint) {
                space()
                append("CONSTRAINT")
                space()
                append(ck.name)
                space()
                append("CHECK(")
                append(ck.toSQL(QueryBuilder(false)))
                append(")")
            } else this


    private fun StringBuilder.NotNull(field: BaseField<*, *>) =
            if (field.required && InlineConstraintType.NOT_NULL in inlineConstraint) {
                this.space().append("NOT NULL")
            } else this

    private fun BaseField<*, *>.createFieldDDL(p: DDL_MODE, fieldType: StringBuilder.() -> StringBuilder) = FieldDDL(buildString {
        token(identity(this@createFieldDDL))
        fieldType()
        NotNull(this@createFieldDDL)
        unique(this@createFieldDDL)
    }, this.constraint.map { StringBuilder().check(it).toString() }.toSet())

    private fun StringBuilder.unique(field: BaseField<*, *>) =
            if (field.unique && InlineConstraintType.UNIQ in inlineConstraint) {
                space().append("CONSTRAINT").space().append(field.fieldName).append("_uniq").space().append("UNIQUE")
            } else this

}
