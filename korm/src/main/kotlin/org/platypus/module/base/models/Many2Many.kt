package org.platypus.module.base.models

import org.platypus.model.ModelMany2Many
import org.platypus.model.ModelMany2Many.getValue
import org.platypus.model.many2manyLink

val ModelMany2Many.userGroupRel by Users many2manyLink Groups