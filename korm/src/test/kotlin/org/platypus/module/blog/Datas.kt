package org.platypus.module.blog

import org.platypus.module.ModuleData
import org.platypus.module.ModuleDataType
import org.platypus.module.blog.gen.blog.blog.blogRepo
import org.platypus.module.blog.gen.blog.blog.maintainer
import org.platypus.module.blog.gen.blog.blog.posts
import org.platypus.module.blog.gen.blog.blog.user
import org.platypus.module.blog.gen.blog.post.blogPostRepo
import org.platypus.module.blog.gen.blog.post.comment.blogPostCommentRepo
import org.platypus.module.blog.gen.blog.post.comment.children
import org.platypus.module.blog.gen.blog.post.comment.pseudo
import org.platypus.module.blog.gen.blog.post.comments
import org.platypus.module.blog.gen.blog.post.content
import org.platypus.module.blog.gen.blog.post.tag.tagRepo
import org.platypus.module.blog.gen.blog.post.tags
import org.platypus.module.blog.gen.blog.profile.age
import org.platypus.module.blog.gen.blog.profile.money
import org.platypus.module.blog.gen.blog.profile.profileRepo
import org.platypus.module.blog.gen.blog.resume.education
import org.platypus.module.blog.gen.blog.resume.experience
import org.platypus.module.blog.gen.blog.resume.leisure
import org.platypus.module.blog.gen.blog.resume.resumeRepo
import org.platypus.module.blog.gen.blog.user.UserMok
import org.platypus.module.blog.gen.blog.user.email
import org.platypus.module.blog.gen.blog.user.nums
import org.platypus.module.blog.gen.blog.user.profile
import org.platypus.module.blog.gen.blog.user.resume
import org.platypus.module.blog.gen.blog.user.userMokRepo
import org.platypus.module.data
import org.platypus.security.PlatypusUser


val JaneDoe = PlatypusUser("jane_doe")
val WillSmith = PlatypusUser("will_smith")

val tagsData = data(ModuleDataType.DEMO) {
    val tag1 = env.tagRepo.newData("tag1") {
        name = "Tag1"
    }
    val tag2 = env.tagRepo.newData("tag2") {
        name = "Tag2"
    }
    val tag3 = env.tagRepo.newData("tag3") {
        name = "Tag3"
    }
    val tag4 = env.tagRepo.newData("tag4") {
        name = "Tag4"
    }
    val tag5 = env.tagRepo.newData("tag5") {
        name = "Tag5"
    }
    val tag6 = env.tagRepo.newData("tag6") {
        name = "Tag6"
    }
}

private fun ModuleData.createUser1(): UserMok = env.userMokRepo.newData("user1") {
    name = "User 1"
    email = "user1@email.com"
    nums = 1
    profile = env.profileRepo.newData("user1_profile") {
        age = 23
        money = 12345.toBigDecimal()
//                    address.street = "165 5th Avenue"
//                    address.city = "New York"
//                    address.zip = "0305"
//        address.country = "USA"

    }
}

private fun ModuleData.createUser2(): UserMok = env.userMokRepo.newData("user2") {
    name = "User 2"
    email = "user2@email.com"
    nums = 2
    profile = env.profileRepo.newData("user2_profile") {
        age = 23
        money = 12345.toBigDecimal()
//                    address.street = "165 5th Avenue"
//                    address.city = "New York"
//                    address.zip = "0305"
//        address.country = "USA"

    }
}

private fun ModuleData.createUser3(): UserMok = env.userMokRepo.newData("user3") {
    name = "User 3"
    email = "user3@email.com"
    nums = 3
    profile = env.profileRepo.newData("user3_profile") {
        age = 23
        money = 12345.toBigDecimal()
        resume = env.resumeRepo.newData("user_3_resume") {
            education = """Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
            |In enim a arcu imperdiet malesuada.
            |In dapibus augue non sapien.
            |Nulla non lectus sed nisl molestie malesuada.
            |Nulla accumsan, elit sit amet varius semper, nulla mauris mollis quam, tempor suscipit diam nulla vel leo.
            |Praesent dapibus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
            |Aliquam in lorem sit amet leo accumsan lacinia. Donec ipsum massa, ullamcorper in, auctor et, scelerisque sed, est.
            |Et harum quidem rerum facilis est et expedita distinctio.
            |Integer vulputate sem a nibh rutrum consequat.""".trimMargin()
            leisure = """Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
            |In enim a arcu imperdiet malesuada.
            |In dapibus augue non sapien.
            |Nulla non lectus sed nisl molestie malesuada.
            |Nulla accumsan, elit sit amet varius semper, nulla mauris mollis quam, tempor suscipit diam nulla vel leo.
            |Praesent dapibus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
            |Aliquam in lorem sit amet leo accumsan lacinia. Donec ipsum massa, ullamcorper in, auctor et, scelerisque sed, est.
            |Et harum quidem rerum facilis est et expedita distinctio.
            |Integer vulputate sem a nibh rutrum consequat.""".trimMargin()
            experience = """Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
            |In enim a arcu imperdiet malesuada.
            |In dapibus augue non sapien.
            |Nulla non lectus sed nisl molestie malesuada.
            |Nulla accumsan, elit sit amet varius semper, nulla mauris mollis quam, tempor suscipit diam nulla vel leo.
            |Praesent dapibus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
            |Aliquam in lorem sit amet leo accumsan lacinia. Donec ipsum massa, ullamcorper in, auctor et, scelerisque sed, est.
            |Et harum quidem rerum facilis est et expedita distinctio.
            |Integer vulputate sem a nibh rutrum consequat.""".trimMargin()

        }
//                    address.street = "165 5th Avenue"
//                    address.city = "New York"
//                    address.zip = "0305"
//        address.country = "USA"

    }
}


private fun ModuleData.dataPost1() = env.blogPostRepo.newData("post1") {
    name = "1st Post"
    tags = env.tagRepo.byRef("tag1") + env.tagRepo.byRef("tag2")
    content = """Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
            |In enim a arcu imperdiet malesuada.
            |In dapibus augue non sapien.
            |Nulla non lectus sed nisl molestie malesuada.
            |Nulla accumsan, elit sit amet varius semper, nulla mauris mollis quam, tempor suscipit diam nulla vel leo.
            |Praesent dapibus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
            |Aliquam in lorem sit amet leo accumsan lacinia. Donec ipsum massa, ullamcorper in, auctor et, scelerisque sed, est.
            |Et harum quidem rerum facilis est et expedita distinctio.
            |Integer vulputate sem a nibh rutrum consequat. """.trimMargin()
    comments = env.blogPostCommentRepo.newData("post1_comment1") {
        content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
        pseudo = "Pseudo1"
        children = env.blogPostCommentRepo.newData("post1_comment1_1") {
            content = "Nunc pretium metus sed rhoncus consequat."
            pseudo = "Pseudo1"
            children = env.blogPostCommentRepo.newData("post1_comment1_1_1") {
                content = "Curabitur in ligula egestas, egestas orci eget, faucibus lectus."
                pseudo = "Pseudo2"
            }.toBag()
        } + env.blogPostCommentRepo.newData("post1_comment1_2") {
            content = "Cras laoreet orci nec lorem accumsan fermentum."
            pseudo = "Pseudo9"
            children = env.blogPostCommentRepo.newData("post1_comment1_2_1") {
                content = "Aenean id erat a ante suscipit porta."
                pseudo = "Pseudo2"
            } + env.blogPostCommentRepo.newData("post1_comment1_2_2") {
                content = "Nullam vitae sem at quam laoreet rhoncus nec sed dui."
                pseudo = "Pseudo9"
                children = env.blogPostCommentRepo.newData("post1_comment1_2_2_1") {
                    content = "Quisque ultricies ipsum eget tempor tincidunt."
                    pseudo = "Pseudo5"
                }.toBag()
            }
        }
    } + env.blogPostCommentRepo.newData("post1_comment2") {
        content = "Suspendisse commodo ex a cursus mattis."
        pseudo = "Pseudo2"
    } + env.blogPostCommentRepo.newData("post1_comment3") {
        content = "Integer a est tincidunt libero convallis vestibulum id ac erat."
        pseudo = "Pseudo3"
    } + env.blogPostCommentRepo.newData("post1_comment4") {
        content = "Donec id augue rhoncus, commodo ex a, rhoncus nulla."
        pseudo = "Pseudo4"
    }
}

private fun ModuleData.dataPost2() = env.blogPostRepo.newData("post2") {
    name = "2nd Post"
    tags = env.tagRepo.byRef("tag2") + env.tagRepo.byRef("tag3")
    content = """Vestibulum et lorem ac urna facilisis rhoncus. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
            |Nulla facilisi.
            |Suspendisse vel lectus pellentesque, bibendum eros quis, imperdiet magna.
            |Nullam iaculis diam nisl, sed rhoncus urna dignissim vitae.
            |Duis magna tortor, varius sed feugiat sit amet, rhoncus ac eros.
            |Suspendisse ac sagittis lectus. Integer metus ex, tincidunt quis interdum vel, luctus ac massa.
            |Nulla vestibulum nec turpis id convallis.
            |Praesent tellus quam, pharetra eget purus tristique, venenatis tempor dolor.
            |Curabitur gravida ullamcorper luctus.
            |Praesent sit amet eleifend libero.
            |Sed eget consectetur urna.
            |Nam ex est, accumsan ac sapien ac, rhoncus varius tellus.""".trimMargin()
    comments = env.blogPostCommentRepo.newData("post1_comment1") {
        content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
        pseudo = "Pseudo4"
        children = env.blogPostCommentRepo.newData("post1_comment1_1") {
            content = "Nunc pretium metus sed rhoncus consequat."
            pseudo = "Pseudo6"
            children = env.blogPostCommentRepo.newData("post1_comment1_1_1") {
                content = "Curabitur in ligula egestas, egestas orci eget, faucibus lectus."
                pseudo = "Pseudo4"
            }.toBag()
        } + env.blogPostCommentRepo.newData("post1_comment1_2") {
            content = "Cras laoreet orci nec lorem accumsan fermentum."
            pseudo = "Pseudo7"
            children = env.blogPostCommentRepo.newData("post1_comment1_2_1") {
                content = "Aenean id erat a ante suscipit porta."
                pseudo = "Pseudo5"
            } + env.blogPostCommentRepo.newData("post1_comment1_2_2") {
                content = "Nullam vitae sem at quam laoreet rhoncus nec sed dui."
                pseudo = "Pseudo2"
                children = env.blogPostCommentRepo.newData("post1_comment1_2_2_1") {
                    content = "Quisque ultricies ipsum eget tempor tincidunt."
                    pseudo = "Pseudo7"
                }.toBag()
            }
        }
    } + env.blogPostCommentRepo.newData("post1_comment2") {
        content = "Suspendisse commodo ex a cursus mattis."
        pseudo = "Pseudo2"
    } + env.blogPostCommentRepo.newData("post1_comment3") {
        content = "Integer a est tincidunt libero convallis vestibulum id ac erat."
        pseudo = "Pseudo3"
    } + env.blogPostCommentRepo.newData("post1_comment4") {
        content = "Donec id augue rhoncus, commodo ex a, rhoncus nulla."
        pseudo = "Pseudo4"
    }
}

private fun ModuleData.dataPost3() = env.blogPostRepo.newData("post3") {
    name = "3rd Post"
    tags = env.tagRepo.byRef("tag4") + env.tagRepo.byRef("tag5")
    content = """Nunc volutpat ultrices vestibulum.
            |Ut interdum malesuada odio, in tempor sapien cursus vitae.
            |Integer non accumsan lacus. Morbi suscipit volutpat gravida.
            |Aenean laoreet ipsum et metus ultricies iaculis.
            |Praesent sollicitudin viverra efficitur.
            |Aliquam non fringilla augue, cursus tristique enim.
            |In orci magna, fermentum eget porttitor at, congue vel turpis.
            |Pellentesque a tincidunt diam, aliquam malesuada ipsum.
            |Donec nisl felis, interdum at imperdiet nec, pretium in mauris.
            |Mauris nec orci purus.
            |Mauris gravida consectetur mi, eget dapibus nulla commodo ut.
            |Proin ac urna sit amet nibh luctus sagittis at ut massa.""".trimMargin()
}

private fun ModuleData.createBlog1() = env.blogRepo.newData("blog1") {
    dependsOfData(tagsData)
    name = "My First Blog"
    posts = this@createBlog1.dataPost1() + this@createBlog1.dataPost2() + this@createBlog1.dataPost3()
}

val dataBlog = data(ModuleDataType.DEMO) {
    dependsOfData(tagsData)
    val user1 = createUser1()
    val user2 = createUser2()
    val user3 = createUser3()
    val blog1 = createBlog1()
    blog1.user = user1
    blog1.maintainer = user2
}