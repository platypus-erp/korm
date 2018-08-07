package org.platypus.v2.record.one

import org.platypus.Identifiable
import org.platypus.entity.Selection
import org.platypus.entity.SelectionValue
import org.platypus.module.base.entities.User
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
import org.platypus.v2.model.field.magic.CreateDateField
import org.platypus.v2.model.field.magic.CreateUserField
import org.platypus.v2.model.field.magic.ExternalRefField
import org.platypus.v2.model.field.magic.WriteDateField
import org.platypus.v2.model.field.magic.WriteUserField
import org.platypus.v2.record.bag.Bag
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import kotlin.reflect.KProperty

interface ImutableRecord<M : BaseModel<M>> : Identifiable, RecordDelegate<M> {



}