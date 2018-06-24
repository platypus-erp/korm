package org.platypus.module

abstract class ModuleBuilder(val name: String, private val init: ModuleDef.() -> Unit) {

    val module: ModuleDef by lazy {
        val mod = ModuleDef(name)
        mod.init()
        mod
    }


}