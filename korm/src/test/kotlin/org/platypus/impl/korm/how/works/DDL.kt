package org.platypus.impl.korm.how.works

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.platypus.Platypus
import org.platypus.impl.korm.how.works.modelentity.PostTagModel


val DDL_POST_TAG = "CREATE TABLE IF NOT EXISTS post_tag (color INT NULL, external_ref VARCHAR(50) NOT NULL, name VARCHAR(50) NOT NULL, id BIGSERIAL PRIMARY KEY)"

class TestCreateTable {

    val _server = Platypus.create {}

//    @Test
//    fun test(){
//        val _env = org.platypus.Platypus.newEnv()
//    }

    @Test
    fun testCreateTable() {
        PostTagModel.freezeDDL()
        _server.connect()
        Platypus.get().newEnv()
        val ddls = PostTagModel.internalTable.ddl
        assertEquals(1, ddls.size)
        val ddl = ddls[0]
        assertEquals(DDL_POST_TAG, ddl)
    }
}