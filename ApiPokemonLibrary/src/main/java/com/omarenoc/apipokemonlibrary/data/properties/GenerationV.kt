package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName
import com.omarenoc.apipokemonlibrary.data.properties.BlackWhite

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite? = null
)