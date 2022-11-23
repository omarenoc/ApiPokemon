package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class Sprites(
    @SerializedName("back_default")
    val backDefault: String? = "",
    @SerializedName("back_female")
    val backFemale: Any? = Any(),
    @SerializedName("back_shiny")
    val backShiny: String? = "",
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any? = Any(),
    @SerializedName("front_default")
    val frontDefault: String? = "",
    @SerializedName("front_female")
    val frontFemale: String? = "",
    @SerializedName("front_shiny")
    val frontShiny: String? = "",
    @SerializedName("front_shiny_female")
    val frontShinyFemale: String? = "",
    @SerializedName("other")
    val other: Other? = Other(),
    @SerializedName("versions")
    val versions: Versions? = Versions()
)