package org.platypus.api.module

import io.ktor.routing.Route
import org.platypus.api.env.PlatypusEnvironement
import org.platypus.api.web.RouteFactory
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.module.ModuleDataHolder
import org.platypus.impl.ui.ViewApi
import java.nio.file.Path

interface PlatypusModuleInfo {
    val name: String
    fun models(): Set<BaseModel<*, *>>
    fun depends(): Set<PlatypusModuleInfo>
    fun datas(): Set<ModuleDataHolder>
    fun routes(): Map<BaseModel<*, *>, Set<RouteFactory>>
    fun views(): Map<BaseModel<*, *>, Set<ViewApi>>
    fun modelFactory(): Map<BaseModel<*, *>, (env: PlatypusEnvironement) -> PlatypusEntityGetter<*, *>>
}

interface PlatypusModuleDefinition {
    val info: PlatypusModuleInfo
}

interface PlatypusModuleUiEngine {
    val name: String

    fun copyTemplate(pathToCopy: Path)

    fun resolveUIDependecy(widget: PlatypusModuleUIWidget)

    fun addCustomHttpRoute(baseRoute : Route)
}

interface PlatypusModuleUIWidget {

    val uiDepends: Set<String>

}