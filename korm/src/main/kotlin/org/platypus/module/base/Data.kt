package org.platypus.module.base

import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
import org.platypus.module.base.entities.code
import org.platypus.module.base.entities.direction
import org.platypus.module.base.entities.isoCode
import org.platypus.module.base.entities.languageRepo
import org.platypus.module.base.entities.translatable
import org.platypus.module.base.models.LanguageDirection
import org.platypus.module.base.models.ltr
import org.platypus.module.data
import org.platypus.security.ROOT_GROUP
import org.platypus.security.ROOT_USER
import org.platypus.security.groups
import org.platypus.security.name
import java.util.*


val dataBaseModule = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    ROOT_GROUP.addData {
        name = "Admin Group"
    }
    ROOT_USER.addData {
        name = "Admin User"
        groups += ROOT_GROUP
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