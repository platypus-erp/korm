package org.platypus.module.blog

import org.platypus.model.Model

object BlogPostCommentModel : Model<BlogPostCommentModel>("blog.post.comment") {

    val parent = many2one("parent", BlogPostCommentModel)
    val children = one2many("parent", { BlogPostCommentModel.parent })

    val content = text("content") {
        required = true
    }
    val post = many2one("post", BlogPostModel) {
        required = true
    }
    val rate = integer("rate")
    val pseudo = string("pseudo") {
        required = true
        default = "Anonymous"
    }
}

