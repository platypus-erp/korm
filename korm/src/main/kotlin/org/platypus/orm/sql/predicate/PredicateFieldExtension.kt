package org.platypus.orm.sql.predicate

import org.platypus.entity.FakeRecordImpl
import org.platypus.model.IModel
import org.platypus.model.field.api.IModelField
import org.platypus.model.field.api.ReferencedField
import java.time.LocalDate
import java.time.LocalDateTime

infix fun PredicateField.and(other: PredicateField) = AndOpField(this, other)
infix fun PredicateField.or(other: PredicateField) = OrOpField(this, other)

fun IModelField<*, *>.isNull() = IsNullOpField(this)

fun IModelField<*, *>.isNotNull() = IsNotNullOpField(this)

infix fun <T : Comparable<T>> IModelField<*, T>.less(value: T) = LessOpField(this, value)
infix fun <T : Comparable<T>> IModelField<*, T>.lessEq(value: T) = LessEqOpField(this, value)

infix fun <T : Comparable<T>> IModelField<*, T>.greater(value: T) = GreaterOpField(this, value)
infix fun <T : Comparable<T>> IModelField<*, T>.greaterEq(value: T) = GreaterEqOpField(this, value)


infix fun <T : Any> IModelField<*, T>.eq(other: T?) = EqOpField(this, other)
infix fun <T : Any> IModelField<*, T>.neq(other: T?) = NeqOpField(this, other)
infix fun <T : Any> IModelField<*, T>.inList(other: Iterable<T>) = InListField(this, other)
infix fun <T : Any> IModelField<*, T>.notInList(other: Iterable<T>) = NotInListField(this, other)

/**
 * Shortcut for
 * ```
 * (myField eqOrNull value) or myField.isNull()
 * ```
 */
infix fun <T : Any> IModelField<*, T>.eqOrNull(other: T) = (this eq other) or this.isNull()

/**
 * Shortcut for
 * ```
 * dateField eq localeDateTimeValue.toLocaleDate()
 * ```
 */
infix fun IModelField<*, LocalDate>.eq(other: LocalDateTime) = EqOpField(this, other.toLocalDate())

/**
 * Shortcut for
 * ```
 * booleanField eq true
 * ```
 */
fun IModelField<*, Boolean>.isTrue() = this eq true

/**
 * Shortcut for
 * ```
 * booleanField eqOrNull true
 * ```
 */
fun IModelField<*, Boolean>.isTrueOrNull() = this eqOrNull true

/**
 * Shortcut for
 * ```
 * booleanField eq false
 * ```
 */
fun IModelField<*, Boolean>.isFalse() = this eq false

/**
 * Shortcut for
 * ```
 * booleanField eqOrNull false
 * ```
 */
fun IModelField<*, Boolean>.isFalseOrNull() = this eqOrNull false

/**
 * Shortcut for
 * ```
 * referenceField eqOrNull FakeRecordImpl(id, referenceField.target)
 * ```
 */
infix fun <TM : IModel<TM>> ReferencedField<*, TM>.eq(id: Int) = this eq FakeRecordImpl(id, this.target)

infix fun IModelField<*, String>.ilike(str: String) = ILikeOpField(this, str)
infix fun IModelField<*, String>.notIlike(str: String) = NotILikeOpField(this, str)
infix fun IModelField<*, String>.like(str: String) = LikeOpField(this, str)
infix fun IModelField<*, String>.notlike(str: String) = NotLikeOpField(this, str)

/**
 * Shortcut for
 * ```
 * stringField like str + "%"
 * ```
 */
infix fun IModelField<*, String>.startWith(str: String) = this like "$str%"

/**
 * Shortcut for
 * ```
 * stringField like "%" + str
 * ```
 */
infix fun IModelField<*, String>.endWith(str: String) = this like "%$str"

/**
 * Shortcut for
 * ```
 * stringField like "%" + str + "%"
 * ```
 */
infix fun IModelField<*, String>.contains(str: String) = this like "%$str%"

/**
 * Shortcut for
 * ```
 * stringField ilike str + "%"
 * ```
 */
infix fun IModelField<*, String>.iStartWith(str: String) = this ilike  "$str%"

/**
 * Shortcut for
 * ```
 * stringField ilike "%" + str
 * ```
 */
infix fun IModelField<*, String>.iEndWith(str: String) = this ilike "%$str"

/**
 * Shortcut for
 * ```
 * stringField ilike "%" + str + "%"
 * ```
 */
infix fun IModelField<*, String>.iContains(str: String) = this ilike "%$str%"