package org.platypus.impl.korm.how.works

import org.platypus.impl.korm.how.works.modelentity.*
import org.platypus.impl.module.declareModule

val BlogModule = declareModule("blog") {
    models {
        add(PostModel, { e -> e.Post })
        add(PostCommentModel, { e -> e.PostComment })
        add(PostTagModel, { e -> e.PostTag })
    }
    datas {
        add(user_blog_data)
        add(testData)
    }
}