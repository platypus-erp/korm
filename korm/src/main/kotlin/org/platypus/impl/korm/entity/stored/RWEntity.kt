package org.platypus.impl.korm.entity.stored

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.ArrayBag
import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.HierarchicNamedEntity
import org.platypus.impl.korm.entity.ManyToOneDelegate
import org.platypus.impl.korm.entity.NamedEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.entity.PlatypusSelection
import org.platypus.impl.korm.entity.PlatypusSelectionCompanion
import org.platypus.impl.korm.entity.many2one
import org.platypus.impl.korm.entity.one2many
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.HierarchyModel
import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.korm.model.property.KormBooleanProperty
import org.platypus.impl.korm.model.property.KormDecimalProperty
import org.platypus.impl.korm.model.property.KormFloatProperty
import org.platypus.impl.korm.model.property.KormIntegerProperty
import org.platypus.impl.korm.model.property.KormNameProperty
import org.platypus.impl.korm.model.property.KormSelectionProperty
import org.platypus.impl.korm.model.property.KormStringProperty
import org.platypus.impl.korm.model.property.KormTextProperty
import org.platypus.impl.korm.identifiants.withId
import java.math.BigDecimal
import kotlin.reflect.KProperty

abstract class RWEntity<E : RWEntity<E, M>, M : BaseModel<M, E>>(
        _id: Long,
        env: PlatypusEnvironement,
        model: M,
        factory: (e: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>
) : ROEntity<E, M>(_id, env, model, factory) {

    operator fun KormStringProperty<M>.setValue(o: Entity<E, M>, desc: KProperty<*>, value: String?) {
        warmCache()[modelID, this] = value
    }

    operator fun KormTextProperty<M>.setValue(o: Entity<E, M>, desc: KProperty<*>, value: String?) {
        warmCache()[modelID, this] = value
    }

    operator fun KormFloatProperty<M>.setValue(o: Entity<E, M>, desc: KProperty<*>, value: Float?) {
        warmCache()[modelID, this] = value
    }

    operator fun KormDecimalProperty<M>.setValue(o: Entity<E, M>, desc: KProperty<*>, value: BigDecimal?) {
        warmCache()[modelID, this] = value
    }

    operator fun <PSC : PlatypusSelectionCompanion<M, E, PS>, PS : PlatypusSelection<M, E>>
        KormSelectionProperty<M, PSC, PS>.setValue(o: Entity<E, M>, desc: KProperty<*>, value: PS?) {
        warmCache()[modelID, this] = value?.value
    }

    operator fun KormIntegerProperty<M>.setValue(o: Entity<E, M>, desc: KProperty<*>, value: Int?) {
        warmCache()[modelID, this] = value
    }

    operator fun KormBooleanProperty<M>.setValue(o: Entity<E, M>, desc: KProperty<*>, value: Boolean) {
        warmCache()[modelID, this] = value
    }

    operator fun <T : Entity<T, MODEL_TARGET>, MODEL_TARGET : BaseModel<MODEL_TARGET, T>>
        ManyToOneDelegate<MODEL_TARGET, T>.setValue(o: Entity<E, M>, desc: KProperty<*>, value: T) {
        warmCache()[modelID, this.prop] = this.prop.model withId value.id
    }

    operator fun plus(other: E): Bag<E> {
        return ArrayBag(env, model, factory, modelID + other.modelID)
    }

}

abstract class RWNamedEntity<SELF : RWNamedEntity<SELF, SELF_MODEL>, SELF_MODEL : ModelNamed<SELF_MODEL, SELF>>(
        _id: Long, env: PlatypusEnvironement, model: SELF_MODEL,
        factory: (e: PlatypusEnvironement) -> PlatypusEntityGetter<SELF, SELF_MODEL>)
    : RWEntity<SELF, SELF_MODEL>(_id, env, model, factory), NamedEntity<SELF, SELF_MODEL> {
    override var name by model.name

    operator fun KormNameProperty<*>.getValue(o: NamedEntity<SELF, SELF_MODEL>, desc: KProperty<*>): String {
        return warmCache()[modelID, this] ?: ""
    }

    operator fun KormNameProperty<*>.setValue(o: NamedEntity<SELF, SELF_MODEL>, desc: KProperty<*>, value: String?) {
        warmCache()[modelID, this] = value
    }
}

abstract class HerarchicalRWNamedEntity<E : HerarchicalRWNamedEntity<E, M>, M : HierarchyModel<M, E>>(
        _id: Long, env: PlatypusEnvironement, model: M,
        factory: (e: PlatypusEnvironement) -> PlatypusEntityGetter<E, M>)
    : RWNamedEntity<E, M>(_id, env, model, factory), HierarchicNamedEntity<E, M>{
    var nn: String by model.name
    override var parent: E by model.parent many2one factory
    override val children: Bag<E> by model.children one2many factory
}