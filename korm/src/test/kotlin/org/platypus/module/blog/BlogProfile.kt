package org.platypus.module.blog

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.Record
import org.platypus.entity.Selection
import org.platypus.model.Model
import org.platypus.module.blog.ProfileGender.getValue
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl


object ProfileGender : Selection<ProfileGender>()

val ProfileGender.MALE by "Male profile"
val ProfileGender.FEMALE by "Female profile"
val ProfileGender.UNKNOW by "Unknow gender profile"

object ProfileModel : Model<ProfileModel>("test.profile") {

    val address: AddressMixin<ProfileModel> = mixin(AddressMixin())

    val age = integer("age")
    val gender = selection("gender", ProfileGender)
    val money = decimal("money")
    val user = one2one("co_creator", UserMokModel){
        required = true
    }
    val bestPost = one2one("bestPost", BlogPostModel)

//    val displayAdresse = api.private("displayAdresse",
//            fun(self: Profile): String? {
////                TODO incule mixin adresse
//                return self.country
//            }
//    )
}

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