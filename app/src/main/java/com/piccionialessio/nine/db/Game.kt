package com.piccionialessio.nine.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Game(
    @PrimaryKey(autoGenerate = true) var id: Int,
    var date: String,
    var time: Long,
    var success: String,
    var name: String
)