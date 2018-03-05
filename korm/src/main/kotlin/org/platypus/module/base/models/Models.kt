package org.platypus.module.base.models

import org.platypus.module.base.entities.Group

data class UserLoginSuccess(val success: Boolean, val error: String? = null)
data class UserDisconnectReturn(val success: Boolean, val error: String? = null)

data class HasGroupsParam(
        val groups: Collection<Group>,
        val all: Boolean = true
)
//
//
//class LocaleToStringConverter : KormPropertyConverter<String, Locale> {
//    override fun from(value: Locale?): String? = value?.displayName
//
//    override fun to(value: String?): Locale? {
//        if (value == null) return Locale.getDefault()
//        return if ("_" in value) {
//            val (lang, country) = value.split("_")
//            Locale(lang, country)
//        } else {
//            Locale(value)
//        }
//    }
//}


