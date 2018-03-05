package org.platypus.orm.sql

import org.platypus.model.field.api.ModelField
import org.platypus.model.field.impl.Many2OneField
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.ReferenceOption

interface ConstraintsVisitor<PARAM, RETURN> {

    //    override fun createStatement() = listOf("ALTER TABLE $referencedTable ADD" + if (fkName.isNotBlank()) " CONSTRAINT $fkName" else "" + foreignKeyPart)
    //
    //    override fun dropStatement() = listOf("ALTER TABLE $refereeTable DROP CONSTRAINT $fkName")
//
//    override fun modifyStatement() = dropStatement() + createStatement()
    //    override fun createStatement() = listOf(currentDialect.createIndex(unique, tableName, indexName, fields))
//    override fun dropStatement() = listOf(currentDialect.dropIndex(tableName, indexName))
//
//
//    override fun modifyStatement() = dropStatement() + createStatement()


    fun accept(fk: ForeignKeyConstraint, param: PARAM): RETURN

    fun accept(fk: Index, param: PARAM): RETURN
}

sealed class SqlConstraint {
    abstract fun <PARAM, RETURN> accept(visitor: ConstraintsVisitor<PARAM, RETURN>, param: PARAM): RETURN
}

data class ForeignKeyConstraint(
        val fkName: String,
        val refereeTable: String,
        val refereeColumn: String,
        val referencedTable: String,
        val referencedColumn: String,
        var deleteRule: ReferenceOption) : SqlConstraint() {

    companion object {
        fun from(tr: PersistenceDialect, column: Many2OneField<*,  *>): ForeignKeyConstraint {
            return ForeignKeyConstraint("",
                    tr.identity(column.target),
                    tr.identity(column.target.id),
                    tr.identity(column.model),
                    tr.identity(column), column.onDelete)
        }
    }

    internal val foreignKeyPart = buildString {
        append(" FOREIGN KEY ($referencedColumn) REFERENCES $refereeTable($refereeColumn)")
        if (deleteRule != ReferenceOption.NO_ACTION) {
            append(" ON DELETE $deleteRule")
        }
    }

    override fun <PARAM, RETURN> accept(visitor: ConstraintsVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.accept(this, param)


}

data class Index(
        val indexName: String,
        val tableName: String,
        val columns: List<String>,
        val unique: Boolean) : SqlConstraint() {
    companion object {
        fun forColumns(tr: PersistenceDialect, unique: Boolean, vararg columns: ModelField<*, *>): Index {
            assert(columns.isNotEmpty())
            val model = columns.first().model
            val indexName = "${tr.inProperCase(model.tableName)}_${columns.joinToString("_") { it.fieldName }}" + (if (unique) tr.inProperCase("_unique") else "")
            return Index(indexName, model.tableName, columns.map { tr.identity(it) }, unique)
        }
    }

    override fun <PARAM, RETURN> accept(visitor: ConstraintsVisitor<PARAM, RETURN>, param: PARAM): RETURN = visitor.accept(this, param)

    fun onlyNameDiffer(other: Index): Boolean =
            indexName != other.indexName && columns == other.columns && unique == other.unique

    override fun toString(): String =
            "${if (unique) "Unique " else ""}Index '$indexName' for '$tableName' on fields ${columns.joinToString(", ")}"
}
