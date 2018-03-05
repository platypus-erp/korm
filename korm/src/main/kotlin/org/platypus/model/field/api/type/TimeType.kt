package org.platypus.model.field.api.type

import java.time.format.DateTimeFormatter
import java.util.*

val DEFAULT_DATE_STRING_FORMATTER = DateTimeFormatter.ofPattern("YYYY-MM-dd", Locale.ROOT)!!
val DEFAULT_DATE_TIME_STRING_FORMATTER = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss.SSSSSS", Locale.ROOT)!!

