package org.platypus

import org.platypus.module.base.entities.User
import org.platypus.module.base.entities.users
import org.platypus.module.base.root

interface SudoAble<out T> : Environmentable {
    fun sudo(user: User = this.env.users.dataRef.root): T
}