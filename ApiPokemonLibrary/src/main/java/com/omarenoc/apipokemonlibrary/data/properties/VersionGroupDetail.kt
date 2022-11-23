package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName
import com.omarenoc.apipokemonlibrary.data.properties.MoveLearnMethod
import com.omarenoc.apipokemonlibrary.data.properties.VersionGroup

data class VersionGroupDetail(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int? = null,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethod? = null,
    @SerializedName("version_group")
    val versionGroup: VersionGroup? = null
)