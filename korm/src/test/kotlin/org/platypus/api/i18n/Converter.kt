package org.platypus.api.i18n

import org.junit.Assert.assertEquals
import org.junit.Test


class ConverteurTest{

    @Test
    fun assertStringTrim(){
        assertEquals("mystring", findi18nKey("  mystring"))
        assertEquals("mystring", findi18nKey("mystring  "))
        assertEquals("mystring", findi18nKey("  mystring  "))
        assertEquals( "my_string", findi18nKey("  my_string  "))
    }
    @Test
    fun assertStringSame(){
        assertEquals("Product", findi18nKey("Product"))
        assertEquals("PRODUCT", findi18nKey("PRODUCT"))
        assertEquals("PRODuCT", findi18nKey("PRODuCT"))
    }

    @Test
    fun assertStringSpaceToDot(){
        assertEquals("platypus_is_an_awsome_framework", findi18nKey("platypus is an awsome framework"))
        assertEquals("platypus_is_an_awsome_framework", findi18nKey("  platypus is an awsome framework"))
        assertEquals("platypus_is_an_awsome_framework", findi18nKey("platypus is an awsome framework  "))
        assertEquals("platypus_is_an_awsome_framework", findi18nKey("  platypus is an awsome framework  "))
    }

    @Test
    fun assertStringWithVarags(){
        assertEquals("The_product_cost_=_%d.2", findi18nKey("The product cost = %d.2"))

    }
}