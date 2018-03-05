package org.platypus.ui

import org.platypus.Platypus
import org.platypus.module.PlatypusModuleDefinition
import org.platypus.struct.BlogModule
import org.platypus.newTest


class ViewGenerator(module: PlatypusModuleDefinition){

}


fun main(args: Array<String>) {
    Platypus.newTest(BlogModule)
}