package org.platypus.orm.sql.visitor

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
import org.platypus.model.field.impl.RevOne2OneField
import org.platypus.model.field.impl.SelectionField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID

object FieldGetVisitor : FieldVisitor<Any?, IModelField<*,*>>{
    override fun visit(field: StringField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: DateField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: DateTimeField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: TimeField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: BooleanField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: TextField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: DecimalField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: IntField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: BinaryField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: One2ManyField<*, *>, p: Any?): IModelField<*, *> = field

    override fun visit(field: Many2OneField<*, *>, p: Any?): IModelField<*, *> = field

    override fun visit(field: Many2OneFieldLink<*, *>, p: Any?): IModelField<*, *> = field

    override fun visit(field: One2OneField<*, *>, p: Any?): IModelField<*, *> = field

    override fun visit(field: RevOne2OneField<*, *>, p: Any?): IModelField<*, *> = field

    override fun visit(field: Many2ManyField<*, *>, p: Any?): IModelField<*, *> = field

    override fun visit(field: PKModelField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: FieldAlias<*, *>, p: Any?): IModelField<*, *> = field.delegate

    override fun visit(field: SelectionField<*, *>, p: Any?): IModelField<*, *> = field

    override fun visit(field: NameModelField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: ExternalRefModelField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: WriteDateModelField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: CreateDateModelField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: ArchivedModelField<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: CreateUID<*>, p: Any?): IModelField<*, *> = field

    override fun visit(field: WriteUID<*>, p: Any?): IModelField<*, *> = field
}