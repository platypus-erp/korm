package org.platypus.module.contact

import org.platypus.module.ModuleBuilder
import org.platypus.module.base.BaseModule
import org.platypus.module.contact.entities.*
import org.platypus.module.contact.models.*
import org.platypus.module.contact.views.*
import org.platypus.ui.action.MenuAction
import org.platypus.ui.form.ModelFormViews
import org.platypus.ui.search.SearchViews
import org.platypus.ui.tree.TreeViews

object ContactModule : ModuleBuilder("contact", {
    dependsOf { setOf(BaseModule) }
    models {
        add(AddressInfos, { it.addressInfosRepo }) {
            views {
                add(ModelFormViews.condensedAddressInfo)
            }
        }
        add(Banks, { it.banksRepo }) {
            views {
                add(TreeViews.view_res_bank_tree)
                add(ModelFormViews.view_res_bank_form)
            }
            actions {
                add(MenuAction.action_res_bank_form)
            }
        }
        add(PartnerBanks, { it.partnerBankRepo }) {
            views {
                add(TreeViews.view_partner_bank_tree)
                add(SearchViews.view_partner_bank_search)
                add(ModelFormViews.view_partner_bank_form)
            }
            actions {
                add(MenuAction.action_res_partner_bank_account_form)
            }
        }
        add(Countries, { it.countriesRepo }) {
            views {
                add(TreeViews.view_country_tree)
                add(ModelFormViews.view_country_form)
            }
            actions {
                add(MenuAction.action_country)
            }
        }
        add(CountriesState, { it.countriesStateRepo }) {
            views {
                add(TreeViews.view_country_state_tree)
                add(ModelFormViews.view_country_state_form)
            }
            actions {
                add(MenuAction.action_country_state)
            }
        }
        add(CountriesGroup, { it.countriesGroupRepo }) {
            views {
                add(TreeViews.view_country_group_tree)
                add(ModelFormViews.view_country_group_form)
            }
            actions {
                add(MenuAction.action_country_group)
            }
        }
        add(Currencies, { it.currenciesRepo }) {
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
        add(CurrencyRateModel, { it.currencyRateRepo }) {
            views {
                add(SearchViews.view_currency_rate_search)
                add(ModelFormViews.view_currency_rate_form)
                add(TreeViews.view_currency_rate_tree)
            }
            actions {
                add(MenuAction.act_view_currency_rates)
            }
        }
        add(Partners, { it.partnersRepo })
        add(PartnerTitles, { it.partnerTitleRepoRepo })
        add(ResCompanies, { it.resCompaniesRepo }) {
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