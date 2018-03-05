package org.platypus.exceptions

import kotlin.reflect.KClass

sealed class PlatypusExceptions(msg: String) : RuntimeException(msg)
class ValidationError(msg: String) : PlatypusExceptions(msg)
class ElementNotFound(elementName: String, query: String) : PlatypusExceptions("The element $elementName not found with Query $query")

class RessourceNotFoundExecption(name: String, loader: KClass<*>) : RuntimeException("Ressource $name not found in ${loader.java.canonicalName} package")



enum class ActionType{
    CREATE, READ, UPDATE, DELETE, OTHER
}
class PlatypusForbiddenAction(val methodName:String) : PlatypusExceptions("You can't perform this action due to the security policy of the application" +
        "\n see your administrator for futher information" +
        "\n Action : $methodName")