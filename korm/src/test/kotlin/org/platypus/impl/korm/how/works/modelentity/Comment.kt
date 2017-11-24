package org.platypus.impl.korm.how.works.modelentity

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.entity.many2one
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.impl.korm.model.ModelNamed

object PostCommentModel : ModelNamed<PostCommentModel, PostComment>("post.comment") {

    init {
        name.extend(required = false, label = "Title")
    }

    val body = field.text("body")
    val note = field.integer("note", min = 0, max = 5)
    val post = field.many2one("post", target = PostModel)

}

typealias EmptyPostComment = EmptyEntity<PostComment, PostCommentModel>

val PlatypusEnvironement.PostComment: EmptyPostComment
    get() = EmptyEntity(this, PostCommentModel, { id, env -> PostComment(id, env) }).apply {
        register(PostCommentModel, this)
    }

class PostComment(_id: Long, env: PlatypusEnvironement) : RWNamedEntity<PostComment, PostCommentModel>(_id, env, PostCommentModel, { e -> e.PostComment })

var PostComment.body by PostCommentModel.body
var PostComment.note by PostCommentModel.note
var PostComment.post by PostCommentModel.post many2one { e -> e.Post }