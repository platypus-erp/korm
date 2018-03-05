package org.platypus.struct

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.context.ContextKeyNonNull
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.orm.ReferenceOption
import org.platypus.orm.sql.and
import org.platypus.orm.sql.or
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

val useSquareBracket = ContextKeyNonNull("useSquareBracket", false)
val fakeKey = ContextKeyNonNull("fakeKey", false)

object UserMokModel : Model<UserMokModel>("test.user") {

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
    val profile = many2one("profile", ProfileModel) {
        onDelete = ReferenceOption.RESTRICT
        required = true
    }
    val age = integer("age") {
        store = true
    }
    val posts = one2many("posts", { BlogPostModel.user })


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


//    val onChangeName = name.onChange(OnChangeType.SERVER) {
//        println("On change Name ${it.name}")
//    }
//    val computeDecoratedName = decoratedName.onGet { it.prefixedUser("User") }
//
//    val getAge = age.onGet { it.profile?.age ?: 0 }
//
//    val setAge = age.onSet { self, age -> self.profile?.age = age }

    val updateCity = api.private("updateCity",
            fun(self: UserMok, city: String) {
                self.profile?.city = city
            }
    )

    val computeNum = api.private("computeNum",
            fun(self: UserMok) {
                self.env.logger.info("ComputeNum")
            }
    )

}

val PlatypusEnvironment.userMokRepo: UserRepo
    get() = RecordRepositoryImpl(this, UserMokModel)

typealias UserMokBag = Bag<UserMokModel>

typealias UserRepo = RecordRepository<UserMokModel>

typealias UserMok = Record<UserMokModel>

var UserMok.decoratedName by UserMokModel.decoratedName
var UserMok.email by UserMokModel.email
var UserMok.password by UserMokModel.password
var UserMok.status by UserMokModel.status
var UserMok.isStaff by UserMokModel.isStaff
var UserMok.isActive by UserMokModel.isActive
var UserMok.profile by UserMokModel.profile
var UserMok.age by UserMokModel.age
var UserMok.posts by UserMokModel.posts
var UserMok.lastPost by UserMokModel.lastPost
var UserMok.resume by UserMokModel.resume
var UserMok.email2 by UserMokModel.email2
var UserMok.isPremium by UserMokModel.isPremium
var UserMok.nums by UserMokModel.nums
var UserMok.size by UserMokModel.size


fun UserMok.prefixedUser(prefix: String) = UserMokModel.prefixedUser.call(this, prefix)
fun UserMok.decorateEmail(prefix: String) = UserMokModel.decorateEmail.call(this, prefix)
