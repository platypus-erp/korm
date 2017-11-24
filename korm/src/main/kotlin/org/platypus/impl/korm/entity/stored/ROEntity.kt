package org.platypus.impl.korm.entity.stored

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.Bag
import org.platypus.impl.korm.entity.Entity
import org.platypus.impl.korm.entity.Many2ManyBag
import org.platypus.impl.korm.entity.ManyToManyDelegate
import org.platypus.impl.korm.entity.ManyToOneDelegate
import org.platypus.impl.korm.entity.NamedEntity
import org.platypus.impl.korm.entity.One2ManyBag
import org.platypus.impl.korm.entity.OneToManyDelegate
import org.platypus.impl.korm.entity.PlatypusEntity
import org.platypus.impl.korm.entity.PlatypusEntityGetter
import org.platypus.impl.korm.entity.PlatypusSelection
import org.platypus.impl.korm.entity.PlatypusSelectionCompanion
import org.platypus.impl.korm.model.BaseModel
import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.korm.model.property.KormBooleanProperty
import org.platypus.impl.korm.model.property.KormDecimalProperty
import org.platypus.impl.korm.model.property.KormFloatProperty
import org.platypus.impl.korm.model.property.KormIntegerProperty
import org.platypus.impl.korm.model.property.KormNameProperty
import org.platypus.impl.korm.model.property.KormSelectionProperty
import org.platypus.impl.korm.model.property.KormStringProperty
import org.platypus.impl.korm.model.property.KormTextProperty
import java.math.BigDecimal
import kotlin.reflect.KProperty

abstract class ROEntity<SELF : ROEntity<SELF, SELF_MODEL>, SELF_MODEL : BaseModel<SELF_MODEL, SELF>>(
        _id: Long,
        env: PlatypusEnvironement,
        model: SELF_MODEL,
        factory: (e: PlatypusEnvironement) -> PlatypusEntityGetter<SELF, SELF_MODEL>
) : PlatypusEntity<SELF, SELF_MODEL>(_id, env, model, factory) {

    operator fun KormStringProperty<SELF_MODEL>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): String {
        return warmCache()[modelID, this] ?: ""
    }

    operator fun KormTextProperty<SELF_MODEL>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): String {
        return warmCache()[modelID, this] ?: ""
    }

    operator fun KormFloatProperty<SELF_MODEL>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): Float {
        return warmCache()[modelID, this] ?: 0F
    }

    operator fun KormDecimalProperty<SELF_MODEL>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): BigDecimal {
        return warmCache()[modelID, this] ?: BigDecimal.ZERO
    }

    operator fun <S : PlatypusSelectionCompanion<SELF_MODEL, SELF, KS>, KS : PlatypusSelection<SELF_MODEL, SELF>> KormSelectionProperty<SELF_MODEL, S, KS>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): KS {
        return this.selection.getUnsafe(warmCache()[modelID, this])
    }

    operator fun KormBooleanProperty<SELF_MODEL>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): Boolean {
        return warmCache()[modelID, this] ?: false
    }

    operator fun KormIntegerProperty<SELF_MODEL>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): Int {
        return warmCache()[modelID, this] ?: 0
    }

    operator fun <T : PlatypusEntity<T, MODEL_TARGET>, MODEL_TARGET : BaseModel<MODEL_TARGET, T>>
        ManyToOneDelegate<MODEL_TARGET, T>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): T {
        return this.factory(env).lazyGetById(warmCache()[modelID, this.prop])
    }

    operator fun <T : PlatypusEntity<T, MODEL_TARGET>, MODEL_TARGET : BaseModel<MODEL_TARGET, T>>
        OneToManyDelegate<SELF_MODEL, MODEL_TARGET, T>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): Bag<T> {
        return One2ManyBag(modelID, this.prop, o.env, this.factory, { warmCache() })
    }

    operator fun <T : PlatypusEntity<T, MODEL_TARGET>, MODEL_TARGET : BaseModel<MODEL_TARGET, T>>
        ManyToManyDelegate<SELF_MODEL, MODEL_TARGET, T>.getValue(o: Entity<SELF, SELF_MODEL>, desc: KProperty<*>): Bag<T> {
        return Many2ManyBag(modelID, this.prop, o.env, this.factory, { warmCache() })
    }

}

abstract class RONamedEntity<SELF : RONamedEntity<SELF, SELF_MODEL>, SELF_MODEL : ModelNamed<SELF_MODEL, SELF>>(
        _id: Long,
        env: PlatypusEnvironement,
        model: SELF_MODEL,
        factory: (e: PlatypusEnvironement) -> EmptyEntity<SELF, SELF_MODEL>
) : ROEntity<SELF, SELF_MODEL>(_id, env, model, factory), NamedEntity<SELF, SELF_MODEL> {
    override val name by model.name

    operator fun KormNameProperty<SELF_MODEL>.getValue(o: NamedEntity<SELF, SELF_MODEL>, desc: KProperty<*>): String {
        return warmCache()[modelID, this] ?: ""
    }
}