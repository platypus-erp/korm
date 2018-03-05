package org.platypus.web.json

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.query.Query
import org.platypus.orm.sql.query.ResultRow
import org.platypus.visitor.CanonicalNameExpression

fun Query.toJson(): JsonArray<JsonObject> {
    val resList = ArrayList<JsonObject>()
    for (rec in this) {
        resList.add(JsonObject(rec.asMapNamed()))
    }
    return JsonArray(resList)
}

fun ResultRow.asMapNamed(): Map<String, Any?> {
    val data = HashMap<String, Any?>(this.data.size)
    for (rec in this.expr) {
        data[rec.accept(CanonicalNameExpression, null)] = this[rec]
    }
    return data
}

fun ResultRow.asMap(): Map<Expression<*>, Any?> {
    val data = HashMap<Expression<*>, Any?>(this.data.size)
    for (rec in this.expr) {
        data[rec] = this[rec]
    }
    return data
}

