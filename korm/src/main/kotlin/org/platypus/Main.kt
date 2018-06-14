package org.platypus

import org.platypus.module.base.BaseModule

val platypus = Platypus.create {
    db {
        dbName = "platypus-base"
    }
    web {
        httpPort = 8080
    }
    ui {
        pathPlatypus = "/home/chmuche/workspace/kotlin/korm/platypus"
        pathViews = "/home/chmuche/workspace/kotlin/korm/platypus/actions"
    }
    loadModule = BaseModule
}


/**
 * This is th entry point to start a platypus server
 * This class will load automaticaly the [PlatypusErpService]
 */
fun main(args: Array<String>) {
    platypus.start()
}