package org.platypus.impl.korm.model.property.api

import org.platypus.impl.korm.model.Model
import org.platypus.impl.korm.model.ModelColumnType
import org.platypus.impl.korm.model.property.slots.KormSlot
import org.platypus.orm.struct.TableColumn

/**
 * This interface is the entry point of all property type in the Platypus FrameWork
 *
 * @implSpec A PlatypusProperty is equal to ananother if the
 * [model] == [other.model]
 * and
 * [name] == [other.name]
 * and
 * [type] == [other.type]
 */
interface PlatypusProperty<KOTLIN_TYPE, SQL_TYPE> :
        PropertyDbConverter<KOTLIN_TYPE, SQL_TYPE>,
        PropertyDDLWriter,
        PropertyValidator<KOTLIN_TYPE>,
        TableColumn {
    val model: Model
    val type: ModelColumnType
    val slots: KormSlot<KOTLIN_TYPE>
}