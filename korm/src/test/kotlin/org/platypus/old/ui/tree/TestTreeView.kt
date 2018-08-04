package org.platypus.old.ui.tree

import kotlinx.html.p
import org.platypus.module.blog.BlogPostModel
import org.platypus.ui.action.MenuAction
import org.platypus.ui.action.MenuAction.getValue
import org.platypus.ui.action.newMenuAction

//val TreeViews.test1 by BlogPostModel.newTree {
//    field(it.name)
//    field(it.user)
//}
//
//private val TreeViews.treeView by BlogPostModel.newTree {
//    field(it.title)
//    field(it.user)
//}
//
//private object Module : ModuleBuilder("blogModule", {
//    dependsOf { setOf(BaseModule) }
//    models {
//        add(BlogPostModel) {
//            views {
//                add(TreeViews.treeView)
//                add(TreeViews.test1)
//            }
//        }
//        add(PostTagModel)
//        add(ProfileModel)
//        add(ResumeModel)
//        add(UserMokModel)
//    }
//    i18n {
//
//    }
//    datas {
//        add(dataBlogPost)
//    }
//})

//fun main(args: Array<String>) {
//    val platypus = Platypus.newTest(Module)
//    platypus.start()
//}

val MenuAction.blogPostAction by BlogPostModel.newMenuAction {
    name = "BlogPost"
    htmlNoContent = {
        p(classes = "oe_view_nocontent_create") {
            +"Click to create a bank account."
        }

    }
}








