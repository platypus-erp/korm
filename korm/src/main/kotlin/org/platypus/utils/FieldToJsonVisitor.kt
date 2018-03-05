package org.platypus.utils

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import org.platypus.cache.CacheState
import org.platypus.cache.ModelID
import org.platypus.cache.PlatypusCache
import org.platypus.model.LazyLoadType
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
import org.platypus.model.field.impl.SimpleField
import org.platypus.model.field.impl.StringField
import org.platypus.model.field.impl.TextField
import org.platypus.model.field.impl.TimeField
import org.platypus.model.field.impl.WriteDateModelField
import org.platypus.model.field.impl.WriteUID
import java.io.StringReader

fun String?.toJson(): JsonObject {
    return if (this != null) {
        Parser().parse(StringReader(this)) as JsonObject
    } else {
        JsonObject()
    }
}

fun <T> String?.toJsonArray(): JsonArray<T> {
    return if (this != null) {
        Parser().parse(StringReader(this)) as JsonArray<T>
    } else {
        JsonArray()
    }
}

class FieldToJsonVisitor : FieldVisitor<FieldToJsonVisitor.Parameter, Pair<String, Any?>?> {
    data class Parameter(
            val currentId: ModelID,
            val cache: PlatypusCache,
            val lazyType: LazyLoadType,
            val parsedIds: List<ModelID>,
            val currentDepth: Int = 0,
            val maxDepth: Int = 10)

    private fun <T : Any> SimpleField<*, T>.visitSimple(p: Parameter): Pair<String, Any?> {
        val state = p.cache.state(p.currentId, this)
        return this.fieldName to if (state != CacheState.NONE) {
            p.cache[p.currentId][this]
        } else {
            null
        }
    }

    override fun visit(field: StringField<*>, p: Parameter): Pair<String, Any?> = field.visitSimple(p)

    override fun visit(field: DateField<*>, p: Parameter): Pair<String, Any?> = field.visitSimple(p)

    override fun visit(field: DateTimeField<*>, p: Parameter): Pair<String, Any?> = field.visitSimple(p)

    override fun visit(field: TimeField<*>, p: Parameter): Pair<String, Any?> = field.visitSimple(p)

    override fun visit(field: BooleanField<*>, p: Parameter): Pair<String, Any?> = field.visitSimple(p)

    override fun visit(field: TextField<*>, p: Parameter): Pair<String, Any?> = field.visitSimple(p)

    override fun visit(field: DecimalField<*>, p: Parameter): Pair<String, Any?> = field.visitSimple(p)

    override fun visit(field: IntField<*>, p: Parameter): Pair<String, Any?> = field.visitSimple(p)

    override fun visit(field: BinaryField<*>, p: Parameter): Pair<String, Any?>? = null

    override fun visit(field: One2ManyField<*, *>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: Many2OneField<*, *>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: One2OneField<*, *>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: RevOne2OneField<*, *>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: Many2ManyField<*, *>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: PKModelField<*>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: SelectionField<*, *>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: NameModelField<*>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: ExternalRefModelField<*>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: WriteDateModelField<*>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: CreateDateModelField<*>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: ArchivedModelField<*>, p: Parameter): Pair<String, Any?> {
        TODO("not implemented")
    }

    override fun visit(field: CreateUID<*>, p: Parameter): Pair<String, Any?>? {
        TODO("not implemented")
    }

    override fun visit(field: WriteUID<*>, p: Parameter): Pair<String, Any?>? {
        TODO("not implemented")
    }

    override fun visit(field: Many2OneFieldLink<*, *>, p: Parameter): Pair<String, Any?>? {
        TODO("not implemented")
    }

    override fun visit(field: FieldAlias<*, *>, p: Parameter): Pair<String, Any?>? = field.delegate.accept(this, p)
}
