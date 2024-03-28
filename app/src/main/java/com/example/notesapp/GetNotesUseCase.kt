package com.example.notesapp

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(
    private val repository: NotesRepository
) {

    operator fun invoke(): Flow<List<NotesData>> {
        return repository.getAllNotes().map { list ->
            list.map {
                it.toNotesData()
            }
        }
    }
}