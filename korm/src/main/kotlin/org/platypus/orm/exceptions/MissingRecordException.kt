package org.platypus.orm.exceptions

import org.platypus.PlatypusEnvironment
import org.platypus.cache.ModelID


class MissingRecordException(modelID: ModelID, env: PlatypusEnvironment) : OrmException("The id ${modelID.id} not found inside ${modelID.model.modelName} maybe this record was deleted", env)
class OnDeleteRestrictError : RuntimeException("You can't delete this record because another reference it")