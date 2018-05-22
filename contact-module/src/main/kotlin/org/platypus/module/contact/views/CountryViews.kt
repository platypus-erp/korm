package org.platypus.module.contact.views

import org.platypus.module.contact.models.Countries
import org.platypus.module.contact.models.CountriesGroup
import org.platypus.module.contact.models.CountriesState
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.MenuAction.getValue
import org.platypus.ui.action.newMenuAction
import org.platypus.ui.form.ModelFormViews
import org.platypus.ui.form.ModelFormViews.getValue
import org.platypus.ui.form.newForm
import org.platypus.ui.tree.TreeViews
import org.platypus.ui.tree.TreeViews.getValue
import org.platypus.ui.tree.newTree

val TreeViews.view_country_tree by Countries.newTree {
    field(it.name)
    field(it.code)
}

val ModelFormViews.view_country_form by Countries.newForm {
    field(it.image)
    group {
        group {
            field(it.name)
            field(it.currency)
            field(it.code)
        }
        group {
            field(it.addressFormat, groups = setOf("base.group_no_one"), placeHolder = "Address format...")
            field(it.phoneCode)
        }
    }
    it.states.label()
    it.states.fieldTree {
        field(it.name)
        field(it.code)
    }
}

val MenuAction.action_country by Countries.newMenuAction {
    name = "name"
    help = "Display and manage the list of all countries that can be assigned to your partner records. You can create or delete countries to make sure the ones you are working on will be maintained."
}

val TreeViews.view_country_group_tree by CountriesGroup.newTree {
    title = "Country GroupData"
    field(it.name)
}

val ModelFormViews.view_country_group_form by CountriesGroup.newForm {
    title = "Country GroupData"
    div(cssClass = "oe_title") {
        it.name.label("GroupData name", cssClass = "oe_edit_only")
        h1 {
            field(it.name)
        }
    }
    group(id = "country_group") {
        it.countries.field(widget = "many2many_tags")
    }
}

val MenuAction.action_country_group by CountriesGroup.newMenuAction {
    help = "Display and manage the list of all countries group. You can create or delete country group to make sure the ones you are working on will be maintained."
}


val TreeViews.view_country_state_tree by CountriesState.newTree {
    title = "State"
    field(it.name)
    field(it.code)
    field(it.country)
}

val ModelFormViews.view_country_state_form by CountriesState.newForm {
    title = "State"
    group {
        field(it.name)
        field(it.code)
        field(it.country, options = "{\"no_open\": True}")
    }
}

val MenuAction.action_country_state by CountriesState.newMenuAction {
    name = "Fed. States"
    views = mapOf(TreeViews to TreeViews.view_country_state_tree)
    help = "If you are working on the American market, you can manage the different federal states you are working on from here. Each state is attached to one country."
}