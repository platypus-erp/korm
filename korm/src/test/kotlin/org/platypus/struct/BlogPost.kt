package org.platypus.struct

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.model.ModelMany2Many.getValue
import org.platypus.model.many2manyLink
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl


val ModelMany2Many.postTagRel by BlogPostModel many2manyLink PostTagModel


object BlogPostModel : Model<BlogPostModel>("test.post") {
    val user = many2one("user", UserMokModel)
    val title = string("title")
    val content = text("content")
    val tags = many2many("tags", { ModelMany2Many.postTagRel })
    val bestPostProfile = revOne2many("bestPostProfile", { ProfileModel.bestPost })
    val abstract = text("abstract")
    val attachment = binary("attachment")
    val lastRead = date("lastRead")
}

val PlatypusEnvironment.blogPostRepo: BlogPostRepo
    get() = RecordRepositoryImpl(this, BlogPostModel)

typealias BlogPostBag = Bag<BlogPostModel>
typealias BlogPostRepo = RecordRepository<BlogPostModel>
typealias BlogPost = Record<BlogPostModel>


var BlogPost.user by BlogPostModel.user
var BlogPost.title by BlogPostModel.title
var BlogPost.content by BlogPostModel.content
var BlogPost.abstract by BlogPostModel.abstract
var BlogPost.attachment by BlogPostModel.attachment
var BlogPost.lastRead by BlogPostModel.lastRead
var BlogPost.bestPostProfile by BlogPostModel.bestPostProfile
var BlogPost.tags by BlogPostModel.tags

