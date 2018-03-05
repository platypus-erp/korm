package org.platypus.module.contact.views

import org.platypus.module.contact.models.ResCompanies
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.MenuAction.getValue
import org.platypus.ui.action.newMenuAction
import org.platypus.ui.form.ModelFormViews
import org.platypus.ui.form.ModelFormViews.getValue
import org.platypus.ui.form.newForm
import org.platypus.ui.tree.TreeViews
import org.platypus.ui.tree.TreeViews.getValue
import org.platypus.ui.tree.newTree

val ModelFormViews.view_company_form by ResCompanies.newForm {
    sheet {
        it.partner.field(widget = "image", cssClass = "oe_avatar") { image }
        div(cssClass = "oe_avatar") {
            it.name.label(cssClass = "oe_edit_only")
            h1 {
                field(it.name, cssClass = "oe_edit_only")
            }
        }
        notebook(colSpan = 4) {
            page {
                title = "General Information"
                group {
                    group {
                        field(it.partner, readonly = true, groups = setOf("base.group_no_one"))
                        it.address.includeForm { condensedAddressInfo }
                        it.partner.field(widget = "url", placeHolder = "e.g. www.platypus-erp.com") { webSite }
                    }
                    group {
                        it.partner.field { phone }
                        it.partner.field { fax }
                        it.partner.field { email }
                        it.partner.field { vat }
                        field(it.companyRegistry)
                        field(it.currency, options = "{'no_create': True}", id = "company_currency")
                        field(it.parent, groups = setOf("base.group_multi_company"))
                        field(it.sequence, invisible = true)
                    }
                }
            }
        }
    }
}

val TreeViews.view_company_tree by ResCompanies.newTree {
    enableTree = true
    title = "Companies"
    field(it.sequence, widget = "handle")
    field(it.name)
    field(it.parent)
}

val MenuAction.company_normal_action_tree by ResCompanies.newMenuAction {
    name = "Companies"
    domain = { active_id, _, _ -> ResCompanies.id eq active_id }
}

val MenuAction.action_res_company_form by ResCompanies.newMenuAction {
    name = "Companies"
    help = "Create and manage the companies that will be managed by Odoo from here. Shops or subsidiaries can be created and maintained from here."
}

//val AppMenus.menu_action_res_company_form by newMenu {
//    parent = UIMenu.menu_users
//    action = MenuAction.action_res_company_form
//}

//<record id="ir_open_company" model="ir.values">
//<field eval="'tree_but_open'" name="key2"/>
//<field eval="'res.company'" name="model"/>
//<field name="name">Companies</field>
//<field eval="'ir.actions.act_window,%d'%company_normal_action_tree" name="value"/>
//</record>