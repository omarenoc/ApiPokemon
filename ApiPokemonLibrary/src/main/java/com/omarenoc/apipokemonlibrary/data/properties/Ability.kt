package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class Ability(
    @SerializedName("ability")
    val ability: AbilityX? = AbilityX(),
    @SerializedName("is_hidden")
    val isHidden: Boolean? = false,
    @SerializedName("slot")
    val slot: Int? = 0
)