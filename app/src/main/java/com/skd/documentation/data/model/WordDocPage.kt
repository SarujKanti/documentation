package com.skd.documentation.data.model

data class WordDocPage(
    val title: String,
    val description: String,
    val steps: List<String>,
    val content: List<WordContentItem>
)