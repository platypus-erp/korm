package org.platypus.impl.korm.how.works.modelentity

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.many2many
import org.platypus.impl.korm.entity.one2many
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.korm.model.ModelNamed

object PostModel : ModelNamed<PostModel, Post>("post") {

    init {
        name.extend(required = true, label = "Title")
    }

    val body = field.text("body")
    val comments = field.one2many("comments", target = { PostCommentModel.post })
    val tags = field.many2many("tags", propGet = { PostTagModel.posts })

    val note = field.integer("note")

//    val computeNote = note.compute { p ->
//        p.comments.map { it.note }.average().toInt()
//    }
}

typealias EmptyPost = EmptyEntity<Post, PostModel>

val PlatypusEnvironement.Post: EmptyPost
    get() = EmptyEntity(this, PostModel, { id, env -> Post(id, env) }).apply {
        register(PostModel, this)
    }

class Post(_id: Long, env: PlatypusEnvironement) : RWNamedEntity<Post, PostModel>(_id, env, PostModel, { e -> e.Post })

var Post.body by PostModel.body
val Post.comments by PostModel.comments one2many { e -> e.PostComment }
val Post.tags by PostModel.tags many2many { e -> e.PostTag }



