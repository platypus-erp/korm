package org.platypus.module.blog

import org.platypus.model.ModelMany2Many
import org.platypus.model.ModelMany2Many.getValue
import org.platypus.model.many2manyLink

val ModelMany2Many.cpostTagRel by BlogPostModel many2manyLink PostTagModel
val ModelMany2Many.cblogTagRel by BlogModel many2manyLink PostTagModel