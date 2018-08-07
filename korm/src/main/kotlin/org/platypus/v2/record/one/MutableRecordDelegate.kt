package org.platypus.v2.record.one

import org.platypus.entity.Selection
import org.platypus.entity.SelectionValue
import org.platypus.v2.model.BaseModel
import org.platypus.v2.model.field.BinaryField
import org.platypus.v2.model.field.BooleanField
import org.platypus.v2.model.field.DateField
import org.platypus.v2.model.field.DateTimeField
import org.platypus.v2.model.field.DecimalField
import org.platypus.v2.model.field.IntField
import org.platypus.v2.model.field.Many2ManyField
import org.platypus.v2.model.field.Many2OneField
import org.platypus.v2.model.field.One2ManyField
import org.platypus.v2.model.field.SelectionField
import org.platypus.v2.model.field.StringField
import org.platypus.v2.model.field.TextField
import org.platypus.v2.model.field.TimeField
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KProperty

interface MutableRecord<M : BaseModel<M>> : ImutableRecord<M> {



}
