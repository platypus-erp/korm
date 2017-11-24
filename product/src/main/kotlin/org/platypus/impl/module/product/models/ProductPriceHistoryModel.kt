package org.platypus.impl.module.product.models

import org.platypus.impl.korm.model.ModelNamed
import org.platypus.impl.module.product.entities.ProductPriceHistory

object ProductPriceHistoryModel : ModelNamed<ProductPriceHistoryModel, ProductPriceHistory>("product.price.history")