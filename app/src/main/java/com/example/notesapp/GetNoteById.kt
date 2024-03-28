package com.example.notesapp

import com.example.notesapp.toNotesData

class GetNoteById(
    private val repository: NotesRepository
) {

    suspend operator fun invoke(id: String): NotesData? {
        return repository.getNoteById(id)?.toNotesData()
    }
}