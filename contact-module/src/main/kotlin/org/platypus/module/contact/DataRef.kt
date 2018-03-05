package org.platypus.module.contact

import org.platypus.module.ModuleDataType
import org.platypus.module.data
import org.platypus.module.contact.entities.*
import org.platypus.module.contact.models.CurrencySymbolPosition
import java.math.BigDecimal

val ResCompanyData.mainCompany
    get() = env.resCompaniesRepo["main_company"]

val CurrencyData.euro
    get() = env.currenciesRepo["EUR"]


val dataContactModule = data(ModuleDataType.REAL) {
    val mainCompany = env.resCompaniesRepo.newData("main_company") {
        name = "Your company"
    }
}

val curencyData = data(ModuleDataType.REAL){
    env.currenciesRepo.newData("USD"){
        name= "USD"
        symbol = "$"
        position = CurrencySymbolPosition.before
    }
    env.currenciesRepo.newData("EURO"){
        name= "EURO"
        symbol = "€"
    }

    env.currenciesRepo.newData("VEF"){
        name= "VEF"
        symbol = "Bs.F"
        rounding = 0.0001.toBigDecimal()
        archived = true
    }
    env.currenciesRepo.newData("CAD"){
        name= "CAD"
        symbol = "$"
        archived = true
    }
    env.currenciesRepo.newData("CHF"){
        name= "CHF"
        symbol = "CHF"
        archived = true
    }
    env.currenciesRepo.newData("BRL"){
        name= "BRL"
        symbol = "R$"
        archived = true
        position = CurrencySymbolPosition.before
    }
    env.currenciesRepo.newData("CNY"){
        name= "CNY"
        symbol = "¥"
        archived = true
    }
    env.currenciesRepo.newData("COP"){
        name= "COP"
        symbol = "$"
        archived = true
        position = CurrencySymbolPosition.before
    }
    env.currenciesRepo.newData("CZK"){
        name= "CZK"
        symbol = "Kč"
        archived = true
    }
    env.currenciesRepo.newData("DKK"){
        name= "DKK"
        symbol = "kr"
        archived = true
        position = CurrencySymbolPosition.before
    }
    env.currenciesRepo.newData("HUF"){
        name= "HUF"
        symbol = "ft"
        rounding = BigDecimal.ONE
        archived = true
    }
    env.currenciesRepo.newData("IDR"){
        name= "IDR"
        symbol = "Rp"
        position = CurrencySymbolPosition.before
        archived = true
    }
    env.currenciesRepo.newData("LVL"){
        name= "LVL"
        symbol = "Ls"
        archived = true
    }
    env.currenciesRepo.newData("NOK"){
        name= "NOK"
        symbol = "kr"
        position = CurrencySymbolPosition.before
        archived = true
    }
    env.currenciesRepo.newData("XPF"){
        name= "XPF"
        symbol = "XPF"
        rounding = BigDecimal.ONE
        archived = true
    }
    env.currenciesRepo.newData("PAB"){
        name= "PAB"
        symbol = "B/."
        archived = true
    }
    env.currenciesRepo.newData("PLN"){
        name= "PLN"
        symbol = "zł"
        archived = true
    }
    env.currenciesRepo.newData("SEK"){
        name= "SEK"
        symbol = "kr"
        archived = true
    }
    env.currenciesRepo.newData("ARS"){
        name= "ARS"
        symbol = "$"
        archived = true
    }
    env.currenciesRepo.newData("INR"){
        name= "INR"
        symbol = "₹"
        archived = true
    }
    env.currenciesRepo.newData("AUD"){
        name= "AUD"
        symbol = "$"
        position = CurrencySymbolPosition.before
        archived = true
    }
    env.currenciesRepo.newData("UAH"){
        name= "UAH"
        symbol = "₴"
        archived = true
    }
    env.currenciesRepo.newData("VND"){
        name= "VND"
        symbol = "₫"
        archived = true
    }
    env.currenciesRepo.newData("HKD"){
        name= "HKD"
        symbol = "$"
        archived = true
    }
    env.currenciesRepo.newData("JPY"){
        name= "JPY"
        symbol = "¥"
        archived = true
    }
    env.currenciesRepo.newData("BGN"){
        name= "BGN"
        symbol = "лв"
        archived = true
    }
    env.currenciesRepo.newData("LTL"){
        name= "LTL"
        symbol = "Lt"
        archived = true
    }
    env.currenciesRepo.newData("RON"){
        name= "RON"
        symbol = "lei"
        archived = true
    }
    env.currenciesRepo.newData("HRK"){
        name= "HRK"
        symbol = "kn"
        archived = true
    }
    env.currenciesRepo.newData("RUB"){
        name= "RUB"
        symbol = "руб"
        archived = true
    }
    env.currenciesRepo.newData("TRY"){
        name= "TRY"
        symbol = "₺"
        archived = true
    }
    env.currenciesRepo.newData("KRW"){
        name= "KRW"
        symbol = "₩"
        archived = true
    }
    env.currenciesRepo.newData("MXN"){
        name= "MXN"
        symbol = "$"
        position = CurrencySymbolPosition.before
        archived = true
    }
    env.currenciesRepo.newData("MYR"){
        name= "MYR"
        symbol = "RM"
        archived = true
    }
    env.currenciesRepo.newData("NZD"){
        name= "NZD"
        symbol = "$"
        position = CurrencySymbolPosition.before
        archived = true
    }
    env.currenciesRepo.newData("PHP"){
        name= "PHP"
        symbol = "Php"
        archived = true
    }
    env.currenciesRepo.newData("SGD"){
        name= "SGD"
        symbol = "$"
        archived = true
    }
    env.currenciesRepo.newData("ZAR"){
        name= "ZAR"
        symbol = "R"
        archived = true
    }
    env.currenciesRepo.newData("MXN"){
        name= "MXN"
        symbol = "$"
        position = CurrencySymbolPosition.before
        archived = true
    }
    env.currenciesRepo.newData("CRC"){
        name= "CRC"
        symbol = "¢"
        archived = true
    }
    env.currenciesRepo.newData("MUR"){
        name= "MUR"
        symbol = "Rs"
        archived = true
    }
    env.currenciesRepo.newData("XOF"){
        name= "XOF"
        symbol = "CFA"
        rounding = BigDecimal.ONE
        archived = true
    }
    env.currenciesRepo.newData("XAF"){
        name= "XAF"
        symbol = "FCFA"
        rounding = BigDecimal.ONE
        archived = true
    }
    env.currenciesRepo.newData("UGX"){
        name= "UGX"
        symbol = "USh"
        rounding = BigDecimal.ONE
        archived = true
    }
    env.currenciesRepo.newData("HNL"){
        name= "HNL"
        symbol = "L"
        archived = true
    }
    env.currenciesRepo.newData("UYU"){
        name= "UYU"
        symbol = "$"
        position = CurrencySymbolPosition.before
        archived = true
    }
    env.currenciesRepo.newData("AFN"){
        name= "AFN"
        symbol = "Afs"
        archived = true
    }
    env.currenciesRepo.newData("AOA"){
        name= "AOA"
        symbol = "Kz"
        rounding = BigDecimal.ONE
        archived = true
    }
    env.currenciesRepo.newData("XCD"){
        name= "XCD"
        symbol = "$"
        rounding = BigDecimal.ONE
        archived = true
    }
    env.currenciesRepo.newData("AMD"){
        name= "AMD"
        symbol = "դր."
        rounding = BigDecimal.ONE
        archived = true
    }
    env.currenciesRepo.newData("AWG"){
        name= "AWG"
        symbol = "Afl."
        archived = true
    }
    env.currenciesRepo.newData("AZN"){
        name= "AZN"
        symbol = "m"
        position = CurrencySymbolPosition.before
        archived = true
    }
    env.currenciesRepo.newData("BSD"){
        name= "BSD"
        symbol = "B$"
        archived = true
    }
    env.currenciesRepo.newData("BHD"){
        name= "BHD"
        symbol = "BD"
        archived = true
    }
    env.currenciesRepo.newData("BDT"){
        name= "BDT"
        symbol = "৳"
        archived = true
    }
    env.currenciesRepo.newData("BBD"){
        name= "BBD"
        symbol = "Bds$"
        archived = true
    }
    env.currenciesRepo.newData("BYR"){
        name= "BYR"
        symbol = "BR"
        archived = true
    }
    env.currenciesRepo.newData("BYN"){
        name= "BYN"
        symbol = "Br"
        archived = true
    }
    env.currenciesRepo.newData("BZD"){
        name= "BZD"
        symbol = "BZ\$"
        archived = true
    }
    env.currenciesRepo.newData("BMD"){
        name= "BMD"
        symbol = "BD\$"
        archived = true
    }
    env.currenciesRepo.newData("BTN"){
        name= "BTN"
        symbol = "Nu."
        archived = true
    }
    env.currenciesRepo.newData("BOB"){
        name= "BOB"
        symbol = "Bs."
        archived = true
    }
    env.currenciesRepo.newData("BAM"){
        name= "BAM"
        symbol = "KM"
        archived = true
    }
    env.currenciesRepo.newData("BWP"){
        name= "BWP"
        symbol = "P"
        archived = true
    }
    env.currenciesRepo.newData("BIF"){
        name= "BIF"
        symbol = "FBu"
        archived = true
    }
    env.currenciesRepo.newData("KHR"){
        name= "KHR"
        symbol = "៛"
        archived = true
    }
    env.currenciesRepo.newData("KYD"){
        name= "KYD"
        symbol = "\$"
        archived = true
    }
    env.currenciesRepo.newData("KMF"){
        name= "KMF"
        symbol = "CF"
        archived = true
    }
    env.currenciesRepo.newData("CDF"){
        name= "CDF"
        symbol = "Fr"
        archived = true
    }
    env.currenciesRepo.newData("CUP"){
        name= "CUP"
        symbol = "\$"
        archived = true
    }

}

val countryData = data(ModuleDataType.REAL){
    env.countriesRepo.newData(""){
        name = ""
        code = ""
        image = ContactModule.getRessourceAsByteArray("img/country_flag/ad.png")
        currency = env.currenciesRepo.dataRef.euro
        phoneCode = ""
    }
}