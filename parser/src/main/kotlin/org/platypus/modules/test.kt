package org.platypus.modules

import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.platypus.modules.lang.kotlin.KotlinLexer
import org.platypus.modules.lang.kotlin.KotlinParser

fun main(args: Array<String>) {
    "val r = 2t".parserCode()
    "val r = 2".parserCode()
    "val r by z".parserCode()
    """val r
        |get() = 25
    """.trimMargin().parserCode()
    """val r
        |get() { return "l" }
    """.trimMargin().parserCode()

}

private fun String.parserCode(){
    println("Start Parsing $this")
    val lexer = KotlinLexer(ANTLRInputStream(this))
    val tokens = CommonTokenStream(lexer)
    val parser = KotlinParser(tokens)
    val kfile = parser.kotlinFile()
    println("End Parsing $this")
}