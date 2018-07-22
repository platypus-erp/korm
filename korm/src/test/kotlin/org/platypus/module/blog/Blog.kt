package org.platypus.module.blog

import org.platypus.model.Model
import org.platypus.orm.ReferenceOption

object BlogModel : Model<BlogModel>("blog.blog") {

    val co_creator = many2one("co_creator", UserMokModel) {
        onDelete = ReferenceOption.RESTRICT
        required = true
//        defaultValueFun = {
//            it.envUser.getData(it)
//        }
    }

    val maintainer = many2one("maintainer", UserMokModel) {
        onDelete = ReferenceOption.RESTRICT
        required = false
//        defaultValueFun  = {
//            it.envUser.getData(it)
//        }
    }

    init {
        name extends {
            label = "Title"
            defaultValueFun = {
                "Blog of " + it.envUser.getData(it).displayName
            }
        }
    }

    val posts = one2many("posts", { BlogPostModel.blog })
    val tags = many2many("tags", { blogTagRel })
}



