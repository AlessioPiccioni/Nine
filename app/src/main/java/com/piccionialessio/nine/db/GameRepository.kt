package com.piccionialessio.nine.db

import androidx.lifecycle.LiveData

class GameRepository(private val daoGame: DaoGame) {
    suspend fun insert(game: Game) {
        daoGame.insert(game)
    }

    fun getBestResult(): LiveData<MutableList<Game>> {
        return daoGame.getBestResults()
    }

    fun getAllGames(): LiveData<MutableList<Game>> {
        return daoGame.getAllGames()
    }
}