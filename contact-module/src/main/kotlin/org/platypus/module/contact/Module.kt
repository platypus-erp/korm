package org.platypus.module.contact

import org.platypus.module.ModuleBuilder
import org.platypus.module.base.BaseModule
import org.platypus.module.contact.models.AddressInfos
import org.platypus.module.contact.models.Banks
import org.platypus.module.contact.models.Countries
import org.platypus.module.contact.models.CountriesGroup
import org.platypus.module.contact.models.CountriesState
import org.platypus.module.contact.models.Currencies
import org.platypus.module.contact.models.CurrencyRateModel
import org.platypus.module.contact.models.PartnerBanks
import org.platypus.module.contact.models.PartnerTitles
import org.platypus.module.contact.models.Partners
import org.platypus.module.contact.models.ResCompanies
import org.platypus.module.contact.views.act_view_currency_rates
import org.platypus.module.contact.views.action_country
import org.platypus.module.contact.views.action_country_group
import org.platypus.module.contact.views.action_country_state
import org.platypus.module.contact.views.action_currency_form
import org.platypus.module.contact.views.action_currency_form_company
import org.platypus.module.contact.views.action_res_bank_form
import org.platypus.module.contact.views.action_res_company_form
import org.platypus.module.contact.views.action_res_partner_bank_account_form
import org.platypus.module.contact.views.company_normal_action_tree
import org.platypus.module.contact.views.condensedAddressInfo
import org.platypus.module.contact.views.view_company_form
import org.platypus.module.contact.views.view_company_tree
import org.platypus.module.contact.views.view_country_form
import org.platypus.module.contact.views.view_country_group_form
import org.platypus.module.contact.views.view_country_group_tree
import org.platypus.module.contact.views.view_country_state_form
import org.platypus.module.contact.views.view_country_state_tree
import org.platypus.module.contact.views.view_country_tree
import org.platypus.module.contact.views.view_currency_form
import org.platypus.module.contact.views.view_currency_rate_form
import org.platypus.module.contact.views.view_currency_rate_search
import org.platypus.module.contact.views.view_currency_rate_tree
import org.platypus.module.contact.views.view_currency_search
import org.platypus.module.contact.views.view_currency_tree
import org.platypus.module.contact.views.view_partner_bank_form
import org.platypus.module.contact.views.view_partner_bank_search
import org.platypus.module.contact.views.view_partner_bank_tree
import org.platypus.module.contact.views.view_res_bank_form
import org.platypus.module.contact.views.view_res_bank_tree
import org.platypus.ui.action.MenuAction
import org.platypus.ui.form.ModelFormViews
import org.platypus.ui.search.SearchViews
import org.platypus.ui.tree.TreeViews

object ContactModule : ModuleBuilder("contact", {
    dependsOf { setOf(BaseModule) }
    models {
        add(AddressInfos) {
            views {
                add(ModelFormViews.condensedAddressInfo)
            }
        }
        add(Banks) {
            views {
                add(TreeViews.view_res_bank_tree)
                add(ModelFormViews.view_res_bank_form)
            }
            actions {
                add(MenuAction.action_res_bank_form)
            }
        }
        add(PartnerBanks) {
            views {
                add(TreeViews.view_partner_bank_tree)
                add(SearchViews.view_partner_bank_search)
                add(ModelFormViews.view_partner_bank_form)
            }
            actions {
                add(MenuAction.action_res_partner_bank_account_form)
            }
        }
        add(Countries) {
            views {
                add(TreeViews.view_country_tree)
                add(ModelFormViews.view_country_form)
            }
            actions {
                add(MenuAction.action_country)
            }
        }
        add(CountriesState) {
            views {
                add(TreeViews.view_country_state_tree)
                add(ModelFormViews.view_country_state_form)
            }
            actions {
                add(MenuAction.action_country_state)
            }
        }
        add(CountriesGroup) {
            views {
                add(TreeViews.view_country_group_tree)
                add(ModelFormViews.view_country_group_form)
            }
            actions {
                add(MenuAction.action_country_group)
            }
        }
        add(Currencies) {
            views {
                add(SearchViews.view_currency_search)
                add(TreeViews.view_currency_tree)
                add(ModelFormViews.view_currency_form)
            }
            actions {
                add(MenuAction.action_currency_form)
                add(MenuAction.action_currency_form_company)
            }

        }
        add(CurrencyRateModel) {
            views {
                add(SearchViews.view_currency_rate_search)
                add(ModelFormViews.view_currency_rate_form)
                add(TreeViews.view_currency_rate_tree)
            }
            actions {
                add(MenuAction.act_view_currency_rates)
            }
        }
        add(Partners)
        add(PartnerTitles)
        add(ResCompanies) {
            views {
                add(ModelFormViews.view_company_form)
                add(TreeViews.view_company_tree)
            }
            actions {
                add(MenuAction.company_normal_action_tree)
                add(MenuAction.action_res_company_form)
            }
            menus {
                //                add(AppMenus.menu_action_res_company_form)
            }
        }
    }

})