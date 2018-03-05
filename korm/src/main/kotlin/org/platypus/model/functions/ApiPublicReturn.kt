package org.platypus.model.functions

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import org.platypus.PlatypusEnvironment
import org.platypus.model.LazyLoadType
import org.platypus.utils.AnytoJson

data class PublicApiReturn<out RETURN : Any?>(
        val result: RETURN = throw IllegalStateException(),
        /**
         * The result for each id of the function
         */
        val results: Map<Int, RETURN> = emptyMap(),
        /**
         * A fieldSet of warning to display on the UI
         */
        val warnings: Set<UIWarnings> = emptySet(),
        /**
         * A fieldSet of success to display on the UI
         */
        val success: Set<UISuccess> = emptySet()
) {
    companion object {
        fun <T : Any?> empty() = PublicApiReturn<T>()
    }

    fun toJson(env: PlatypusEnvironment) = JsonObject(
            mapOf(
                    "result" to AnytoJson(result, LazyLoadType.FULL),
                    "warnings" to JsonArray(warnings.map { it.toJson() }),
                    "success" to JsonArray(success.map { it.toJson() })
            )
    )
}

fun <RETURN : Any?> RETURN.asResult() = PublicApiReturn(this)
fun <RETURN : Any?> Map<Int, RETURN>.asResult() = PublicApiReturn(results = this)
//fun <E:BaseEntity<E, M>, M:Model<M, E>> Bag<E, M>.asResult() = this.associate { it.id to it.nameGet() }.asResult()

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