package com.skd.documentation.data.model

data class BookSection(
    val tabName: String,
    val tabIcon: Int,
    val levelTag: String = "All Levels",
    val content: List<ContentItem>
)
