package org.platypus.module

import io.ktor.routing.Route
import org.platypus.PlatypusEnvironment
import org.platypus.model.Model
import org.platypus.repository.RecordRepository
import org.platypus.ui.ToViewApi
import org.platypus.ui.action.UIMenuAction
import org.platypus.ui.menu.UIMenu
import org.platypus.web.RouteFactory
import java.nio.file.Path

interface PlatypusModuleInfo {
    val name: String
    fun models(): Set<Model<*>>
    fun depends(): Set<PlatypusModuleInfo>
    fun datas(): Set<ModuleDataHolder>
    fun routes(): Map<Model<*>, Set<RouteFactory>>
    fun views(): Map<Model<*>, Set<ToViewApi<*>>>
    fun actions(): Map<Model<*>, Set<UIMenuAction<*>>>
    fun menus(): Set<UIMenu>
    fun modelFactory(): Map<Model<*>, (env: PlatypusEnvironment) -> RecordRepository<*>>
}

interface PlatypusModuleDefinition {
    val info: PlatypusModuleInfo
}

interface PlatypusModuleUiEngine {
    val name: String

    fun copyTemplate(pathToCopy: Path)

    fun resolveUIDependecy(widget: PlatypusModuleUIWidget)

    fun addCustomHttpRoute(baseRoute: Route)
}

interface PlatypusModuleUIWidget {

    val uiDepends: Set<String>

}