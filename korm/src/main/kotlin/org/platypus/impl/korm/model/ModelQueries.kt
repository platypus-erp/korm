package org.platypus.impl.korm.model

import org.platypus.impl.korm.model.property.KormProperty
import org.platypus.impl.korm.sql.Op
import org.platypus.impl.korm.sql.Query
import org.platypus.impl.korm.sql.select
import org.platypus.impl.korm.sql.transactions.TransactionManager

//fun <M : BaseModel<M, *>> M.simpleInsert(internalRef: String, body: M.(InsertModelStatement<M>) -> Unit): InsertModelStatement<M> =
//        InsertModelStatement(this, false, internalRef).apply {
//            body(this)
//            execute(TransactionManager.current())
//        }
//
//fun <M : BaseModel<M, *>> M.insert(internalRef: String, body: M.(InsertModelStatement<M>) -> Unit): ModelID =
//        InsertModelStatement(this, false, internalRef).apply {
//            body(this)
//            execute(TransactionManager.current())
//        }[this.id]
//
//
//fun <M : BaseModel<M, *>> M.insert2(body: M.(InsertModelStatement<M>) -> Unit): ModelID =
//        InsertModelStatement(this, false, "").apply {
//            body(this)
//            execute(TransactionManager.current())
//        }[this.id]

//fun <M : BaseModel<M>> M.byRef(externalRef: String): EntityID<Long> =
//        this.internalTable.select { this@byRef.externalRef eq externalRef }.first()[this.id]


fun <M : BaseModel<M, *>> M.select(vararg fields: KormProperty<M, *>, where: () -> Op<Boolean>): Query =
        this.internalTable.slice(fields.map { it.column } + this.id.column).select(where)

fun <M : BaseModel<M, *>> M.selectIds(where: () -> Op<Boolean>): Query =
        this.internalTable.slice(this.id.column).select(where)

inline fun <M : BaseModel<M, *>> M.selectWhere(where: () -> Op<Boolean>): Query =
        selectWhere(where())

fun <M : BaseModel<M, *>> M.selectWhere(where: Op<Boolean>): Query =
        Query(TransactionManager.current(), this.internalTable, where)

fun <M : BaseModel<M, *>> M.selectAll(): Query =
        Query(TransactionManager.current(), this.internalTable, null)

//fun <M : BaseModel<M>> M.deleteWhere(op: SqlExpressionBuilder.() -> Op<Boolean>) =
//        DeleteStatement.where(TransactionManager.current(), this@deleteWhere.internalTable, SqlExpressionBuilder.op())
//
//fun <M : BaseModel<M>> M.deleteIgnoreWhere(op: SqlExpressionBuilder.() -> Op<Boolean>) =
//        DeleteStatement.where(TransactionManager.current(), this@deleteIgnoreWhere.internalTable, SqlExpressionBuilder.op(), true)
//
//fun <M : BaseModel<M>> M.deleteAll() =
//        DeleteStatement.all(TransactionManager.current(), this@deleteAll.internalTable)