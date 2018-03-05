package org.platypus.module.base.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.base.models.Languages
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias LangageRepository = RecordRepository<Languages>
typealias LangageBag = Bag<Languages>
typealias LangageData = DataRef<Languages>
typealias Language = Record<Languages>

val PlatypusEnvironment.languageRepo: LangageRepository
    get() = RecordRepositoryImpl(this, Languages)

var Language.installed by Languages.installed
var Language.code by Languages.code
var Language.isoCode by Languages.isoCode
var Language.translatable by Languages.translatable
var Language.direction by Languages.direction
var Language.dateFormat by Languages.dateFormat
var Language.timeFormat by Languages.timeFormat
var Language.grouping by Languages.grouping
var Language.decimalPoint by Languages.decimalPoint
var Language.thousandsSep by Languages.thousandsSep