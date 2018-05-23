package org.platypus.module.base

import org.platypus.module.ModuleData
import org.platypus.module.ModuleDataType
import org.platypus.module.UpdateDataType
import org.platypus.module.base.entities.Language
import org.platypus.module.base.entities.UserData
import org.platypus.module.base.entities.code
import org.platypus.module.base.entities.direction
import org.platypus.module.base.entities.isoCode
import org.platypus.module.base.entities.languageRepo
import org.platypus.module.base.entities.translatable
import org.platypus.module.base.entities.users
import org.platypus.module.base.models.LanguageDirection
import org.platypus.module.data
import org.platypus.security.AdminGroup
import org.platypus.security.AdminUser
import org.platypus.security.groups
import org.platypus.security.name
import java.util.*


val dataBaseModule = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    AdminGroup.addData {
        name = "Admin Group"
    }
    AdminUser.addData {
        name = "Admin User"
        groups += AdminGroup
    }
}

val languageData = data(ModuleDataType.REAL, UpdateDataType.NEVER) {
    for (l in Locale.getAvailableLocales().filter { it.country.isNotBlank() }) {
        newLanguage(l.toString()) {
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


fun ModuleData.newLanguage(ref: String, init: Language.() -> Unit): Language {
    return newData(this.env.languageRepo, ref, init)
}