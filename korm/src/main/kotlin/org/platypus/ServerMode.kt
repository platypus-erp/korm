package org.platypus

sealed class ServerMode(val name:String) {

    object TEST : ServerMode("TEST")
    object DEMO : ServerMode("DEMO")
    object DEV : ServerMode("DEV")
    object PRODUCTION : ServerMode("PRODUCTION")

    override fun toString(): String {
        return name
    }
}