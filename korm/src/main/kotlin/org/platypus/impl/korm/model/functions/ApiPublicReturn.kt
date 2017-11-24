package org.platypus.impl.korm.model.functions

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.api.web.JsonEntityConverteur
import org.platypus.impl.korm.model.LazyLoadType

data class PublicApiReturn<out RETURN : Any?>(
    val result: RETURN = throw IllegalStateException(),
    /**
     * The result for each id of the function
     */
    val results: Map<Long, RETURN> = emptyMap(),
    /**
     * A set of warning to display on the UI
     */
    val warnings: Set<UIWarnings> = emptySet(),
    /**
     * A set of success to display on the UI
     */
    val success: Set<UISuccess> = emptySet()
) {
    fun toJson(env: PlatypusEnvironement) = JsonObject(
        mapOf(
            "result" to JsonEntityConverteur.toJson(result, LazyLoadType.NONE),
            "warnings" to JsonArray(warnings.map { it.toJson() }),
            "success" to JsonArray(success.map { it.toJson() })
        )
    )
}

fun <RETURN : Any?> createResult(result: RETURN) = PublicApiReturn(result)
fun <RETURN : Any?> createMultiResult(result: Map<Long, RETURN>) = PublicApiReturn(results = result)

data class UIWarnings(val msg: String) {
    fun toJson(): JsonObject {
        return JsonObject(mapOf("message" to msg))
    }

    fun toJsonString(prettyPrint: Boolean = false, canonical: Boolean = false) = toJson().toJsonString(prettyPrint, canonical)
}

data class UISuccess(val msg: String) {
    fun toJson(): JsonObject {
        return JsonObject(mapOf("message" to msg))
    }

    fun toJsonString(prettyPrint: Boolean = false, canonical: Boolean = false) = toJson().toJsonString(prettyPrint, canonical)

}