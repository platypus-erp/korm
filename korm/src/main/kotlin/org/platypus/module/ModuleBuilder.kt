package org.platypus.module

import java.io.InputStream

abstract class ModuleBuilder(val name: String, private val init: ModuleDef.() -> Unit) {

    val module: ModuleDef by lazy {
        val mod = ModuleDef(name)
        mod.init()
        mod
    }

    fun getRessource(path: String): InputStream = this::class.java.getResourceAsStream(path)

    fun getRessourceAsByteArray(path: String): ByteArray = this.getRessource(path).readBytes()


}