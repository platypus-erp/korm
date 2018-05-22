package org.platypus.module.base.i18n

import org.platypus.i18n.baseTranslate
import org.platypus.module.base.models.GroupsData
import org.platypus.module.base.models.Users
import java.util.*

val i18n_base = baseTranslate(Locale.ENGLISH) {
    model(Users)
    model(GroupsData)
}