package org.platypus.base.entities

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.base.models.GroupModel
import org.platypus.impl.korm.entity.stored.EmptyEntity
import org.platypus.impl.korm.entity.stored.RWNamedEntity
import org.platypus.api.data.DataRef

typealias EmptyGroup = EmptyEntity<Group, GroupModel>
typealias GroupData = DataRef<Group, GroupModel>

val PlatypusEnvironement.Group: EmptyGroup
    get() = EmptyEntity(this, GroupModel, { id, env -> Group(id, env) })

class Group(id: Long, env: PlatypusEnvironement) : RWNamedEntity<Group, GroupModel>(id, env, GroupModel, { e: PlatypusEnvironement -> e.Group })
