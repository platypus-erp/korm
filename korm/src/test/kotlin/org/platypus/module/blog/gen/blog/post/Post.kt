package org.platypus.module.blog.gen.blog.post

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.module.blog.BlogPostModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

val PlatypusEnvironment.blogPostRepo: BlogPostRepo
    get() = RecordRepositoryImpl(this, BlogPostModel)

typealias BlogPostBag = Bag<BlogPostModel>
typealias BlogPostRepo = RecordRepository<BlogPostModel>
typealias BlogPost = Record<BlogPostModel>

var BlogPost.blog by BlogPostModel.blog
var BlogPost.content by BlogPostModel.content
var BlogPost.abstract by BlogPostModel.abstract
var BlogPost.attachment by BlogPostModel.attachment
var BlogPost.lastRead by BlogPostModel.lastRead
var BlogPost.bestPostProfile by BlogPostModel.bestPostProfile
var BlogPost.tags by BlogPostModel.tags
var BlogPost.comments by BlogPostModel.comments


typealias BlogPostModelAlias = Alias<BlogPostModel>

val BlogPostModelAlias.blog by BlogPostModel.blog
val BlogPostModelAlias.content by BlogPostModel.content
val BlogPostModelAlias.tags by BlogPostModel.tags
val BlogPostModelAlias.bestPostProfile by BlogPostModel.bestPostProfile
val BlogPostModelAlias.abstract by BlogPostModel.abstract
val BlogPostModelAlias.attachment by BlogPostModel.attachment
val BlogPostModelAlias.lastRead by BlogPostModel.lastRead
val BlogPostModelAlias.comments by BlogPostModel.comments