package org.platypus.module.blog

import org.platypus.i18n.baseTranslate
import org.platypus.module.ModuleBuilder
import java.util.*

val blogModuleI18n = baseTranslate(Locale.US) {
    model(BlogModel)
    model(BlogPostModel)
    model(BlogPostCommentModel)
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

object BaseBlogModule : ModuleBuilder("base_blogModule", {
    models {
        +BlogModel
        +BlogPostModel
        +PostTagModel
        +ProfileModel
        +ResumeModel
        +UserMokModel
    }
    datas {
        add(dataBlogJane)
    }
})