package org.platypus.module.blog.gen.blog.profile

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.model.Alias
import org.platypus.module.blog.ProfileModel
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl

val PlatypusEnvironment.profileRepo: ProfileRepo
    get() = RecordRepositoryImpl(this, ProfileModel)

typealias ProfileBag = Bag<ProfileModel>
typealias ProfileRepo = RecordRepository<ProfileModel>
typealias Profile = Record<ProfileModel>

/**
 * Embeded Mixin City
 */
//val Profile.address by ProfileModel.address

var Profile.age by ProfileModel.age
var Profile.gender by ProfileModel.gender
var Profile.money by ProfileModel.money
var Profile.bestPost by ProfileModel.bestPost
var Profile.user by ProfileModel.user

//fun Profile.displayAdresse() = ProfileModel.displayAdresse.call(this)

typealias ProfileAlias = Alias<ProfileModel>
val ProfileAlias.age by ProfileModel.age
val ProfileAlias.gender by ProfileModel.gender
val ProfileAlias.money by ProfileModel.money
val ProfileAlias.user by ProfileModel.user
val ProfileAlias.bestPost by ProfileModel.bestPost