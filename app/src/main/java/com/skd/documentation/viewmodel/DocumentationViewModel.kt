package com.skd.documentation.viewmodel

import androidx.lifecycle.ViewModel
import com.skd.documentation.data.model.OfficeApp
import com.skd.documentation.data.repository.DocumentationRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DocumentationViewModel : ViewModel() {

    private val repository = DocumentationRepository()

    private val _apps = MutableStateFlow(repository.getAllApps())
    val apps: StateFlow<List<OfficeApp>> = _apps


    private val _selectedAppIndex = MutableStateFlow(0)
    val selectedAppIndex: StateFlow<Int> = _selectedAppIndex

    fun selectApp(index: Int) {
        _selectedAppIndex.value = index
    }
}
