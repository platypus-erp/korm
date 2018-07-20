package org.platypus.module.blog

import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.orm.ReferenceOption


object BlogPostModel : Model<BlogPostModel>("test.post") {
    init {
        name extends {
            label = "title"
        }
    }

    val blog = many2one("blog", BlogModel) {
        onDelete = ReferenceOption.CASCADE
        required = true
    }
    val content = text("content")
    val tags = many2many("tags", { ModelMany2Many.postTagRel })
    val bestPostProfile = one2one("bestPostProfile", ProfileModel)
    val abstract = text("abstract")
    val attachment = binary("attachment")
    val lastRead = date("lastRead")
    val comments = one2many("comments", { BlogPostCommentModel.post })
}






