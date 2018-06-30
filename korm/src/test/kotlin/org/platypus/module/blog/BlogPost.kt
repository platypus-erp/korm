package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.orm.ReferenceOption
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl


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
    val comments = one2many("comments", {BlogPostCommentModel.post})
}

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

