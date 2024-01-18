package com.piccionialessio.nine.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

@Database(entities = [Game::class], version = 1)
abstract class DbGame : RoomDatabase() {

    companion object {
        private var db: DbGame? = null

        fun getInstance(context: Context): DbGame {
            if (db == null) {
                db = databaseBuilder(context, DbGame::class.java, "db.db").createFromAsset("db.db").build()
            }
            return db as DbGame
        }
    }

    abstract fun gameDao(): DaoGame

}