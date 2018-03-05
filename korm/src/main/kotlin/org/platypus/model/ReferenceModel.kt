package org.platypus.model

import org.platypus.model.field.api.ReferencedField

internal object ReferenceModel {

    private val privateReference: MutableMap<IModel<*>, MutableSet<ReferencedField<*, *>>> = HashMap()

    fun referencedBy(model: IModel<*>, referenceField: ReferencedField<*, *>) {
        privateReference.merge(model, mutableSetOf(referenceField), { s1, s2 -> HashSet(s1 + s2) })
    }

    operator fun get(model: IModel<*>): Set<ReferencedField<*, *>> {
        return privateReference[model] ?: emptySet()
    }
}