package com.example.projectretrofit.repository

import com.example.projectretrofit.data.GameApi
import com.example.projectretrofit.model.GameList
import javax.inject.Inject

class GamesRepository @Inject constructor(private val apiGames: GameApi){
    suspend fun getGames(): List<GameList>?{
        val response = apiGames.getGames()
        if (response.isSuccessful){
            return response.body()?.results
        }
        return null
    }
}