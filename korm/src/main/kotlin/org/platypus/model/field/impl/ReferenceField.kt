package org.platypus.model.field.impl

import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.field.api.FieldSlotsImpl
import org.platypus.model.field.api.ModelField
import org.platypus.model.field.api.ReferencedField
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.expression.Expression
import org.platypus.utils.suffix

//TODO to replace with an interface ?
abstract class ReferenceField<
        M : Model<M>,
        TM : Model<TM>
        >
(model: M,
 name: String,
 slots: FieldSlotsImpl<Record<TM>>,
 defaultOnDelete: ReferenceOption?,
 defaultDomain: (TM.() -> Expression<Boolean>)?
) : RealModelField<M, Record<TM>>(model, name.suffix("_id"), slots), ReferencedField<M, TM> {

    var domain: (TM.() -> Expression<Boolean>)? = defaultDomain
        protected set
    override var onDelete: ReferenceOption = defaultOnDelete ?: ReferenceOption.SET_NULL
        protected set
}

abstract class MutliReferenceField<
        M : Model<M>,
        TM : Model<TM>
        >
(model: M,
 name: String,
 slots: FieldSlotsImpl<Bag<TM>>,
 defaultDomain: (TM.() -> Expression<Boolean>)?
) : RealModelField<M, Bag<TM>>(model, name.suffix("_id"), slots) {

    var domain: (TM.() -> Expression<Boolean>)? = defaultDomain
        protected set
}

abstract class SimpleField<M : Model<M>, T : Any>
(model: M, name: String, slots: FieldSlotsImpl<T>) : RealModelField<M, T>(model, name, slots)


abstract class RealModelField<M : Model<M>, T : Any>
(model: M, name: String, slots: FieldSlotsImpl<T>) : ModelField<M, T>(model, name, slots)