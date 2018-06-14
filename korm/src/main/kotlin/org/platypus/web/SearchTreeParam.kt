package org.platypus.web

import com.beust.klaxon.JsonArray

data class SearchTreeParam(
        val filter: String?,
        val orderby: JsonArray<String>,
        val groupby: String?,
        val limit: Int,
        val page: Int
)