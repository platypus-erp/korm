package org.platypus.old.ui

import org.platypus.Platypus
import org.platypus.module.PlatypusModuleDefinition
import org.platypus.module.blog.BlogModule
import org.platypus.newTest


class ViewGenerator(module: PlatypusModuleDefinition){

}


fun main(args: Array<String>) {
    Platypus.newTest(BlogModule)
}