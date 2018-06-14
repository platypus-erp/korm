package org.platypus.module.blog

import org.platypus.module.ModuleDataType
import org.platypus.module.data
import org.platypus.security.PlatypusUser


val JaneDoe = PlatypusUser("jane_doe")
val WillSmith = PlatypusUser("will_smith")

val tagsData = data(ModuleDataType.DEMO) {
    val tag1 = env.tagRepo.newData("Tendings") {
        name = "Tendings"
    }
    val tag2 = env.tagRepo.newData("Books") {
        name = "Books"
    }
    val tag3 = env.tagRepo.newData("Jane 's") {
        name = "Jane 's"
    }
}

data class DataTest(val userJane: UserMok, val janeProfile: Profile,
                    val post1: BlogPost, val post2: BlogPost,
                    val tag1: PostTag, val tag2: PostTag, val tag3: PostTag)

val dataBlogJane = data(ModuleDataType.DEMO) {
    tagsData.loadData(env)
    val userJane = env.userMokRepo.newData("user_jane") {
        name = "Jane Smith"
        email = "jane.smith@example.com"
        nums = 2
        profile = env.profileRepo.newData("jane_profile") {
            age = 23
            money = 12345.toBigDecimal()
//                    address.street = "165 5th Avenue"
//                    address.city = "New York"
//                    address.zip = "0305"
//        address.country = "USA"
        }
        blogs = env.blogRepo.newData("blog1") {
            name = "My First Blog"
            tags.addAll(env.tagRepo.newData("tag1") {
                name = "Tag 1"
            } + env.tagRepo.newData("tag2") {
                name = "Tag 2"
            })
            posts = env.blogPostRepo.newData("janeBlogPost1") {
                name = "1st Post"
                content = "Content of first post"
                comments = env.blogPostCommentRepo.newData("comm1") {
                    content = "Great Post 1"
                }.toBag()
            } + env.blogPostRepo.newData("janeBlogPost2") {
                name = "2nd Post"
                content = "Content of first post"
                comments = env.blogPostCommentRepo.newData("comm2") {
                    content = "Great Post 1"
                } + env.blogPostCommentRepo.newData("comm3") {
                    content = "Great Post 1"
                }
            } + env.blogPostRepo.newData("janeBlogPost3") {
                name = "3rd Post"
                content = "Content of first post"
            }
        } + env.blogRepo.newData("blog2") {
            name = "My Second Blog"
            tags = env.tagRepo["tag2"] + env.tagRepo.newData("tag3") {
                name = "Tag 3"
            }
            posts = env.blogPostRepo.newData("janeBlog2Post1") {
                name = "1st Post"
                content = "Content of first post"
            } + env.blogPostRepo.newData("janeBlog2Post2") {
                name = "2nd Post"
                content = "Content of first post"
                comments = env.blogPostCommentRepo.newData("comm4") {
                    content = "Great Post 2 blog 2"
                }.toBag()
            } + env.blogPostRepo.newData("janeBlog2Post3") {
                name = "3rd Post"
                content = "Content of first post"
            }
        }

    }
}