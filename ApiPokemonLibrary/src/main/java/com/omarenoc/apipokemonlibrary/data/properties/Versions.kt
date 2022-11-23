package com.omarenoc.apipokemonlibrary.data.properties


import com.google.gson.annotations.SerializedName
import com.omarenoc.apipokemonlibrary.data.properties.*

data class Versions(
    @SerializedName("generation-i")
    val generationI: GenerationI? = GenerationI(),
    @SerializedName("generation-ii")
    val generationIi: GenerationIi? = GenerationIi(),
    @SerializedName("generation-iii")
    val generationIii: GenerationIii? = GenerationIii(),
    @SerializedName("generation-iv")
    val generationIv: GenerationIv? = GenerationIv(),
    @SerializedName("generation-v")
    val generationV: GenerationV? = GenerationV(),
    @SerializedName("generation-vi")
    val generationVi: GenerationVi? = GenerationVi(),
    @SerializedName("generation-vii")
    val generationVii: GenerationVii? = GenerationVii(),
    @SerializedName("generation-viii")
    val generationViii: GenerationViii? = GenerationViii()
)