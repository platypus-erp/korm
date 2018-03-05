//package org.platypus.modules.generator.orm
//
//import com.squareup.kotlinpoet.ClassName
//import com.squareup.kotlinpoet.TypeSpec
//import org.platypus.modules.data.ModelGenerate
//import org.platypus.modules.data.platypusTable
//import org.platypus.modules.firstUpper
//import org.platypus.modules.toSneakeCase
//
//
//fun generateTable(m: ModelGenerate): TypeSpec.Builder {
//    val models = ClassName(m.pkg, m.fieldName)
//    val models = ClassName(m.pkg,"${m.fieldName.firstUpper()}Table")
//    println("${m.fieldName.firstUpper()}Table")
//    val tableBuilder = TypeSpec.objectBuilder(models)
//            .superclass(platypusTable).addSuperclassConstructorParameter("%S", m.fieldName.toSneakeCase())
//
//    for (f in m.simpleField) {
//        println("\t"+ f.fieldName + " " + f.type)
//        tableBuilder.addProperty(f.type.templateGenerateTable(f, models).build())
//    }
//    return tableBuilder
//}