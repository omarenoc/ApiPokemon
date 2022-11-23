package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class OmegarubyAlphasapphire(
    @SerializedName("front_default")
    val frontDefault: String? = null,
    @SerializedName("front_female")
    val frontFemale: String? = null,
    @SerializedName("front_shiny")
    val frontShiny: String? = null,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: String? = null
)