package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class Emerald(
    @SerializedName("front_default")
    val frontDefault: String? = null,
    @SerializedName("front_shiny")
    val frontShiny: String? = null
)