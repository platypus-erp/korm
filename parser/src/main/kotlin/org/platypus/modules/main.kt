package org.platypus.modules

import org.platypus.modules.parser.ModelsParser
import java.nio.file.Files
import java.nio.file.Paths

/**
 * @author chmuchme
 * @since 0.1
 * on 14/10/17.
 */
fun main(args: Array<String>) {
    val group = "org.platypus.erp"
    val artifact = "base"
    val arg = arrayOf("--group=$group", "--artifactId=$artifact")
    val p = "/home/apasquier/WorkSpace/Kotlin/platypus/korm/src/test/kotlin/org/platypus/korm/how/works/modelentity"
    val result = ModelsParser.run(Paths.get(p))



    result.models
}

fun String.firstUpper(): String {
    return this.first().toUpperCase() + this.substring(1)
}

private val REGEX = "([a-z])([A-Z]+)".toRegex()
fun String.toSneakeCase(): String {
    return this.replace(REGEX, "$1_$2").toLowerCase()
}