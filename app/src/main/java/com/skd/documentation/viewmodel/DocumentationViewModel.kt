package com.skd.documentation.viewmodel

import androidx.lifecycle.ViewModel
import com.skd.documentation.data.repository.DocumentationRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DocumentationViewModel : ViewModel() {

    private val repository = DocumentationRepository()

    private val _pages = MutableStateFlow(repository.getDocumentation())
    val pages: StateFlow<List<com.skd.documentation.data.model.WordDocPage>> = _pages
}