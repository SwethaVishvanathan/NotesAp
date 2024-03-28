package com.example.notesapp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notesapp.domain.GetNotesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NotesListViewModel(
    private val getNotesUseCase: GetNotesUseCase
) :ViewModel() {

    private val _state = MutableStateFlow<List<NotesData>>(emptyList())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            getNotesUseCase().collectLatest { list ->
                _state.update {
                    list
                }
            }
        }
    }


}