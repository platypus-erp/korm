package org.platypus.module.contact.models

fun sanitize_account_number(acc_number: String): String {
    return if (acc_number.isNotBlank()) {
//        re.sub(r'\W+', '', acc_number).upper()
        acc_number
    } else {
        ""
    }
}