package org.platypus.web

import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.content.resolveResource
import io.ktor.features.CallLogging
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.platypus.ErpModule
import org.platypus.Platypus
import org.platypus.config.PlatypusConf
import org.slf4j.event.Level
import java.util.stream.Collectors

fun generatingRouting(conf: PlatypusConf) = embeddedServer(Netty, conf.port) {
    install(CallLogging) {
        level = Level.INFO
    }
    routing {
        ressourseRouting(conf)
        get("web/{next...}") {
            val next = call.parameters.getAll("next")
            println("Call $next")
            val content = call.resolveResource("/ui/index.html", classLoader = Platypus::class.java.classLoader)
            if (content != null)
                call.respond(content)
        }
//        for (model in ErpModule.models) {
//            println("Creating Route /${model.tableName}")
//            route(model.tableName) {
//                for (modelRoute in ErpModule.routes[model] ?: emptySet<RouteFactory>()) {
//                    println("Creating Route /${model.tableName}/$modelRoute")
//                    modelRoute.createRoute(this, this@Platypus)
//                }
//                route("actions") {
//                    for (action in ErpModule.actions[model] ?: emptySet()) {
//                        println("Creating Route /${model.tableName}/actions/${action.uuid}")
//                        get(action.uuid) {
//                            val html = action.render(createHTML(true), newReadOnlyEnv())
//                            call.respondText(html, ContentType.Text.Html)
//                        }
//                    }
//                }
//                route("views") {
//                    for (view in ErpModule.views[model] ?: emptySet<ToViewApi<*>>()) {
//                        println("Creating Route /${model.tableName}/views/${view.uniqueName}")
//                        route(view.uniqueName) {
//                            get {
//                                val html = view.toViewApi().render(createHTML(true), newReadOnlyEnv())
//                                call.respondText(html, ContentType.Text.Html)
//                            }
//                            get("search") {
//                                val filter = call.parameters["filter"]
//                                val orderby = call.parameters["orderby"].toJsonArray<String>()
//                                val groupby = call.parameters["groupby"]
//                                val limit = call.parameters["limit"] ?: "80"
//                                val page = call.parameters["page"] ?: "0"
//                                val param = SearchTreeParam(
//                                        filter = filter,
//                                        orderby = orderby,
//                                        groupby = groupby,
//                                        limit = limit.toInt(),
//                                        page = page.toInt()
//                                )
//                                val query = view.querySearch(param).buildQuery(newEnv())
//                                val res = JsonObject(
//                                        mapOf<String, Any?>(
//                                                "result" to query.toJson(),
//                                                "warnings" to JsonArray(emptyList<String>()),
//                                                "success" to JsonArray(emptyList<String>()),
//                                                "errors" to JsonArray(emptyList<String>())
//                                        )
//                                )
//                                call.respondText(res.toJsonString(true), ContentType.Application.Json, HttpStatusCode.OK)
//                            }
//                        }
//                    }
//                }
//                route("call") {
//                    //                            TODO route of model
//                }
//                get("{id}") {
//                    val env = newEnv()
//                    val obj = ErpModule.modelFactory[model]!!.invoke(env).browse(call.parameters["id"]!!.toInt())
//                    call.respondText(toJsonObj(obj).asResult().toJson(env).toJsonString(true), ContentType.Application.Json)
//                }
//                get {
//                    val name = call.parameters["name"]
//                    if (name != null) {
////                                TODO call a nameSearch or something extendable
//                        val env = newEnv()
//                        val obj = ErpModule.modelFactory[model]!!.invoke(env).find { model.name ilike "%$name%" }
//                        call.respondText(toJsonArray(obj).asResult().toJson(env).toJsonString(true), ContentType.Application.Json)
//                    }
//                }
//
//            }
//        }
        get("menus") {
            val topParents = JsonArray<JsonObject>(ErpModule.menus.stream()
                    .filter { it.parent == null }
                    .sorted { m1, m2 -> m1.sequence.compareTo(m2.sequence) }
                    .map { it.toJson() }
                    .collect(Collectors.toList()))
            call.respondText(topParents[0].toJsonString(true), ContentType.Application.Json)
        }


    }
}