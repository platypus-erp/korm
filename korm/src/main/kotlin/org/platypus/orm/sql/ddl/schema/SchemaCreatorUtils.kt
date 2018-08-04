package org.platypus.orm.sql.ddl.schema

import org.infinispan.configuration.cache.Index
import org.platypus.model.IModel
import org.platypus.orm.database.vendors.ForeignKeyConstraint
import java.sql.DatabaseMetaData
import java.sql.ResultSet
import java.util.*

/**
 * type:
 * @see java.sql.Types
 */
data class ColumnMetadata(val name: String, val type: Int, val nullable: Boolean)

data class ModelMetadata(val name: String, val type: String)

class SchemaCreatorUtils(databaseName: String, metadata: DatabaseMetaData) {
    private val allTablesNames: List<ModelMetadata>
    private val allViewNames: List<ModelMetadata>
    private val ddlMetadata: Map<ModelMetadata, List<ColumnMetadata>>

    init {
        allTablesNames = ArrayList()
        allViewNames = ArrayList()
        val resultSet = metadata.getTables(null, null, "%", arrayOf("TABLE", "VIEW"))
        while (resultSet.next()) {
            if (resultSet.getString("TABLE_TYPE") == "TABLE") {
                allTablesNames.add(ModelMetadata(resultSet.getString("TABLE_NAME").inProperCase, "TABLE"))
            }
            if (resultSet.getString("TABLE_TYPE") == "VIEW") {
                allViewNames.add(ModelMetadata(resultSet.getString("TABLE_NAME").inProperCase, "VIEW"))
            }
        }
        resultSet.close()
        val rs = metadata.getColumns(databaseName, null, "%", "%")
        ddlMetadata = rs.extractColumns(allTablesNames) {
            it.getString("TABLE_NAME") to ColumnMetadata(it.getString("COLUMN_NAME"), it.getInt("DATA_TYPE"), it.getBoolean("NULLABLE"))
        }
        rs.close()
    }

    private val isUpperCaseIdentifiers = metadata.storesUpperCaseIdentifiers()
    private val isLowerCaseIdentifiers = metadata.storesLowerCaseIdentifiers()
    val String.inProperCase: String
        get() = when {
            isUpperCaseIdentifiers -> toUpperCase()
            isLowerCaseIdentifiers -> toLowerCase()
            else -> this
        }

    private fun ResultSet.extractColumns(tables: List<ModelMetadata>, extract: (ResultSet) -> Pair<String, ColumnMetadata>): Map<ModelMetadata, List<ColumnMetadata>> {
        val mapping = tables.associateBy { it.name }
        val result = HashMap<ModelMetadata, MutableList<ColumnMetadata>>()

        while (next()) {
            val (tableName, columnMetadata) = extract(this)
            mapping[tableName]?.let { t ->
                result.getOrPut(t) { arrayListOf() } += columnMetadata
            }
        }
        return result
    }


    /**
     * returns map of constraint for a models name/column name pair
     */

    fun columnConstraints(vararg tables: IModel<*>): Map<Pair<String, String>, List<ForeignKeyConstraint>> = emptyMap()

    /**
     * return fieldSet of indices for each models
     */
    fun existingIndices(vararg tables: IModel<*>): Map<IModel<*>, List<Index>> = emptyMap()

    fun modelExist(model: IModel<*>): Boolean = model.toMetadata() in allTablesNames


    private fun IModel<*>.toMetadata(): ModelMetadata {
        return ModelMetadata(tableName.inProperCase, "TABLE")
    }

    fun checkTableMapping(table: IModel<*>) = true


}