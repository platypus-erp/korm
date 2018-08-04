package org.platypus.module.contact.models

import org.platypus.model.Model
import java.time.LocalDateTime

object CurrencyRateModel : Model<CurrencyRateModel>("res.currency.rate") {
    val date = dateTime("date") {
        required = true
        index = true
        defaultValueFun = {
            LocalDateTime.now()
        }
    }
    val rate = decimal("rate") {
        help = "The rate of the currency to the currency of rate 1"
    }

    val currency = many2one("currency", Currencies) {
        readonly = true
    }

    val company = many2one("company", ResCompanies) {
        defaultValueFun = {
            TODO("it.user.company")
        }
    }

    init {
        name extend {
            TODO("onGet date")
        }
//        nameSearch extends { self, param ->
//            //            if operator in ['=', '!=']:
//            try:
//                date_format = '%Y-%m-%d'
//                if self._context.get('lang'):
//                langs = self.env['res.lang'].search([('code', '=', self._context['lang'])])
//                if langs:
//                date_format = langs.date_format
//                name = time.strftime('%Y-%m-%d', time.strptime(name, date_format))
//                except ValueError:
//                try:
//                    args.append(('rate', operator, float(name)))
//                    except ValueError:
//                    return []
//                    name = ''
//                    operator = 'ilike'
//            self.callSuper(param)
//        }
    }
}