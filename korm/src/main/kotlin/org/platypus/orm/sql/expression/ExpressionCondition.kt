package org.platypus.orm.sql.expression

//infix fun <S : T, T> Expression<T>.eq(other: Expression<S>): Expression<Boolean> = EqOp(this, other)
//
//infix fun <M: Model<M>, T : Model<T>> IModelField<M, Record<T>>.eq(other: Expression<Int>): Expression<Boolean> = EqOp(this, other)
//
//infix fun <S : T, T> Expression<T>.eqOrNull(other: Expression<S>): Expression<Boolean> = EqOp(this, other) or this.isNull()
//
//fun <S : T, T> Expression<T>.isNull(): Expression<Boolean> = IsNullOp(this)
//
//fun <S : T, T> Expression<T>.isNotNull(): Expression<Boolean> = IsNotNullOp(this)
//
//fun <S : T, T> Expression<T>.less(other: Expression<S>): Expression<Boolean> = LessOp(this, other)
//
//fun <S : T, T> Expression<T>.lessEq(other: Expression<S>): Expression<Boolean> = LessEqOp(this, other)
//
//fun <S : T, T> Expression<T>.greater(other: Expression<S>): Expression<Boolean> = GreaterOp(this, other)
//
//fun <S : T, T> Expression<T>.greaterEq(other: Expression<S>): Expression<Boolean> = GreaterEqOp(this, other)

operator fun <S : T, T> Expression<T>.plus(other: Expression<S>): Expression<T> = PlusOp(this, other)

operator fun <S : T, T> Expression<T>.minus(other: Expression<S>): Expression<T> = MinusOp(this, other)

operator fun <S : T, T> Expression<T>.times(other: Expression<S>): Expression<T> = MultiplyOp(this, other)

operator fun <S : T, T> Expression<T>.div(other: Expression<S>): Expression<T> = DivideOp(this, other)