package com.example.notesapp

class AddNoteUseCase(
    private val repository: NotesRepository
) {

    suspend operator fun invoke(notesData: NotesData) {
        repository.insertOrUpdate(notesData.toNotesTable())
    }
}