package org.platypus.module.contact.views

import kotlinx.html.p
import org.platypus.module.contact.models.PartnerBanks
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.MenuAction.getValue
import org.platypus.ui.action.newMenuAction
import org.platypus.ui.form.ModelFormViews
import org.platypus.ui.form.ModelFormViews.getValue
import org.platypus.ui.form.newForm
import org.platypus.ui.search.SearchViews
import org.platypus.ui.search.SearchViews.getValue
import org.platypus.ui.search.newSearch
import org.platypus.ui.tree.TreeViews
import org.platypus.ui.tree.TreeViews.getValue
import org.platypus.ui.tree.newTree

val TreeViews.view_partner_bank_tree by PartnerBanks.newTree {
    title = "Bank Accounts"
    field(it.sequence, invisible = true)
    field(it.accNumber)
    field(it.bank) { name }
    field(it.bank) { address }
    field(it.company, groups = setOf("base.group_multi_company"))
    field(it.partner)
}


val SearchViews.view_partner_bank_search by PartnerBanks.newSearch {
    title = "Bank Accounts"
//    field(it.bank) { email }
    field(it.company /*invisible="context.get('company_hide', True)"*/)
    field(it.partner)
}

val ModelFormViews.view_partner_bank_form by PartnerBanks.newForm {
    title = "Bank account"
    group(col = 4) {
        field(it.accNumber)
        field(it.partner)
        field(it.bank)
        it.bank.field { email }
        field(it.currency, groups = setOf("base.group_multi_currency"), options = "{'no_create': True}")
        field(it.company, groups = setOf("base.group_multi_company"), options = "{'no_create': True}")
    }
}


val MenuAction.action_res_partner_bank_account_form by PartnerBanks.newMenuAction {
    name = "Bank Accounts"
    htmlNoContent = {
        p("oe_view_nocontent_create") {
            +"Click to create a bank account."
        }
    }
}

