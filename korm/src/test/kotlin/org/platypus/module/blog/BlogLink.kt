package org.platypus.module.blog

import org.platypus.model.ModelMany2Many
import org.platypus.model.ModelMany2Many.getValue
import org.platypus.model.many2manyLink

val ModelMany2Many.postTagRel by BlogPostModel many2manyLink PostTagModel
val ModelMany2Many.blogTagRel by BlogModel many2manyLink PostTagModel