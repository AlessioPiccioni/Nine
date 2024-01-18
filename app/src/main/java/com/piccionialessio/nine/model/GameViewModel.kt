package com.piccionialessio.nine.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.piccionialessio.nine.db.DbGame
import com.piccionialessio.nine.db.Game
import com.piccionialessio.nine.db.GameRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GameViewModel(application: Application): AndroidViewModel(application) {
    private val repository: GameRepository

    init {
        val gameDao = DbGame.getInstance(application).gameDao()
        repository = GameRepository(gameDao)
    }

    fun insert(game: Game) {
        viewModelScope.launch(Dispatchers.IO) { repository.insert(game) }
    }

    fun getBestResults(): LiveData<MutableList<Game>> {
        return repository.getBestResult()
    }

    fun getAllTries(): LiveData<MutableList<Game>> {
        return repository.getAllTries()
    }
}