package com.skd.documentation.data.model

sealed class WordContentItem {
    data class Text(val value: String) : WordContentItem()
    data class Image(val resId: Int) : WordContentItem()
}