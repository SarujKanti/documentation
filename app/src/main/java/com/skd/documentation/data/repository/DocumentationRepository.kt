package com.skd.documentation.data.repository

import com.skd.documentation.R
import com.skd.documentation.data.model.WordContentItem
import com.skd.documentation.data.model.WordDocPage

class DocumentationRepository {

    fun getDocumentation(): List<WordDocPage> {
        return listOf(

            WordDocPage(
                title = "Home Tab",
                description = "The Home tab contains basic formatting tools.",
                steps = listOf(
                    "Change font size",
                    "Apply bold or italic",
                    "Align text"
                ),
                content = listOf(
                    WordContentItem.Text("The Home tab contains basic formatting tools."),
                    WordContentItem.Image(R.drawable.home_tab),

                    WordContentItem.Text("Use font options to customize text appearance."),
                    WordContentItem.Image(R.drawable.insert_tab),

                    WordContentItem.Text("Alignment tools help organize content."),
                    WordContentItem.Image(R.drawable.home_tab),

                    WordContentItem.Text("The Home tab contains basic formatting tools."),
                    WordContentItem.Image(R.drawable.home_tab),

                    WordContentItem.Text("Use font options to customize text appearance."),
                    WordContentItem.Image(R.drawable.insert_tab),

                    WordContentItem.Text("Alignment tools help organize content."),
                    WordContentItem.Image(R.drawable.home_tab)
                )
            ),

            // 🔹 Insert Tab
            WordDocPage(
                title = "Insert Tab",
                description = "Insert objects into the document.",
                steps = listOf(
                    "Insert images",
                    "Add tables",
                    "Insert headers"
                ),
                content = listOf(
                    WordContentItem.Text("Insert different types of objects into your document."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            ),

            // 🔹 Layout Tab
            WordDocPage(
                title = "Layout Tab",
                description = "Used to control page layout and arrangement.",
                steps = listOf(
                    "Set page margins",
                    "Change orientation",
                    "Adjust spacing"
                ),
                content = listOf(
                    WordContentItem.Text("Control the layout and structure of pages."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            ),

            // 🔹 References Tab
            WordDocPage(
                title = "References Tab",
                description = "Manage citations, footnotes, and table of contents.",
                steps = listOf(
                    "Add citations",
                    "Insert footnotes",
                    "Create table of contents"
                ),
                content = listOf(
                    WordContentItem.Text("Manage references and citations efficiently."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            ),

            // 🔹 Mailings Tab
            WordDocPage(
                title = "Mailings Tab",
                description = "Used for creating mail merge documents.",
                steps = listOf(
                    "Start mail merge",
                    "Select recipients",
                    "Insert merge fields"
                ),
                content = listOf(
                    WordContentItem.Text("Create personalized documents using mail merge."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            ),

            // 🔹 Review Tab
            WordDocPage(
                title = "Review Tab",
                description = "Provides tools for reviewing and proofing documents.",
                steps = listOf(
                    "Check spelling",
                    "Add comments",
                    "Track changes"
                ),
                content = listOf(
                    WordContentItem.Text("Control how your document is displayed."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            ),

            // 🔹 View Tab
            WordDocPage(
                title = "View Tab",
                description = "Controls document views and zoom levels.",
                steps = listOf(
                    "Switch view modes",
                    "Zoom in or out",
                    "Arrange windows"
                ),
                content = listOf(
                    WordContentItem.Text("Control how your document is displayed."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            ),

            // 🔹 Design Tab
            WordDocPage(
                title = "Design Tab",
                description = "Apply themes and document formatting styles.",
                steps = listOf(
                    "Apply themes",
                    "Change colors",
                    "Adjust fonts"
                ),
                content = listOf(
                    WordContentItem.Text("Control how your document is displayed."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            ),

            // 🔹 Draw Tab
            WordDocPage(
                title = "Draw Tab",
                description = "Use drawing tools and ink features.",
                steps = listOf(
                    "Draw with pen",
                    "Highlight text",
                    "Convert ink to text"
                ),
                content = listOf(
                    WordContentItem.Text("Control how your document is displayed."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            ),

            // 🔹 Help Tab
            WordDocPage(
                title = "Help Tab",
                description = "Get help and support for Word features.",
                steps = listOf(
                    "Search help topics",
                    "Contact support",
                    "View tutorials"
                ),
                content = listOf(
                    WordContentItem.Text("Control how your document is displayed."),
                    WordContentItem.Image(R.drawable.insert_tab)
                )
            )
        )
    }
}