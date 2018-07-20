package org.platypus.module.blog.gen.blog.user

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.module.blog.UserMokModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

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
var UserMok.blogs by UserMokModel.blogs
var UserMok.lastPost by UserMokModel.lastPost
var UserMok.resume by UserMokModel.resume
var UserMok.email2 by UserMokModel.email2
var UserMok.isPremium by UserMokModel.isPremium
var UserMok.nums by UserMokModel.nums
var UserMok.size by UserMokModel.size

fun UserMok.prefixedUser(prefix: String) = UserMokModel.prefixedUser.call(this, prefix)
fun UserMok.decorateEmail(prefix: String) = UserMokModel.decorateEmail.call(this, prefix)