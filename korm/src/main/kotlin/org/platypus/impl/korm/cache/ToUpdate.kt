package org.platypus.impl.korm.cache

import org.platypus.impl.korm.identifiants.ModelID
import org.platypus.impl.korm.sql.Column

data class ToUpdate(val modelID: ModelID, val props: MutableSet<Column<*>>)