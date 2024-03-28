package com.example.notesapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notesapp.AddNoteUi
import com.example.notesapp.LocalNavHostController

@Composable
fun MyNavHost() {
    val controller = LocalNavHostController.current
    NavHost(navController = controller, startDestination = Routes.NotesListScreen.name) {

        composable(Routes.NotesListScreen.name) {
            NotesListScreen()
        }
        composable(Routes.AddNotesScreen.name+"/{id}") {
            AddNoteUi()
        }

    }
}