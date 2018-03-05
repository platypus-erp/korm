package org.platypus.struct

import org.platypus.PlatypusEnvironment
import org.platypus.bag.Bag
import org.platypus.entity.PlatypusSelection
import org.platypus.entity.PlatypusSelectionCompanion
import org.platypus.entity.Record
import org.platypus.model.Model
import org.platypus.repository.RecordRepository
import org.platypus.repository.RecordRepositoryImpl
import org.platypus.struct.ProfileGender.getValue

object ProfileGender : PlatypusSelectionCompanion<ProfileModel, ProfileGenderData>(ProfileGenderData::class, { v, l -> ProfileGenderData(v, l) })
class ProfileGenderData(value: String, label: String) : PlatypusSelection<ProfileModel>(value, label)

val ProfileGender.MALE by "Male profile"
val ProfileGender.FEMALE by "Female profile"
val ProfileGender.UNKNOW by "Unknow gender profile"

object ProfileModel : Model<ProfileModel>("test.profile") {

    val address: AddressMixin<ProfileModel> = mixin(AddressMixin())

    val age = integer("age")
    val gender = selection("gender", ProfileGender)

    val street = string("street")
    val zip = string("zip")
    val city = string("city")
    val money = decimal("money")
    val user = many2one("user", UserMokModel)
    val bestPost = one2one("bestPost", BlogPostModel)
    val country = string("country")

    val displayAdresse = api.private("displayAdresse",
            fun(self: Profile): String? {
//                TODO incule mixin adresse
                return self.country
            }
    )
}

val PlatypusEnvironment.profileRepo: ProfileRepo
    get() = RecordRepositoryImpl(this, ProfileModel)

typealias ProfileBag = Bag<ProfileModel>
typealias ProfileRepo = RecordRepository<ProfileModel>
typealias Profile = Record<ProfileModel>

/**
 * Embeded Mixin City
 */
var Profile.city by ProfileModel.city
var Profile.zip by ProfileModel.zip
var Profile.street by ProfileModel.street

var Profile.age by ProfileModel.age
var Profile.gender by ProfileModel.gender
var Profile.money by ProfileModel.money
var Profile.country by ProfileModel.country
var Profile.bestPost by ProfileModel.bestPost
var Profile.user by ProfileModel.user

fun Profile.displayAdresse() = ProfileModel.displayAdresse.call(this)