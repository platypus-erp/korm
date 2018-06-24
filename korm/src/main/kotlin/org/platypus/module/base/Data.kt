package org.platypus.module.base

import org.platypus.data.importer.CSVImporter
import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
import org.platypus.module.base.entities.languageRepo
import org.platypus.module.data
import org.platypus.security.ROOT_GROUP
import org.platypus.security.ROOT_USER
import org.platypus.security.groups
import org.platypus.security.name


val dataBaseModule = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    ROOT_GROUP.addData {
        name = "Admin Group"
    }
    ROOT_USER.addData {
        name = "Admin User"
        groups += ROOT_GROUP
    }
}


val dataResLanguage = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    env.languageRepo.readResource(CSVImporter, "data/res_lang.csv")
}