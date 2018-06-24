package org.platypus.module.base.models

import org.platypus.model.Model
import org.platypus.orm.sql.query.ORDERBY_TYPE

object Languages : Model<Languages>("res.language") {
    init {
        name extends {
            required = true
        }
        archived.enable()
    }

    val installed = boolean("installed")
    val code = string("code") {
        label = "Locale Code"
        required = true
        help = "This field is used to set/get locales for user"
    }
    val isoCode = string("isoCode") {
        label = "ISO code"
        help = "This ISO code is the name of po files to use for translations"
    }
    val translatable = boolean("translatable")
    val direction = selection("direction", LanguageDirection) {
        required = true
    }

    val dateFormat = string("dateFormat") {
        default = "%m-%d-%Y"
        required = true
    }

    val timeFormat = string("timeFormat") {
        default = "%H:%M:%S"
        required = true
    }

    val grouping = string("grouping") {
        label = "Separator Format"
        required = true
        default = "[]"
        help = """The Separator Format should be like [,n] where 0 < n :starting from Unit digit.
                |-1 will end the separation. e.g. [3,2,-1] will represent 106500 to be 1,06,500;
                |[1,2,-1] will represent it to be 106,50,0;
                |[3] will represent it as 106,500.
                |Provided ',' as the thousand separator in each case.""".trimMargin()
    }
    val decimalPoint = string("decimalPoint") {
        label = "Decimal Separator"
        required = true
        default = "."
    }
    val thousandsSep = string("thousandsSep") {
        label = "Thousands Separator"
        required = true
        default = ","
    }

    init {
        unique("name_uniq", "The name of the language must be unique !", name)
        unique("code_uniq", "The code of the language must be unique !", code)
        orderBy(installed to ORDERBY_TYPE.ASC, isoCode to ORDERBY_TYPE.ASC)

    }


}