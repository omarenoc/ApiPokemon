package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class GenerationIi(
    @SerializedName("crystal")
    val crystal: Crystal? = null,
    @SerializedName("gold")
    val gold: Gold? = null,
    @SerializedName("silver")
    val silver: Silver? = null
)