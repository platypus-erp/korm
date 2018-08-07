package org.platypus.v2.model

import org.platypus.model.ModelVisitor
import org.platypus.orm.sql.dml.ColumnSet
import org.platypus.utils.to_sneak_case
import org.platypus.v2.model.field.magic.IdField

interface BaseModel<M : BaseModel<M>> : ColumnSet {
    /**
     * The unique name of the model
     */
    val modelName: String

    val tableName: String
        get() = modelName.to_sneak_case().toLowerCase().replace('-', '_').replace('.', '_')

    val id: IdField<M>

    /**
     * The display fieldName of the models
     */
    val modelLabel: String
        get() = ""
    /**
     * A little help of what this models is used for
     */
    val modelHelp: String
        get() = ""

    fun <PARAM : Any, RETURN : Any> accept(visitor: ModelVisitor<PARAM, RETURN>, p: PARAM): RETURN

}