package org.platypus.module.contact.models

import org.platypus.model.Model
import org.platypus.model.NameSearchParam
import org.platypus.model.functions.asResult
import org.platypus.module.contact.entities.Bank
import org.platypus.module.contact.entities.bic
import org.platypus.orm.sql.or

object Banks : Model<Banks>("res.bank") {
    init {
        name extends {
            required = true
        }
        //True
        archived.enable()
    }

    val email = string("email")
    val phone = string("phone")
    val fax = string("fax")
    val bic = string("bic") {
        index = true
        label = "Bank Identifier Code"
        help = "Sometimes called BIC or Swift."
    }
    val address = many2one("address", AddressInfos)
    val company = many2one("company", ResCompanies)


    init {
        nameGet extends {
            val name = if (it.bic != null) {
                "${it.name} - ${it.bic}"
            } else {
                it.name!!
            }
            name.asResult()
        }

        nameSearch extends { repo, param ->
            repo.callSuper(NameSearchParam(
                    param.value, param.where,
                    { e, v -> Banks.bic.ilike("$v%") or (e.eq(v)) },
                    param.limit))
        }
    }
}