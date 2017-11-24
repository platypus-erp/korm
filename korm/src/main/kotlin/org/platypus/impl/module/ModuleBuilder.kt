package org.platypus.impl.module

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.api.i18n.PlatypusI18N
import org.platypus.api.module.PlatypusModuleInfo
import org.platypus.api.web.*
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.functions.PublicApiReturn
import org.platypus.impl.korm.model.functions.one.ApiOneNoParamStacker
import org.platypus.impl.ui.ViewApi

class PlatypusModuleImpl(
        override val name: String,
        private val models: Set<BaseModel<*, *>>,
        private val depends: Set<ModuleDef>,
        private val datas: Set<ModuleDataHolder>,
        private val routes: Map<BaseModel<*, *>, Set<RouteFactory>>,
        private val modelFactory: Map<BaseModel<*, *>, (env: PlatypusEnvironement) -> PlatypusEntityGetter<*, *>>,
        private val views: Map<BaseModel<*, *>, Set<ViewApi>>
) : PlatypusModuleInfo {
    override fun models() = models

    override fun depends() = depends.map { it.getModule() }.toSet()

    override fun datas() = datas

    override fun routes() = routes

    override fun modelFactory() = modelFactory

    override fun views() = views

    override fun toString(): String {
        return name
    }
}

fun declareModule(name: String, init: ModuleDef.() -> Unit): ModuleDef {
    val module = ModuleDef(name)
    module.init()
    return module
}

class ModuleDef(val name: String) {
    private val models = ModelModule()
    private val data = DataModuleHolder()
    private val i18n = I18nModuleHolder()
    private var dependsModule: () -> Set<ModuleDef> = { emptySet() }
    private val module by lazy {
        val route = HashMap<BaseModel<*, *>, Set<RouteFactory>>()
        val views = HashMap<BaseModel<*, *>, Set<ViewApi>>()
        val factory = HashMap<BaseModel<*, *>, (env: PlatypusEnvironement) -> PlatypusEntityGetter<*, *>>()
        for (mod in models.models) {
            route[mod.model] = mod.webRoutes.datas
            factory[mod.model] = mod.factory
            views[mod.model] = mod.views.views
        }
        PlatypusModuleImpl(name,
            models.models.map { it.model }.toSet(),
            dependsModule(),
            data.datas,
            route,
            factory,
            views
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

    fun dependsOf(depends: () -> Set<ModuleDef>) {
        this.dependsModule = depends
    }

    fun i18n(def: I18nModuleHolder.() -> Unit) {
        i18n.def()
    }
}

class ModelModule {
    private val internalModels: MutableSet<ModelDataHolder<*, *>> = HashSet()

    val models: Set<ModelDataHolder<*, *>>
        get() = internalModels

    fun <M : BaseModel<M, E>, E : PlatypusEntity<E, M>>
        add(model: BaseModel<M, E>,
            factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>,
            def: ModelDataHolder<M, E>.() -> Unit = {}) {
        val holder = ModelDataHolder(model, factory)
        holder.def()
        internalModels.add(holder)
    }
}

class ModelDataHolder<M : BaseModel<M, E>, E : PlatypusEntity<E, M>>
(val model: BaseModel<M, E>, val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>) {
    val webRoutes = ModelRouteHolder(factory)
    val views = ModelViewsHolder<M, E>()

    init {
        webRoutes.datas.add(ApiStore(model, factory))
        webRoutes.datas.add(ApiDeleteOne(model, factory))
        webRoutes.datas.add(ApiGetByIdOne(model, factory))
    }

    fun route(def: ModelRouteHolder<M, E>.() -> Unit) {
        webRoutes.def()
    }

    fun views(def: ModelViewsHolder<M, E>.() -> Unit) {
        views.def()
    }
}

class ModelRouteHolder<M : BaseModel<M, E>, E : PlatypusEntity<E, M>>(
    val factory: (env: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>
) {
    internal val datas = HashSet<RouteFactory>()

    val routes: Set<RouteFactory>
        get() = datas

    infix fun <T : Any?> String.pathOf(meth: ApiOneNoParamStacker<E, M, PublicApiReturn<T>>) {
        datas.add(ApiOneNoParamStackerRoute(this, factory, meth, meth.visibilityType))
    }
}

class ModelViewsHolder<M : BaseModel<M, E>, E : PlatypusEntity<E, M>> {
    val datas = HashSet<ViewApi>()

    val views: Set<ViewApi>
        get() = datas

    fun add(view: ViewApi) {
        datas.add(view)
    }
}


class DataModuleHolder {
    private val data = HashSet<ModuleDataHolder>()

    val datas: Set<ModuleDataHolder>
        get() = data

    fun add(dataHolder: ModuleDataHolder) {
        data.add(dataHolder)
    }
}

class I18nModuleHolder {
    private val data = HashSet<PlatypusI18N>()

    val i18n: Set<PlatypusI18N>
        get() = data

    fun add(dataHolder: PlatypusI18N) {
        data.add(dataHolder)
    }
}




