package org.platypus.model.field.api

import org.platypus.model.Model
import org.platypus.model.functions.compute.ComputeGetStacker
import org.platypus.model.functions.compute.ComputeSetStacker
import org.platypus.model.functions.one.ApiOneNoParamStacker
import org.platypus.orm.sql.expression.FieldExpression
import org.platypus.utils.to_sneak_case
import java.util.*
import kotlin.collections.HashSet

val comparatorField = compareBy<IModelField<*, *>>({ it.model.modelName }, { it.fieldName })

enum class OnChangeType {
    UI, SERVER, BOTH, NONE
}

abstract class ModelField<M : Model<M>, KOTLIN_TYPE : Any>(
        override val model: M,
        nameField: String, internal var slots: FieldSlotsImpl<KOTLIN_TYPE>
) : IModelField<M, KOTLIN_TYPE>,
        FieldExpression<KOTLIN_TYPE>,
        FieldSlots<KOTLIN_TYPE> by slots{

    override val fieldName: String = nameField.to_sneak_case().toLowerCase()

    private var onGet: ComputeGetStacker<M, KOTLIN_TYPE>? = null
    private var onSet: ComputeSetStacker<M, KOTLIN_TYPE>? = null

    val searchable:Boolean
        get() = onGet == null || (onSet != null && store)

            private val privateOnChange: EnumMap<OnChangeType, MutableSet<ApiOneNoParamStacker<M, Unit>>> = EnumMap(OnChangeType::class.java)
    private val onChange: Map<OnChangeType, Set<ApiOneNoParamStacker<M, Unit>>>
        get() = privateOnChange

    internal fun Model<M>.setOnSet(onSet: ComputeSetStacker<M, KOTLIN_TYPE>): ComputeSetStacker<M, KOTLIN_TYPE> {
        this@ModelField.onSet = onSet
        return onSet
    }

    internal fun Model<M>.setOnGet(onGet: ComputeGetStacker<M, KOTLIN_TYPE>): ComputeGetStacker<M, KOTLIN_TYPE> {
        this@ModelField.onGet = onGet
        return onGet
    }

    internal fun Model<M>.addOnChange(type: OnChangeType, onChangeFunction: ApiOneNoParamStacker<M, Unit>): ApiOneNoParamStacker<M, Unit> {
        privateOnChange.getOrPut(type, { HashSet() }).add(onChangeFunction)
        return onChangeFunction
    }

    interface Builder<M : Model<M>, out FIELD : ModelField<M, *>> {
        fun build(): FIELD
    }

    override operator fun compareTo(other: IModelField<*,*>): Int = comparatorField.compare(this, other)


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModelField<*, *>

        if (model != other.model) return false
        if (fieldName != other.fieldName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = model.hashCode()
        result = 31 * result + fieldName.hashCode()
        return result
    }
}