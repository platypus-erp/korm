package org.platypus.model.field.api

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
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID

interface FieldVisitor<in PARAM_TYPE, out RETURN> {
    fun visit(field: StringField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: DateField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: DateTimeField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: TimeField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: BooleanField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: TextField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: DecimalField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: IntField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: BinaryField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: One2ManyField<*, *>, p: PARAM_TYPE): RETURN
    fun visit(field: Many2OneField<*, *>, p: PARAM_TYPE): RETURN
    fun visit(field: Many2OneFieldLink<*, *>, p: PARAM_TYPE): RETURN
    fun visit(field: One2OneField<*, *>, p: PARAM_TYPE): RETURN
    fun visit(field: RevOne2OneField<*, *>, p: PARAM_TYPE): RETURN
    fun visit(field: Many2ManyField<*, *>, p: PARAM_TYPE): RETURN
    //    fun visit(field: NativeField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: PKModelField<*>, p: PARAM_TYPE): RETURN

    fun visit(field: FieldAlias<*, *>, p: PARAM_TYPE): RETURN
    fun visit(field: SelectionField<*, *>, p: PARAM_TYPE): RETURN
    fun visit(field: NameModelField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: ExternalRefModelField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: WriteDateModelField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: CreateDateModelField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: ArchivedModelField<*>, p: PARAM_TYPE): RETURN
    fun visit(field: CreateUID<*>, p: PARAM_TYPE): RETURN
    fun visit(field: WriteUID<*>, p: PARAM_TYPE): RETURN

}