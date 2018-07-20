package org.platypus.module.blog.gen.blog.post.tag

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.module.blog.PostTagModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

val PlatypusEnvironment.tagRepo: PostTagRepo
    get() = RecordRepositoryImpl(this, PostTagModel)
typealias PostTagBag = Bag<PostTagModel>
typealias PostTagRepo = RecordRepository<PostTagModel>
typealias PostTag = Record<PostTagModel>


var PostTag.description by PostTagModel.description
var PostTag.rate by PostTagModel.rate
val PostTag.bestPost by PostTagModel.bestPost
val PostTag.posts by PostTagModel.posts

fun PostTag.checkRate() = PostTagModel.checkRate.call(this)

typealias PostTagAlias = Alias<PostTagModel>
val PostTagAlias.bestPost by PostTagModel.bestPost
val PostTagAlias.posts by PostTagModel.posts
val PostTagAlias.description by PostTagModel.description
val PostTagAlias.rate by PostTagModel.rate