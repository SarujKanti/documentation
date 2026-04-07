package com.skd.documentation.data.model

sealed class ContentItem {
    data class ChapterHeader(val title: String, val subtitle: String = "") : ContentItem()
    data class SectionHeading(val text: String) : ContentItem()
    data class SubHeading(val text: String) : ContentItem()
    data class BodyText(val text: String) : ContentItem()
    data class NumberedStep(val number: Int, val title: String, val body: String = "") : ContentItem()
    data class BulletItem(val text: String, val level: Int = 0) : ContentItem()
    data class ScreenshotItem(val stepTitle: String, val caption: String) : ContentItem()
    data class TipBox(val text: String) : ContentItem()
    data class NoteBox(val text: String) : ContentItem()
    data class WarningBox(val text: String) : ContentItem()
    data class KeyShortcut(val keys: String, val action: String) : ContentItem()
    data class FormulaItem(val formula: String, val description: String) : ContentItem()
    object SectionDivider : ContentItem()
}
