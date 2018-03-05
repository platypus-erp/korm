package org.platypus.module.contact

import org.platypus.Platypus

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