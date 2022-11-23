package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class OfficialArtwork(
    @SerializedName("front_default")
    val frontDefault: String? = null
)