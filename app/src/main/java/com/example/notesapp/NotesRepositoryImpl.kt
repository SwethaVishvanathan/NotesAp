package com.example.notesapp

import com.example.notesapp.NotesTableDao
import com.example.notesapp.NotesRepository
import kotlinx.coroutines.flow.Flow

class NotesRepositoryImpl(
    private val notesTableDao: NotesTableDao
) : NotesRepository {
    override suspend fun insertOrUpdate(notesTable: NotesTable) {
        notesTableDao.insertNote(notesTable)
    }

    override suspend fun deleteNote(id: String) {
        notesTableDao.deleteNote(id)

    }

    override fun getAllNotes(): Flow<List<NotesTable>> = notesTableDao.getAllNotes()
    override suspend fun getNoteById(id: String): NotesTable? {
        return notesTableDao.getNoteById(id)
    }
}