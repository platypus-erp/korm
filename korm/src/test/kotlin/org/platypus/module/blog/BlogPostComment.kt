package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

object BlogPostCommentModel : Model<BlogPostCommentModel>("blog.post.comment"){
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

val PlatypusEnvironment.blogPostCommentRepo: BlogPostCommentRepo
    get() = RecordRepositoryImpl(this, BlogPostCommentModel)

typealias BlogPostCommentBag = Bag<BlogPostCommentModel>
typealias BlogPostCommentRepo = RecordRepository<BlogPostCommentModel>
typealias BlogPostComment = Record<BlogPostCommentModel>


var BlogPostComment.content by BlogPostCommentModel.content
var BlogPostComment.post by BlogPostCommentModel.post
var BlogPostComment.rate by BlogPostCommentModel.rate
var BlogPostComment.pseudo by BlogPostCommentModel.pseudo