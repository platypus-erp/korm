package org.platypus

import org.platypus.model.Model
import org.platypus.module.ModuleDataHolder
import org.platypus.module.ModuleDef
import org.platypus.module.PlatypusModuleInfo
import org.platypus.repository.RecordRepository
import org.platypus.ui.ToViewApi
import org.platypus.ui.action.UIMenuAction
import org.platypus.ui.menu.UIMenu
import org.platypus.web.RouteFactory

internal object ErpModule : PlatypusModuleInfo {
    override val name: String = "platypus-erp-module"
    val models: MutableSet<Model<*>> = HashSet()
    val depends: MutableSet<ModuleDef> = HashSet()
    val datas: MutableSet<ModuleDataHolder> = HashSet()
    val routes: MutableMap<Model<*>, MutableSet<RouteFactory>> = HashMap()
    val modelFactory: MutableMap<Model<*>, (env: PlatypusEnvironment) -> RecordRepository<*>> = HashMap()
    val views: MutableMap<Model<*>, MutableSet<ToViewApi<*>>> = HashMap()
    val actions: MutableMap<Model<*>, Set<UIMenuAction<*>>> = HashMap()
    val menus: MutableSet<UIMenu> = HashSet()

    override fun actions(): Map<Model<*>, Set<UIMenuAction<*>>> = actions

    override fun menus(): Set<UIMenu> = menus

    override fun models() = models

    override fun depends() = depends.map { it.getModule() }.toSet()

    override fun datas() = datas

    override fun routes() = routes

    override fun modelFactory() = modelFactory

    override fun views() = views
}