package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class GameIndice(
    @SerializedName("game_index")
    val gameIndex: Int? = null,
    @SerializedName("version")
    val version: Version? = null
)