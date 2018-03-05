package org.platypus

import io.ktor.content.defaultResource
import io.ktor.content.files
import io.ktor.content.resources
import io.ktor.content.static
import io.ktor.routing.Route
import org.platypus.config.PlatypusConf

fun Route.ressourseRouting(conf: PlatypusConf) {
    static {
        resources("ui")
        defaultResource("index.html", "ui")
        static("live"){
            files("/home/chmuche/workspace/kotlin/korm/webapp/")
        }
    }
}
