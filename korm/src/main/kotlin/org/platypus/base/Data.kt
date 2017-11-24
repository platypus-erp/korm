package org.platypus.base

import org.platypus.base.entities.*
import org.platypus.api.data.dataRef


val GroupData.adminGroup by dataRef("group_root") {
    it.Group.create {
        name = "Admin group"
    }
}
val ResCompanyData.MainCompany by dataRef("main_company") {
    it.ResCompany.create {
        name = "Your company"
    }
}
val UserData.Administrator by dataRef("platypus_root") { e ->
    e.User.create {
        name = "Root"
        groups += env.Group.dataRef.adminGroup
    }
}
