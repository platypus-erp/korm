package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.model.ModelMany2Many
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
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