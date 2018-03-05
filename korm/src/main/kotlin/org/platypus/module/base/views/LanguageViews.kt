package org.platypus.module.base.views

import org.platypus.module.base.models.Languages
import org.platypus.module.base.ui.resAuthMenu
import org.platypus.orm.sql.or
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.MenuAction.getValue
import org.platypus.ui.action.newMenuAction
import org.platypus.ui.form.ModelFormViews
import org.platypus.ui.form.ModelFormViews.getValue
import org.platypus.ui.form.newForm
import org.platypus.ui.menu.AppMenus
import org.platypus.ui.menu.AppMenus.getValue
import org.platypus.ui.menu.newMenu
import org.platypus.ui.search.SearchViews
import org.platypus.ui.search.SearchViews.getValue
import org.platypus.ui.search.newSearch
import org.platypus.ui.tree.TreeViews
import org.platypus.ui.tree.TreeViews.getValue
import org.platypus.ui.tree.newTree

val TreeViews.res_lang_tree by Languages.newTree {
    title = "Languages"
    colors = "gray:not active"
    field(it.name)
    field(it.code)
    field(it.isoCode)
    field(it.direction)
    field(it.translatable)
    field(it.archived)
//    val invisibleAttrs: Languages.() -> Expression<Boolean> = { archived eq false }
//    buttonAction(label = "Update Terms",
//            icon = "fa-refresh",
//            help="Update Language Terms",
//            attrs = UIButton.invisible to invisibleAttrs){action_wizard_update_translations}
}

val ModelFormViews.res_lang_form by Languages.newForm {
    title = "Languages"
    sheet {
        buttonBox {
            button(it.archived, id = "toggle_active", cssClass = "oe_stat_button", icon = "fa-check",
                    options = "{\"terminology\": \"active\"}", widget = "boolean_button")
        }
        div(cssClass = "oe_title") {
            it.name.label(cssClass = "oe_edit_only")
            h1 {
                field(it.name)
            }
        }
        group(3) {
            group {
                field(it.code)
                field(it.isoCode)
                field(it.translatable)
            }
            group {
                field(it.direction)
                field(it.grouping)
                field(it.decimalPoint)
                field(it.thousandsSep)
                field(it.dateFormat)
                field(it.timeFormat)
            }
        }
        group(label = "Legends for supported Date and Time Formats") {
            div { +"%%a - Abbreviated weekday name." }
            div { +"%%A - Full weekday name." }
            div { +"%%b - Abbreviated month name." }
            div { +"%%B - Full month name." }
            div { +"%%d - Day of the month [01,31]." }
            div { +"%%j - Day of the year [001,366]." }
            div { +"%%H - Hour (24-hour clock) [00,23]." }
            div { +"%%I - Hour (12-hour clock) [01,12]." }
            div { +"%%M - Minute [00,59]." }
            div { +"%%p - Equivalent of either AM or PM." }
            div { +"%%S - Seconds [00,61]." }
            div { +"%%w - Weekday number [0(Sunday),6]." }
            div { +"%%y - Year without century [00,99]." }
            div { +"%%Y - Year with century." }
            div { +"%%m - Month number [01,12]." }
        }
        group(label = "Examples") {
            +"1. %%b, %%B         ==> Dec, December"
            +"2. %%a ,%%A         ==> Fri, Friday"
            +"3. %%y, %%Y         ==> 08, 2008"
            +"4. %%d, %%m         ==> 05, 12"
            +"5. %%H:%%M:%%S      ==> 18:25:20"
            +"6. %%I:%%M:%%S %%p  ==> 06:25:20 PM"
            +"7. %%j              ==> 340"
            +"8. %%S              ==> 20"
            +"9. %%w              ==> 5 ( Friday is the 6th day)"
        }
    }
}

val SearchViews.res_lang_search by Languages.newSearch {
    title = "Languages"
    field(it.name, label = "Language") {
        (name ilike it) or (code ilike it) or (isoCode ilike it)
    }
    field(it.direction)
    filter(label = "Translatable", id = "is_translatable") {
        translatable eq true
    }
    filter(label = "Active", id = "active") {
        archived eqOrNull false
    }
}

val MenuAction.res_lang_act_window by Languages.newMenuAction {
    //    views += mapOf(SearchViews to ModelSearchViews.res_lang_search)

}

val AppMenus.menu_res_lang_act_window by newMenu {
    name = Languages.modelLabel
    action = MenuAction.res_lang_act_window
    parent = AppMenus.resAuthMenu
    groups += setOf("base.group_no_one")
    sequence = 1
}