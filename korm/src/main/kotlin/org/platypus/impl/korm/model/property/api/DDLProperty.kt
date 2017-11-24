package org.platypus.impl.korm.model.property.api

/**
 * This class is used to hold the ddl of a [PlatypusProperty]
 * [mainDDL] hold the column itself DDL
 * [additionalDDL] is used if the column want to add other ddl after the table ddl
 */
data class DDLProperty(val mainDDL: String, val additionalDDL: List<String>)