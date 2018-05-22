package org.platypus.module.base

import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
import org.platypus.module.data
import org.platypus.module.base.entities.*
import org.platypus.module.base.models.LanguageDirection
import org.platypus.security.GroupData
import org.platypus.security.groupsRepo
import java.util.*


val GroupData.adminGroup
    get() = env.groupsRepo["group_root"]

val UserData.root
    get() = env.users["platypus_root"]


val dataBaseModule = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    val adminGroup = env.groupsRepo.newData(env.conf.adminUserRef +"_group") {
        name = "Admin group"
    }
    val administrator = env.users.newData(env.conf.adminUserRef) {
        groups.add(adminGroup)
    }
}

val languageData = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    for (l in Locale.getAvailableLocales().filter { it.country.isNotBlank() }) {
        env.languageRepo.newData(l.toString()) {
            name = l.displayName
            isoCode = l.toLanguageTag()
            code = l.toString()
            translatable = true
            direction = LanguageDirection.ltr
//            dateFormat = (SimpleDateFormat.getDateInstance(SimpleDateFormat.LONG) as SimpleDateFormat).toLocalizedPattern()
//            timeFormat = (SimpleDateFormat.getDateInstance(SimpleDateFormat.HOUR_OF_DAY0_FIELD) as SimpleDateFormat).toLocalizedPattern()
        }
    }
}
