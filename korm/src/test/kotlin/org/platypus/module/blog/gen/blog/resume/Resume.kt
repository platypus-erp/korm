package org.platypus.module.blog.gen.blog.resume

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.module.blog.ResumeModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

val PlatypusEnvironment.resumeRepo: ResumeRepo
    get() = RecordRepositoryImpl(this, ResumeModel)
typealias ResumeBag = Bag<ResumeModel>
typealias ResumeRepo = RecordRepository<ResumeModel>
typealias Resume = Record<ResumeModel>
var Resume.education by ResumeModel.education
var Resume.experience by ResumeModel.experience
var Resume.leisure by ResumeModel.leisure

typealias ResumeAlias = Alias<ResumeModel>
val ResumeAlias.education by ResumeModel.education
val ResumeAlias.experience by ResumeModel.experience
val ResumeAlias.leisure by ResumeModel.leisure