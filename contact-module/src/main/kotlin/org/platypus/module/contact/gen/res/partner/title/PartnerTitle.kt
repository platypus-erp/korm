package org.platypus.module.contact.gen.res.partner.title

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.data.DataRef
import org.platypus.entity.Record
import org.platypus.module.contact.models.PartnerTitles
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

typealias PartnerTitle = Record<PartnerTitles>
typealias PartnerTitleRepository = RecordRepository<PartnerTitles>
typealias PartnerTitleBag = Bag<PartnerTitles>
typealias PartnerTitleData = DataRef<PartnerTitles>

val PlatypusEnvironment.partnerTitleRepo: PartnerTitleRepository
    get() = RecordRepositoryImpl(this, PartnerTitles)


var PartnerTitle.shortcut by PartnerTitles.shortcut