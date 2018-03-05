package org.platypus.struct

import org.platypus.i18n.baseTranslate
import org.platypus.module.ModuleBuilder
import org.platypus.test.dataBlogPost
import java.util.*

val blogModuleI18n = baseTranslate(Locale.US) {
    model(BlogPostModel)
    model(PostTagModel)
    model(ProfileModel)
    model(ResumeModel)
    model(UserMokModel)
    selection(ProfileGender) {
        add(ProfileGender.FEMALE)
        add(ProfileGender.MALE)
        add(ProfileGender.UNKNOW)
    }
}

object BlogModule : ModuleBuilder("blogModule", {
    models {
        add(BlogPostModel)
        add(PostTagModel)
        add(ProfileModel)
        add(ResumeModel)
        add(UserMokModel)
    }
    i18n {

    }
    datas {
        add(dataBlogPost)
    }
})