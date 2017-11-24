package org.platypus.impl.korm.model.property.slots

import org.platypus.api.DecimalPrecision
import org.platypus.impl.korm.sql.LiteralOp
import org.platypus.impl.korm.sql.Op
import org.platypus.impl.korm.sql.ReferenceOption
import org.platypus.impl.ui.widget.UIWidget

interface KormBaseSlot<FIELD_TYPE> {
    val store: Boolean
    val required: Boolean
    val manual: Boolean
}


interface KormSlot<T> : KormBaseSlot<T> {
    val label: String?
    val help: String?
    val defaultValue: LiteralOp<T>?
    val default: T?
    val collate: String?
    val length: Int?
    val maxSize: Int?
    val minSize: Int?
    val prefix: String?
    val suffix: String?
    val min: T?
    val max: T?
    val readonly: Boolean?
    val unique: Boolean?
    val index: Boolean?
    val domain: (() -> Op<Boolean>)?
    val onDelete: ReferenceOption?
    val l10n: Boolean?
    val precision: DecimalPrecision?
    val widget: UIWidget<*, T>?

    fun freeze()
}

data class KormSlotImpl<T>(
    override var label: String? = null,
    override var help: String? = null,
    override var store: Boolean = true,
    override var required: Boolean = false,
    override var readonly: Boolean = false,
    override var manual: Boolean = false,
    override var precision: DecimalPrecision? = null,
    override var defaultValue: LiteralOp<T>? = null,
    override var default: T? = null,
    override var collate: String? = null,
    override var length: Int? = null,
    override var maxSize: Int? = null,
    override var minSize: Int? = null,
    override var prefix: String? = null,
    override var suffix: String? = null,
    override var min: T? = null,
    override var max: T? = null,
    override var unique: Boolean? = null,
    override var domain: (() -> Op<Boolean>)? = null,
    override var index: Boolean? = null,
    override var l10n: Boolean? = null,
    override var onDelete: ReferenceOption? = null,
    override var widget: UIWidget<*, T>? = null
) : KormSlot<T> {
    override fun freeze() {}
}