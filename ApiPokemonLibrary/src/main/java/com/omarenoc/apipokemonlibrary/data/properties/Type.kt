package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class Type(
    @SerializedName("slot")
    val slot: Int? = 0,
    @SerializedName("type")
    val type: TypeX? = TypeX()
)