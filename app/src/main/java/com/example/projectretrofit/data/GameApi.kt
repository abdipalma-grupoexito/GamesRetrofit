package com.example.projectretrofit.data

import com.example.projectretrofit.model.GamesModel
import com.example.projectretrofit.util.Constants.Companion.API_KEY
import com.example.projectretrofit.util.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface GameApi {
    @GET(ENDPOINT + API_KEY)
    suspend fun getGames(): Response<GamesModel>
}