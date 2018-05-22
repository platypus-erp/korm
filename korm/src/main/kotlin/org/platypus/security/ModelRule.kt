package org.platypus.security

import org.platypus.model.Model
import org.platypus.orm.sql.expression.Expression

data class ModelRule<M : Model<M>>(
        val uniqueId: String,
        val name: String,
        val read: Boolean,
        val write: Boolean,
        val delete: Boolean,
        val groups: Set<GroupData>,
        val rule: (M) -> Expression<Boolean>
)

fun <M : Model<M>> ModelRule<M>.toBuilder(): ModelRuleBuilder<M> =
        ModelRuleBuilder<M>(uniqueId).apply {
            read = this@toBuilder.read
            name = this@toBuilder.name
            write = this@toBuilder.write
            delete = this@toBuilder.delete
            groups = this@toBuilder.groups
            rule = this@toBuilder.rule
        }


val <M : Model<M>> ModelRule<M>.global: Boolean
    get() = groups.isEmpty()


class ModelRuleBuilder<M : Model<M>>(val uniqueId: String) {
    var read: Boolean = false
    var name: String = ""
    var write: Boolean = false
    var delete: Boolean = false
    var groups: Set<GroupData> = emptySet()
    var rule: ((M) -> Expression<Boolean>)? = null

    internal fun build(): ModelRule<M> = ModelRule(
            uniqueId = uniqueId,
            name = name,
            read = read,
            write = write,
            delete = delete,
            rule = rule!!,
            groups = groups
    )
}

data class ModelGroup<M : Model<M>>(
        val model: M,
        val name: String,
        val uniqueId: String,
        val create: Boolean,
        val read: Boolean,
        val write: Boolean,
        val delete: Boolean,
        val groups: Set<GroupData>
)

class ModelGroupBuilder<M : Model<M>>(val model: M, val uniqueId: String) {
    var name: String = ""
    var create: Boolean = false
    var read: Boolean = false
    var write: Boolean = false
    var delete: Boolean = false
    var groups: Set<GroupData> = emptySet()
}