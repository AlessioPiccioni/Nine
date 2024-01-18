package com.piccionialessio.nine.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaoGame {

    @Insert
    suspend fun insert(game: Game)

    //Per ottenere i vincitori classificati in base al tempo
    @Query("SELECT * FROM Game WHERE success = 'ok' ORDER BY time")
    fun getClassifiedResults(): LiveData<MutableList<Game>>

    //Per ottenere tutta la lista di tentativi
    @Query("SELECT * FROM Game")
    fun getAllTries(): LiveData<MutableList<Game>>

    //TODO: aggiungi la possibilita di vedere i tentativi di un certo nome, un filtro per nome e anche per data
}