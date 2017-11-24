package org.platypus


fun main(args: Array<String>) {
    val platypusServer = Platypus.create {
        web {
            httpPort = 80
        }
    }
    platypusServer.start()
}

