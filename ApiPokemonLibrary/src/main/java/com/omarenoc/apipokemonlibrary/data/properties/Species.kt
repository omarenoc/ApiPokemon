package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class Species(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("url")
    val url: String? = null
)