package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.model.Model
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

object BlogPostCommentModel : Model<BlogPostCommentModel>("blog.post.comment"){

    val parent = many2one("parent", BlogPostCommentModel)

    val content = text("content"){
        required = true
    }
    val post = many2one("post", BlogPostModel){
        required = true
    }
    val rate = integer("rate")
    val pseudo = string("pseudo"){
        required = true
        default = "Anonymous"
    }
}

