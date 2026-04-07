package com.skd.documentation.data.repository

import com.skd.documentation.R
import com.skd.documentation.data.model.WordContentItem
import com.skd.documentation.data.model.WordDocPage

class DocumentationRepository {

    fun getDocumentation(): List<WordDocPage> {
        return listOf(

            // ─── MS Office Overview Tab ───────────────────────────────────────
            WordDocPage(
                title = "MS Office",
                description = "Complete overview of Microsoft Office suite and its applications.",
                steps = listOf(
                    "Choose the right Office app for your task",
                    "Use Word for documents, Excel for data, PowerPoint for presentations",
                    "Collaborate using OneDrive and Microsoft 365"
                ),
                content = listOf(

                    WordContentItem.Heading("What is Microsoft Office?"),
                    WordContentItem.Text(
                        "Microsoft Office is a suite of productivity applications developed by Microsoft. " +
                        "It includes tools for word processing, spreadsheets, presentations, email, " +
                        "database management, and more. It is available as Microsoft 365 (cloud-based subscription) " +
                        "or as a one-time purchase (Office 2021/2019)."
                    ),

                    WordContentItem.Divider(),

                    // ── Microsoft Word ──────────────────────────────────────────
                    WordContentItem.Heading("Microsoft Word"),
                    WordContentItem.Text(
                        "Word is a word processing application used to create, edit, and format text documents " +
                        "such as letters, reports, resumes, and books."
                    ),
                    WordContentItem.BulletPoint("Create professional documents with rich formatting"),
                    WordContentItem.BulletPoint("Insert images, tables, charts, and hyperlinks"),
                    WordContentItem.BulletPoint("Use mail merge to send bulk personalized letters"),
                    WordContentItem.BulletPoint("Track changes and add comments for collaboration"),
                    WordContentItem.BulletPoint("Export documents to PDF format"),
                    WordContentItem.BulletPoint("Use templates for resumes, letters, and reports"),
                    WordContentItem.Text(
                        "Key Tabs: Home, Insert, Design, Layout, References, Mailings, Review, View, Draw, Help."
                    ),

                    WordContentItem.Divider(),

                    // ── Microsoft Excel ─────────────────────────────────────────
                    WordContentItem.Heading("Microsoft Excel"),
                    WordContentItem.Text(
                        "Excel is a spreadsheet application used for data organization, analysis, " +
                        "calculations, and visualization through charts and graphs."
                    ),
                    WordContentItem.BulletPoint("Organize data in rows and columns (cells)"),
                    WordContentItem.BulletPoint("Use formulas: SUM, AVERAGE, VLOOKUP, IF, COUNTIF, etc."),
                    WordContentItem.BulletPoint("Create charts: Bar, Pie, Line, Scatter, and more"),
                    WordContentItem.BulletPoint("Use Pivot Tables to summarize large datasets"),
                    WordContentItem.BulletPoint("Apply conditional formatting to highlight important data"),
                    WordContentItem.BulletPoint("Use macros and VBA for automation"),
                    WordContentItem.BulletPoint("Protect sheets and workbooks with passwords"),
                    WordContentItem.Text(
                        "Key Tabs: Home, Insert, Page Layout, Formulas, Data, Review, View, Automate."
                    ),

                    WordContentItem.Divider(),

                    // ── Microsoft PowerPoint ────────────────────────────────────
                    WordContentItem.Heading("Microsoft PowerPoint"),
                    WordContentItem.Text(
                        "PowerPoint is a presentation application used to create slide-based visual " +
                        "presentations for business, education, and training purposes."
                    ),
                    WordContentItem.BulletPoint("Create slides with text, images, charts, and videos"),
                    WordContentItem.BulletPoint("Apply themes and design templates for professional look"),
                    WordContentItem.BulletPoint("Add slide transitions and animations"),
                    WordContentItem.BulletPoint("Use Slide Master to maintain consistent design"),
                    WordContentItem.BulletPoint("Rehearse timings and record narration"),
                    WordContentItem.BulletPoint("Present in Presenter View with speaker notes"),
                    WordContentItem.BulletPoint("Export as PDF, video, or image files"),
                    WordContentItem.Text(
                        "Key Tabs: Home, Insert, Draw, Design, Transitions, Animations, Slide Show, Review, View."
                    ),

                    WordContentItem.Divider(),

                    // ── Microsoft Outlook ───────────────────────────────────────
                    WordContentItem.Heading("Microsoft Outlook"),
                    WordContentItem.Text(
                        "Outlook is an email and personal information manager used for sending/receiving emails, " +
                        "managing calendars, contacts, and tasks."
                    ),
                    WordContentItem.BulletPoint("Send, receive, and organize emails with folders and rules"),
                    WordContentItem.BulletPoint("Schedule meetings and appointments using the Calendar"),
                    WordContentItem.BulletPoint("Manage contacts and create contact groups"),
                    WordContentItem.BulletPoint("Set reminders and manage daily tasks"),
                    WordContentItem.BulletPoint("Use Focused Inbox to prioritize important emails"),
                    WordContentItem.BulletPoint("Connect to Exchange, Gmail, and IMAP/POP3 accounts"),
                    WordContentItem.Text(
                        "Key Features: Mail, Calendar, People (Contacts), Tasks, Notes."
                    ),

                    WordContentItem.Divider(),

                    // ── Microsoft OneNote ───────────────────────────────────────
                    WordContentItem.Heading("Microsoft OneNote"),
                    WordContentItem.Text(
                        "OneNote is a digital notebook for capturing and organizing notes, ideas, " +
                        "sketches, and web clips in a free-form canvas."
                    ),
                    WordContentItem.BulletPoint("Create notebooks, sections, and pages for organization"),
                    WordContentItem.BulletPoint("Type, draw, or record audio notes"),
                    WordContentItem.BulletPoint("Clip web pages and save images"),
                    WordContentItem.BulletPoint("Share notebooks for real-time collaboration"),
                    WordContentItem.BulletPoint("Search handwritten and typed text"),

                    WordContentItem.Divider(),

                    // ── Microsoft Access ────────────────────────────────────────
                    WordContentItem.Heading("Microsoft Access"),
                    WordContentItem.Text(
                        "Access is a database management system for creating and managing relational databases, " +
                        "forms, queries, and reports."
                    ),
                    WordContentItem.BulletPoint("Create tables to store structured data"),
                    WordContentItem.BulletPoint("Design queries using SQL or Query Designer"),
                    WordContentItem.BulletPoint("Build user-friendly forms for data entry"),
                    WordContentItem.BulletPoint("Generate printable reports from database data"),
                    WordContentItem.BulletPoint("Link tables with relationships for relational data"),

                    WordContentItem.Divider(),

                    // ── Microsoft Publisher ─────────────────────────────────────
                    WordContentItem.Heading("Microsoft Publisher"),
                    WordContentItem.Text(
                        "Publisher is a desktop publishing application for creating visually rich " +
                        "publications like brochures, flyers, newsletters, and business cards."
                    ),
                    WordContentItem.BulletPoint("Design brochures, flyers, and newsletters"),
                    WordContentItem.BulletPoint("Use pre-built templates for quick design"),
                    WordContentItem.BulletPoint("Precisely position text boxes and images"),
                    WordContentItem.BulletPoint("Export designs to PDF for professional printing"),

                    WordContentItem.Divider(),

                    // ── Microsoft Teams ─────────────────────────────────────────
                    WordContentItem.Heading("Microsoft Teams"),
                    WordContentItem.Text(
                        "Teams is a collaboration and communication platform that integrates chat, " +
                        "video meetings, file sharing, and Office apps in one place."
                    ),
                    WordContentItem.BulletPoint("Chat with individuals or groups in channels"),
                    WordContentItem.BulletPoint("Host and join video/audio meetings"),
                    WordContentItem.BulletPoint("Share and collaborate on Office files in real-time"),
                    WordContentItem.BulletPoint("Integrate with third-party apps and tools"),
                    WordContentItem.BulletPoint("Use Teams for remote work and hybrid collaboration"),

                    WordContentItem.Divider(),

                    // ── OneDrive ────────────────────────────────────────────────
                    WordContentItem.Heading("OneDrive (Cloud Storage)"),
                    WordContentItem.Text(
                        "OneDrive is Microsoft's cloud storage service for saving and syncing files " +
                        "across devices and sharing with others."
                    ),
                    WordContentItem.BulletPoint("Store files securely in the cloud (5 GB free / 1 TB with M365)"),
                    WordContentItem.BulletPoint("Access files from any device: PC, phone, or tablet"),
                    WordContentItem.BulletPoint("Share files and folders with view or edit permissions"),
                    WordContentItem.BulletPoint("Auto-save Office documents in real-time"),
                    WordContentItem.BulletPoint("Restore deleted files from Recycle Bin"),

                    WordContentItem.Divider(),

                    // ── Microsoft 365 Plans ─────────────────────────────────────
                    WordContentItem.Heading("Microsoft 365 Plans"),
                    WordContentItem.Text(
                        "Microsoft 365 (formerly Office 365) is the cloud-based subscription that provides " +
                        "always-updated Office apps plus extra services."
                    ),
                    WordContentItem.BulletPoint("Personal — For 1 user, 1 TB OneDrive, all Office apps"),
                    WordContentItem.BulletPoint("Family — Up to 6 users, each with 1 TB OneDrive"),
                    WordContentItem.BulletPoint("Business Basic — Web and mobile apps + Teams + 1 TB storage"),
                    WordContentItem.BulletPoint("Business Standard — All apps + desktop versions + advanced features"),
                    WordContentItem.BulletPoint("Enterprise (E3/E5) — Advanced security, compliance, analytics"),

                    WordContentItem.Divider(),

                    // ── Tips ────────────────────────────────────────────────────
                    WordContentItem.Heading("Pro Tips for MS Office"),
                    WordContentItem.BulletPoint("Use Ctrl + Z to undo and Ctrl + Y to redo in all apps"),
                    WordContentItem.BulletPoint("Press F12 to open Save As dialog in any Office app"),
                    WordContentItem.BulletPoint("Use Tell Me (Alt + Q) to quickly find any feature"),
                    WordContentItem.BulletPoint("Enable AutoSave when working on OneDrive files"),
                    WordContentItem.BulletPoint("Use Smart Lookup (right-click > Search) to research in-app"),
                    WordContentItem.BulletPoint("Customize the Quick Access Toolbar for frequent actions"),
                )
            ),

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