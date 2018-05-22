package org.platypus.module.contact.views

import org.platypus.context.newContext
import org.platypus.context.withDefault
import org.platypus.module.contact.models.Currencies
import org.platypus.module.contact.models.CurrencyRateModel
import org.platypus.orm.sql.expression.Expression
import org.platypus.orm.sql.expression.eq
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

val SearchViews.view_currency_rate_search by CurrencyRateModel.newSearch {
    title = "Currency Rates"
    field(it.date)
}

val ModelFormViews.view_currency_rate_form by CurrencyRateModel.newForm {
    title = "Currency Rates"
    sheet {
        group {
            group {
                field(it.name)
                field(it.rate)
            }
            group {
                field(it.currency)
                field(it.company)
            }
        }
    }
    field(it.date)
    field(it.rate)
    field(it.company, groups = setOf("base.group_multi_company"))
}

val TreeViews.view_currency_rate_tree by CurrencyRateModel.newTree {
    title = "Currency Rates"
    field(it.date)
    field(it.rate)
    field(it.company, groups = setOf("base.group_multi_company"))
}

val MenuAction.act_view_currency_rates by CurrencyRateModel.newMenuAction {
    name = "Currency Rates"
    views += mapOf(TreeViews to TreeViews.view_currency_rate_tree)
    domain = { activeId, _, _ -> CurrencyRateModel.company eq activeId }
    context = { _, _, _ -> newContext(CurrencyRateModel.currency withDefault 1) }
}

val SearchViews.view_currency_search by Currencies.newSearch {
    field(it.name, label = "Currency")
    field(it.archived)
    filter(id = "active", label = "Active", help = "Show active currencies") { archived eq true }
    filter(id = "inactive", label = "Inactive", help = "Show inactive currencies") { archived eq false }
}

val TreeViews.view_currency_tree by Currencies.newTree {
    title = "Currencies"
//    decoration-muted="(not active)"
    field(it.name)
    field(it.symbol)
    field(it.date)
    field(it.rate)
    field(it.archived)
}

val ModelFormViews.view_currency_form by Currencies.newForm {
    header {
        val invisibleAttrs: Currencies.() -> Expression<Boolean> = { archived eq true }
//        buttonAction(label = "View Rates") {
//            act_view_currency_rates
//        }
    }
    sheet {
        div(cssClass = "oe_button_box", id = "button_box") {
            button(it.archived, id = "toggle_active", cssClass = "oe_stat_button", widget = "boolean_button",
                    icon = "fa-archive",
                    options = "'{\"terminology\": \"active\"}'")
        }
        group(4) {
            field(it.name)
            field(it.rate)
        }
        group(groups = setOf("base.group_no_one")) {
            group(label = "Price Accuracy") {
                field(it.rounding)
                field(it.decimalPlaces)
            }
            group(label = "Display") {
                field(it.symbol)
                field(it.position)
            }
        }
    }
}


val MenuAction.action_currency_form by Currencies.newMenuAction {
    name = "Currencies"
    views += mapOf(SearchViews to SearchViews.view_currency_search)
//    <field name="search_view_id" dataRef="view_currency_search"/>
//    <field name="context">{'active_test': False}</field>
}

val MenuAction.action_currency_form_company by Currencies.newMenuAction {
    name = "Currencies"
}

//val ModelFormViews.view_company_form2 by ModelFormViews.view_company_form.extend {
//    findById("company_currency").position(FieldPosition.AFTER) {
//        it.id.label()
//        p(cssClass = "text-muted") {
//            +"Activate"
//            buttonAction(label = "here", widget = "html-a-link") { action_currency_form_company }
//            +"a new currency before creating a new company."
//        }
//    }
//}