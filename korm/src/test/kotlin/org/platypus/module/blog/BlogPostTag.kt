package org.platypus.module.blog

import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.module.blog.gen.blog.post.tag.PostTag
import org.platypus.module.blog.gen.blog.post.tag.description
import org.platypus.module.blog.gen.blog.post.tag.rate
import org.platypus.utils.UserError

//TODO make recursive
object PostTagModel : Model<PostTagModel>("test.post.tag") {

    val bestPost = many2one("bestPost", BlogPostModel)
    val posts = many2manyR("posts", { ModelMany2Many.postTagRel })
    val description = string("description")
    val rate = integer("rate")


    val checkRate = api.private("checkRate",
            fun(self: PostTag) {
                if (self.rate != null) {
                    if (self.rate ?: 1 < 0 || self.rate ?: 1 > 10) {
                        throw UserError("Tag rate must be between 0 and 10")
                    }
                }
            }
    )

    val checkNameDescription = name.constraint {
        if (it.name == it.description) {
            throw UserError("The name and the desction can't be the same")
        }
    }
}


