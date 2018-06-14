package org.platypus

import org.platypus.cache.PlatypusCache
import org.platypus.config.PlatypusConf
import org.platypus.context.PlatypusContext
import org.platypus.model.Model
import org.platypus.module.base.entities.Language
import org.platypus.orm.PersistenceDialect
import org.platypus.orm.transaction.TransactionExecutor
import org.platypus.security.PlatypusUser
import org.slf4j.Logger
import java.time.ZoneId

interface PlatypusEnvironment : ReadOnlyPlatypusEnvironment, SudoAble<PlatypusEnvironment>, ContextAble<PlatypusEnvironment> {

    /**
     * Store all the altered and new data to the DataBase
     */
    fun flush()
    /**
     * Store all the altered and new data to the DataBase for this model
     */
    fun flush(model:Model<*>)

    /**
     * After the call you can't call [flush]
     */
    override fun close()

    /**
     * Return a new Environement with [envUser] = [user]
     * [sudoUser] is reset
     * [context] is a copy of the current
     * [lang] = [user].language
     * [timezone] = [user].zoneId
     */
    fun connect(user:PlatypusUser):PlatypusEnvironment

    val internal: PlatypusEnvironmentInternal

}

interface PlatypusEnvironmentInternal:AutoCloseable {

    val dbName: String
    val cr: TransactionExecutor
    val cache: PlatypusCache
    val dialect: PersistenceDialect

    fun resetCache()


}

interface ReadOnlyPlatypusEnvironment : AutoCloseable {
    /**
     * Return the value passed to the configuration
     * @see org.platypus.api.config.PlatypusConf.debug
     */
    val debug: Boolean
    /**
     * The configuration of the server
     */
    val conf:PlatypusConf
    /**
     * The current context of the environement
     */
    val context: PlatypusContext
    /**
     * The current user who trigger the current action
     */
    val envUser: PlatypusUser
    /**
     * The sudo user work like in Unix, GNU/Linux Os.
     * If [sudoUser] and [envUser] are not the same the [sudoUser] is used to check the access
     * if the [envUser] don't have the minimal grant to perform the wanted action
     *
     * [sudoUser] return the current sudo user or the same value of the [envUser] property
     */
    val sudoUser: PlatypusUser
    /**
     * The language of the current User
     * If the [sudoUser] is set the language don't change
     */
    val lang: Language?
    /**
     * The timezone of the current User
     * If the [sudoUser] is set the timezone don't change
     */
    val timezone: ZoneId
    /**
     * A generic logger if you wan't to log somethings is the application log
     */
    val logger: Logger
}