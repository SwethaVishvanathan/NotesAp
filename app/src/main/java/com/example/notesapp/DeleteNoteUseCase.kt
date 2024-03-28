package com.example.notesapp

class DeleteNoteUseCase(
    private val repository: NotesRepository
) {

    suspend fun invoke(id: String) {
        repository.deleteNote(id)
    }
}