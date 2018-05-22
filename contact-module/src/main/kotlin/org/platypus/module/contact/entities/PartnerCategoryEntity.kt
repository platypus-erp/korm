package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.PartnersCategories
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias PartnerCategory = Record<PartnersCategories>
typealias PartnerCategoryRepository = RecordRepository<PartnersCategories>
typealias PartnerCategoryBag = Bag<PartnersCategories>
typealias PartnerCategoryData = DataRef<PartnersCategories>

val PlatypusEnvironment.partnerCategoryRepo: PartnerCategoryRepository
    get() = RecordRepositoryImpl(this, PartnersCategories)
