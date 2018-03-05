package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.RecursiveStoredEntity
import org.platypus.module.contact.models.PartnersCategories

class PartnerCategory(id: Int, env: PlatypusEnvironment) : RecursiveStoredEntity<PartnerCategory, PartnersCategories>(id, env, PartnersCategories, { it.partnerCategoriesRepo })

typealias PartnerCategoriesRepository = StoredRepository<PartnerCategory, PartnersCategories>
typealias PartnerCategoriesBag = Bag<PartnerCategory, PartnersCategories>
typealias PartnerCategoriesData = DataRef<PartnerCategory, PartnersCategories>

val PlatypusEnvironment.partnerCategoriesRepo: PartnerCategoriesRepository
    get() = PartnerCategoriesRepository(this, PartnersCategories, { id, env -> PartnerCategory(id, env) })