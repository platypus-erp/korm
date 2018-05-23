package org.platypus

import org.platypus.security.AdminUser
import org.platypus.security.PlatypusUser

interface SudoAble<out T> {
    fun sudo(user: PlatypusUser = AdminUser): T
}