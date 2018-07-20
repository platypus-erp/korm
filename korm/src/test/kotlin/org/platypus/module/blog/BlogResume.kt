package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.model.Model
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

object ResumeModel : Model<ResumeModel>("test.resume") {
    val education = text("education")
    val experience = text("experience")
    val leisure = text("leisure")
}


