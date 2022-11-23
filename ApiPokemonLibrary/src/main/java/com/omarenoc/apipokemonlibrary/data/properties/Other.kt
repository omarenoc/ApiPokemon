package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName
import com.omarenoc.apipokemonlibrary.data.properties.DreamWorld
import com.omarenoc.apipokemonlibrary.data.properties.Home
import com.omarenoc.apipokemonlibrary.data.properties.OfficialArtwork

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld? = null,
    @SerializedName("home")
    val home: Home? = null,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork? = null
)