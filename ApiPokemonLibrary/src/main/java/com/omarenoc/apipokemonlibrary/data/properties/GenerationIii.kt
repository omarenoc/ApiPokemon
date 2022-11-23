package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName

data class GenerationIii(
    @SerializedName("emerald")
    val emerald: Emerald? = null,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: FireredLeafgreen? = null,
    @SerializedName("ruby-sapphire")
    val rubySapphire: RubySapphire? = null
)