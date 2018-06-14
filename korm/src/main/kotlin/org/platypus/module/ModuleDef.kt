package org.platypus.module

import org.platypus.PlatypusEnvironment
import org.platypus.model.Model
import org.platypus.module.base.BaseModule
import org.platypus.repository.RecordRepository
import org.platypus.ui.ToViewApi
import org.platypus.ui.action.UIMenuAction
import org.platypus.web.RouteFactory

class ModuleDef(val name: String) {
    private val models = ModelModule()
    private val data = DataModuleHolder()
    private val i18n = I18nModuleHolder()
    private val menus = MenuHolder()
    private var dependsModule: Set<ModuleBuilder> = setOf(BaseModule)
    private val module by lazy {
        val route = HashMap<Model<*>, Set<RouteFactory>>()
        val views = HashMap<Model<*>, Set<ToViewApi<*>>>()
        val actions = HashMap<Model<*>, Set<UIMenuAction<*>>>()
        val factory = HashMap<Model<*>, (env: PlatypusEnvironment) -> RecordRepository<*>>()
        for (mod in models.models) {
            route[mod.model] = mod.webRoutes.datas
            factory[mod.model] = mod.factory
            views[mod.model] = mod.views.views
            actions[mod.model] = mod.actions.actions
        }
        PlatypusModuleImpl(name,
                models = models.models.map { it.model }.toSet(),
                depends = dependsModule,
                datas = data.datas,
                routes = route,
                modelFactory = factory,
                views = views,
                actions = actions,
                menus = menus.datas
        )
    }

    fun getModule(): PlatypusModuleInfo {
        return module
    }

    fun models(def: ModelModule.() -> Unit) {
        models.def()
    }

    fun datas(def: DataModuleHolder.() -> Unit) {
        data.def()
    }

    fun dependsOf(vararg depends: ModuleBuilder) {
        this.dependsModule = depends.toSet()
    }

    fun menus(menuDef: MenuHolder.() -> Unit) {
        menus.menuDef()
    }

    fun i18n(def: I18nModuleHolder.() -> Unit) {
        i18n.def()
    }
}