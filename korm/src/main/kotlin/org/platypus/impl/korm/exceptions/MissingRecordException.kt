package org.platypus.impl.korm.exceptions

import org.platypus.api.env.PlatypusEnvironement
import org.platypus.impl.korm.identifiants.ModelID

class MissingRecordException(modelID: ModelID, env: PlatypusEnvironement) :OrmException("The id ${modelID.id} not found inside ${modelID.model.modelName} maybe this record was deleted", env)