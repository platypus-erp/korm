package org.platypus.impl.korm.how.works

import org.platypus.base.entities.Group
import org.platypus.base.entities.User
import org.platypus.base.entities.groups
import org.platypus.impl.korm.how.works.modelentity.*
import org.platypus.impl.module.ModuleDataType
import org.platypus.impl.module.data

val user_blog_data = data(ModuleDataType.REAL, version = "1") {
    env.User.newData("user_1") {
        name = "User 1"
        this.groups += env.Group.newData("group_user") {
            name = "User group"
        }
    }
}

val testData = data(ModuleDataType.DEMO, version = "1") {
    val tagTuto = env.PostTag.newData("tag_tuto") {
        color = 1
        name = "TUTO"
    }
    val tagEntity = env.PostTag.newData("tag_entity") {
        color = 2
        name = "ENTITY"
    }

    val tagPlatypus = env.PostTag.newData("tag_platypus") {
        color = 3
        name = "PLATYPUS"
    }

    val post1 = env.Post.newData("post1") {
        name = "My first Post"
        body = """Lerel ipsum
                |multi line
                | <- the pipe is where your ident start
            """.trimMargin()

        comments += env.PostComment.newData("post1_comment1") {
            name = "Inline data"
            body = """You can create inline the data creation
                |No need to declare the comment after the post like in the post2
            """.trimMargin()
            note = 5
        }
        comments += env.PostComment.newData("post1_comment2") {
            name = "Add comment one by one"
            body = "You can add comment to the post one by one like this and the comment 1"
            note = 1
        }

        comments.addAll(
                env.PostComment.newData("post1_comment3") {
                    name = "Multi comment 1"
                    body = "Or directy add a collection of post"
                    note = 2
                } + env.PostComment.newData("post1_comment4") {
                    name = "Multi comment 1"
                    body = "Or directy add a collection of post make with the '+' operator"
                    note = 3
                }
        )
        tags.addAll(arrayOf(tagEntity, tagPlatypus))
    }

    val post2 = env.Post.newData("post2") {
        name = "My Second Post"
        body = """Lerel ipsum
                |multi line
                | <- the pipe is where your ident start""".trimMargin()
    }

    post2.tags.add(tagEntity)

    val comment1OnPost2 = env.PostComment.newData("post2_comment1") {
        name = "My Comment on the post 2"
        post = post2
    }

    val comment1OnPost3 = env.PostComment.newData("post2_comment3") {
        name = "My Comment on the post 3"
        post = post2
    }
}

val datasDemo = setOf(user_blog_data, testData)

