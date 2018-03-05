package org.platypus.module.contact.entities

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.impl.StoredEntity
import org.platypus.module.contact.models.PartnerTitles

class PartnerTitle(id: Int, env: PlatypusEnvironment) : StoredEntity<PartnerTitle, PartnerTitles>(id, env, PartnerTitles, { it.partnerTitleRepoRepo })

typealias PartnerTitleRepository = StoredRepository<PartnerTitle, PartnerTitles>
typealias PartnerTitleBag = Bag<PartnerTitle, PartnerTitles>
typealias PartnerTitleData = DataRef<PartnerTitle, PartnerTitles>

val PlatypusEnvironment.partnerTitleRepoRepo: PartnerTitleRepository
    get() = PartnerTitleRepository(this, PartnerTitles, { id, env -> PartnerTitle(id, env) })

var PartnerTitle.shortcut by PartnerTitles.shortcut