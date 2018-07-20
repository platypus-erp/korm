package org.platypus.module.blog

import org.platypus.context.ContextKeyNonNull
import org.platypus.model.Model
import org.platypus.module.blog.gen.blog.user.UserMok
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.and
import org.platypus.orm.sql.expression.eq
import org.platypus.orm.sql.expression.greater
import org.platypus.orm.sql.or

val useSquareBracket = ContextKeyNonNull("useSquareBracket", false)
val fakeKey = ContextKeyNonNull("fakeKey", false)


//TODO replace with inherit User
object UserMokModel : Model<UserMokModel>("blog.user") {

    val decoratedName = string("decoratedName")

    init {
        name extends {
            copy = false
        }
    }

    val email = string("email") {
        lenght = 100
        index = true
    }
    val password = string("password") {
        copy = false
    }
    val status = integer("status") {
        default = 12
    }
    val isStaff = boolean("isStaff")
    val isActive = boolean("isActive")
    val profile = revOne2one("profile", { ProfileModel.user }) {
        onDelete = ReferenceOption.RESTRICT
        required = true
    }
    val age = integer("age") {
        store = true
    }
    val blogs = one2many("posts", { BlogModel.co_creator })


    //    val Pmoney = profile.related().money
    val lastPost = many2one("lastPost", BlogPostModel)
    val resume = many2one("resume", ResumeModel)
    val email2 = string("email2") {
        store = false
    }
    val isPremium = boolean("isPremium")
    val nums = integer("nums")


    val size = decimal("size")

    init {
        check("nums_premium", "Premium users must have positive nums") {
            (isPremium eq true) and (nums greater 0) or (isPremium eq false)
        }
    }

    val prefixedUser = api.private("prefixedUser",
            fun(self: UserMok, prefix: String): String = "$prefix : ${self.name}"
    )

    val decorateEmail = api.private("decorateEmail",
            fun(self: UserMok, prefix: String): String {
                return if (self.env.context[useSquareBracket]) {
                    "[${self.name}]"
                } else {
                    "<${self.name}>"
                }
            }
    )

}


