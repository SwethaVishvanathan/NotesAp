package com.example.notesapp

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.notesapp.NotesTable
import kotlinx.coroutines.flow.Flow

@Dao
interface NotesTableDao {

    @Upsert
    suspend fun insertNote(notesTable: NotesTable)

    @Query("DELETE FROM Notes WHERE id=:id")
    suspend fun deleteNote(id: String)


    @Query("SELECT * FROM Notes")
    fun getAllNotes(): Flow<List<NotesTable>>

    @Query("SELECT * FROM Notes WHERE id=:id")
    suspend fun getNoteById(id: String): NotesTable?


}