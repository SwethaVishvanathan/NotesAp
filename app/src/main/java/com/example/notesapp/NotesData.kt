package com.example.notesapp

import com.example.notesapp.NotesTable

data class NotesData(
    val id: Int = 0,
    val title: String = "",
    val message: String = ""
)

fun NotesData.toNotesTable(): NotesTable {
    return NotesTable(
        title,
        message,
        System.currentTimeMillis(),
        id,
    )
}
