package org.platypus.api.i18n

import java.util.*

/**
 * The entry point of the findi18nKey platypus framework
 * Try to convert [str] in a findi18nKey Java properties key and get the Value or return [str]
 * If [str] is null the string "null" is returned
 * @see [java.lang.String.valueOf]
 */
fun findi18nKey(str: String?, vararg args: Any): String {
    return StringToi18nJ.convert(java.lang.String.valueOf(str))
}


/**
 * This class convert a Basic String to a findi18nKey Java property key
 */
object StringToi18nJ {


    fun convert(str: String): String {
        return str.trim().replace(' ', '_')
    }

    fun getTrad(str: String): String {
        return ResourceBundle.getBundle("ui", PlatypusResourcesBundleControle()).getString(str)
    }

    class PlatypusResourcesBundleControle : ResourceBundle.Control() {


    }

}