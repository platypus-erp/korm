package org.platypus.bag

import org.platypus.entity.Record
import org.platypus.model.Model

interface MutableBag<M : Model<M>> : Bag<M>, MutableCollection<Record<M>>