package org.platypus.module.blog.gen.blog.post.comment

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.module.blog.BlogPostCommentModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

val PlatypusEnvironment.blogPostCommentRepo: BlogPostCommentRepo
    get() = RecordRepositoryImpl(this, BlogPostCommentModel)

typealias BlogPostCommentBag = Bag<BlogPostCommentModel>
typealias BlogPostCommentRepo = RecordRepository<BlogPostCommentModel>
typealias BlogPostComment = Record<BlogPostCommentModel>


var BlogPostComment.content by BlogPostCommentModel.content
var BlogPostComment.post by BlogPostCommentModel.post
var BlogPostComment.rate by BlogPostCommentModel.rate
var BlogPostComment.pseudo by BlogPostCommentModel.pseudo

typealias BlogPostCommentlAlias = Alias<BlogPostCommentModel>

val BlogPostCommentlAlias.content by BlogPostCommentModel.content
val BlogPostCommentlAlias.post by BlogPostCommentModel.post
val BlogPostCommentlAlias.rate by BlogPostCommentModel.rate
val BlogPostCommentlAlias.pseudo by BlogPostCommentModel.pseudo