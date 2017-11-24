package org.platypus.api.web

import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.pipeline.PipelineInterceptor
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.delete
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route
import org.platypus.Platypus
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.functions.PublicApiReturn
import org.platypus.impl.korm.model.functions.one.ApiOneNoParamStacker


interface RouteFactory {
    fun createRoute(route: Route, platypus: Platypus)
}

fun Route.createRoute(path: String, method: HttpMethod, body: PipelineInterceptor<Unit, ApplicationCall>): Route {
    return route(path, method) { handle(body) }
}

class ApiOneNoParamStackerRoute<E : PlatypusEntity<E, M>, M : BaseModel<M, E>, RETURN : Any?>(
        private val path: String = "/",
        private val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>,
        private val method: ApiOneNoParamStacker<E, M, PublicApiReturn<RETURN>>,
        private val httpMethod: HttpMethod = HttpMethod.Post) : RouteFactory {

    override fun createRoute(route: Route, platypus: Platypus) {
        println("Create Route $httpMethod $path/$method")
        route.createRoute(path, httpMethod) {
            val env = platypus.newEnv()
            val entity = factory(env).fromJson(call.receive())
            val res = method.call(entity)
            env.closeEnv()
            call.respondText(res.toJson(env).toJsonString(true), ContentType.Application.Json)
        }
    }
}

class ApiStore<E : PlatypusEntity<E, M>, M : BaseModel<M, E>>(
    val model: BaseModel<M, E>,
    private val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>) : RouteFactory {

    override fun createRoute(route: Route, platypus: Platypus) {
        route.post("/") {
            val env = platypus.newEnv()
            val res = model.store.call(factory(env).fromJson(call.receive()))
            env.closeEnv()
            val realRes = PublicApiReturn(
                factory(env)[res.result.id],
                results = res.results,
                warnings = res.warnings,
                success = res.success
            )
            call.respondText(realRes.toJson(env).toJsonString(), ContentType.Application.Json)
        }
    }

    override fun toString(): String = "POST /"
}

class ApiStoreUnsafe(
    val model: BaseModel<*, *>,
    private val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<*, *>) : RouteFactory {

    override fun createRoute(route: Route, platypus: Platypus) {
        route.post("/") {
            val env = platypus.newEnv()
            val res = model.store.hardCall(factory(env).fromJson(call.receive()))
            env.closeEnv()
            val realRes = PublicApiReturn(
                factory(env)[res.result.id],
                results = res.results,
                warnings = res.warnings,
                success = res.success
            )
            call.respondText(realRes.toJson(env).toJsonString(), ContentType.Application.Json)
        }
    }

    override fun toString(): String = "POST /"
}


class ApiDeleteOne<E : PlatypusEntity<E, M>, M : BaseModel<M, E>>(
    val model: BaseModel<M, E>,
    private val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>) : RouteFactory {

    override fun createRoute(route: Route, platypus: Platypus) {
        route.delete("{id}") {
            val id = call.parameters["id"]!!.toLong()
            val env = platypus.newEnv()
            val res = model.delete.call(factory(env).updateWith(false, id) { })
            env.closeEnv()
            call.respondText(res.toJson(env).toJsonString(), ContentType.Application.Json)
        }
    }

    override fun toString(): String = "DELETE /{id}"
}

class ApiGetByIdOne<E : PlatypusEntity<E, M>, M : BaseModel<M, E>>(
    val model: BaseModel<M, E>,
    private val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>) : RouteFactory {

    override fun createRoute(route: Route, platypus: Platypus) {
        route.get("{id}") {
            val env = platypus.newEnv()
            val id = call.parameters["id"]!!.toLong()
            val res = model.getById.call(factory(env), id)
            env.closeEnv()
            call.respondText(res.toJson(env).toJsonString(), ContentType.Application.Json)

        }
    }

    override fun toString(): String = "GET /{id}"
}