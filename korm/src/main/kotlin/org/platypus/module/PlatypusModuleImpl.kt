package org.platypus.module

import org.platypus.PlatypusEnvironment
import org.platypus.i18n.PlatypusI18N
import org.platypus.model.Model
import org.platypus.model.functions.PublicApiReturn
import org.platypus.model.functions.one.ApiOneNoParamStacker
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.security.ModelGroupBuilder
import org.platypus.security.ModelRuleBuilder
import org.platypus.security.toBuilder
import org.platypus.ui.ToViewApi
import org.platypus.ui.action.UIMenuAction
import org.platypus.ui.menu.UIMenu
import org.platypus.web.RouteFactory

class ModelDataHolder<M : Model<M>>(val model: M) {
    val factory: (env: PlatypusEnvironment) -> RecordRepository<M> = { RecordRepositoryImpl(it, model) }
    val webRoutes = ModelRouteHolder(model)
    val views = ModelViewsHolder<M>()
    val actions = ActionHolder<M>()

    init {
//        webRoutes.datas.add(ApiStore(models, factory))
//        webRoutes.datas.add(ApiDeleteOne(models, factory))
//        webRoutes.datas.add(ApiGetByIdOne(models, factory))
    }

    fun route(def: ModelRouteHolder<M>.() -> Unit) {
        webRoutes.def()
    }

    fun views(def: ModelViewsHolder<M>.() -> Unit) {
        views.def()
    }

    fun actions(def: ActionHolder<M>.() -> Unit) {
        actions.def()
    }

    fun menus(def: ModelViewsHolder<M>.() -> Unit) {
        views.def()
    }

    fun security(def: ModelSecurityHolder<M>.() -> Unit) {

    }
}

class ModelSecurityHolder<M : Model<M>>(val model: M) {

    fun newRule(name: String, ruleDef: ModelRuleBuilder<M>.() -> Unit) {
        model.metadata.addRule(ModelRuleBuilder<M>(name).apply{ ruleDef() }.build())
    }

    fun extendRule(name:String, ruleDef:ModelRuleBuilder<M>.() -> Unit){
        val rule = model.metadata.getRule(name).toBuilder().apply { ruleDef() }
        model.metadata.addRule(rule.build())
    }

    fun newSecurityGroup(name:String, ruleDef: ModelGroupBuilder<M>.() -> Unit) {

    }

    fun extendSecurityGroup(name:String, ruleDef: ModelGroupBuilder<M>.() -> Unit) {

    }
}

class ModelRouteHolder<M : Model<M>>(model: M) {
    internal val datas = HashSet<RouteFactory>()

    val routes: Set<RouteFactory>
        get() = datas

    infix fun <T : Any?> String.pathOf(meth: ApiOneNoParamStacker<M, PublicApiReturn<T>>) {
//        datas.add(ApiOneNoParamStackerRoute(this, factory, meth, meth.visibilityType))
    }
}

class ModelViewsHolder<M : Model<M>> {
    val datas = HashSet<ToViewApi<*>>()

    val views: Set<ToViewApi<*>>
        get() = datas

    fun add(view: ToViewApi<*>) {
        datas.add(view)
    }
}

class MenuHolder {
    val datas = HashSet<UIMenu>()

    val views: Set<UIMenu>
        get() = datas

    fun add(view: UIMenu) {
        datas.add(view)
    }
}

class ActionHolder<M : Model<M>> {
    val datas = HashSet<UIMenuAction<M>>()

    val actions: Set<UIMenuAction<M>>
        get() = datas

    fun add(view: UIMenuAction<M>) {
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


class PlatypusModuleImpl(
        override val name: String,
        private val models: Set<Model<*>>,
        private val depends: Set<ModuleBuilder>,
        private val datas: Set<ModuleDataHolder>,
        private val routes: Map<Model<*>, Set<RouteFactory>>,
        private val modelFactory: Map<Model<*>, (env: PlatypusEnvironment) -> RecordRepository<*>>,
        private val views: Map<Model<*>, Set<ToViewApi<*>>>,
        private val actions: Map<Model<*>, Set<UIMenuAction<*>>>,
        private val menus: Set<UIMenu>
) : PlatypusModuleInfo {
    override fun models() = models

    override fun depends() = depends.map { it.module.getModule() }.toSet()

    override fun datas() = datas

    override fun routes() = routes

    override fun modelFactory() = modelFactory

    override fun views() = views

    override fun actions() = actions

    override fun menus(): Set<UIMenu> = menus

    override fun toString(): String {
        return name
    }
}