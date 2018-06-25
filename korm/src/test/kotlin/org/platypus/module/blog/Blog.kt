package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.orm.ReferenceOption
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

object BlogModel : Model<BlogModel>("blog.blog") {

    val co_creator = many2one("co_creator", UserMokModel){
        onDelete = ReferenceOption.RESTRICT
        required = true
//        defaultValueFun  = {
//            it.envUser.getData(it)
//        }
    }
    val maintainer = many2one("maintainer", UserMokModel){
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
                "Blog of "+ it.envUser.getData(it).displayName
            }
        }
    }

    val posts = one2many("posts", { BlogPostModel.blog })
    val tags = many2many("tags", { blogTagRel })
}

val PlatypusEnvironment.blogRepo: BlogRepo
    get() = RecordRepositoryImpl(this, BlogModel)

typealias BlogBag = Bag<BlogModel>
typealias BlogRepo = RecordRepository<BlogModel>
typealias Blog = Record<BlogModel>

var Blog.tags by BlogModel.tags
var Blog.user by BlogModel.co_creator
var Blog.posts by BlogModel.posts