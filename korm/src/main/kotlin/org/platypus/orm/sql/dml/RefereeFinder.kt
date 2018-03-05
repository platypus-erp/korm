package org.platypus.orm.sql.dml

import org.platypus.model.IModel
import org.platypus.model.ModelMany2Many
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
import org.platypus.module.base.models.Users
import org.platypus.visitor.FieldVisitorPredicate

object RefereeExistFinder : FieldVisitorPredicate<IModelField<*, *>> {

    override fun visit(field: Many2OneField<*, *>, p: IModelField<*, *>): Boolean = p.model == field.target
    override fun visit(field: One2OneField<*, *>, p: IModelField<*, *>): Boolean = p.model == field.target

}

object RefereeFinder : FieldVisitor<Unit, IModel<*>?> {

    override fun visit(field: PKModelField<*>, p: Unit) = null

    override fun visit(field: StringField<*>, p: Unit) = null

    override fun visit(field: DateField<*>, p: Unit) = null

    override fun visit(field: DateTimeField<*>, p: Unit) = null

    override fun visit(field: TimeField<*>, p: Unit) = null

    override fun visit(field: BooleanField<*>, p: Unit) = null

    override fun visit(field: TextField<*>, p: Unit) = null

    override fun visit(field: DecimalField<*>, p: Unit) = null

    override fun visit(field: IntField<*>, p: Unit) = null

    override fun visit(field: BinaryField<*>, p: Unit) = null

    override fun visit(field: One2ManyField<*, *>, p: Unit) = null

    override fun visit(field: Many2OneField<*, *>, p: Unit) = field.target

    override fun visit(field: Many2OneFieldLink<*, *>, p: Unit)= field.target

    override fun visit(field: Many2ManyField<*, *>, p: Unit) = field.target(ModelMany2Many)
    override fun visit(field: CreateUID<*>, p: Unit) = Users

    override fun visit(field: WriteUID<*>, p: Unit) = Users

    override fun visit(field: One2OneField<*, *>, p: Unit) = field.target

    override fun visit(field: RevOne2OneField<*, *>, p: Unit) = null

    override fun visit(field: SelectionField<*, *>, p: Unit) = null

    override fun visit(field: NameModelField<*>, p: Unit) = null

    override fun visit(field: ExternalRefModelField<*>, p: Unit) = null

    override fun visit(field: WriteDateModelField<*>, p: Unit) = null

    override fun visit(field: CreateDateModelField<*>, p: Unit) = null

    override fun visit(field: ArchivedModelField<*>, p: Unit) = null

    override fun visit(field: FieldAlias<*, *>, p: Unit) = field.delegate.accept(this, p)

}