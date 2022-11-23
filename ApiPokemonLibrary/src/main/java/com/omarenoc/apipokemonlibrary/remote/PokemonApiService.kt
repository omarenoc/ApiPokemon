package com.omarenoc.apipokemonlibrary.remote

import com.omarenoc.apipokemonlibrary.data.PokemonResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApiService {
    @GET("{pokemon}")
    suspend fun getPokemon(@Path("pokemon") pokemon: String): Response<PokemonResponse>
}