package org.platypus.module.blog.gen.blog.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.module.blog.BlogModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

val PlatypusEnvironment.blogRepo: BlogRepo
    get() = RecordRepositoryImpl(this, BlogModel)

typealias BlogBag = Bag<BlogModel>
typealias BlogRepo = RecordRepository<BlogModel>
typealias Blog = Record<BlogModel>
typealias BlogModelAlias = Alias<BlogModel>

var Blog.user by BlogModel.co_creator
var Blog.maintainer by BlogModel.maintainer
var Blog.posts by BlogModel.posts
var Blog.tags by BlogModel.tags


val BlogModelAlias.user by BlogModel.co_creator
val BlogModelAlias.maintainer by BlogModel.maintainer
val BlogModelAlias.posts by BlogModel.posts
val BlogModelAlias.tags by BlogModel.tags