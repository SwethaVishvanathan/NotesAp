package com.example.notesapp
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notesapp.NotesTableDao

@Database(entities = [NotesTable::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getMyDao(): NotesTableDao
}