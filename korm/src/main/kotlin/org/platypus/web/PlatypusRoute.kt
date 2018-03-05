package org.platypus.web

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpMethod
import io.ktor.pipeline.PipelineInterceptor
import io.ktor.routing.Route
import io.ktor.routing.route
import org.platypus.Platypus


interface RouteFactory {
    fun createRoute(route: Route, platypus: Platypus)
}

fun Route.createRoute(path: String, method: HttpMethod, body: PipelineInterceptor<Unit, ApplicationCall>): Route {
    return route(path, method) { handle(body) }
}

//class ApiOneNoParamStackerRoute<E : BaseEntity<E, M>, M : Model<M, E>, RETURN : Any?>(
//        private val path: String = "/",
//        private val factory: (env: PlatypusEnvironment) -> BaseRepository<E, M>,
//        private val method: ApiOneNoParamStacker<E, M, PublicApiReturn<RETURN>>,
//        private val httpMethod: HttpMethod = HttpMethod.Post) : RouteFactory {
//
//    override fun createRoute(route: Route, platypus: Platypus) {
//        println("Create Route $httpMethod $path/$method")
//        route.createRoute(path, httpMethod) {
//            val env = platypus.newEnv()
//            val entity = factory(env).fromJson(call.receive())
//            val res = method.call(entity)
//            env.close()
//            call.respondText(res.toJson(env).toJsonString(true), ContentType.Application.Json)
//        }
//    }
//}