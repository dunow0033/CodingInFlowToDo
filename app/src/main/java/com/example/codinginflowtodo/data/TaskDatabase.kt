package com.example.codinginflowtodo.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Task::class],
    version
)
abstract class TaskDatabase : RoomDatabase() {
}