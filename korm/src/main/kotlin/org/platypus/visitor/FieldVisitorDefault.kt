package org.platypus.visitor

import org.platypus.model.field.api.FieldVisitor
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

interface FieldVisitorDefault<PARAM, DEFAULT> : FieldVisitor<PARAM, DEFAULT> {
    val default: DEFAULT
    override fun visit(field: StringField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: DateField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: DateTimeField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: TimeField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: BooleanField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: TextField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: DecimalField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: IntField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: BinaryField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: One2ManyField<*, *>, p: PARAM): DEFAULT = default

    override fun visit(field: Many2OneField<*, *>, p: PARAM): DEFAULT = default

    override fun visit(field: One2OneField<*, *>, p: PARAM): DEFAULT = default

    override fun visit(field: RevOne2OneField<*, *>, p: PARAM): DEFAULT = default

    override fun visit(field: Many2ManyField<*, *>, p: PARAM): DEFAULT = default

    override fun visit(field: PKModelField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: Many2OneFieldLink<*, *>, p: PARAM): DEFAULT = default

    override fun visit(field: FieldAlias<*, *>, p: PARAM): DEFAULT = default

    override fun visit(field: SelectionField<*, *>, p: PARAM): DEFAULT = default

    override fun visit(field: NameModelField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: ExternalRefModelField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: WriteDateModelField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: CreateDateModelField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: ArchivedModelField<*>, p: PARAM): DEFAULT = default

    override fun visit(field: CreateUID<*>, p: PARAM): DEFAULT = default

    override fun visit(field: WriteUID<*>, p: PARAM): DEFAULT = default
}
