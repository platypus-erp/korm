package org.platypus.cache

import org.platypus.entity.Record
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
import java.util.stream.Collectors.toList

internal fun IModelField<*, *>.toCacheValue(value:Any?):Any? = accept(CacheValueConverter, value)

private object CacheValueConverter : FieldVisitor<Any?, Any?> {
    override fun visit(field: StringField<*>, p: Any?): Any? = p

    override fun visit(field: DateField<*>, p: Any?): Any? = p

    override fun visit(field: DateTimeField<*>, p: Any?): Any? = p

    override fun visit(field: TimeField<*>, p: Any?): Any? = p

    override fun visit(field: BooleanField<*>, p: Any?): Any? = p

    override fun visit(field: TextField<*>, p: Any?): Any? = p

    override fun visit(field: DecimalField<*>, p: Any?): Any? = p

    override fun visit(field: IntField<*>, p: Any?): Any? = p

    override fun visit(field: BinaryField<*>, p: Any?): Any? = p

    override fun visit(field: Many2OneFieldLink<*, *>, p: Any?): Any? = when (p) {
        null -> null
        is ModelID -> p
        is Record<*> -> p.modelID
        else -> throw IllegalArgumentException("Can't convert the value $p of type ${p::class} for the field $field")
    }

    override fun visit(field: One2ManyField<*, *>, p: Any?): Any? = when (p) {
        null -> null
        is Iterable<*> -> {
            val first = p.firstOrNull()
            if (first != null) {
                if (first !is Record<*>) {
                    throw IllegalArgumentException("Can't convert the value $p of type ${p::class} for the field $field")
                }
                ModelIDS(first.model, p.toList().stream()
                        .map { it as Record<*> }
                        .map { it.id }.collect(toList()))
            } else {
                null
            }
        }
        is Record<*> -> p.modelID.toModelIDS()
        else -> throw IllegalArgumentException("Can't convert the value $p of type ${p::class} for the field $field")

    }

    override fun visit(field: Many2OneField<*, *>, p: Any?): Any? = when (p) {
        null -> null
        is ModelID -> p
        is Record<*> -> p.modelID
        else -> throw IllegalArgumentException("Can't convert the value $p of type ${p::class} for the field $field")
    }

    override fun visit(field: One2OneField<*, *>, p: Any?): Any? = when (p) {
        null -> null
        is ModelID -> p
        is Record<*> -> p.modelID
        else -> throw IllegalArgumentException("Can't convert the value $p of type ${p::class} for the field $field")
    }

    override fun visit(field: RevOne2OneField<*, *>, p: Any?): Any? = when (p) {
        null -> null
        is ModelID -> p
        is Record<*> -> p.modelID
        else -> throw IllegalArgumentException("Can't convert the value $p of type ${p::class} for the field $field")
    }


    override fun visit(field: Many2ManyField<*, *>, p: Any?): Any? = when (p) {
        null -> null
        is Iterable<*> -> {
            val first = p.firstOrNull()
            if (first != null) {
                if (first !is Record<*>) {
                    throw IllegalArgumentException("Can't convert the value $p of type ${p::class} for the field $field")
                }
                ModelIDS(first.model, p.toList().stream()
                        .map { it as Record<*> }
                        .map { it.id }.collect(toList()))
            } else {
                null
            }
        }
        is Record<*> -> p.modelID.toModelIDS()
        else -> throw IllegalArgumentException("Can't convert the value $p of type ${p::class} for the field $field")
    }

    override fun visit(field: PKModelField<*>, p: Any?): Any? = p

    override fun visit(field: FieldAlias<*, *>, p: Any?): Any? = field.delegate.accept(this, p)

    override fun visit(field: SelectionField<*, *>, p: Any?): Any? = p

    override fun visit(field: NameModelField<*>, p: Any?): Any? = p

    override fun visit(field: ExternalRefModelField<*>, p: Any?): Any? = p

    override fun visit(field: WriteDateModelField<*>, p: Any?): Any? = p

    override fun visit(field: CreateDateModelField<*>, p: Any?): Any? = p

    override fun visit(field: ArchivedModelField<*>, p: Any?): Any? = p

    override fun visit(field: CreateUID<*>, p: Any?): Any? = p

    override fun visit(field: WriteUID<*>, p: Any?): Any? = p
}