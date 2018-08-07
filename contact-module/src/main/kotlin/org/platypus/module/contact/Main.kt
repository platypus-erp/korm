package org.platypus.module.contact

import org.platypus.v2.env.Platypus

fun main(args: Array<String>) {
    val platypus = Platypus.create {
        loadModule = ContactModule
        db {
            dbName = "platypus-contact"
            userDb = "platypus"
            passwordDb = "platypus"
        }
    }
    platypus.start()
}