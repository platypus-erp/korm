package org.platypus.module.contact.views

import kotlinx.html.p
import org.platypus.module.contact.models.Banks
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.MenuAction.getValue
import org.platypus.ui.action.newMenuAction
import org.platypus.ui.form.ModelFormViews
import org.platypus.ui.form.ModelFormViews.getValue
import org.platypus.ui.form.newForm
import org.platypus.ui.tree.TreeViews
import org.platypus.ui.tree.TreeViews.getValue
import org.platypus.ui.tree.newTree

val TreeViews.view_res_bank_tree by Banks.newTree {
    title = "Banks"
    field(it.name)
    field(it.bic)
    field(it.address, invisible = true) { country }
}


val ModelFormViews.view_res_bank_form by Banks.newForm {
    title = "Bank"
    group(col = 4) {
        field(it.name)
        field(it.bic)
    }
    group {
        group {
            title = "Address"
            it.address.includeForm { condensedAddressInfo }
        }
        group {
            title = "Communication"
            field(it.phone)
            field(it.fax)
            field(it.email, widget = "email")
            field(it.archived)
        }
    }
}

val MenuAction.action_res_bank_form by Banks.newMenuAction {
    name = "Banks"
    defaultView = ModelFormViews
    viewMode = setOf(TreeViews, ModelFormViews)
    htmlNoContent = {
        p("oe_view_nocontent_create") {
            +"Click to create a new bank."
        }
        p {
            +"Manage bank records you want to be used in the system."
        }
    }
}