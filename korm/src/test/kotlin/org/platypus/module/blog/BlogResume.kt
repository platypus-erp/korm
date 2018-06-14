package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

object ResumeModel : Model<ResumeModel>("test.resume") {
    val education = text("education")
    val experience = text("experience")
    val leisure = text("leisure")
}

val PlatypusEnvironment.resumeRepo: ResumeRepo
    get() = RecordRepositoryImpl(this, ResumeModel)
typealias ResumeBag = Bag<ResumeModel>
typealias ResumeRepo = RecordRepository<ResumeModel>
typealias Resume = Record<ResumeModel>


var Resume.education by ResumeModel.education
var Resume.experience by ResumeModel.experience
var Resume.leisure by ResumeModel.leisure