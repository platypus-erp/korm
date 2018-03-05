package org.platypus.model.field.impl

import org.platypus.visitor.FieldVisitorPredicate

object InverseOneToOneTarget : FieldVisitorPredicate<One2OneField<*, *>> {
    override fun visit(field: RevOne2OneField<*, *>, p: One2OneField<*, *>): Boolean {
        return field.targetField() == p
    }

}

object OneToManyTarget : FieldVisitorPredicate<Many2OneField<*, *>> {

    override fun visit(field: One2ManyField<*, *>, p: Many2OneField<*, *>): Boolean {
        return field.targetField() == p
    }
}