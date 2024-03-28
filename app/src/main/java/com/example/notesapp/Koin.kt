package com.example.notesapp

import androidx.room.Room
import com.example.notesapp.AppDatabase
import com.example.notesapp.NotesRepositoryImpl
import org.koin.dsl.module

val sharedModules = module {

    single<AppDatabase> {
        Room.databaseBuilder(get(), AppDatabase::class.java, "AppDb")
            .build()
    }
    factory<NotesTableDao> {
        get<AppDatabase>().getMyDao()
    }
    factory {
        AddNotesViewModel(get(), get(), get())
    }
    factory {
        AddNoteUseCase(get())
    }
    factory<NotesRepository> {
        NotesRepositoryImpl(get())
    }
    factory {
        NotesListViewModel(get())
    }
    factory {
        GetNotesUseCase(get())
    }
    factory {
        GetNoteById(get())
    }

}