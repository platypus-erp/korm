package org.platypus.model.field.n

import org.platypus.DecimalPrecision
import org.platypus.model.IModel
import org.platypus.model.field.api.IndexableField
import org.platypus.model.field.n.api.ClassicField
import org.platypus.model.field.n.api.FieldBuilder
import java.math.BigDecimal

interface DecimalField<M : IModel<M>> : ClassicField<M, BigDecimal>, IndexableField {
    val decimalPrecision: DecimalPrecision

    interface Builder<M : IModel<M>> : FieldBuilder<M, BigDecimal, DecimalField<M>>, IndexableField.Mutable{
        var decimalPrecision: DecimalPrecision?
    }
}