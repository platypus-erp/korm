package org.platypus.module.contact.models

import org.platypus.model.Model
import org.platypus.module.base.models.Languages
import org.platypus.module.base.models.Users
import org.platypus.module.contact.entities.resCompaniesRepo
import org.platypus.orm.sql.and
import org.platypus.orm.sql.or

object Partners : Model<Partners>("res.partners") {

    init {
        archived.enable()
        name extends {
            required = true
        }
    }

    val displayName = string("displayName") {
        index = true
        store = true
    }

    val parent = many2one("parent", Partners)

    val parentName = parent.related(readonly = true) { name }

    val title = many2one("title", PartnerTitles)
    val ref = string("dataRef")
    val lang = many2one("lang", Languages) {
        domain = { installed eq true }
        defaultValueFun = { it.lang!! }
        help = "If the selected language is loaded in the system, all documents related to " +
                "this contact will be printed in this language. If not, it will be English."
    }

    //Natural ZoneId
    val tz = string("timezone") {
        defaultValueFun = { it.timezone.id }
        help = "The partner's timezone, used to output proper date and time values " +
                "inside printed reports. It is important to set a value for this field. " +
                "You should use the same timezone that is otherwise used to pick and " +
                "render date and time values: your computer's timezone."
    }

    //Natural ZoneOffset
    val tzOffset = string("timeZoneOffset")

    val user = many2one("user", Users) {
        label = "Salesperson"
        help = "The internal user that is in charge of communicating with this contact if any."
    }

    val vat = string("vat") {
        label = "TIN"
        help = "Tax Identification Number. " +
                "Fill it if the company is subjected to taxes. " +
                "Used by the some of the legal statements."
    }

    val banks = one2many("banks", { PartnerBanks.partner }) {
        label = "Banks"
    }

    val webSite = string("webSite")

    val comment=  text("comment")

    val categories = many2many("categories", { partner_to_partner_category_rel }) {
        label = "Tags"
    }

    val creditLimit  =decimal("creditLimit") {
        label = "Credit Limit"
    }

    val barcode = string("barcode") {
        label = "ean13"
    }

    val customer = boolean("customer") {
        label = "Is a Customer"
        help = "Check this box if this contact is a customer."
        default = true
    }

    val vendor = boolean("vendor") {
        label = "Is a Vendor"
        help = "Check this box if this contact is a vendor. " +
                "If it's not checked, purchase people will not see it when encoding a purchase order."
    }

    val employee = boolean("employee") {
        label = "Is an Employee"
        help = "Check this box if this contact is an Employee."
    }

    val isCompany = boolean("isCompany") {
        label = "Is a Company"
        help = "Check if the contact is a company, otherwise it is a person"
    }

    val function = string("function")

    val type = selection("type", PartnerType) {
        label = "Address Type"
        help = "Used to select automatically the right address according to the context in sales and purchases documents."
    }

    val adresseInfo = many2one("adresseInfo", AddressInfos)

    val email = string("email")

    val emailFormated = string("emailFormated") {
        label = "Formatted Email"
        help = """Format email address "Name <email@domain>""""
    }

    val phone = string("phone")

    val fax = string("fax")
    val mobile = string("mobile")
    val companyType = selection("companyType", PartnerCompanyType) {
        label = "Company Type"
    }

    val company = many2one("company", ResCompanies) {
        index = true
        defaultValueFun = {
            it.resCompaniesRepo.dataRef.mainCompany
        }
    }

    val color = integer("color") {
        default = 0
    }

//    val user = one2many("user", { Users.partner})

    val partnerShare = boolean("partnerShare") {
        label = "Share Partner"
        store = true
        help = "Either customer (no user), either shared user. Indicated the current partner is a customer without " +
                "access or with a limited access created for sharing data."
    }

    val contactAddress = string("contactAddress") {
        label = "Complete Address"
    }

    val commercialPartner = many2one("commercialPartner", Partners) {
        label = "Commercial Entity"
        store = true
        index = true
    }

    val commercialCompanyName = string("commercialCompanyName") {
        store = true
    }

    val companyName = string("companyName")

    val image = binary("image") {
        label = "Image"
        attachement = true
        help = "This field holds the image used as avatar for this contact, limited to 1024x1024px"
    }

    val imageMedium = binary("imageMedium") {
        label = "Medium-sized image"
        attachement = true
        help = "Medium-sized image of this contact. It is automatically " +
                "resized as a 128x128px image, with aspect ratio preserved. " +
                "Use this field in form actions or some kanban actions."
    }

    val imageSmall = binary("imageSmall") {
        label = "Small-sized image"
        attachement = true
        help = "Small-sized image of this contact. It is automatically " +
                "resized as a 64x64px image, with aspect ratio preserved. " +
                "Use this field anywhere a small image is required."
    }

    init {
        check("check_name", "(type='contact' AND name IS NOT NULL) or (type!='contact')") {
            ((type eq PartnerType.contact) and name.isNotNull()) or (type neq PartnerType.contact)
        }
    }

//    val computeEmailFormatted = emailFormated.onGet {
//        TODO("To transpose")
//    }
//
//    val compute_commercial_company_name = commercialCompanyName.onGet {
//        TODO("To transpose")
//    }
//
//    val _compute_commercial_partner = commercialPartner.onGet {
//        TODO("To transpose")
//    }
//
//    val compute_contact_address = contactAddress.onGet {
//        TODO("To transpose")
//    }
//
//    val compute_partner_share = partnerShare.onGet {
//        TODO("To transpose")
//    }
//
//    val compute_company_type = companyType.onGet {
//        TODO("To transpose")
//    }
//
//    val write_company_type = companyType.onSet { partner, partnerCompanyType ->
//        TODO("To transpose")
//    }
//
//
//    val onGetTzOffset = tzOffset.onGet {
//        ZonedDateTime.now().zone.rules.getOffset(Instant.now()).id
//    }
//
//    val compute_display_name = displayName.onGet {
//        it.withContext().nameGet()
//    }
}