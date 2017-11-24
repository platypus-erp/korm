package org.platypus

import org.junit.Test
import org.platypus.impl.korm.how.works.BlogModule
import org.platypus.api.module.PlatypusModuleInfo

open class BeforeTest(val module: PlatypusModuleInfo) {

    @Test
    fun createDb() {
        Platypus.create {}.init(module)
    }

}

class BeforeBlogModuleTest : BeforeTest(BlogModule.getModule())