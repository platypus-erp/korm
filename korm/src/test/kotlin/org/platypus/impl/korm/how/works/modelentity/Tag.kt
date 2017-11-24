package org.platypus.impl.korm.how.works.modelentity

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.many2many
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.korm.model.ModelNamed

object PostTagModel : ModelNamed<PostTagModel, PostTag>("post.tag") {

    init {
        name.extend(required = true)
    }

    val color = field.integer("color", required = false)
    val posts = field.many2many("posts", target = PostModel, targetField = "tags")

}

typealias EmptyPostTag = EmptyEntity<PostTag, PostTagModel>

val PlatypusEnvironement.PostTag: EmptyPostTag
    get() = EmptyEntity(this, PostTagModel, { id, env -> PostTag(id, env) }).apply {
        register(PostTagModel, this)
    }

class PostTag(_id: Long, env: PlatypusEnvironement) : RWNamedEntity<PostTag, PostTagModel>(_id, env, PostTagModel, { e -> e.PostTag })

var PostTag.color by PostTagModel.color
val PostTag.posts by PostTagModel.posts many2many { e -> e.Post }