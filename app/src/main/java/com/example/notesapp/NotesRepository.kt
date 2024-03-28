package com.example.notesapp

import kotlinx.coroutines.flow.Flow

interface NotesRepository {

    suspend fun insertOrUpdate(notesTable: NotesTable)
    suspend fun deleteNote(id: String)
    fun getAllNotes(): Flow<List<NotesTable>>

    suspend fun getNoteById(id: String): NotesTable?

}