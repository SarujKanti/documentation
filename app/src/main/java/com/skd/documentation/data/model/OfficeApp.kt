package com.skd.documentation.data.model

data class OfficeApp(
    val appName: String,
    val appIcon: Int,
    val primaryColor: Long,
    val sections: List<BookSection>
)
