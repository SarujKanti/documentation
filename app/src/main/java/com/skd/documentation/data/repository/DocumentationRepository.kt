package com.skd.documentation.data.repository

import com.skd.documentation.R
import com.skd.documentation.data.model.BookSection
import com.skd.documentation.data.model.ContentItem
import com.skd.documentation.data.model.OfficeApp

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
                    WordContentItem.Heading("Microsoft Word"),
                    WordContentItem.Text("Word is a word processing application used to create, edit, and format text documents such as letters, reports, resumes, and books."),
                    WordContentItem.BulletPoint("Create professional documents with rich formatting"),
                    WordContentItem.BulletPoint("Insert images, tables, charts, and hyperlinks"),
                    WordContentItem.BulletPoint("Use mail merge to send bulk personalized letters"),
                    WordContentItem.BulletPoint("Track changes and add comments for collaboration"),
                    WordContentItem.BulletPoint("Export documents to PDF format"),
                    WordContentItem.BulletPoint("Use templates for resumes, letters, and reports"),
                    WordContentItem.Text("Key Tabs: Home, Insert, Design, Layout, References, Mailings, Review, View, Draw, Help."),
                    WordContentItem.Divider(),
                    WordContentItem.Heading("Microsoft Excel"),
                    WordContentItem.Text("Excel is a spreadsheet application used for data organization, analysis, calculations, and visualization through charts and graphs."),
                    WordContentItem.BulletPoint("Organize data in rows and columns (cells)"),
                    WordContentItem.BulletPoint("Use formulas: SUM, AVERAGE, VLOOKUP, IF, COUNTIF, etc."),
                    WordContentItem.BulletPoint("Create charts: Bar, Pie, Line, Scatter, and more"),
                    WordContentItem.BulletPoint("Use Pivot Tables to summarize large datasets"),
                    WordContentItem.BulletPoint("Apply conditional formatting to highlight important data"),
                    WordContentItem.BulletPoint("Use macros and VBA for automation"),
                    WordContentItem.BulletPoint("Protect sheets and workbooks with passwords"),
                    WordContentItem.Text("Key Tabs: Home, Insert, Page Layout, Formulas, Data, Review, View, Automate."),
                    WordContentItem.Divider(),
                    WordContentItem.Heading("Microsoft PowerPoint"),
                    WordContentItem.Text("PowerPoint is a presentation application used to create slide-based visual presentations for business, education, and training purposes."),
                    WordContentItem.BulletPoint("Create slides with text, images, charts, and videos"),
                    WordContentItem.BulletPoint("Apply themes and design templates for professional look"),
                    WordContentItem.BulletPoint("Add slide transitions and animations"),
                    WordContentItem.BulletPoint("Use Slide Master to maintain consistent design"),
                    WordContentItem.BulletPoint("Rehearse timings and record narration"),
                    WordContentItem.BulletPoint("Present in Presenter View with speaker notes"),
                    WordContentItem.BulletPoint("Export as PDF, video, or image files"),
                    WordContentItem.Divider(),
                    WordContentItem.Heading("Microsoft Outlook"),
                    WordContentItem.Text("Outlook is an email and personal information manager used for sending/receiving emails, managing calendars, contacts, and tasks."),
                    WordContentItem.BulletPoint("Send, receive, and organize emails with folders and rules"),
                    WordContentItem.BulletPoint("Schedule meetings and appointments using the Calendar"),
                    WordContentItem.BulletPoint("Manage contacts and create contact groups"),
                    WordContentItem.BulletPoint("Set reminders and manage daily tasks"),
                    WordContentItem.BulletPoint("Use Focused Inbox to prioritize important emails"),
                    WordContentItem.BulletPoint("Connect to Exchange, Gmail, and IMAP/POP3 accounts"),
                    WordContentItem.Divider(),
                    WordContentItem.Heading("Microsoft OneNote"),
                    WordContentItem.Text("OneNote is a digital notebook for capturing and organizing notes, ideas, sketches, and web clips in a free-form canvas."),
                    WordContentItem.BulletPoint("Create notebooks, sections, and pages for organization"),
                    WordContentItem.BulletPoint("Type, draw, or record audio notes"),
                    WordContentItem.BulletPoint("Clip web pages and save images"),
                    WordContentItem.BulletPoint("Share notebooks for real-time collaboration"),
                    WordContentItem.BulletPoint("Search handwritten and typed text"),
                    WordContentItem.Divider(),
                    WordContentItem.Heading("Microsoft Teams"),
                    WordContentItem.Text("Teams is a collaboration and communication platform that integrates chat, video meetings, file sharing, and Office apps in one place."),
                    WordContentItem.BulletPoint("Chat with individuals or groups in channels"),
                    WordContentItem.BulletPoint("Host and join video/audio meetings"),
                    WordContentItem.BulletPoint("Share and collaborate on Office files in real-time"),
                    WordContentItem.BulletPoint("Integrate with third-party apps and tools"),
                    WordContentItem.Divider(),
                    WordContentItem.Heading("OneDrive (Cloud Storage)"),
                    WordContentItem.Text("OneDrive is Microsoft's cloud storage service for saving and syncing files across devices and sharing with others."),
                    WordContentItem.BulletPoint("Store files securely in the cloud (5 GB free / 1 TB with M365)"),
                    WordContentItem.BulletPoint("Access files from any device: PC, phone, or tablet"),
                    WordContentItem.BulletPoint("Share files and folders with view or edit permissions"),
                    WordContentItem.BulletPoint("Auto-save Office documents in real-time"),
                    WordContentItem.Divider(),
                    WordContentItem.Heading("Microsoft 365 Plans"),
                    WordContentItem.BulletPoint("Personal — For 1 user, 1 TB OneDrive, all Office apps"),
                    WordContentItem.BulletPoint("Family — Up to 6 users, each with 1 TB OneDrive"),
                    WordContentItem.BulletPoint("Business Basic — Web and mobile apps + Teams + 1 TB storage"),
                    WordContentItem.BulletPoint("Business Standard — All apps + desktop versions + advanced features"),
                    WordContentItem.BulletPoint("Enterprise (E3/E5) — Advanced security, compliance, analytics"),
                    WordContentItem.Divider(),
                    WordContentItem.Heading("Pro Tips for MS Office"),
                    WordContentItem.BulletPoint("Use Ctrl + Z to undo and Ctrl + Y to redo in all apps"),
                    WordContentItem.BulletPoint("Press F12 to open Save As dialog in any Office app"),
                    WordContentItem.BulletPoint("Use Tell Me (Alt + Q) to quickly find any feature"),
                    WordContentItem.BulletPoint("Enable AutoSave when working on OneDrive files"),
                    WordContentItem.BulletPoint("Use Smart Lookup (right-click > Search) to research in-app"),
                    WordContentItem.BulletPoint("Customize the Quick Access Toolbar for frequent actions"),
                )
            ),

            // ─── Home Tab ─────────────────────────────────────────────────────
            WordDocPage(
                title = "Home Tab",
                description = "Master all Home tab tools from basic formatting to advanced styles.",
                steps = listOf(
                    "Open Word → click the Home tab",
                    "Select text → apply formatting from the ribbon",
                    "Use Styles for consistent document-wide formatting"
                ),
                content = listOf(

                    // BEGINNER
                    WordContentItem.Heading("Beginner — Getting Started"),
                    WordContentItem.Text(
                        "The Home tab is the first tab you see when you open Microsoft Word. " +
                        "It contains all the essential tools for typing and basic formatting. " +
                        "Every document you create starts here."
                    ),
                    WordContentItem.Image(R.drawable.home_tab),
                    WordContentItem.Text("Use font options to customize text appearance."),
                    WordContentItem.Image(R.drawable.insert_tab),
                    WordContentItem.Text("Alignment tools help organize content."),
                    WordContentItem.Image(R.drawable.home_tab),
                    WordContentItem.Text("The Home tab contains basic formatting tools."),
                    WordContentItem.Image(R.drawable.home_tab),

                    WordContentItem.Heading("Step 11 — Paragraph Borders and Shading"),
                    WordContentItem.BulletPoint("Select a paragraph or text"),
                    WordContentItem.BulletPoint("Click the Borders dropdown arrow in the Paragraph group"),
                    WordContentItem.BulletPoint("Choose a border style (Bottom, Box, All, etc.)"),
                    WordContentItem.BulletPoint("Click 'Borders and Shading...' for full control over color and width"),
                    WordContentItem.BulletPoint("Use the Shading tab to add background color to a paragraph"),

                    WordContentItem.Heading("Step 12 — Keyboard Shortcuts Summary"),
                    WordContentItem.BulletPoint("Ctrl + A — Select All text in document"),
                    WordContentItem.BulletPoint("Ctrl + B / I / U — Bold / Italic / Underline"),
                    WordContentItem.BulletPoint("Ctrl + Z / Y — Undo / Redo"),
                    WordContentItem.BulletPoint("Ctrl + C / X / V — Copy / Cut / Paste"),
                    WordContentItem.BulletPoint("Ctrl + L / E / R / J — Left / Center / Right / Justify align"),
                    WordContentItem.BulletPoint("Ctrl + 1 / 2 / 5 — Single / Double / 1.5 line spacing"),
                    WordContentItem.BulletPoint("Ctrl + D — Open Font dialog box"),
                    WordContentItem.BulletPoint("Ctrl + Shift + > / < — Increase / Decrease font size"),
                    WordContentItem.Image(R.drawable.insert_tab),
                )
            ),

            // ─── Insert Tab ───────────────────────────────────────────────────
            WordDocPage(
                title = "Insert Tab",
                description = "Learn to insert every type of object into Word documents professionally.",
                steps = listOf(
                    "Click Insert tab in the ribbon",
                    "Choose the type of object to insert",
                    "Customize size and position after inserting"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the Insert Tab?"),
                    WordContentItem.Text(
                        "The Insert tab lets you add objects beyond plain text — tables, images, charts, " +
                        "links, headers, footers, page numbers, shapes, and more. It is the most feature-rich tab in Word."
                    ),
                    WordContentItem.Image(R.drawable.insert_tab),

                    WordContentItem.Heading("Step 1 — Insert a Table"),
                    WordContentItem.BulletPoint("Click Insert → Table"),
                    WordContentItem.BulletPoint("Hover over the grid to select the number of rows and columns"),
                    WordContentItem.BulletPoint("Click to insert the table at the cursor position"),
                    WordContentItem.BulletPoint("Or click 'Insert Table...' to enter exact dimensions"),
                    WordContentItem.BulletPoint("Use 'Draw Table' to draw rows and columns manually"),
                    WordContentItem.BulletPoint("Use 'Quick Tables' for pre-built calendar and list table styles"),
                    WordContentItem.Text("After inserting: Use the Table Design and Layout tabs (appear when inside a table) to style, merge cells, and adjust borders."),
                    WordContentItem.Image(R.drawable.insert_tab),

                    WordContentItem.Heading("Step 2 — Insert Pictures"),
                    WordContentItem.BulletPoint("Click Insert → Pictures"),
                    WordContentItem.BulletPoint("'This Device' — Browse your computer for a local image file"),
                    WordContentItem.BulletPoint("'Stock Images' — Access Microsoft's royalty-free image library"),
                    WordContentItem.BulletPoint("'Online Pictures' — Search Bing for images (check licensing)"),
                    WordContentItem.BulletPoint("After inserting: Drag corners to resize. Click 'Wrap Text' to control how text flows around the image"),
                    WordContentItem.BulletPoint("Right-click the image → 'Format Picture' for advanced adjustments (brightness, contrast, crop, artistic effects)"),
                    WordContentItem.Image(R.drawable.insert_tab),

                    WordContentItem.Heading("Step 3 — Insert Shapes"),
                    WordContentItem.BulletPoint("Click Insert → Shapes"),
                    WordContentItem.BulletPoint("Choose from Lines, Rectangles, Circles, Arrows, Stars, Callouts, etc."),
                    WordContentItem.BulletPoint("Click and drag on the document to draw the shape"),
                    WordContentItem.BulletPoint("Hold Shift while drawing to make perfect circles or squares"),
                    WordContentItem.BulletPoint("Right-click a shape → 'Add Text' to type inside it"),
                    WordContentItem.BulletPoint("Use the Shape Format tab to change fill color, outline, and effects"),

                    WordContentItem.Heading("Step 4 — Insert SmartArt"),
                    WordContentItem.BulletPoint("Click Insert → SmartArt"),
                    WordContentItem.BulletPoint("Choose a category: List, Process, Cycle, Hierarchy, Relationship, Matrix, Pyramid"),
                    WordContentItem.BulletPoint("Click a design → click OK"),
                    WordContentItem.BulletPoint("Type text in the text pane on the left or directly in the shapes"),
                    WordContentItem.BulletPoint("Use the SmartArt Design tab to change layout, add shapes, or change colors"),
                    WordContentItem.Text("Best uses: Org charts (Hierarchy), step-by-step flows (Process), comparisons (List)."),
                    WordContentItem.Image(R.drawable.insert_tab),

                    WordContentItem.Heading("Step 5 — Insert Charts"),
                    WordContentItem.BulletPoint("Click Insert → Chart"),
                    WordContentItem.BulletPoint("Select chart type: Bar, Line, Pie, Area, Scatter, Combo, etc."),
                    WordContentItem.BulletPoint("Click OK — an Excel-like spreadsheet opens to enter your data"),
                    WordContentItem.BulletPoint("Edit data in the grid — the chart updates in real-time"),
                    WordContentItem.BulletPoint("Close the data window when done"),
                    WordContentItem.BulletPoint("Use the Chart Design and Format tabs to style the chart"),

                    WordContentItem.Heading("Step 6 — Insert Screenshot"),
                    WordContentItem.BulletPoint("Click Insert → Screenshot"),
                    WordContentItem.BulletPoint("'Available Windows' — Click any open window to insert a screenshot of it"),
                    WordContentItem.BulletPoint("'Screen Clipping' — Drag to select a specific area of your screen"),
                    WordContentItem.Text("Use case: Insert a screenshot of software or a web page directly into your Word document without saving an image file."),

                    WordContentItem.Heading("Step 7 — Headers and Footers"),
                    WordContentItem.BulletPoint("Click Insert → Header (or Footer)"),
                    WordContentItem.BulletPoint("Choose a built-in design (Blank, Banded, Retrospect, etc.)"),
                    WordContentItem.BulletPoint("Type your content (document title, company name, date, etc.)"),
                    WordContentItem.BulletPoint("Check 'Different First Page' to have a unique first page header"),
                    WordContentItem.BulletPoint("Check 'Different Odd & Even Pages' for book-style layouts"),
                    WordContentItem.BulletPoint("Click 'Close Header and Footer' or press Esc when done"),
                    WordContentItem.Image(R.drawable.home_tab),

                    WordContentItem.Heading("Step 8 — Insert Page Numbers"),
                    WordContentItem.BulletPoint("Click Insert → Page Number"),
                    WordContentItem.BulletPoint("Choose position: Top of Page, Bottom of Page, Page Margins, or Current Position"),
                    WordContentItem.BulletPoint("Select an alignment style (Left, Center, Right, Bold Numbers, etc.)"),
                    WordContentItem.BulletPoint("To start numbering from a specific number: Insert → Page Number → Format Page Numbers → Start at: [number]"),
                    WordContentItem.BulletPoint("To remove page numbers: Insert → Page Number → Remove Page Numbers"),

                    WordContentItem.Heading("Step 9 — Text Box"),
                    WordContentItem.BulletPoint("Click Insert → Text Box"),
                    WordContentItem.BulletPoint("Choose a built-in style (Simple, Austin, Banded, etc.) or 'Draw Text Box'"),
                    WordContentItem.BulletPoint("Click and drag to draw the box anywhere on the page"),
                    WordContentItem.BulletPoint("Type your text inside the box"),
                    WordContentItem.BulletPoint("Drag the box to reposition it freely on the page"),
                    WordContentItem.Text("Use text boxes for sidebars, callouts, or placing text outside the main document flow."),

                    WordContentItem.Heading("Step 10 — WordArt"),
                    WordContentItem.BulletPoint("Click Insert → WordArt"),
                    WordContentItem.BulletPoint("Choose a decorative style from the gallery"),
                    WordContentItem.BulletPoint("Type your text in the box that appears"),
                    WordContentItem.BulletPoint("Use the Shape Format tab to change fill, outline, text effects, and 3D effects"),
                    WordContentItem.BulletPoint("Drag to reposition — use Transform effect for curved or arched text"),

                    WordContentItem.Heading("Step 11 — Hyperlinks and Bookmarks"),
                    WordContentItem.BulletPoint("Hyperlink: Select text → Insert → Link → type or paste URL → OK"),
                    WordContentItem.BulletPoint("Or press Ctrl + K to open the Insert Hyperlink dialog"),
                    WordContentItem.BulletPoint("Link to a Bookmark: First create a Bookmark (Insert → Bookmark → name it → Add)"),
                    WordContentItem.BulletPoint("Then create a hyperlink and select 'Place in This Document' → choose the bookmark"),
                    WordContentItem.BulletPoint("Ctrl + Click on any hyperlink to follow it"),
                    WordContentItem.Image(R.drawable.insert_tab),

                    WordContentItem.Heading("Step 12 — Equations and Symbols"),
                    WordContentItem.BulletPoint("Equation: Insert → Equation → choose a built-in (Pythagorean, Quadratic, etc.) or insert a new one"),
                    WordContentItem.BulletPoint("Use the Equation tab to add fractions, radicals, integrals, matrices, etc."),
                    WordContentItem.BulletPoint("Symbol: Insert → Symbol → More Symbols... → choose from character sets"),
                    WordContentItem.BulletPoint("Common symbols: © (copyright), ® (registered), ™ (trademark), ° (degree), ± (plus-minus)"),
                    WordContentItem.BulletPoint("Use the Special Characters tab for en dash, em dash, nonbreaking space, etc."),
                )
            ),

            // ─── Design Tab ───────────────────────────────────────────────────
            WordDocPage(
                title = "Design Tab",
                description = "Apply themes, colors, fonts, and page styling for a professional look.",
                steps = listOf(
                    "Click the Design tab in the ribbon",
                    "Choose a Theme for overall document styling",
                    "Customize colors, fonts, and spacing to match your brand"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the Design Tab?"),
                    WordContentItem.Text(
                        "The Design tab controls the visual appearance of the entire document. " +
                        "It lets you apply themes, change color palettes, choose font sets, " +
                        "set paragraph spacing styles, and add page backgrounds and borders."
                    ),
                    WordContentItem.Image(R.drawable.design_tab),

                    WordContentItem.Heading("Step 1 — Apply a Document Theme"),
                    WordContentItem.BulletPoint("Click the Design tab"),
                    WordContentItem.BulletPoint("In the Document Formatting group, hover over any theme in the Themes gallery"),
                    WordContentItem.BulletPoint("A live preview shows how the theme affects headings, body text, and colors"),
                    WordContentItem.BulletPoint("Click a theme to apply it to the whole document"),
                    WordContentItem.BulletPoint("Each theme includes coordinated fonts and colors"),
                    WordContentItem.Text("Popular themes: Office, Facet, Ion, Metropolitan, Retrospect, Slice, Wisp."),
                    WordContentItem.Image(R.drawable.design_tab),

                    WordContentItem.Heading("Step 2 — Change Color Palette"),
                    WordContentItem.BulletPoint("Click Design → Colors"),
                    WordContentItem.BulletPoint("Hover over color sets to preview them on your document"),
                    WordContentItem.BulletPoint("Click a color set to apply it (e.g., Blue Warm, Green, Red Orange)"),
                    WordContentItem.BulletPoint("Click 'Customize Colors...' to create your own color palette"),
                    WordContentItem.BulletPoint("In the custom dialog, set Accent 1–6 colors plus hyperlink colors"),
                    WordContentItem.BulletPoint("Name your custom palette and click Save"),
                    WordContentItem.Text("The color palette affects all heading colors, table colors, SmartArt, and chart colors across the document."),

                    WordContentItem.Heading("Step 3 — Change Font Set"),
                    WordContentItem.BulletPoint("Click Design → Fonts"),
                    WordContentItem.BulletPoint("Each font set shows Heading font + Body font pairing"),
                    WordContentItem.BulletPoint("Hover to preview, click to apply"),
                    WordContentItem.BulletPoint("Click 'Customize Fonts...' to choose your own heading and body fonts"),
                    WordContentItem.BulletPoint("Example professional pairings: Garamond + Garamond, Georgia + Verdana, Cambria + Calibri"),
                    WordContentItem.Image(R.drawable.design_tab),

                    WordContentItem.Heading("Step 4 — Paragraph Spacing Presets"),
                    WordContentItem.BulletPoint("Click Design → Paragraph Spacing"),
                    WordContentItem.BulletPoint("Choose from: Compact, Tight, Open, Relaxed, Double, No Paragraph Space"),
                    WordContentItem.BulletPoint("These presets adjust both line spacing and space between paragraphs"),
                    WordContentItem.BulletPoint("'No Paragraph Space' removes all extra space between paragraphs"),
                    WordContentItem.BulletPoint("'Double' is commonly required for academic papers (APA, MLA format)"),
                    WordContentItem.Text("This is a document-wide setting — it changes spacing for all paragraphs at once."),

                    WordContentItem.Heading("Step 5 — Set as Default"),
                    WordContentItem.BulletPoint("After customizing your theme, colors, fonts, and spacing..."),
                    WordContentItem.BulletPoint("Click Design → 'Set as Default'"),
                    WordContentItem.BulletPoint("Choose to apply to this document only or all future new documents"),
                    WordContentItem.BulletPoint("This saves your preferred styling as the starting point for new documents"),
                    WordContentItem.Image(R.drawable.design_tab),

                    WordContentItem.Heading("Step 6 — Watermark"),
                    WordContentItem.BulletPoint("Click Design → Watermark"),
                    WordContentItem.BulletPoint("Choose a built-in watermark: CONFIDENTIAL, DO NOT COPY, DRAFT, URGENT, SAMPLE"),
                    WordContentItem.BulletPoint("Click 'Custom Watermark...' to create your own"),
                    WordContentItem.BulletPoint("'Text Watermark' — Type any text, set font, size, color, and angle (diagonal or horizontal)"),
                    WordContentItem.BulletPoint("'Picture Watermark' — Use a logo or image as the watermark"),
                    WordContentItem.BulletPoint("'Remove Watermark' — Removes the watermark from the document"),
                    WordContentItem.Text("Watermarks appear on every page behind your content. They print faintly to show document status."),

                    WordContentItem.Heading("Step 7 — Page Color"),
                    WordContentItem.BulletPoint("Click Design → Page Color"),
                    WordContentItem.BulletPoint("Click a color swatch to set the background color of all pages"),
                    WordContentItem.BulletPoint("Click 'More Colors...' to choose a custom color"),
                    WordContentItem.BulletPoint("Click 'Fill Effects...' for Gradient, Texture, Pattern, or Picture backgrounds"),
                    WordContentItem.Text("Note: Page Color prints only if your printer supports background printing. Enable it in File → Options → Display → 'Print background colors and images'."),
                    WordContentItem.Image(R.drawable.design_tab),

                    WordContentItem.Heading("Step 8 — Page Borders"),
                    WordContentItem.BulletPoint("Click Design → Page Borders"),
                    WordContentItem.BulletPoint("In the 'Setting' column: choose None, Box, Shadow, 3-D, or Custom"),
                    WordContentItem.BulletPoint("Choose a border style (solid, dashed, dotted, double, wavy)"),
                    WordContentItem.BulletPoint("Set color and width of the border line"),
                    WordContentItem.BulletPoint("Use 'Art' dropdown for decorative borders (stars, hearts, trees, etc.)"),
                    WordContentItem.BulletPoint("In 'Apply to' — choose 'Whole document', 'First page only', 'All except first page', or a specific section"),
                    WordContentItem.BulletPoint("Click OK to apply the border"),
                )
            ),

            // ─── Layout Tab ───────────────────────────────────────────────────
            WordDocPage(
                title = "Layout Tab",
                description = "Control page setup, margins, orientation, columns, and text flow.",
                steps = listOf(
                    "Click Layout tab in the ribbon",
                    "Adjust margins and orientation first",
                    "Use Columns and Breaks for complex document layouts"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the Layout Tab?"),
                    WordContentItem.Text(
                        "The Layout tab controls the physical structure of the page — how content is arranged, " +
                        "how much white space surrounds it, and how pages are divided. Mastering this tab is essential " +
                        "for professional document formatting."
                    ),
                    WordContentItem.Image(R.drawable.layout_tab),

                    WordContentItem.Heading("Step 1 — Page Margins"),
                    WordContentItem.BulletPoint("Click Layout → Margins"),
                    WordContentItem.BulletPoint("Choose a preset: Normal (1\" all), Narrow (0.5\" all), Wide (2\" left/right), Moderate, Mirrored"),
                    WordContentItem.BulletPoint("Click 'Custom Margins...' to set exact values for Top, Bottom, Left, Right"),
                    WordContentItem.BulletPoint("Set 'Gutter' margin for binding on the inside edge of pages"),
                    WordContentItem.BulletPoint("'Gutter position' — Left (for regular binding) or Top (for top-bound documents)"),
                    WordContentItem.Text("Standard margins: Academic papers use 1\" on all sides. Business letters often use 1.25\" left/right."),
                    WordContentItem.Image(R.drawable.layout_tab),

                    WordContentItem.Heading("Step 2 — Page Orientation"),
                    WordContentItem.BulletPoint("Click Layout → Orientation"),
                    WordContentItem.BulletPoint("Portrait — Taller than wide (standard for most documents)"),
                    WordContentItem.BulletPoint("Landscape — Wider than tall (for wide tables, charts, or certificates)"),
                    WordContentItem.Text("Tip: To use different orientations on different pages, use Section Breaks. Set orientation per section."),

                    WordContentItem.Heading("Step 3 — Paper Size"),
                    WordContentItem.BulletPoint("Click Layout → Size"),
                    WordContentItem.BulletPoint("Common sizes: Letter (8.5\"×11\"), A4 (210×297mm), Legal (8.5\"×14\"), A3, A5"),
                    WordContentItem.BulletPoint("Click 'More Paper Sizes...' to enter a custom width and height"),
                    WordContentItem.BulletPoint("Match paper size to what is loaded in your printer to avoid print issues"),
                    WordContentItem.Image(R.drawable.layout_tab),

                    WordContentItem.Heading("Step 4 — Columns"),
                    WordContentItem.BulletPoint("Click Layout → Columns"),
                    WordContentItem.BulletPoint("Choose: One (default), Two, Three, Left (narrow left column), Right (narrow right column)"),
                    WordContentItem.BulletPoint("Click 'More Columns...' for custom number of columns and widths"),
                    WordContentItem.BulletPoint("Check 'Line between' to add a dividing line between columns"),
                    WordContentItem.BulletPoint("To apply columns to only part of document: Select text first → then apply columns → choose 'Selected text' in Apply to"),
                    WordContentItem.Text("Use case: Newsletters, brochures, and newspapers use multi-column layouts."),

                    WordContentItem.Heading("Step 5 — Breaks"),
                    WordContentItem.Text("Breaks control where text flows from one area to another."),
                    WordContentItem.BulletPoint("Page Break (Ctrl + Enter) — Starts text on a new page"),
                    WordContentItem.BulletPoint("Column Break — Moves text to the next column"),
                    WordContentItem.BulletPoint("Text Wrapping Break — Forces text below an image or object"),
                    WordContentItem.BulletPoint("Next Page Section Break — New section starting on next page (new orientation/margins possible)"),
                    WordContentItem.BulletPoint("Continuous Section Break — New section on the same page"),
                    WordContentItem.BulletPoint("Even/Odd Page Section Break — New section on next even or odd page (for book layouts)"),
                    WordContentItem.Image(R.drawable.layout_tab),

                    WordContentItem.Heading("Step 6 — Indent"),
                    WordContentItem.BulletPoint("Left Indent — Moves the entire paragraph left edge to the right"),
                    WordContentItem.BulletPoint("Right Indent — Moves the entire paragraph right edge to the left"),
                    WordContentItem.BulletPoint("First Line Indent — Only the first line of a paragraph is indented"),
                    WordContentItem.BulletPoint("Hanging Indent — First line stays left, all other lines are indented (used in bibliographies)"),
                    WordContentItem.Text("How to set: Layout → Indent Left/Right boxes. Or open Paragraph dialog (Home → Paragraph arrow) for first line and hanging options."),

                    WordContentItem.Heading("Step 7 — Paragraph Spacing"),
                    WordContentItem.BulletPoint("Layout → Spacing Before — Adds space above the paragraph"),
                    WordContentItem.BulletPoint("Layout → Spacing After — Adds space below the paragraph"),
                    WordContentItem.BulletPoint("Values are in points (pt). 6pt before + 6pt after is common for body text"),
                    WordContentItem.BulletPoint("12pt before Heading 1 gives breathing room between sections"),
                    WordContentItem.Image(R.drawable.layout_tab),

                    WordContentItem.Heading("Step 8 — Position and Wrap Text (for Images/Shapes)"),
                    WordContentItem.BulletPoint("Click on an image or shape"),
                    WordContentItem.BulletPoint("Layout → Position — Choose preset positions (top-left, center, bottom-right, etc.)"),
                    WordContentItem.BulletPoint("Layout → Wrap Text — Control how text wraps around the object:"),
                    WordContentItem.BulletPoint("  • In Line with Text — Object sits in the text flow like a character"),
                    WordContentItem.BulletPoint("  • Square — Text wraps in a square around the object"),
                    WordContentItem.BulletPoint("  • Tight — Text wraps to the shape of the object"),
                    WordContentItem.BulletPoint("  • Through — Text flows through transparent areas of the object"),
                    WordContentItem.BulletPoint("  • Top and Bottom — Text only appears above and below the object"),
                    WordContentItem.BulletPoint("  • Behind Text — Object floats behind the text"),
                    WordContentItem.BulletPoint("  • In Front of Text — Object floats on top of text"),

                    WordContentItem.Heading("Step 9 — Line Numbers"),
                    WordContentItem.BulletPoint("Click Layout → Line Numbers"),
                    WordContentItem.BulletPoint("Choose: None, Continuous, Restart Each Page, Restart Each Section, Suppress for Current Paragraph"),
                    WordContentItem.Text("Use case: Legal documents, contracts, court filings, and scripts frequently require line numbers for reference."),

                    WordContentItem.Heading("Step 10 — Hyphenation"),
                    WordContentItem.BulletPoint("Click Layout → Hyphenation"),
                    WordContentItem.BulletPoint("None — No automatic hyphenation (default)"),
                    WordContentItem.BulletPoint("Automatic — Word hyphenates long words at line ends to reduce gaps"),
                    WordContentItem.BulletPoint("Manual — Word asks you to confirm each hyphenation point"),
                    WordContentItem.BulletPoint("Hyphenation Options — Set hyphenation zone and limit consecutive hyphens"),
                    WordContentItem.Text("Tip: Use automatic hyphenation with justified text to reduce large gaps between words."),
                )
            ),

            // ─── References Tab ───────────────────────────────────────────────
            WordDocPage(
                title = "References Tab",
                description = "Create table of contents, citations, footnotes, and bibliography professionally.",
                steps = listOf(
                    "Apply Heading styles before creating Table of Contents",
                    "Use Citations to track sources while writing",
                    "Generate Bibliography automatically at the end"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the References Tab?"),
                    WordContentItem.Text(
                        "The References tab is used in academic, legal, and professional documents to manage citations, " +
                        "footnotes, a table of contents, figure captions, indexes, and bibliographies. " +
                        "It automates tasks that would otherwise require manual formatting."
                    ),
                    WordContentItem.Image(R.drawable.references_tab),

                    WordContentItem.Heading("Step 1 — Table of Contents (TOC)"),
                    WordContentItem.Text("Prerequisites: Apply Heading 1, Heading 2, and Heading 3 styles to your section titles using the Home tab Styles. The TOC is built from these."),
                    WordContentItem.BulletPoint("Click at the start of your document where you want the TOC"),
                    WordContentItem.BulletPoint("Click References → Table of Contents"),
                    WordContentItem.BulletPoint("Choose Automatic Table 1 or Automatic Table 2"),
                    WordContentItem.BulletPoint("The TOC is inserted with page numbers and clickable links"),
                    WordContentItem.BulletPoint("To update after editing: Click on the TOC → click 'Update Table'"),
                    WordContentItem.BulletPoint("Choose 'Update page numbers only' or 'Update entire table'"),
                    WordContentItem.BulletPoint("Click References → Table of Contents → 'Custom Table of Contents' for advanced options"),
                    WordContentItem.Text("Custom options: choose how many levels to show, dotted or solid tab leaders, and whether to show page numbers."),
                    WordContentItem.Image(R.drawable.references_tab),

                    WordContentItem.Heading("Step 2 — Footnotes and Endnotes"),
                    WordContentItem.BulletPoint("Footnote — A note that appears at the bottom of the current page"),
                    WordContentItem.BulletPoint("Endnote — A note that appears at the end of the document"),
                    WordContentItem.BulletPoint("Click where you want the footnote number in the text"),
                    WordContentItem.BulletPoint("References → Insert Footnote (Ctrl + Alt + F) or Insert Endnote (Ctrl + Alt + D)"),
                    WordContentItem.BulletPoint("A number is placed in the text; your cursor jumps to the note area"),
                    WordContentItem.BulletPoint("Type your note text"),
                    WordContentItem.BulletPoint("Press Ctrl + Home or double-click the number to jump back to the document"),
                    WordContentItem.BulletPoint("References → Show Notes — Toggle between footnotes and endnotes view"),
                    WordContentItem.Text("Format: References → Footnote & Endnote dialog → change numbering style (1,2,3 or i,ii,iii or a,b,c) and starting number."),

                    WordContentItem.Heading("Step 3 — Citations and Sources"),
                    WordContentItem.BulletPoint("Click References → Style → choose citation format (APA, MLA, Chicago, Harvard, IEEE, etc.)"),
                    WordContentItem.BulletPoint("Click in the text where you want to cite a source"),
                    WordContentItem.BulletPoint("Click References → Insert Citation → Add New Source"),
                    WordContentItem.BulletPoint("Fill in: Type (Book, Journal, Website, etc.), Author, Title, Year, Publisher"),
                    WordContentItem.BulletPoint("Click OK — the in-text citation is inserted (e.g., (Smith, 2023) for APA)"),
                    WordContentItem.BulletPoint("To cite an already-added source: Insert Citation → click the source from the list"),
                    WordContentItem.BulletPoint("References → Manage Sources — Edit, delete, or copy sources"),
                    WordContentItem.Image(R.drawable.references_tab),

                    WordContentItem.Heading("Step 4 — Bibliography"),
                    WordContentItem.BulletPoint("After adding all citations, click at the end of the document"),
                    WordContentItem.BulletPoint("References → Bibliography"),
                    WordContentItem.BulletPoint("Choose 'Bibliography', 'References', or 'Works Cited'"),
                    WordContentItem.BulletPoint("Word auto-generates the formatted reference list from your sources"),
                    WordContentItem.BulletPoint("If you add more sources, click the bibliography → Update Citations and Bibliography"),
                    WordContentItem.Text("The bibliography format matches the citation style selected (APA, MLA, etc.)."),

                    WordContentItem.Heading("Step 5 — Captions"),
                    WordContentItem.BulletPoint("Click on an image, table, chart, or figure"),
                    WordContentItem.BulletPoint("References → Insert Caption"),
                    WordContentItem.BulletPoint("Label: choose Figure, Table, or Equation (or create a custom label)"),
                    WordContentItem.BulletPoint("Position: Above or Below the selected item"),
                    WordContentItem.BulletPoint("Type the description in the Caption box (e.g., 'Figure 1: Sales data 2024')"),
                    WordContentItem.BulletPoint("Click OK — caption is inserted with auto-numbering"),
                    WordContentItem.BulletPoint("References → Insert Table of Figures — auto-generates a list of all figures with page numbers"),
                    WordContentItem.Image(R.drawable.references_tab),

                    WordContentItem.Heading("Step 6 — Mark Entry and Index"),
                    WordContentItem.BulletPoint("An index is an alphabetical list of terms with page numbers, typically at the back of a book"),
                    WordContentItem.BulletPoint("Select a word or phrase to include in the index"),
                    WordContentItem.BulletPoint("References → Mark Entry (or press Alt + Shift + X)"),
                    WordContentItem.BulletPoint("In the dialog: set Main Entry and optionally Subentry"),
                    WordContentItem.BulletPoint("Click 'Mark' (current instance) or 'Mark All' (all instances in document)"),
                    WordContentItem.BulletPoint("After marking all entries: References → Insert Index to generate the formatted index"),

                    WordContentItem.Heading("Step 7 — Table of Authorities (Legal)"),
                    WordContentItem.BulletPoint("Used in legal documents to list cases, statutes, rules cited in the document"),
                    WordContentItem.BulletPoint("Select a legal citation in the text"),
                    WordContentItem.BulletPoint("References → Mark Citation (Alt + Shift + I)"),
                    WordContentItem.BulletPoint("Set the category (Cases, Statutes, Rules, etc.)"),
                    WordContentItem.BulletPoint("After marking all citations: References → Insert Table of Authorities"),
                    WordContentItem.Image(R.drawable.references_tab),
                )
            ),

            // ─── Mailings Tab ─────────────────────────────────────────────────
            WordDocPage(
                title = "Mailings Tab",
                description = "Master mail merge to send personalized documents and envelopes in bulk.",
                steps = listOf(
                    "Prepare your recipient list in Excel or Word",
                    "Start Mail Merge Wizard and connect the data source",
                    "Insert merge fields and finish the merge"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the Mailings Tab?"),
                    WordContentItem.Text(
                        "The Mailings tab is used for mail merge — a powerful feature that lets you create personalized " +
                        "letters, emails, envelopes, and labels for hundreds of recipients from a single template document. " +
                        "It connects a Word document with a data source (Excel, Outlook, or Word table)."
                    ),
                    WordContentItem.Image(R.drawable.mailings_tab),

                    WordContentItem.Heading("Step 1 — Create a Recipient List (Data Source)"),
                    WordContentItem.Text("Before starting mail merge, prepare your list of recipients. Best done in Excel."),
                    WordContentItem.BulletPoint("Open Excel → create a new spreadsheet"),
                    WordContentItem.BulletPoint("Row 1: Add column headers — FirstName, LastName, Address, City, Email, etc."),
                    WordContentItem.BulletPoint("From Row 2 onward: Enter each recipient's data"),
                    WordContentItem.BulletPoint("Save the Excel file (e.g., 'Recipients.xlsx')"),
                    WordContentItem.Text("Tip: Keep the data clean — no merged cells, no blank columns between data. First row must be headers."),
                    WordContentItem.Image(R.drawable.mailings_tab),

                    WordContentItem.Heading("Step 2 — Start Mail Merge"),
                    WordContentItem.BulletPoint("Open your Word letter template (or a blank document)"),
                    WordContentItem.BulletPoint("Mailings → Start Mail Merge"),
                    WordContentItem.BulletPoint("Choose document type: Letters, Email Messages, Envelopes, Labels, or Directory"),
                    WordContentItem.BulletPoint("Or use the wizard: Mailings → Start Mail Merge → Step-by-Step Mail Merge Wizard"),
                    WordContentItem.Text("The wizard guides you through all 6 steps: document type → starting document → recipients → message → preview → complete."),

                    WordContentItem.Heading("Step 3 — Select Recipients"),
                    WordContentItem.BulletPoint("Mailings → Select Recipients"),
                    WordContentItem.BulletPoint("'Use an Existing List' — Browse and select your Excel or CSV file"),
                    WordContentItem.BulletPoint("Select the worksheet that contains your data → OK"),
                    WordContentItem.BulletPoint("'Type a New List' — Enter recipients directly in a Word dialog (for small lists)"),
                    WordContentItem.BulletPoint("'Choose from Outlook Contacts' — Use your Outlook address book"),
                    WordContentItem.BulletPoint("Mailings → Edit Recipient List — Filter, sort, and deselect recipients before merging"),
                    WordContentItem.Image(R.drawable.mailings_tab),

                    WordContentItem.Heading("Step 4 — Insert Merge Fields"),
                    WordContentItem.BulletPoint("In your document, click where a personalized field should appear"),
                    WordContentItem.BulletPoint("Mailings → Insert Merge Field → select a field (e.g., «FirstName», «City»)"),
                    WordContentItem.BulletPoint("The field appears as «FirstName» — this will be replaced with real data"),
                    WordContentItem.BulletPoint("Example letter opening: 'Dear «FirstName» «LastName»,' then the body text"),
                    WordContentItem.BulletPoint("Mailings → Address Block — inserts a full formatted address block in one click"),
                    WordContentItem.BulletPoint("Mailings → Greeting Line — inserts 'Dear Mr. Smith,' type greetings with name format options"),
                    WordContentItem.Text("Tip: Use the 'Highlight Merge Fields' button to see all merge fields highlighted in your document."),

                    WordContentItem.Heading("Step 5 — Rules (Advanced)"),
                    WordContentItem.BulletPoint("Mailings → Rules — Add conditional logic to your merge"),
                    WordContentItem.BulletPoint("If...Then...Else — Display different text based on field value (e.g., 'Dear Mr.' if Male, 'Dear Ms.' if Female)"),
                    WordContentItem.BulletPoint("Fill-in — Prompt user to type text for each record"),
                    WordContentItem.BulletPoint("Skip Record If — Skip a recipient if a condition is met (e.g., skip if City is blank)"),
                    WordContentItem.Image(R.drawable.mailings_tab),

                    WordContentItem.Heading("Step 6 — Preview Results"),
                    WordContentItem.BulletPoint("Mailings → Preview Results — Toggle to see the actual data instead of merge fields"),
                    WordContentItem.BulletPoint("Use the arrows to browse through each recipient's version of the document"),
                    WordContentItem.BulletPoint("Look for any formatting issues or missing data"),
                    WordContentItem.BulletPoint("Mailings → Find Recipient — Search for a specific name to preview that record"),

                    WordContentItem.Heading("Step 7 — Finish & Merge"),
                    WordContentItem.BulletPoint("Mailings → Finish & Merge"),
                    WordContentItem.BulletPoint("'Edit Individual Documents' — Creates a new Word file with all merged letters (one per page). Best for reviewing before printing."),
                    WordContentItem.BulletPoint("'Print Documents' — Sends directly to printer. Choose All, Current, or a range."),
                    WordContentItem.BulletPoint("'Send Email Messages' — Sends personalized emails. Set 'To' field to the email column, set subject line."),
                    WordContentItem.Image(R.drawable.mailings_tab),

                    WordContentItem.Heading("Step 8 — Print Envelopes"),
                    WordContentItem.BulletPoint("Mailings → Envelopes"),
                    WordContentItem.BulletPoint("Enter Delivery address and Return address"),
                    WordContentItem.BulletPoint("Click 'Options...' to set envelope size (standard: Size 10 = 4.125\"×9.5\")"),
                    WordContentItem.BulletPoint("'Add to Document' — Adds the envelope as the first page of your document"),
                    WordContentItem.BulletPoint("'Print' — Prints directly"),
                    WordContentItem.BulletPoint("For bulk envelopes: Start Mail Merge → Envelopes → connect your recipient list → finish merge"),

                    WordContentItem.Heading("Step 9 — Print Labels"),
                    WordContentItem.BulletPoint("Mailings → Labels"),
                    WordContentItem.BulletPoint("Enter an address and click 'New Document' to create a sheet of identical labels"),
                    WordContentItem.BulletPoint("For different labels per recipient: Start Mail Merge → Labels"),
                    WordContentItem.BulletPoint("Select label vendor and product number (e.g., Avery 5160 = 30 labels per sheet)"),
                    WordContentItem.BulletPoint("Insert merge fields → Mailings → Update Labels → Finish & Merge"),
                )
            ),

            // ─── Review Tab ───────────────────────────────────────────────────
            WordDocPage(
                title = "Review Tab",
                description = "Proof, comment, track changes, compare, and protect your documents.",
                steps = listOf(
                    "Run Spelling & Grammar check before sharing",
                    "Use Track Changes when collaborating on edits",
                    "Protect the document before sending to reviewers"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the Review Tab?"),
                    WordContentItem.Text(
                        "The Review tab is essential for collaboration and quality control. It provides tools for " +
                        "proofreading, adding comments, tracking edits, comparing document versions, and " +
                        "restricting who can make changes."
                    ),
                    WordContentItem.Image(R.drawable.review_tab),

                    WordContentItem.Heading("Step 1 — Spelling and Grammar"),
                    WordContentItem.BulletPoint("Press F7 or click Review → Spelling & Grammar"),
                    WordContentItem.BulletPoint("Word scans the document and highlights errors"),
                    WordContentItem.BulletPoint("For each issue, see suggestions in the task pane on the right"),
                    WordContentItem.BulletPoint("Click a suggestion → 'Change' to fix it, or 'Change All' to fix all occurrences"),
                    WordContentItem.BulletPoint("'Ignore Once' — Skip this instance"),
                    WordContentItem.BulletPoint("'Ignore All' — Skip all instances of this word"),
                    WordContentItem.BulletPoint("'Add to Dictionary' — Adds the word as correct for future checks"),
                    WordContentItem.Text("Inline checking: Red underline = spelling error. Blue underline = grammar/style suggestion. Right-click underlined word for quick fix."),
                    WordContentItem.Image(R.drawable.review_tab),

                    WordContentItem.Heading("Step 2 — Thesaurus"),
                    WordContentItem.BulletPoint("Select a word in the document"),
                    WordContentItem.BulletPoint("Review → Thesaurus (or press Shift + F7)"),
                    WordContentItem.BulletPoint("A list of synonyms and antonyms appears in the task pane"),
                    WordContentItem.BulletPoint("Hover over a word → click the arrow → 'Insert' to replace the selected word"),
                    WordContentItem.BulletPoint("Or right-click any word → Synonyms → choose from the quick list"),

                    WordContentItem.Heading("Step 3 — Word Count"),
                    WordContentItem.BulletPoint("Review → Word Count"),
                    WordContentItem.BulletPoint("Displays: Pages, Words, Characters (no spaces), Characters (with spaces), Paragraphs, Lines"),
                    WordContentItem.BulletPoint("Select specific text first to count words only in that selection"),
                    WordContentItem.BulletPoint("The word count is also shown in the bottom Status Bar at all times"),

                    WordContentItem.Heading("Step 4 — Comments"),
                    WordContentItem.BulletPoint("Select text or click where you want to leave a comment"),
                    WordContentItem.BulletPoint("Review → New Comment (or press Ctrl + Alt + M)"),
                    WordContentItem.BulletPoint("Type your comment in the balloon on the right"),
                    WordContentItem.BulletPoint("Reply to a comment: Click the reply arrow under an existing comment"),
                    WordContentItem.BulletPoint("Resolve a comment: Click the comment → Mark as Resolved (it grays out)"),
                    WordContentItem.BulletPoint("Delete a comment: Right-click → Delete Comment, or Review → Delete → Delete All"),
                    WordContentItem.BulletPoint("Review → Show Comments — Toggle comment visibility"),
                    WordContentItem.BulletPoint("Review → Next / Previous Comment — Navigate between comments"),
                    WordContentItem.Image(R.drawable.review_tab),

                    WordContentItem.Heading("Step 5 — Track Changes"),
                    WordContentItem.Text("Track Changes records every insertion, deletion, and formatting change so reviewers can accept or reject each edit."),
                    WordContentItem.BulletPoint("Review → Track Changes (Ctrl + Shift + E) — Toggle tracking ON/OFF"),
                    WordContentItem.BulletPoint("When ON: Insertions appear underlined. Deletions appear as strikethrough. Changes are color-coded per author."),
                    WordContentItem.BulletPoint("Review → Display for Review — Choose: All Markup (show all), Simple Markup (clean view with change indicator), No Markup (final version), Original (original version)"),
                    WordContentItem.BulletPoint("Review → Accept → Accept This Change / Accept All Changes"),
                    WordContentItem.BulletPoint("Review → Reject → Reject This Change / Reject All Changes"),
                    WordContentItem.BulletPoint("Review → Next / Previous — Navigate between changes"),
                    WordContentItem.Text("Best practice: Send the document with Track Changes ON. Recipients make edits which are marked. You then review and accept/reject."),
                    WordContentItem.Image(R.drawable.review_tab),

                    WordContentItem.Heading("Step 6 — Lock Track Changes"),
                    WordContentItem.BulletPoint("Review → Track Changes → Lock Tracking"),
                    WordContentItem.BulletPoint("Set a password to prevent others from turning off Track Changes"),
                    WordContentItem.BulletPoint("Reviewers can still make changes, but cannot hide or accept them"),
                    WordContentItem.BulletPoint("Use when you need a complete audit trail of all edits"),

                    WordContentItem.Heading("Step 7 — Compare Documents"),
                    WordContentItem.BulletPoint("Review → Compare → Compare..."),
                    WordContentItem.BulletPoint("'Original document' — Browse for the original file"),
                    WordContentItem.BulletPoint("'Revised document' — Browse for the edited file"),
                    WordContentItem.BulletPoint("Click OK — Word creates a new document showing all differences as tracked changes"),
                    WordContentItem.BulletPoint("Review → Compare → Combine — Merges tracked changes from multiple reviewers into one document"),
                    WordContentItem.Image(R.drawable.review_tab),

                    WordContentItem.Heading("Step 8 — Protect Document"),
                    WordContentItem.BulletPoint("Review → Protect → Restrict Editing"),
                    WordContentItem.BulletPoint("Section 1: Formatting restrictions — limit styles others can apply"),
                    WordContentItem.BulletPoint("Section 2: Editing restrictions — choose: No changes (read only), Comments only, Fill in forms only, or Tracked changes only"),
                    WordContentItem.BulletPoint("Section 3: Exceptions — select specific users who can edit freely"),
                    WordContentItem.BulletPoint("Click 'Yes, Start Enforcing Protection' → set a password"),
                    WordContentItem.BulletPoint("To unprotect: Review → Protect → Restrict Editing → Stop Protection → enter password"),
                    WordContentItem.Text("Use case: Send a form for filling → restrict to 'Fill in forms only'. Send for review → restrict to 'Comments only'."),
                )
            ),

            // ─── View Tab ─────────────────────────────────────────────────────
            WordDocPage(
                title = "View Tab",
                description = "Control how your document is displayed and manage windows efficiently.",
                steps = listOf(
                    "Choose the right view mode for your task",
                    "Use Navigation Pane to jump to sections quickly",
                    "Zoom in for detail work, zoom out for layout overview"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the View Tab?"),
                    WordContentItem.Text(
                        "The View tab controls how you see the document on screen — it does not change the document content. " +
                        "It lets you switch between layouts, show/hide UI elements, zoom, and manage multiple document windows."
                    ),
                    WordContentItem.Image(R.drawable.view_tab),

                    WordContentItem.Heading("Step 1 — Document Views"),
                    WordContentItem.BulletPoint("Print Layout (default) — Shows the document exactly as it will print, with margins and page edges"),
                    WordContentItem.BulletPoint("Read Mode — Full-screen reading view optimized for reading, not editing"),
                    WordContentItem.BulletPoint("Web Layout — Shows how the document would look as a web page (no page breaks)"),
                    WordContentItem.BulletPoint("Outline View — Shows document structure based on Heading styles. Expand/collapse sections."),
                    WordContentItem.BulletPoint("Draft View — Shows only text without images, headers, or margins. Fastest for typing."),
                    WordContentItem.Text("Shortcut: Read Mode (Ctrl + Alt + R), Print Layout (Ctrl + Alt + P), Outline (Ctrl + Alt + O)."),
                    WordContentItem.Image(R.drawable.view_tab),

                    WordContentItem.Heading("Step 2 — Show / Hide UI Elements"),
                    WordContentItem.BulletPoint("Ruler — Shows horizontal and vertical rulers for measuring and setting indents/tabs"),
                    WordContentItem.BulletPoint("Gridlines — Displays a grid for aligning objects precisely on the page"),
                    WordContentItem.BulletPoint("Navigation Pane — Shows a panel with document headings, pages, and search"),
                    WordContentItem.Text("Check or uncheck these in View → Show group."),

                    WordContentItem.Heading("Step 3 — Navigation Pane"),
                    WordContentItem.BulletPoint("View → Navigation Pane (or press Ctrl + F)"),
                    WordContentItem.BulletPoint("'Headings' tab — See all headings in a clickable tree structure. Click to jump to any section."),
                    WordContentItem.BulletPoint("'Pages' tab — See thumbnail previews of all pages. Click to jump to a page."),
                    WordContentItem.BulletPoint("'Results' tab — Search results appear here when you use the search box"),
                    WordContentItem.BulletPoint("Drag headings in the Headings tab to rearrange entire sections of the document"),
                    WordContentItem.Image(R.drawable.view_tab),

                    WordContentItem.Heading("Step 4 — Zoom"),
                    WordContentItem.BulletPoint("View → Zoom — Opens the Zoom dialog with preset percentages"),
                    WordContentItem.BulletPoint("200% — Zoomed in for detail work"),
                    WordContentItem.BulletPoint("100% — Normal size"),
                    WordContentItem.BulletPoint("75% — Slightly zoomed out"),
                    WordContentItem.BulletPoint("'Page Width' — Zooms to fill the window width"),
                    WordContentItem.BulletPoint("'Whole Page' — Fits the entire page in the window"),
                    WordContentItem.BulletPoint("'Two Pages' — Shows two pages side by side"),
                    WordContentItem.BulletPoint("'Many Pages' — Shows a grid of multiple pages at once"),
                    WordContentItem.BulletPoint("Quick zoom: Use the slider in the bottom-right corner of the Word window"),
                    WordContentItem.BulletPoint("Ctrl + Mouse Wheel — Zoom in or out quickly"),

                    WordContentItem.Heading("Step 5 — Window Management"),
                    WordContentItem.BulletPoint("View → New Window — Opens a second window of the same document (both show real-time changes)"),
                    WordContentItem.BulletPoint("View → Arrange All — Tiles all open Word documents on screen"),
                    WordContentItem.BulletPoint("View → Split — Divides one document into two scrollable panes (great for comparing distant sections)"),
                    WordContentItem.BulletPoint("View → Remove Split — Returns to single pane view"),
                    WordContentItem.BulletPoint("View → View Side by Side — Places two documents next to each other for comparison"),
                    WordContentItem.BulletPoint("View → Synchronous Scrolling — Scroll both documents together (used with Side by Side)"),
                    WordContentItem.BulletPoint("View → Reset Window Position — Restores the side-by-side layout to equal split"),
                    WordContentItem.Image(R.drawable.view_tab),

                    WordContentItem.Heading("Step 6 — Macros"),
                    WordContentItem.BulletPoint("A macro is a recorded sequence of actions you can replay with one click"),
                    WordContentItem.BulletPoint("View → Macros → Record Macro — Start recording your actions"),
                    WordContentItem.BulletPoint("Give the macro a name and optionally assign it to a button or keyboard shortcut"),
                    WordContentItem.BulletPoint("Perform the steps you want to automate (formatting, inserting text, etc.)"),
                    WordContentItem.BulletPoint("View → Macros → Stop Recording"),
                    WordContentItem.BulletPoint("View → Macros → View Macros — Run, edit, or delete saved macros"),
                    WordContentItem.BulletPoint("Alt + F8 — Open the Macros dialog quickly"),
                    WordContentItem.Text("Advanced: View → Macros → View Macros → Edit → opens the Visual Basic Editor (VBA) to write custom macros."),
                )
            ),

            // ─── Draw Tab ─────────────────────────────────────────────────────
            WordDocPage(
                title = "Draw Tab",
                description = "Use digital ink to draw, annotate, and convert handwriting in Word.",
                steps = listOf(
                    "Use a stylus or mouse to draw with the Draw tab tools",
                    "Convert ink to text or shapes automatically",
                    "Use Lasso Select to move or delete ink strokes"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the Draw Tab?"),
                    WordContentItem.Text(
                        "The Draw tab enables digital ink tools in Word. It is most useful on touchscreen devices with a stylus " +
                        "but also works with a mouse. You can annotate documents, draw diagrams, highlight content, " +
                        "and convert handwritten ink to typed text or mathematical notation."
                    ),
                    WordContentItem.Image(R.drawable.draw_tab),

                    WordContentItem.Heading("Step 1 — Drawing Tools"),
                    WordContentItem.BulletPoint("Draw tab → Drawing Tools section"),
                    WordContentItem.BulletPoint("Draw with Mouse — Click to enable mouse/touch drawing mode"),
                    WordContentItem.BulletPoint("Pen — Draws solid colored lines. Click to select, double-click to customize."),
                    WordContentItem.BulletPoint("Pencil — Draws with a textured sketchy appearance"),
                    WordContentItem.BulletPoint("Highlighter — Draws transparent color over text (like a real highlighter)"),
                    WordContentItem.BulletPoint("Eraser — Erase ink strokes. Options: Stroke Eraser (removes whole strokes) or Segment Eraser (removes parts)"),
                    WordContentItem.Image(R.drawable.draw_tab),

                    WordContentItem.Heading("Step 2 — Customize Pens"),
                    WordContentItem.BulletPoint("Double-click any pen or highlighter to open customization"),
                    WordContentItem.BulletPoint("Change the Color — Choose from theme colors or custom hex colors"),
                    WordContentItem.BulletPoint("Change Thickness — Set line width from 0.25mm to 6mm"),
                    WordContentItem.BulletPoint("Set Effects — Rainbow, Galaxy, Lava, Ocean, Rose Gold, Gold ink effects"),
                    WordContentItem.BulletPoint("The pen stays customized for future sessions"),

                    WordContentItem.Heading("Step 3 — Lasso Select"),
                    WordContentItem.BulletPoint("Draw → Lasso Select"),
                    WordContentItem.BulletPoint("Draw a circle around ink strokes to select them"),
                    WordContentItem.BulletPoint("Selected ink can be moved, resized, copied, or deleted"),
                    WordContentItem.BulletPoint("Use to reorganize handwritten notes or diagrams"),
                    WordContentItem.Image(R.drawable.draw_tab),

                    WordContentItem.Heading("Step 4 — Ink to Text"),
                    WordContentItem.BulletPoint("Write text with your pen tool"),
                    WordContentItem.BulletPoint("Select the handwritten ink with Lasso Select"),
                    WordContentItem.BulletPoint("Draw → Ink to Text"),
                    WordContentItem.BulletPoint("Word converts the handwriting to typed text automatically"),
                    WordContentItem.BulletPoint("Works best with clear, consistent handwriting"),
                    WordContentItem.Text("Use case: Take handwritten notes during meetings → convert to typed text for sharing."),

                    WordContentItem.Heading("Step 5 — Ink to Shape"),
                    WordContentItem.BulletPoint("Draw a rough shape (circle, rectangle, triangle, arrow, etc.)"),
                    WordContentItem.BulletPoint("Select it with Lasso Select"),
                    WordContentItem.BulletPoint("Draw → Ink to Shape"),
                    WordContentItem.BulletPoint("Word recognizes the intended shape and replaces your rough drawing with a perfect vector shape"),
                    WordContentItem.BulletPoint("The shape can then be formatted using the Shape Format tab"),
                    WordContentItem.Image(R.drawable.draw_tab),

                    WordContentItem.Heading("Step 6 — Ink to Math"),
                    WordContentItem.BulletPoint("Draw → Ink to Math"),
                    WordContentItem.BulletPoint("A yellow drawing area opens"),
                    WordContentItem.BulletPoint("Write a mathematical equation by hand in the yellow box"),
                    WordContentItem.BulletPoint("Word recognizes the equation and shows a preview"),
                    WordContentItem.BulletPoint("Click Insert to place the formatted equation in the document"),
                    WordContentItem.Text("Use case: Quickly write complex equations (integrals, fractions, matrices) by hand instead of using the equation editor."),

                    WordContentItem.Heading("Step 7 — Ink Replay"),
                    WordContentItem.BulletPoint("Draw → Ink Replay"),
                    WordContentItem.BulletPoint("Plays back all ink strokes in the order they were drawn"),
                    WordContentItem.BulletPoint("Shows the drawing process from start to finish as an animation"),
                    WordContentItem.BulletPoint("Use to demonstrate how a diagram or equation was drawn"),
                    WordContentItem.Image(R.drawable.draw_tab),
                )
            ),

            // ─── Help Tab ─────────────────────────────────────────────────────
            WordDocPage(
                title = "Help Tab",
                description = "Get help, training, and support for all Microsoft Word features.",
                steps = listOf(
                    "Press F1 anywhere in Word to open Help instantly",
                    "Use Tell Me (Alt + Q) to find any feature fast",
                    "Visit Microsoft Learn for free video tutorials"
                ),
                content = listOf(

                    WordContentItem.Heading("Overview — What is the Help Tab?"),
                    WordContentItem.Text(
                        "The Help tab provides access to Microsoft's documentation, learning resources, " +
                        "support channels, and feedback tools. It is your starting point when you are " +
                        "unsure how to use a feature."
                    ),
                    WordContentItem.Image(R.drawable.help_tab),

                    WordContentItem.Heading("Step 1 — Help (F1)"),
                    WordContentItem.BulletPoint("Press F1 or click Help → Help"),
                    WordContentItem.BulletPoint("A Help task pane opens on the right side"),
                    WordContentItem.BulletPoint("Type a question or keyword in the search box"),
                    WordContentItem.BulletPoint("Browse the results — click any article to read the explanation"),
                    WordContentItem.BulletPoint("Articles include step-by-step instructions, images, and videos"),
                    WordContentItem.Text("Example searches: 'how to create a table of contents', 'mail merge', 'track changes', 'page numbers'."),
                    WordContentItem.Image(R.drawable.help_tab),

                    WordContentItem.Heading("Step 2 — Tell Me What You Want to Do"),
                    WordContentItem.BulletPoint("Click the search box in the ribbon that says 'Tell me' (or press Alt + Q)"),
                    WordContentItem.BulletPoint("Type a feature name, action, or description"),
                    WordContentItem.BulletPoint("Word shows matching commands directly — click to execute immediately"),
                    WordContentItem.BulletPoint("Example: Type 'insert table' → click to insert a table without navigating tabs"),
                    WordContentItem.BulletPoint("Example: Type 'double spacing' → click to apply double spacing"),
                    WordContentItem.Text("Tell Me is the fastest way to find and use any feature in Word."),

                    WordContentItem.Heading("Step 3 — Show Training"),
                    WordContentItem.BulletPoint("Help → Show Training"),
                    WordContentItem.BulletPoint("Opens Microsoft's free training content for Word"),
                    WordContentItem.BulletPoint("Topics include beginner basics, collaboration, formatting, and more"),
                    WordContentItem.BulletPoint("Training includes short video lessons with transcripts"),
                    WordContentItem.Image(R.drawable.help_tab),

                    WordContentItem.Heading("Step 4 — What's New"),
                    WordContentItem.BulletPoint("Help → What's New"),
                    WordContentItem.BulletPoint("Shows the latest features added to Microsoft Word"),
                    WordContentItem.BulletPoint("Updated with each major Office update"),
                    WordContentItem.BulletPoint("Useful for staying current with new AI-powered features, Copilot updates, etc."),

                    WordContentItem.Heading("Step 5 — Contact Support"),
                    WordContentItem.BulletPoint("Help → Contact Support"),
                    WordContentItem.BulletPoint("Opens the Microsoft Support portal in your browser"),
                    WordContentItem.BulletPoint("Options: Chat with a support agent, request a callback, or browse articles"),
                    WordContentItem.BulletPoint("You need a Microsoft account to use live support"),
                    WordContentItem.BulletPoint("Microsoft 365 subscribers get priority support"),
                    WordContentItem.Image(R.drawable.help_tab),

                    WordContentItem.Heading("Step 6 — Feedback"),
                    WordContentItem.BulletPoint("Help → Feedback"),
                    WordContentItem.BulletPoint("'I Like Something' — Report a feature you find helpful"),
                    WordContentItem.BulletPoint("'I Don't Like Something' — Report a frustrating experience"),
                    WordContentItem.BulletPoint("'I Have a Suggestion' — Submit a feature request to Microsoft"),
                    WordContentItem.Text("Feedback is reviewed by Microsoft product teams to improve future versions of Word."),

                    WordContentItem.Heading("Essential Keyboard Shortcuts Reference"),
                    WordContentItem.Text("Master these shortcuts to work faster in any Word tab:"),
                    WordContentItem.BulletPoint("F1 — Open Help"),
                    WordContentItem.BulletPoint("F7 — Spelling and Grammar check"),
                    WordContentItem.BulletPoint("F12 — Save As"),
                    WordContentItem.BulletPoint("Alt + Q — Tell Me / Search commands"),
                    WordContentItem.BulletPoint("Ctrl + S — Save"),
                    WordContentItem.BulletPoint("Ctrl + P — Print"),
                    WordContentItem.BulletPoint("Ctrl + Z — Undo"),
                    WordContentItem.BulletPoint("Ctrl + Y — Redo"),
                    WordContentItem.BulletPoint("Ctrl + F — Find"),
                    WordContentItem.BulletPoint("Ctrl + H — Replace"),
                    WordContentItem.BulletPoint("Ctrl + G — Go to page/section/line"),
                    WordContentItem.BulletPoint("Ctrl + Home — Jump to top of document"),
                    WordContentItem.BulletPoint("Ctrl + End — Jump to bottom of document"),
                    WordContentItem.BulletPoint("Ctrl + A — Select all"),
                    WordContentItem.BulletPoint("Ctrl + B / I / U — Bold / Italic / Underline"),
                    WordContentItem.BulletPoint("Ctrl + Alt + M — Insert comment"),
                    WordContentItem.BulletPoint("Ctrl + Shift + E — Toggle Track Changes"),
                    WordContentItem.BulletPoint("Alt + F8 — Open Macros dialog"),
                    WordContentItem.Image(R.drawable.help_tab),
                )
            )
        )
    )

    private fun wordHomeTab() = BookSection(
        tabName = "Home",
        tabIcon = R.drawable.home_tab,
        levelTag = "Beginner → Advanced",
        content = listOf(
            ContentItem.ChapterHeader("Home Tab", "Complete formatting guide — beginner to advanced"),
            ContentItem.ScreenshotItem("Home Tab Ribbon", "The full Home tab showing Clipboard, Font, Paragraph, Styles, and Editing groups"),

            // OVERVIEW
            ContentItem.SectionHeading("What is the Home Tab?"),
            ContentItem.BodyText("The Home tab is the default tab in Microsoft Word. It contains the most frequently used tools — text formatting, paragraph alignment, bullet lists, styles, and find/replace. Everything you need for everyday document work is here."),
            ContentItem.NoteBox("The Home tab is always active when you open Word. It handles roughly 80% of all document formatting tasks."),

            // BEGINNER
            ContentItem.SectionDivider,
            ContentItem.SectionHeading("BEGINNER LEVEL"),

            ContentItem.SubHeading("1. The Clipboard Group"),
            ContentItem.BodyText("The Clipboard group sits at the far left. It stores content you cut or copy so you can paste it elsewhere."),
            ContentItem.NumberedStep(1, "Select your text", "Click and drag over text to highlight it."),
            ContentItem.NumberedStep(2, "Copy or Cut", "Press Ctrl+C to copy (keep original) or Ctrl+X to cut (remove original)."),
            ContentItem.NumberedStep(3, "Position the cursor", "Click where you want to paste."),
            ContentItem.NumberedStep(4, "Paste", "Press Ctrl+V. Click the small arrow under Paste for Paste Special options (paste as plain text, keep source formatting, etc.)."),
            ContentItem.ScreenshotItem("Clipboard Group", "Cut, Copy, Paste, and Format Painter buttons highlighted in the ribbon"),
            ContentItem.TipBox("Click the small arrow at the bottom-right of the Clipboard group to open the Clipboard pane — it stores your last 24 copied items."),

            ContentItem.SubHeading("Format Painter"),
            ContentItem.NumberedStep(1, "Select formatted text", "Select text whose formatting you want to copy."),
            ContentItem.NumberedStep(2, "Click Format Painter", "Click the paintbrush icon in the Clipboard group. Your cursor turns into a paintbrush."),
            ContentItem.NumberedStep(3, "Apply to new text", "Drag over any other text — it instantly takes on the copied formatting."),
            ContentItem.TipBox("Double-click Format Painter to apply to multiple locations. Press Esc when done."),

            ContentItem.SubHeading("2. The Font Group"),
            ContentItem.BodyText("The Font group controls every visual aspect of individual characters — typeface, size, color, and effects."),
            ContentItem.NumberedStep(1, "Select text", "Highlight the text you want to format."),
            ContentItem.NumberedStep(2, "Change font", "Click the Font Name dropdown (default: Calibri) and choose any font."),
            ContentItem.NumberedStep(3, "Change size", "Click the Font Size box and type a number, or use the A+/A− buttons."),
            ContentItem.NumberedStep(4, "Apply Bold, Italic, or Underline", "Click B, I, or U — or use the keyboard shortcuts below."),
            ContentItem.ScreenshotItem("Font Group", "Font name, size, Bold, Italic, Underline, color, and text effects controls"),
            ContentItem.KeyShortcut("Ctrl+B", "Bold"),
            ContentItem.KeyShortcut("Ctrl+I", "Italic"),
            ContentItem.KeyShortcut("Ctrl+U", "Underline"),
            ContentItem.KeyShortcut("Ctrl+D", "Open full Font dialog"),
            ContentItem.KeyShortcut("Ctrl+Shift+>", "Increase font size"),
            ContentItem.KeyShortcut("Ctrl+Shift+<", "Decrease font size"),
            ContentItem.SubHeading("All Font Options"),
            ContentItem.BulletItem("Strikethrough — Draws a line through text"),
            ContentItem.BulletItem("Subscript (Ctrl+=) — Small text below baseline: H₂O"),
            ContentItem.BulletItem("Superscript (Ctrl+Shift+=) — Small text above baseline: x²"),
            ContentItem.BulletItem("Text Highlight Color — Colored background like a highlighter"),
            ContentItem.BulletItem("Font Color — Change text color (the A with colored underline)"),
            ContentItem.BulletItem("Change Case — Toggle UPPERCASE, lowercase, Title Case, Sentence case"),
            ContentItem.BulletItem("Clear All Formatting — Remove all styles; returns text to Normal"),
            ContentItem.WarningBox("Avoid using more than 2–3 fonts in one document. Use one font for headings and one for body text for a professional look."),

            ContentItem.SubHeading("3. The Paragraph Group"),
            ContentItem.BodyText("The Paragraph group controls how entire paragraphs are laid out on the page."),
            ContentItem.NumberedStep(1, "Select paragraphs", "Click inside a paragraph, or select multiple paragraphs."),
            ContentItem.NumberedStep(2, "Choose alignment", "Click the alignment button you need."),
            ContentItem.BulletItem("Align Left (Ctrl+L) — Text starts at the left margin"),
            ContentItem.BulletItem("Center (Ctrl+E) — Text is centered on the page"),
            ContentItem.BulletItem("Align Right (Ctrl+R) — Text starts from the right margin"),
            ContentItem.BulletItem("Justify (Ctrl+J) — Text spreads to fill the full line width"),
            ContentItem.NumberedStep(3, "Set line spacing", "Click the Line Spacing dropdown → choose 1.0, 1.5, 2.0, or custom."),
            ContentItem.NumberedStep(4, "Set paragraph spacing", "Add space Before or After a paragraph via the line spacing menu → Line Spacing Options."),
            ContentItem.ScreenshotItem("Paragraph Group", "Alignment buttons, line spacing, bullets, numbering, and indent controls"),
            ContentItem.KeyShortcut("Ctrl+1", "Single line spacing"),
            ContentItem.KeyShortcut("Ctrl+2", "Double line spacing"),
            ContentItem.KeyShortcut("Ctrl+5", "1.5 line spacing"),

            ContentItem.SubHeading("Bullets and Numbering"),
            ContentItem.NumberedStep(1, "Place cursor", "Click at the start of the line where you want to begin a list."),
            ContentItem.NumberedStep(2, "Click Bullets or Numbering", "Click the bullet (•) or numbering (1.) button in the Paragraph group."),
            ContentItem.NumberedStep(3, "Type your items", "Type each item and press Enter to go to the next bullet."),
            ContentItem.NumberedStep(4, "End the list", "Press Enter twice, or press Backspace after the last empty bullet."),
            ContentItem.NumberedStep(5, "Create sub-items", "Press Tab on a new bullet to indent it as a sub-item. Press Shift+Tab to promote it back up."),
            ContentItem.TipBox("Click the dropdown arrow next to the Bullets button to choose custom bullet symbols (arrows, checkmarks, diamonds, etc.)."),

            // INTERMEDIATE
            ContentItem.SectionDivider,
            ContentItem.SectionHeading("INTERMEDIATE LEVEL"),

            ContentItem.SubHeading("4. Styles Gallery"),
            ContentItem.BodyText("Styles are named combinations of font, size, color, and spacing. Using styles keeps your document consistent and enables automatic features like Table of Contents."),
            ContentItem.NumberedStep(1, "Apply a style", "Select text → click any style in the Styles Gallery on the Home tab."),
            ContentItem.NumberedStep(2, "Use Heading styles", "Apply Heading 1 to chapter titles, Heading 2 to sections, Heading 3 to sub-sections."),
            ContentItem.NumberedStep(3, "Navigate styles", "Click the expand arrow at the bottom-right of the Styles Gallery to see all styles."),
            ContentItem.ScreenshotItem("Styles Gallery", "The Styles Gallery showing Normal, Heading 1, Heading 2, Title, Subtitle, and other built-in styles"),
            ContentItem.BulletItem("Normal — Default body text"),
            ContentItem.BulletItem("Heading 1 — Main chapter/section title (large, bold)"),
            ContentItem.BulletItem("Heading 2 — Sub-section title"),
            ContentItem.BulletItem("Heading 3 — Sub-sub-section"),
            ContentItem.BulletItem("Title — Large decorative title for cover pages"),
            ContentItem.BulletItem("Quote — Indented italic text for block quotes"),
            ContentItem.BulletItem("Emphasis — Italic text for in-line emphasis"),
            ContentItem.NoteBox("When you update a Style (e.g., change Heading 1's font), ALL text using that style updates automatically throughout the document."),

            ContentItem.SubHeading("Modify a Style"),
            ContentItem.NumberedStep(1, "Right-click any style", "Right-click a style in the Styles Gallery."),
            ContentItem.NumberedStep(2, "Select Modify", "Click 'Modify...' from the context menu."),
            ContentItem.NumberedStep(3, "Change formatting", "Adjust font, size, color, spacing, and alignment in the dialog."),
            ContentItem.NumberedStep(4, "Save the change", "Check 'Automatically update' so the style updates all matching text. Click OK."),

            ContentItem.SubHeading("5. Find & Replace"),
            ContentItem.NumberedStep(1, "Open Find & Replace", "Press Ctrl+H to open the dialog."),
            ContentItem.NumberedStep(2, "Enter search term", "Type the word or phrase to find in the 'Find what' box."),
            ContentItem.NumberedStep(3, "Enter replacement", "Type the replacement in 'Replace with'."),
            ContentItem.NumberedStep(4, "Replace", "Click 'Replace' for one instance, or 'Replace All' to change every occurrence at once."),
            ContentItem.ScreenshotItem("Find & Replace Dialog", "The Find and Replace dialog with Find what, Replace with fields, and options for Match case and whole word"),
            ContentItem.TipBox("Click 'More >>' in the dialog to search with advanced options: match case, whole word only, wildcards, or even match by formatting."),

            // ADVANCED
            ContentItem.SectionDivider,
            ContentItem.SectionHeading("ADVANCED LEVEL"),

            ContentItem.SubHeading("6. Create a Custom Style"),
            ContentItem.NumberedStep(1, "Format sample text", "Apply the exact font, size, color, and spacing you want."),
            ContentItem.NumberedStep(2, "Select the text", "Highlight the formatted text."),
            ContentItem.NumberedStep(3, "Open Styles dropdown", "Click the expand arrow in the Styles Gallery → 'Create a Style'."),
            ContentItem.NumberedStep(4, "Name and save", "Type a name (e.g., 'CompanyBody') → click OK. Your style now appears in the gallery."),

            ContentItem.SubHeading("7. Paragraph Borders & Shading"),
            ContentItem.NumberedStep(1, "Select the paragraph", "Click inside or select the paragraph."),
            ContentItem.NumberedStep(2, "Open Borders menu", "Click the Borders dropdown arrow in the Paragraph group."),
            ContentItem.NumberedStep(3, "Apply a border", "Choose Bottom Border, Box Border, or 'Borders and Shading...' for full control."),
            ContentItem.NumberedStep(4, "Add shading", "In the Borders and Shading dialog → Shading tab → choose a background fill color."),

            ContentItem.SubHeading("Keyboard Shortcuts Quick Reference"),
            ContentItem.KeyShortcut("Ctrl+A", "Select all text"),
            ContentItem.KeyShortcut("Ctrl+Z", "Undo"),
            ContentItem.KeyShortcut("Ctrl+Y", "Redo"),
            ContentItem.KeyShortcut("Ctrl+C", "Copy"),
            ContentItem.KeyShortcut("Ctrl+X", "Cut"),
            ContentItem.KeyShortcut("Ctrl+V", "Paste"),
            ContentItem.KeyShortcut("Ctrl+L", "Align left"),
            ContentItem.KeyShortcut("Ctrl+E", "Center"),
            ContentItem.KeyShortcut("Ctrl+R", "Align right"),
            ContentItem.KeyShortcut("Ctrl+J", "Justify"),
        )
    )

    private fun wordInsertTab() = BookSection(
        tabName = "Insert",
        tabIcon = R.drawable.insert_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Insert Tab", "Add tables, images, shapes, and more"),
            ContentItem.ScreenshotItem("Insert Tab Ribbon", "Full Insert tab with Pages, Tables, Illustrations, Media, Links, Comments, Header & Footer, Text, and Symbols groups"),

            ContentItem.SectionHeading("Tables"),
            ContentItem.NumberedStep(1, "Click Insert → Table", "Open the Table grid picker."),
            ContentItem.NumberedStep(2, "Hover to select size", "Hover over the grid to highlight the number of rows × columns."),
            ContentItem.NumberedStep(3, "Click to insert", "Click the grid to insert the table at the cursor."),
            ContentItem.NumberedStep(4, "Style the table", "The Table Design and Layout tabs appear — use them to set borders, shading, and row/column sizes."),
            ContentItem.ScreenshotItem("Insert Table Grid", "The table grid picker showing mouse hovering over a 4×3 selection"),
            ContentItem.TipBox("Use 'Quick Tables' for pre-built calendar and formatted table styles. Use 'Insert Table' dialog for exact row/column counts."),

            ContentItem.SectionHeading("Pictures"),
            ContentItem.NumberedStep(1, "Insert → Pictures → This Device", "Browse your computer for an image file (PNG, JPG, GIF, etc.)."),
            ContentItem.NumberedStep(2, "Resize the image", "Drag the corner handles to resize. Hold Shift to keep proportions."),
            ContentItem.NumberedStep(3, "Set text wrapping", "Click the image → Picture Format tab → Wrap Text → choose Square, Tight, or Through."),
            ContentItem.NumberedStep(4, "Crop", "Picture Format → Crop → drag the crop handles."),
            ContentItem.ScreenshotItem("Picture Wrap Text Menu", "The Wrap Text menu showing In Line with Text, Square, Tight, Through, Top and Bottom options"),
            ContentItem.BulletItem("Stock Images — Microsoft's royalty-free photo library"),
            ContentItem.BulletItem("Online Pictures — Bing image search (check licensing)"),
            ContentItem.BulletItem("Screenshots — Capture any open window or screen region"),

            ContentItem.SectionHeading("Shapes & SmartArt"),
            ContentItem.NumberedStep(1, "Insert → Shapes", "Choose from lines, rectangles, circles, arrows, callouts, and more."),
            ContentItem.NumberedStep(2, "Draw the shape", "Click and drag on the document. Hold Shift for perfect squares or circles."),
            ContentItem.NumberedStep(3, "Add text", "Right-click the shape → Add Text."),
            ContentItem.NumberedStep(4, "SmartArt", "Insert → SmartArt → pick a category (Process, Hierarchy, Cycle, etc.) → fill in text pane."),
            ContentItem.ScreenshotItem("SmartArt Gallery", "SmartArt gallery showing List, Process, Cycle, Hierarchy, Relationship, Matrix, and Pyramid categories"),

            ContentItem.SectionHeading("Headers, Footers & Page Numbers"),
            ContentItem.NumberedStep(1, "Insert → Header or Footer", "Choose a built-in design from the gallery."),
            ContentItem.NumberedStep(2, "Type content", "Type your document title, company name, date, or page number inside the header/footer area."),
            ContentItem.NumberedStep(3, "Page numbers", "Insert → Page Number → choose position (top, bottom, margins) and alignment style."),
            ContentItem.NumberedStep(4, "Different first page", "In the Header & Footer tab → check 'Different First Page' for a unique cover page header."),
            ContentItem.NumberedStep(5, "Close", "Click 'Close Header and Footer' or press Esc."),
            ContentItem.TipBox("To start page numbering at a specific number: Insert → Page Number → Format Page Numbers → Start at: [your number]."),

            ContentItem.SectionHeading("Hyperlinks & Bookmarks"),
            ContentItem.NumberedStep(1, "Select link text", "Highlight the text you want to make clickable."),
            ContentItem.NumberedStep(2, "Insert → Link (Ctrl+K)", "The Insert Hyperlink dialog opens."),
            ContentItem.NumberedStep(3, "Type the URL", "Paste or type the web address in the Address box → click OK."),
            ContentItem.NumberedStep(4, "Bookmark link", "First add a Bookmark (Insert → Bookmark → name it). Then Insert → Link → 'Place in This Document' → choose the bookmark."),
            ContentItem.KeyShortcut("Ctrl+K", "Insert or edit hyperlink"),
            ContentItem.NoteBox("Ctrl+Click any hyperlink to follow it. Right-click → Edit Hyperlink to change the URL."),

            ContentItem.SectionHeading("Equations & Symbols"),
            ContentItem.NumberedStep(1, "Insert → Equation", "Choose a built-in equation (Pythagorean theorem, quadratic formula, etc.) or 'Insert New Equation'."),
            ContentItem.NumberedStep(2, "Build your equation", "Use the Equation tab tools: Fraction, Radical, Integral, Matrix, and more."),
            ContentItem.NumberedStep(3, "Insert a Symbol", "Insert → Symbol → More Symbols → choose character set and symbol → Insert."),
            ContentItem.BulletItem("© — Copyright  |  ® — Registered  |  ™ — Trademark"),
            ContentItem.BulletItem("° — Degree  |  ± — Plus/minus  |  µ — Micro"),
            ContentItem.BulletItem("Use Special Characters tab for em dash (—), en dash (–), nonbreaking space"),
        )
    )

    private fun wordDesignTab() = BookSection(
        tabName = "Design",
        tabIcon = R.drawable.design_tab,
        levelTag = "Intermediate",
        content = listOf(
            ContentItem.ChapterHeader("Design Tab", "Themes, colors, fonts, and page backgrounds"),
            ContentItem.ScreenshotItem("Design Tab Ribbon", "Design tab showing Document Formatting gallery, Colors, Fonts, Paragraph Spacing, and Page Background groups"),

            ContentItem.SectionHeading("Document Themes"),
            ContentItem.BodyText("A Theme applies a coordinated set of fonts and colors to the entire document at once — headings, body text, tables, SmartArt, and charts all update instantly."),
            ContentItem.NumberedStep(1, "Click Design tab", "Navigate to the Design tab in the ribbon."),
            ContentItem.NumberedStep(2, "Hover over themes", "Live preview shows changes in your document as you hover."),
            ContentItem.NumberedStep(3, "Click to apply", "Click any theme to apply it globally."),
            ContentItem.ScreenshotItem("Themes Gallery", "Themes gallery with Office, Facet, Integral, Ion, Metropolitan, Retrospect, Slice, and Wisp themes visible"),
            ContentItem.TipBox("After applying a theme, you can still customize its individual colors and fonts without changing the overall layout."),

            ContentItem.SectionHeading("Colors & Fonts"),
            ContentItem.NumberedStep(1, "Design → Colors", "Browse color palettes or click 'Customize Colors' to define your own 10-color set (Accent 1–6, Hyperlinks, Background, etc.)."),
            ContentItem.NumberedStep(2, "Design → Fonts", "Each font set pairs a Heading font + Body font. Click 'Customize Fonts' to choose your own pairing."),
            ContentItem.NumberedStep(3, "Paragraph Spacing", "Design → Paragraph Spacing → choose Compact, Tight, Open, Relaxed, Double, or No Paragraph Space."),
            ContentItem.NoteBox("'Set as Default' saves your theme, colors, fonts, and spacing as the starting point for all new Word documents."),

            ContentItem.SectionHeading("Watermarks"),
            ContentItem.NumberedStep(1, "Design → Watermark", "Choose CONFIDENTIAL, DRAFT, URGENT, DO NOT COPY — or click 'Custom Watermark'."),
            ContentItem.NumberedStep(2, "Text watermark", "Type custom text, set font, size, color, and angle (diagonal recommended)."),
            ContentItem.NumberedStep(3, "Picture watermark", "Use your company logo as a semi-transparent background image."),
            ContentItem.NumberedStep(4, "Remove", "Design → Watermark → Remove Watermark."),
            ContentItem.ScreenshotItem("Watermark Dialog", "Custom Watermark dialog showing Text Watermark selected with DRAFT text, diagonal layout, and semi-transparent option"),

            ContentItem.SectionHeading("Page Color & Borders"),
            ContentItem.NumberedStep(1, "Design → Page Color", "Click any swatch for a solid color. Click Fill Effects for Gradient, Texture, Pattern, or Picture backgrounds."),
            ContentItem.NumberedStep(2, "Design → Page Borders", "Set border style, color, width, and art. Apply to whole document or specific sections/pages."),
            ContentItem.WarningBox("Page background color does NOT print by default. Enable it: File → Options → Display → check 'Print background colors and images'."),
        )
    )

    private fun wordLayoutTab() = BookSection(
        tabName = "Layout",
        tabIcon = R.drawable.layout_tab,
        levelTag = "Intermediate",
        content = listOf(
            ContentItem.ChapterHeader("Layout Tab", "Page setup, margins, columns, and text flow"),
            ContentItem.ScreenshotItem("Layout Tab Ribbon", "Layout tab showing Page Setup, Paragraph, and Arrange groups"),

            ContentItem.SectionHeading("Page Setup"),
            ContentItem.NumberedStep(1, "Set Margins", "Layout → Margins → choose Normal (1\" all sides), Narrow (0.5\"), Wide (2\" sides), or Custom Margins for exact values."),
            ContentItem.NumberedStep(2, "Set Orientation", "Layout → Orientation → Portrait (tall) or Landscape (wide)."),
            ContentItem.NumberedStep(3, "Set Paper Size", "Layout → Size → Letter (8.5×11\"), A4 (210×297mm), Legal, or custom."),
            ContentItem.ScreenshotItem("Page Setup Group", "Margins, Orientation, and Size buttons in the Page Setup group"),
            ContentItem.TipBox("To use Landscape orientation on just one page: Insert a Next Page Section Break before and after that page, then change orientation for just that section."),

            ContentItem.SectionHeading("Columns"),
            ContentItem.NumberedStep(1, "Layout → Columns", "Choose One, Two, Three, Left (narrow left), or Right (narrow right)."),
            ContentItem.NumberedStep(2, "Custom columns", "Click 'More Columns' to set exact widths, gutters, and optionally a dividing line between columns."),
            ContentItem.NumberedStep(3, "Apply to selection", "Select text first → apply columns → choose 'Selected text' in Apply to dropdown."),
            ContentItem.NoteBox("Use columns for newsletters, brochures, and tri-fold flyers."),

            ContentItem.SectionHeading("Section & Page Breaks"),
            ContentItem.NumberedStep(1, "Page Break (Ctrl+Enter)", "Starts content on the next page immediately."),
            ContentItem.NumberedStep(2, "Column Break", "Moves text to the top of the next column."),
            ContentItem.NumberedStep(3, "Next Page Section Break", "Starts a new section on the next page — allows different margins, orientation, or headers per section."),
            ContentItem.NumberedStep(4, "Continuous Section Break", "Starts a new section on the same page (useful for changing column layout mid-page)."),
            ContentItem.ScreenshotItem("Breaks Menu", "Breaks dropdown showing Page Break, Column Break, Text Wrapping Break, and all Section Break types"),

            ContentItem.SectionHeading("Indent & Spacing"),
            ContentItem.BulletItem("Left/Right Indent — Move the paragraph edge inward from the margin"),
            ContentItem.BulletItem("Spacing Before/After — Add whitespace above or below paragraphs"),
            ContentItem.BulletItem("Line Numbers — Layout → Line Numbers (required for legal documents and scripts)"),
            ContentItem.BulletItem("Hyphenation — Layout → Hyphenation → Automatic (reduces gaps in justified text)"),

            ContentItem.SectionHeading("Wrap Text for Images"),
            ContentItem.BulletItem("In Line with Text — Image sits inside the text flow"),
            ContentItem.BulletItem("Square — Text wraps in a rectangular box around the image"),
            ContentItem.BulletItem("Tight — Text wraps to the image's actual shape"),
            ContentItem.BulletItem("Behind Text — Image floats behind text (useful for backgrounds)"),
            ContentItem.BulletItem("In Front of Text — Image overlays on top of the text"),
        )
    )

    private fun wordReferencesTab() = BookSection(
        tabName = "References",
        tabIcon = R.drawable.references_tab,
        levelTag = "Advanced",
        content = listOf(
            ContentItem.ChapterHeader("References Tab", "TOC, footnotes, citations, bibliography, and index"),
            ContentItem.ScreenshotItem("References Tab Ribbon", "References tab showing Table of Contents, Footnotes, Citations & Bibliography, Captions, Index, and Table of Authorities groups"),

            ContentItem.SectionHeading("Table of Contents"),
            ContentItem.BodyText("A TOC is automatically built from Heading styles. Apply Heading 1, 2, and 3 styles to your section titles before inserting a TOC."),
            ContentItem.NumberedStep(1, "Apply Heading styles", "Select each section title → Home tab → click Heading 1, Heading 2, or Heading 3 in the Styles Gallery."),
            ContentItem.NumberedStep(2, "Position cursor", "Click at the very beginning of the document (or after the cover page)."),
            ContentItem.NumberedStep(3, "Insert → Table of Contents", "References → Table of Contents → choose Automatic Table 1 or 2."),
            ContentItem.NumberedStep(4, "Update the TOC", "After editing: click on the TOC → click 'Update Table' → 'Update entire table'."),
            ContentItem.ScreenshotItem("Table of Contents", "Auto-generated TOC showing chapter names with dotted tab leaders and page numbers"),
            ContentItem.TipBox("Click 'Custom Table of Contents' to control how many levels appear, change tab leaders (dots, dashes, underline), and toggle page numbers."),

            ContentItem.SectionHeading("Footnotes & Endnotes"),
            ContentItem.NumberedStep(1, "Position cursor", "Click where the footnote number should appear in the text."),
            ContentItem.NumberedStep(2, "Insert footnote", "Press Ctrl+Alt+F or References → Insert Footnote. A superscript number appears; cursor jumps to the bottom of the page."),
            ContentItem.NumberedStep(3, "Type the note", "Type your footnote text at the bottom of the page."),
            ContentItem.NumberedStep(4, "Return to text", "Double-click the footnote number to jump back to the reference point."),
            ContentItem.NoteBox("Endnotes (Ctrl+Alt+D) work the same way but appear at the end of the document, not the bottom of each page."),

            ContentItem.SectionHeading("Citations & Bibliography"),
            ContentItem.NumberedStep(1, "Select citation style", "References → Style → choose APA, MLA, Chicago, Harvard, IEEE, etc."),
            ContentItem.NumberedStep(2, "Insert citation", "Click where the citation goes → References → Insert Citation → Add New Source."),
            ContentItem.NumberedStep(3, "Fill source details", "Choose source type (Book, Journal, Website, etc.) → fill Author, Title, Year, Publisher → OK."),
            ContentItem.NumberedStep(4, "Reuse a source", "References → Insert Citation → click the previously added source."),
            ContentItem.NumberedStep(5, "Generate Bibliography", "Click at document end → References → Bibliography → choose Bibliography, References, or Works Cited."),
            ContentItem.ScreenshotItem("Bibliography", "Auto-generated APA bibliography showing formatted references with hanging indent"),

            ContentItem.SectionHeading("Captions & Index"),
            ContentItem.NumberedStep(1, "Caption", "Click image/table → References → Insert Caption → choose label (Figure, Table) and position → type description → OK."),
            ContentItem.NumberedStep(2, "Table of Figures", "References → Insert Table of Figures — lists all captioned objects with page numbers."),
            ContentItem.NumberedStep(3, "Mark Index entry", "Select a word → References → Mark Entry (Alt+Shift+X) → Mark All to mark every instance."),
            ContentItem.NumberedStep(4, "Insert Index", "Position cursor at end → References → Insert Index — generates alphabetical list with page numbers."),
        )
    )

    private fun wordMailingsTab() = BookSection(
        tabName = "Mailings",
        tabIcon = R.drawable.mailings_tab,
        levelTag = "Advanced",
        content = listOf(
            ContentItem.ChapterHeader("Mailings Tab", "Mail merge — send personalized letters, emails, and labels in bulk"),
            ContentItem.ScreenshotItem("Mailings Tab Ribbon", "Mailings tab showing Create, Start Mail Merge, Write & Insert Fields, Preview Results, and Finish groups"),

            ContentItem.SectionHeading("Prepare the Data Source"),
            ContentItem.BodyText("Before starting a mail merge, prepare a clean list of recipients in Excel. This is your data source."),
            ContentItem.NumberedStep(1, "Open Excel", "Create a new spreadsheet."),
            ContentItem.NumberedStep(2, "Add headers in Row 1", "FirstName, LastName, Address, City, State, ZipCode, Email, etc."),
            ContentItem.NumberedStep(3, "Enter recipient data", "Fill in each recipient starting from Row 2."),
            ContentItem.NumberedStep(4, "Save the file", "Save as .xlsx (e.g., 'Recipients.xlsx')."),
            ContentItem.WarningBox("No blank rows, no merged cells, and no blank columns between data. Row 1 MUST contain headers only."),

            ContentItem.SectionHeading("Start the Mail Merge"),
            ContentItem.NumberedStep(1, "Open your letter template", "Open the Word document you want to personalize, or start from blank."),
            ContentItem.NumberedStep(2, "Mailings → Start Mail Merge", "Choose: Letters, Email Messages, Envelopes, Labels, or Directory."),
            ContentItem.NumberedStep(3, "Select Recipients", "Mailings → Select Recipients → Use an Existing List → browse to your Excel file → select the worksheet → OK."),
            ContentItem.ScreenshotItem("Select Recipients", "Select Data Source dialog browsing to Recipients.xlsx, and Select Table dialog showing Sheet1 selected"),

            ContentItem.SectionHeading("Insert Merge Fields"),
            ContentItem.NumberedStep(1, "Click in document", "Click where you want a personalized field (e.g., after 'Dear ')."),
            ContentItem.NumberedStep(2, "Insert Merge Field", "Mailings → Insert Merge Field → choose a field (e.g., «FirstName»)."),
            ContentItem.NumberedStep(3, "Build the letter", "Example: 'Dear «FirstName» «LastName»,' then your letter body."),
            ContentItem.NumberedStep(4, "Address Block", "Mailings → Address Block — inserts a full formatted address with one click."),
            ContentItem.NumberedStep(5, "Greeting Line", "Mailings → Greeting Line — inserts 'Dear Mr. Smith,' with name format options."),
            ContentItem.TipBox("Click 'Highlight Merge Fields' to see all merge fields highlighted yellow in your document."),
            ContentItem.ScreenshotItem("Merge Fields in Document", "Letter document showing «FirstName», «LastName», «Address» merge fields highlighted"),

            ContentItem.SectionHeading("Preview & Finish"),
            ContentItem.NumberedStep(1, "Preview Results", "Mailings → Preview Results — toggle to see actual data instead of field codes."),
            ContentItem.NumberedStep(2, "Browse records", "Use the arrow buttons to step through each recipient's version."),
            ContentItem.NumberedStep(3, "Finish & Merge", "Mailings → Finish & Merge:"),
            ContentItem.BulletItem("Edit Individual Documents — Creates a new file with all merged letters, one per page (review before printing)"),
            ContentItem.BulletItem("Print Documents — Sends directly to the printer"),
            ContentItem.BulletItem("Send Email Messages — Emails each recipient personally (set 'To' field to your email column)"),
        )
    )

    private fun wordReviewTab() = BookSection(
        tabName = "Review",
        tabIcon = R.drawable.review_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Review Tab", "Proofing, comments, track changes, and document protection"),
            ContentItem.ScreenshotItem("Review Tab Ribbon", "Review tab showing Proofing, Accessibility, Language, Comments, Tracking, Changes, Compare, and Protect groups"),

            ContentItem.SectionHeading("Spelling & Grammar"),
            ContentItem.NumberedStep(1, "Press F7", "Or click Review → Spelling & Grammar. Word scans the document."),
            ContentItem.NumberedStep(2, "Review suggestions", "The Editor pane opens on the right showing each error."),
            ContentItem.NumberedStep(3, "Fix each issue", "Click a suggestion → Change (this instance) or Change All (all instances)."),
            ContentItem.NumberedStep(4, "Ignore or add", "Click Ignore Once, Ignore All, or Add to Dictionary for correct words that Word doesn't recognize."),
            ContentItem.NoteBox("Red underline = spelling error. Blue underline = grammar or clarity suggestion. Right-click any underlined word for a quick fix menu."),

            ContentItem.SectionHeading("Comments"),
            ContentItem.NumberedStep(1, "Select text", "Highlight the text you want to comment on."),
            ContentItem.NumberedStep(2, "Insert comment", "Review → New Comment (or Ctrl+Alt+M). Type in the comment balloon."),
            ContentItem.NumberedStep(3, "Reply", "Click the reply arrow inside an existing comment."),
            ContentItem.NumberedStep(4, "Resolve", "Click the comment → Mark as Resolved. It grays out but is preserved."),
            ContentItem.NumberedStep(5, "Delete", "Right-click comment → Delete Comment, or Review → Delete → Delete All Comments."),
            ContentItem.ScreenshotItem("Comments in Document", "Document with a comment balloon on the right showing a reviewer's note with reply and resolve options"),

            ContentItem.SectionHeading("Track Changes"),
            ContentItem.BodyText("Track Changes records every edit so collaborators can see and accept or reject each change. Essential for professional document review."),
            ContentItem.NumberedStep(1, "Turn on tracking", "Press Ctrl+Shift+E or Review → Track Changes. A colored bar appears in the margin."),
            ContentItem.NumberedStep(2, "Make edits", "Insertions appear underlined; deletions appear as colored strikethrough. Each reviewer gets a different color."),
            ContentItem.NumberedStep(3, "Display modes", "Review → Display for Review:"),
            ContentItem.BulletItem("All Markup — Shows all insertions, deletions, and comments"),
            ContentItem.BulletItem("Simple Markup — Clean view with change bar indicators only"),
            ContentItem.BulletItem("No Markup — Shows the final version without markup"),
            ContentItem.BulletItem("Original — Shows the original unedited text"),
            ContentItem.NumberedStep(4, "Accept or reject", "Review → Accept → Accept This Change, or Reject → Reject This Change. Use Accept All or Reject All to process everything at once."),
            ContentItem.ScreenshotItem("Track Changes", "Document showing insertions underlined in blue, deletions in red strikethrough, and a change bar in the margin"),
            ContentItem.TipBox("Review → Track Changes → Lock Tracking (set a password) to prevent reviewers from turning off tracking."),

            ContentItem.SectionHeading("Compare & Protect"),
            ContentItem.NumberedStep(1, "Compare documents", "Review → Compare → Compare → select Original and Revised files → Word creates a new document showing all differences as tracked changes."),
            ContentItem.NumberedStep(2, "Combine revisions", "Review → Compare → Combine — merges tracked changes from multiple reviewers into one document."),
            ContentItem.NumberedStep(3, "Restrict editing", "Review → Protect → Restrict Editing → choose: No changes (Read only), Comments only, Fill in forms only, or Tracked changes only → set a password."),
        )
    )

    private fun wordViewTab() = BookSection(
        tabName = "View",
        tabIcon = R.drawable.view_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("View Tab", "Document views, navigation, zoom, and window management"),
            ContentItem.ScreenshotItem("View Tab Ribbon", "View tab showing Views, Immersive Reader, Page Movement, Show, Zoom, Window, and Macros groups"),

            ContentItem.SectionHeading("View Modes"),
            ContentItem.BulletItem("Print Layout (default) — Shows the document exactly as it prints, with page edges and margins"),
            ContentItem.BulletItem("Read Mode — Full-screen reading optimized for reading, not editing (press Esc to exit)"),
            ContentItem.BulletItem("Web Layout — Shows how the document looks as a web page (no page breaks)"),
            ContentItem.BulletItem("Outline View — Shows the heading structure. Collapse/expand sections. Drag headings to reorder."),
            ContentItem.BulletItem("Draft View — Text only, no images or margins. Fastest for heavy typing."),
            ContentItem.KeyShortcut("Ctrl+Alt+P", "Switch to Print Layout"),
            ContentItem.KeyShortcut("Ctrl+Alt+O", "Switch to Outline view"),

            ContentItem.SectionHeading("Show / Hide Ruler & Navigation Pane"),
            ContentItem.NumberedStep(1, "Ruler", "View → check Ruler. The horizontal ruler shows margins, tabs, and paragraph indents."),
            ContentItem.NumberedStep(2, "Navigation Pane (Ctrl+F)", "View → check Navigation Pane. Shows three tabs:"),
            ContentItem.BulletItem("Headings tab — Click any heading to jump to that section instantly"),
            ContentItem.BulletItem("Pages tab — Thumbnail grid of all pages; click to jump to any page"),
            ContentItem.BulletItem("Results tab — Search results when using the search box"),
            ContentItem.TipBox("In the Navigation Pane Headings tab, drag heading items up or down to reorder entire document sections without cut-and-paste."),
            ContentItem.ScreenshotItem("Navigation Pane", "Navigation Pane showing the Headings tab with a 3-level document outline and the current section highlighted"),

            ContentItem.SectionHeading("Zoom"),
            ContentItem.NumberedStep(1, "View → Zoom", "Opens the Zoom dialog — set exact percentage, Page Width, Whole Page, Two Pages, or Many Pages."),
            ContentItem.NumberedStep(2, "Quick zoom", "Use the zoom slider in the bottom-right corner of the Word window."),
            ContentItem.NumberedStep(3, "Mouse wheel zoom", "Hold Ctrl and scroll the mouse wheel to zoom in or out."),

            ContentItem.SectionHeading("Window Management & Macros"),
            ContentItem.BulletItem("New Window — Opens a second window on the same document (both reflect live changes)"),
            ContentItem.BulletItem("Split — Divides one document into two scrollable panes"),
            ContentItem.BulletItem("View Side by Side — Shows two documents next to each other for comparison"),
            ContentItem.BulletItem("Synchronous Scrolling — Scrolls both side-by-side documents together"),
            ContentItem.NumberedStep(1, "Record a Macro", "View → Macros → Record Macro → name it → assign a button or shortcut → perform your steps → Stop Recording."),
            ContentItem.NumberedStep(2, "Run a Macro", "View → Macros → View Macros → select macro → Run."),
            ContentItem.KeyShortcut("Alt+F8", "Open Macros dialog"),
        )
    )

    private fun wordDrawTab() = BookSection(
        tabName = "Draw",
        tabIcon = R.drawable.draw_tab,
        levelTag = "Intermediate",
        content = listOf(
            ContentItem.ChapterHeader("Draw Tab", "Digital ink, handwriting recognition, and ink-to-text conversion"),
            ContentItem.ScreenshotItem("Draw Tab Ribbon", "Draw tab showing Drawing Tools (pen, pencil, highlighter), Insert Ink, and Convert groups"),

            ContentItem.SectionHeading("Drawing Tools"),
            ContentItem.NumberedStep(1, "Enable drawing mode", "Draw → Draw with Mouse (or use a stylus on a touchscreen)."),
            ContentItem.NumberedStep(2, "Choose a tool", "Select Pen (solid lines), Pencil (textured/sketchy), or Highlighter (semi-transparent)."),
            ContentItem.NumberedStep(3, "Customize the pen", "Double-click any pen icon to set its Color, Thickness (0.25–6mm), and special effects (Rainbow, Galaxy, Gold, etc.)."),
            ContentItem.NumberedStep(4, "Erase", "Draw → Eraser → Stroke Eraser (removes a whole stroke) or Segment Eraser (removes only the part you touch)."),
            ContentItem.ScreenshotItem("Draw Toolbar", "Pen, Pencil, and Highlighter tools shown with a pen customization popup for color and thickness"),

            ContentItem.SectionHeading("Lasso Select"),
            ContentItem.NumberedStep(1, "Draw → Lasso Select", "Your cursor becomes a lasso."),
            ContentItem.NumberedStep(2, "Draw around ink", "Circle the ink strokes you want to select."),
            ContentItem.NumberedStep(3, "Move or resize", "Drag the selection to move it, or drag corners to resize."),

            ContentItem.SectionHeading("Ink to Text"),
            ContentItem.NumberedStep(1, "Write text", "Use the Pen tool to write words by hand."),
            ContentItem.NumberedStep(2, "Lasso select the handwriting", "Circle the written text with Lasso Select."),
            ContentItem.NumberedStep(3, "Draw → Ink to Text", "Word recognizes and converts the handwriting to typed text automatically."),
            ContentItem.TipBox("Works best with clear, consistent handwriting. Print letters separately for best recognition accuracy."),

            ContentItem.SectionHeading("Ink to Shape & Ink to Math"),
            ContentItem.NumberedStep(1, "Ink to Shape", "Draw a rough shape → Lasso select it → Draw → Ink to Shape. Word snaps it to a perfect vector shape."),
            ContentItem.NumberedStep(2, "Ink to Math", "Draw → Ink to Math → write an equation by hand in the yellow box → Word recognizes it → Insert."),
            ContentItem.NoteBox("Ink Replay (Draw → Ink Replay) animates your drawing stroke-by-stroke — useful for teaching or demonstrations."),
        )
    )

    private fun wordHelpTab() = BookSection(
        tabName = "Help",
        tabIcon = R.drawable.help_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Help Tab", "Support, training, and master keyboard shortcut reference"),
            ContentItem.ScreenshotItem("Help Tab Ribbon", "Help tab showing Help, Show Training, What's New, Contact Support, and Feedback buttons"),

            ContentItem.SectionHeading("Getting Help"),
            ContentItem.NumberedStep(1, "Press F1", "Opens the Help task pane. Type any question or keyword to search Microsoft's documentation."),
            ContentItem.NumberedStep(2, "Tell Me / Search (Alt+Q)", "Type a feature name directly in the search bar in the ribbon. Click results to execute features instantly without navigating tabs."),
            ContentItem.NumberedStep(3, "Show Training", "Help → Show Training — free Microsoft video lessons for Word basics, collaboration, and advanced features."),
            ContentItem.NumberedStep(4, "Contact Support", "Help → Contact Support — opens the Microsoft Support portal for live chat or callback."),
            ContentItem.TipBox("Tell Me (Alt+Q) is the fastest way to find any feature. Type 'double spacing', 'insert table', or 'track changes' and execute with one click."),

            ContentItem.SectionHeading("Master Keyboard Shortcut Reference"),
            ContentItem.SubHeading("File Operations"),
            ContentItem.KeyShortcut("Ctrl+N", "New document"),
            ContentItem.KeyShortcut("Ctrl+O", "Open document"),
            ContentItem.KeyShortcut("Ctrl+S", "Save"),
            ContentItem.KeyShortcut("F12", "Save As"),
            ContentItem.KeyShortcut("Ctrl+P", "Print"),
            ContentItem.KeyShortcut("Ctrl+W", "Close document"),
            ContentItem.SubHeading("Editing"),
            ContentItem.KeyShortcut("Ctrl+Z", "Undo"),
            ContentItem.KeyShortcut("Ctrl+Y", "Redo"),
            ContentItem.KeyShortcut("Ctrl+F", "Find"),
            ContentItem.KeyShortcut("Ctrl+H", "Find & Replace"),
            ContentItem.KeyShortcut("Ctrl+G", "Go To page/section"),
            ContentItem.SubHeading("Navigation"),
            ContentItem.KeyShortcut("Ctrl+Home", "Jump to top of document"),
            ContentItem.KeyShortcut("Ctrl+End", "Jump to bottom of document"),
            ContentItem.KeyShortcut("Ctrl+←/→", "Move word by word"),
            ContentItem.KeyShortcut("Ctrl+↑/↓", "Move paragraph by paragraph"),
            ContentItem.SubHeading("Formatting"),
            ContentItem.KeyShortcut("Ctrl+B", "Bold"),
            ContentItem.KeyShortcut("Ctrl+I", "Italic"),
            ContentItem.KeyShortcut("Ctrl+U", "Underline"),
            ContentItem.KeyShortcut("Ctrl+Shift+V", "Paste Special"),
            ContentItem.KeyShortcut("Alt+Shift+X", "Mark Index entry"),
            ContentItem.KeyShortcut("Ctrl+Alt+M", "Insert comment"),
            ContentItem.KeyShortcut("Ctrl+Shift+E", "Toggle Track Changes"),
        )
    )

    // ═══════════════════════════════════════════════════════════════
    //  MS EXCEL
    // ═══════════════════════════════════════════════════════════════

    private fun getExcelApp() = OfficeApp(
        appName = "MS Excel",
        appIcon = R.drawable.ic_excel,
        primaryColor = 0xFF217346L,
        sections = listOf(
            excelGettingStarted(), excelHomeTab(),
            excelFormulas(), excelDataTab(),
            excelChartsTab(), excelPivotTables()
        )
    )

    private fun excelGettingStarted() = BookSection(
        tabName = "Getting Started",
        tabIcon = R.drawable.ic_excel,
        levelTag = "Beginner",
        content = listOf(
            ContentItem.ChapterHeader("Microsoft Excel", "The world's most powerful spreadsheet application"),
            ContentItem.ScreenshotItem("Excel Interface", "Excel window showing the ribbon, Name Box (A1), Formula Bar, column letters (A, B, C...), row numbers (1, 2, 3...), sheet tabs, and status bar"),

            ContentItem.SectionHeading("Understanding the Excel Interface"),
            ContentItem.BulletItem("Cell — The basic unit. Each cell has an address like A1, B3, or Z100."),
            ContentItem.BulletItem("Column — Vertical strip identified by letters (A, B, C... Z, AA, AB...)."),
            ContentItem.BulletItem("Row — Horizontal strip identified by numbers (1, 2, 3...)."),
            ContentItem.BulletItem("Name Box — Shows the address of the selected cell (top-left)."),
            ContentItem.BulletItem("Formula Bar — Shows the content or formula of the selected cell."),
            ContentItem.BulletItem("Sheet Tabs — Multiple worksheets in one workbook (Sheet1, Sheet2, etc.)."),
            ContentItem.NoteBox("Excel workbooks contain up to 1,048,576 rows and 16,384 columns per sheet."),

            ContentItem.SectionHeading("Entering Data"),
            ContentItem.NumberedStep(1, "Click a cell", "Click any cell to select it. The cell address appears in the Name Box."),
            ContentItem.NumberedStep(2, "Type your data", "Type text, numbers, or dates. Press Enter to confirm and move down."),
            ContentItem.NumberedStep(3, "Move with Tab", "Press Tab to confirm and move right. Shift+Tab to move left."),
            ContentItem.NumberedStep(4, "Edit a cell", "Double-click a cell to edit in-place, or press F2."),
            ContentItem.KeyShortcut("Enter", "Confirm entry and move down"),
            ContentItem.KeyShortcut("Tab", "Confirm entry and move right"),
            ContentItem.KeyShortcut("Esc", "Cancel entry"),
            ContentItem.KeyShortcut("F2", "Edit the active cell"),
            ContentItem.KeyShortcut("Ctrl+Z", "Undo"),

            ContentItem.SectionHeading("AutoFill"),
            ContentItem.NumberedStep(1, "Type a starting value", "Type Monday, January, or 1 in a cell."),
            ContentItem.NumberedStep(2, "Hover the fill handle", "Hover the bottom-right corner of the cell — cursor changes to a black +."),
            ContentItem.NumberedStep(3, "Drag to fill", "Drag down or across. Excel auto-fills the series: Tuesday, Wednesday... or February, March..."),
            ContentItem.ScreenshotItem("AutoFill in Action", "A cell with 'Monday' selected, with the fill handle being dragged down filling in Tuesday through Sunday"),
            ContentItem.TipBox("Type 1 and 2 in two cells, select both, then drag the fill handle — Excel continues the numeric pattern (3, 4, 5...)."),

            ContentItem.SectionHeading("Saving and File Formats"),
            ContentItem.BulletItem(".xlsx — Standard Excel format (default)"),
            ContentItem.BulletItem(".xls — Legacy Excel 97-2003 format (for old systems)"),
            ContentItem.BulletItem(".csv — Comma-separated values (plain text, universal compatibility)"),
            ContentItem.BulletItem(".pdf — Export as PDF for sharing (File → Save As → PDF)"),
            ContentItem.KeyShortcut("Ctrl+S", "Save"),
            ContentItem.KeyShortcut("F12", "Save As"),
        )
    )

    private fun excelHomeTab() = BookSection(
        tabName = "Formatting",
        tabIcon = R.drawable.home_tab,
        levelTag = "Beginner → Intermediate",
        content = listOf(
            ContentItem.ChapterHeader("Excel Formatting", "Number formats, cell styles, and conditional formatting"),
            ContentItem.ScreenshotItem("Excel Home Tab", "Excel Home tab showing Clipboard, Font, Alignment, Number, Styles, Cells, and Editing groups"),

            ContentItem.SectionHeading("Number Formatting"),
            ContentItem.BodyText("Number formatting controls how values display in cells without changing the underlying data."),
            ContentItem.NumberedStep(1, "Select cells", "Click and drag to select the cells you want to format."),
            ContentItem.NumberedStep(2, "Open the Number group", "Home → Number group — click the dropdown (shows 'General' by default)."),
            ContentItem.NumberedStep(3, "Choose a format", ""),
            ContentItem.BulletItem("General — Default; Excel chooses the best display"),
            ContentItem.BulletItem("Number — Fixed decimal places (e.g., 1234.50)"),
            ContentItem.BulletItem("Currency — Adds currency symbol (e.g., $1,234.50)"),
            ContentItem.BulletItem("Accounting — Aligns currency symbols and decimal points in columns"),
            ContentItem.BulletItem("Date — Displays dates (e.g., 4/8/2026 or April 8, 2026)"),
            ContentItem.BulletItem("Time — Displays time (e.g., 2:30 PM)"),
            ContentItem.BulletItem("Percentage — Multiplies by 100 and adds % (e.g., 0.75 → 75%)"),
            ContentItem.BulletItem("Fraction — Displays as a fraction (e.g., 0.5 → 1/2)"),
            ContentItem.BulletItem("Scientific — Exponential notation (e.g., 1.23E+06)"),
            ContentItem.BulletItem("Text — Treats the cell as text (numbers won't calculate)"),
            ContentItem.ScreenshotItem("Number Format Dropdown", "Number format dropdown showing General, Number, Currency, Accounting, Short Date, Long Date, Time, Percentage, Fraction, Scientific, Text, and More Number Formats"),
            ContentItem.KeyShortcut("Ctrl+1", "Open Format Cells dialog"),
            ContentItem.KeyShortcut("Ctrl+Shift+$", "Apply Currency format"),
            ContentItem.KeyShortcut("Ctrl+Shift+%", "Apply Percentage format"),
            ContentItem.KeyShortcut("Ctrl+Shift+#", "Apply Date format"),

            ContentItem.SectionHeading("Cell Alignment & Merging"),
            ContentItem.NumberedStep(1, "Align content", "Home → Alignment group → click Left, Center, Right, Top, Middle, or Bottom align."),
            ContentItem.NumberedStep(2, "Wrap Text", "Home → Wrap Text — fits all text in the cell by increasing row height."),
            ContentItem.NumberedStep(3, "Merge cells", "Select cells → Home → Merge & Center → choose Merge & Center, Merge Across, Merge Cells, or Unmerge Cells."),
            ContentItem.WarningBox("Avoid merging cells in tables or data ranges — it breaks sorting, filtering, and formulas. Use 'Center Across Selection' instead (Format Cells → Alignment tab)."),

            ContentItem.SectionHeading("Conditional Formatting"),
            ContentItem.BodyText("Conditional formatting applies color, icons, or data bars based on cell values — no formulas required."),
            ContentItem.NumberedStep(1, "Select the data range", "Click and drag to select the cells."),
            ContentItem.NumberedStep(2, "Home → Conditional Formatting", "Choose a rule type:"),
            ContentItem.BulletItem("Highlight Cell Rules — Color cells above/below a threshold, equal to a value, or containing text"),
            ContentItem.BulletItem("Top/Bottom Rules — Highlight top 10%, bottom 10 items, above/below average"),
            ContentItem.BulletItem("Data Bars — In-cell bar chart showing relative size"),
            ContentItem.BulletItem("Color Scales — Gradient color across the range (e.g., red → yellow → green)"),
            ContentItem.BulletItem("Icon Sets — Traffic lights, arrows, or stars based on value ranges"),
            ContentItem.NumberedStep(3, "Manage rules", "Home → Conditional Formatting → Manage Rules — edit, delete, or reorder existing rules."),
            ContentItem.ScreenshotItem("Conditional Formatting", "A sales data table with Data Bars applied — shorter bars for lower values, taller bars for higher values, and red color scale for negative values"),
        )
    )

    private fun excelFormulas() = BookSection(
        tabName = "Formulas",
        tabIcon = R.drawable.references_tab,
        levelTag = "Beginner → Advanced",
        content = listOf(
            ContentItem.ChapterHeader("Excel Formulas", "From basic arithmetic to advanced lookup functions"),
            ContentItem.ScreenshotItem("Formula Bar", "Formula bar showing =VLOOKUP(A2,Sheet2!A:C,2,FALSE) with the Formulas tab visible"),

            ContentItem.SectionHeading("Formula Basics"),
            ContentItem.BodyText("Every formula starts with = (equals sign). Excel calculates the result and displays it in the cell."),
            ContentItem.NumberedStep(1, "Type = in a cell", "This tells Excel you are entering a formula, not data."),
            ContentItem.NumberedStep(2, "Enter the formula", "Type your formula using cell references, operators, and functions."),
            ContentItem.NumberedStep(3, "Press Enter", "Excel calculates and displays the result."),
            ContentItem.NumberedStep(4, "See the formula", "Click the result cell — the formula appears in the Formula Bar."),
            ContentItem.TipBox("Use cell references (A1, B3) instead of typed numbers. When the source data changes, your formula updates automatically."),
            ContentItem.FormulaItem("=A1+B1", "Adds the values in cells A1 and B1"),
            ContentItem.FormulaItem("=A1*B1", "Multiplies A1 by B1"),
            ContentItem.FormulaItem("=A1/B1", "Divides A1 by B1"),
            ContentItem.FormulaItem("=A1^2", "Raises A1 to the power of 2 (A1 squared)"),

            ContentItem.SectionHeading("Essential Functions"),
            ContentItem.SubHeading("SUM — Add a range"),
            ContentItem.FormulaItem("=SUM(A1:A10)", "Adds all values from A1 to A10"),
            ContentItem.FormulaItem("=SUM(A1:A10, C1:C10)", "Adds two separate ranges together"),
            ContentItem.KeyShortcut("Alt+=", "AutoSum — inserts SUM for the range above"),
            ContentItem.SubHeading("AVERAGE, MIN, MAX, COUNT"),
            ContentItem.FormulaItem("=AVERAGE(B2:B20)", "Calculates the mean of B2 through B20"),
            ContentItem.FormulaItem("=MIN(C2:C50)", "Returns the smallest value in the range"),
            ContentItem.FormulaItem("=MAX(C2:C50)", "Returns the largest value in the range"),
            ContentItem.FormulaItem("=COUNT(D2:D100)", "Counts cells that contain numbers"),
            ContentItem.FormulaItem("=COUNTA(D2:D100)", "Counts all non-empty cells (including text)"),
            ContentItem.SubHeading("IF — Conditional logic"),
            ContentItem.FormulaItem("=IF(A1>100, \"Pass\", \"Fail\")", "If A1 is greater than 100, shows 'Pass'; otherwise 'Fail'"),
            ContentItem.FormulaItem("=IF(B2=\"Yes\", C2*1.1, C2)", "If B2 is Yes, multiply C2 by 1.1; otherwise return C2 unchanged"),
            ContentItem.BodyText("Nested IF: Stack multiple conditions: =IF(A1>=90,\"A\", IF(A1>=80,\"B\", IF(A1>=70,\"C\",\"F\")))"),
            ContentItem.SubHeading("VLOOKUP — Vertical lookup"),
            ContentItem.BodyText("VLOOKUP searches the first column of a range for a value, then returns a value from a specified column in the same row."),
            ContentItem.FormulaItem("=VLOOKUP(A2, B:D, 2, FALSE)", "Looks up value in A2 in column B, returns the value from column C (2nd column of B:D). FALSE = exact match."),
            ContentItem.ScreenshotItem("VLOOKUP Example", "Spreadsheet showing VLOOKUP looking up an Employee ID in column A, searching table B:D, and returning the employee's department name"),
            ContentItem.TipBox("Always use FALSE for exact match in VLOOKUP. TRUE does approximate matching and requires the lookup column to be sorted ascending."),
            ContentItem.SubHeading("XLOOKUP — Modern replacement for VLOOKUP"),
            ContentItem.FormulaItem("=XLOOKUP(A2, B:B, C:C, \"Not found\")", "Looks up A2 in column B, returns matching value from column C. Shows 'Not found' if no match. More flexible than VLOOKUP."),
            ContentItem.SubHeading("COUNTIF & SUMIF"),
            ContentItem.FormulaItem("=COUNTIF(A:A, \"Apple\")", "Counts how many cells in column A contain the word 'Apple'"),
            ContentItem.FormulaItem("=COUNTIF(B:B, \">100\")", "Counts cells in column B with values greater than 100"),
            ContentItem.FormulaItem("=SUMIF(A:A, \"North\", B:B)", "Sums values in column B where column A equals 'North'"),
            ContentItem.SubHeading("Text Functions"),
            ContentItem.FormulaItem("=CONCAT(A1, \" \", B1)", "Joins text from A1, a space, and B1 (e.g., 'John' + ' ' + 'Smith' = 'John Smith')"),
            ContentItem.FormulaItem("=LEFT(A1, 3)", "Returns the first 3 characters of A1"),
            ContentItem.FormulaItem("=RIGHT(A1, 4)", "Returns the last 4 characters of A1"),
            ContentItem.FormulaItem("=LEN(A1)", "Returns the number of characters in A1"),
            ContentItem.FormulaItem("=UPPER(A1)", "Converts text in A1 to UPPERCASE"),
            ContentItem.FormulaItem("=TRIM(A1)", "Removes extra spaces from the start, end, and middle of text"),

            ContentItem.SectionHeading("Absolute vs Relative References"),
            ContentItem.BodyText("When you copy a formula to another cell, cell references change (relative). Add $ signs to lock them (absolute)."),
            ContentItem.FormulaItem("=A1*B1", "Relative — both A1 and B1 change when the formula is copied"),
            ContentItem.FormulaItem("=A1*\$B\$1", "B1 is absolute — stays fixed when copied. A1 still adjusts."),
            ContentItem.FormulaItem("=\$A\$1*\$B\$1", "Both references are absolute — neither changes when copied"),
            ContentItem.KeyShortcut("F4", "Toggle between relative, absolute, and mixed references"),
        )
    )

    private fun excelDataTab() = BookSection(
        tabName = "Data Tools",
        tabIcon = R.drawable.layout_tab,
        levelTag = "Intermediate → Advanced",
        content = listOf(
            ContentItem.ChapterHeader("Data Tab", "Sort, filter, validation, text-to-columns, and data tools"),
            ContentItem.ScreenshotItem("Excel Data Tab", "Data tab showing Get & Transform Data, Queries & Connections, Sort & Filter, Data Tools, Forecast, and Outline groups"),

            ContentItem.SectionHeading("Sort Data"),
            ContentItem.NumberedStep(1, "Click inside your data range", "Click any cell in the column you want to sort."),
            ContentItem.NumberedStep(2, "Data → Sort A to Z or Z to A", "For a quick single-column sort."),
            ContentItem.NumberedStep(3, "Multi-column sort", "Data → Sort → click 'Add Level' to sort by multiple columns (e.g., sort by Department, then by Last Name within each department)."),
            ContentItem.ScreenshotItem("Sort Dialog", "Sort dialog showing Sort by 'Department' (A to Z), Then by 'LastName' (A to Z) levels"),

            ContentItem.SectionHeading("Filter Data"),
            ContentItem.NumberedStep(1, "Click inside your table", "Click any cell in the data range."),
            ContentItem.NumberedStep(2, "Data → Filter (Ctrl+Shift+L)", "Dropdown arrows appear in the header row."),
            ContentItem.NumberedStep(3, "Click a dropdown arrow", "Check/uncheck values to show/hide rows. Use 'Number Filters' or 'Text Filters' for range-based filtering."),
            ContentItem.NumberedStep(4, "Clear filters", "Data → Clear, or click the filter arrow → 'Clear Filter From [Column]'."),
            ContentItem.TipBox("Use Ctrl+Shift+L to toggle Filter on/off quickly. AutoFilter is one of Excel's most used features."),

            ContentItem.SectionHeading("Data Validation"),
            ContentItem.NumberedStep(1, "Select cells to restrict", "Highlight the input cells."),
            ContentItem.NumberedStep(2, "Data → Data Validation", "Opens the Data Validation dialog."),
            ContentItem.NumberedStep(3, "Set validation rule", "Allow: Whole number, Decimal, List, Date, Time, Text length, or Custom formula."),
            ContentItem.NumberedStep(4, "Dropdown list", "Choose 'List' → enter comma-separated values (e.g., Yes,No,Maybe) or select a range with your list."),
            ContentItem.NumberedStep(5, "Error alert", "Go to the Error Alert tab → type a message shown when invalid data is entered."),
            ContentItem.ScreenshotItem("Data Validation Dropdown", "A cell with a dropdown arrow showing a list: Yes, No, Pending, Approved, Rejected"),

            ContentItem.SectionHeading("Text to Columns"),
            ContentItem.NumberedStep(1, "Select the column", "Select the cells containing text to split."),
            ContentItem.NumberedStep(2, "Data → Text to Columns", "Opens the Convert Text to Columns Wizard."),
            ContentItem.NumberedStep(3, "Choose delimiter", "Delimited (split by comma, tab, space, or other character) or Fixed Width (split at specific character positions)."),
            ContentItem.NumberedStep(4, "Set destination", "Choose where to put the split data → Finish."),
            ContentItem.TipBox("Use Text to Columns to split 'John Smith' into 'John' and 'Smith' in separate columns, or to parse dates from imported CSV files."),

            ContentItem.SectionHeading("Remove Duplicates"),
            ContentItem.NumberedStep(1, "Click inside your data", "Any cell in the range."),
            ContentItem.NumberedStep(2, "Data → Remove Duplicates", "Choose which columns to check for duplicates."),
            ContentItem.NumberedStep(3, "Click OK", "Excel removes duplicate rows and reports how many were removed."),
            ContentItem.WarningBox("Remove Duplicates permanently deletes rows. Make a copy of your data before running this if you might need the originals."),
        )
    )

    private fun excelChartsTab() = BookSection(
        tabName = "Charts",
        tabIcon = R.drawable.insert_tab,
        levelTag = "Beginner → Intermediate",
        content = listOf(
            ContentItem.ChapterHeader("Excel Charts", "Visualize data with professional charts and graphs"),
            ContentItem.ScreenshotItem("Chart Types Gallery", "Insert Chart dialog showing Bar, Column, Line, Pie, Area, XY Scatter, Map, Stock, Surface, Radar, Treemap, Sunburst, Histogram, Box & Whisker, Waterfall, Funnel, and Combo chart types"),

            ContentItem.SectionHeading("Create a Chart"),
            ContentItem.NumberedStep(1, "Select your data", "Highlight the cells containing the data AND headers you want to chart."),
            ContentItem.NumberedStep(2, "Insert → Chart", "Click Insert → Charts group → click the chart type icon, or click 'Recommended Charts' for suggestions."),
            ContentItem.NumberedStep(3, "Choose a chart type", "See recommended types or browse the 'All Charts' tab."),
            ContentItem.NumberedStep(4, "Click OK", "The chart is inserted into the sheet."),
            ContentItem.TipBox("Select your data first, then press Alt+F1 to instantly create a default chart. Press F11 to create the chart on a new chart sheet."),

            ContentItem.SectionHeading("Chart Types Guide"),
            ContentItem.BulletItem("Column/Bar — Compare quantities across categories (sales by region, scores by student)"),
            ContentItem.BulletItem("Line — Show trends over time (monthly revenue, daily temperature)"),
            ContentItem.BulletItem("Pie/Donut — Show proportions of a whole (market share, budget allocation) — use only with a few categories"),
            ContentItem.BulletItem("Area — Like a line chart but filled in — shows cumulative values over time"),
            ContentItem.BulletItem("Scatter (XY) — Show correlation between two numeric variables"),
            ContentItem.BulletItem("Combo — Combine two chart types (e.g., column + line for budget vs. actual)"),
            ContentItem.BulletItem("Histogram — Show distribution/frequency of data"),

            ContentItem.SectionHeading("Customize a Chart"),
            ContentItem.NumberedStep(1, "Click the chart", "The Chart Design and Format tabs appear in the ribbon."),
            ContentItem.NumberedStep(2, "Chart Design → Quick Layout", "Choose a pre-set layout for axis labels, titles, and legend position."),
            ContentItem.NumberedStep(3, "Chart Design → Change Colors", "Apply a different color palette from the options."),
            ContentItem.NumberedStep(4, "Add Chart Elements", "Click the + button next to the chart → add/remove Axis Titles, Data Labels, Legend, Gridlines, Trendline, and more."),
            ContentItem.NumberedStep(5, "Move the chart", "Chart Design → Move Chart → 'New sheet' (dedicated chart sheet) or 'Object in' (stays on the data sheet)."),
            ContentItem.ScreenshotItem("Chart with Labels", "A column chart with the chart title 'Quarterly Sales', data labels showing values on each bar, and a legend at the bottom"),
        )
    )

    private fun excelPivotTables() = BookSection(
        tabName = "Pivot Tables",
        tabIcon = R.drawable.design_tab,
        levelTag = "Advanced",
        content = listOf(
            ContentItem.ChapterHeader("Pivot Tables", "Summarize thousands of rows of data in seconds"),
            ContentItem.ScreenshotItem("Pivot Table Overview", "A raw sales data table on the left and a finished Pivot Table summary on the right showing total sales by region and product"),

            ContentItem.SectionHeading("What is a Pivot Table?"),
            ContentItem.BodyText("A Pivot Table is an interactive summary table that lets you group, count, sum, and analyze large datasets without formulas. It's the most powerful analysis tool in Excel."),
            ContentItem.NoteBox("Pivot Tables do not change your original data. They create a separate summary view that you can rearrange at any time."),

            ContentItem.SectionHeading("Create a Pivot Table"),
            ContentItem.NumberedStep(1, "Prepare clean data", "Your data must have column headers in row 1, no blank rows, and no merged cells."),
            ContentItem.NumberedStep(2, "Click inside your data", "Any cell in the data range."),
            ContentItem.NumberedStep(3, "Insert → PivotTable", "Excel selects the data range automatically. Choose New Worksheet → OK."),
            ContentItem.NumberedStep(4, "The PivotTable pane opens", "The PivotTable Field List appears on the right side."),
            ContentItem.ScreenshotItem("PivotTable Field List", "PivotTable Field List pane showing available fields at the top and the four drop zones: Filters, Columns, Rows, and Values"),

            ContentItem.SectionHeading("Build the Pivot Table"),
            ContentItem.NumberedStep(1, "Add rows", "Drag a field to the Rows box (e.g., 'Region' → gives you one row per region)."),
            ContentItem.NumberedStep(2, "Add values", "Drag a numeric field to the Values box (e.g., 'Sales' → sums sales per region)."),
            ContentItem.NumberedStep(3, "Add columns", "Drag a field to Columns (e.g., 'Quarter' → creates a column per quarter)."),
            ContentItem.NumberedStep(4, "Add filters", "Drag a field to Filters → a filter dropdown appears above the table."),
            ContentItem.TipBox("Drag and drop fields between zones to rearrange the table. Your original data is never touched."),

            ContentItem.SectionHeading("Pivot Table Analysis"),
            ContentItem.NumberedStep(1, "Change summary function", "Right-click a value → 'Value Field Settings' → change Sum to Count, Average, Max, Min, or %."),
            ContentItem.NumberedStep(2, "Sort & Filter", "Click the dropdown arrow in any Row or Column label to sort, filter, or expand/collapse groups."),
            ContentItem.NumberedStep(3, "Refresh the data", "If your source data changes: right-click anywhere on the Pivot Table → Refresh."),
            ContentItem.NumberedStep(4, "Add a Slicer", "PivotTable Analyze → Insert Slicer → choose a field. Slicers add visual filter buttons you can click to filter the table instantly."),
            ContentItem.ScreenshotItem("Pivot Table with Slicer", "Pivot Table showing Sales by Region and Quarter with a Slicer panel for Product Category with North, South, East, West buttons"),
        )
    )

    // ═══════════════════════════════════════════════════════════════
    //  MS POWERPOINT
    // ═══════════════════════════════════════════════════════════════

    private fun getPowerPointApp() = OfficeApp(
        appName = "PowerPoint",
        appIcon = R.drawable.ic_powerpoint,
        primaryColor = 0xFFD24726L,
        sections = listOf(
            pptGettingStarted(), pptDesignThemes(),
            pptTextAndObjects(), pptAnimations(),
            pptSlideShow()
        )
    )

    private fun pptGettingStarted() = BookSection(
        tabName = "Getting Started",
        tabIcon = R.drawable.ic_powerpoint,
        levelTag = "Beginner",
        content = listOf(
            ContentItem.ChapterHeader("Microsoft PowerPoint", "Create professional presentations from scratch"),
            ContentItem.ScreenshotItem("PowerPoint Interface", "PowerPoint window showing the ribbon, Slides panel on the left, main editing area, and Notes panel at the bottom"),

            ContentItem.SectionHeading("Understanding the Interface"),
            ContentItem.BulletItem("Slides Panel — Left sidebar showing thumbnail previews of all slides"),
            ContentItem.BulletItem("Editing Area — The large central area where you design each slide"),
            ContentItem.BulletItem("Notes Panel — Below the slide, for speaker notes (not shown to audience)"),
            ContentItem.BulletItem("Slide Layout — The template structure of placeholders on each slide"),
            ContentItem.BulletItem("Outline View — View → Outline View — see all slide text in document-style outline"),

            ContentItem.SectionHeading("Creating Your First Presentation"),
            ContentItem.NumberedStep(1, "Open PowerPoint", "Click Blank Presentation for a fresh start, or choose a template from the gallery."),
            ContentItem.NumberedStep(2, "Click a placeholder", "Click 'Click to add title' or 'Click to add text' in the slide to start typing."),
            ContentItem.NumberedStep(3, "Add a new slide", "Home → New Slide → choose a layout (Title Slide, Title and Content, Two Content, Blank, etc.)."),
            ContentItem.NumberedStep(4, "Duplicate a slide", "Right-click a slide in the Slides panel → Duplicate Slide."),
            ContentItem.NumberedStep(5, "Rearrange slides", "Drag slides up or down in the Slides panel to reorder."),
            ContentItem.KeyShortcut("Ctrl+M", "Insert new slide"),
            ContentItem.KeyShortcut("Ctrl+D", "Duplicate selected slide"),
            ContentItem.KeyShortcut("Ctrl+Enter", "Move to next placeholder on slide"),

            ContentItem.SectionHeading("Slide Layouts"),
            ContentItem.BodyText("A Slide Layout defines where placeholders (title, content, image) are positioned on the slide. Always use layouts instead of manually positioning text boxes — this ensures consistency."),
            ContentItem.BulletItem("Title Slide — Large centered title + subtitle (use as the first slide)"),
            ContentItem.BulletItem("Title and Content — Title at top, large content area below (most common)"),
            ContentItem.BulletItem("Two Content — Title + two side-by-side content areas"),
            ContentItem.BulletItem("Comparison — Two columns with headers (for comparing items)"),
            ContentItem.BulletItem("Blank — Empty slide for fully custom design"),
            ContentItem.TipBox("Change a slide's layout anytime: Home → Layout → choose a new one. Your existing content is repositioned to the new layout's placeholders."),
        )
    )

    private fun pptDesignThemes() = BookSection(
        tabName = "Design",
        tabIcon = R.drawable.design_tab,
        levelTag = "Beginner → Intermediate",
        content = listOf(
            ContentItem.ChapterHeader("Design & Themes", "Create a visually consistent professional presentation"),
            ContentItem.ScreenshotItem("Design Tab", "PowerPoint Design tab showing Themes gallery, Variants panel, Customize section, and Designer task pane"),

            ContentItem.SectionHeading("Apply a Theme"),
            ContentItem.NumberedStep(1, "Click Design tab", "The Themes gallery shows all built-in PowerPoint themes."),
            ContentItem.NumberedStep(2, "Hover to preview", "Hovering applies a live preview to all slides simultaneously."),
            ContentItem.NumberedStep(3, "Click to apply", "Applies the theme to every slide in the presentation."),
            ContentItem.NumberedStep(4, "Choose a Variant", "Each theme has 4 color variants shown in the Variants panel — click one to change the color palette while keeping the layout."),
            ContentItem.ScreenshotItem("Theme Variants", "A theme shown in 4 color variants: blue, red, green, and dark/black"),

            ContentItem.SectionHeading("Slide Size"),
            ContentItem.NumberedStep(1, "Design → Slide Size", "Choose Standard (4:3) or Widescreen (16:9 — modern default) or Custom Size."),
            ContentItem.WarningBox("Set the slide size BEFORE adding content. Changing it after may distort images and text positions."),

            ContentItem.SectionHeading("Slide Master — Control All Slides at Once"),
            ContentItem.BodyText("The Slide Master is the master template behind your presentation. Changes to the Slide Master automatically apply to all slides."),
            ContentItem.NumberedStep(1, "Open Slide Master", "View → Slide Master."),
            ContentItem.NumberedStep(2, "Edit the master slide", "The top slide (with the larger thumbnail) is the Slide Master. Edit its background, logo, font, footer, and colors."),
            ContentItem.NumberedStep(3, "Edit layouts", "The smaller slides below are individual Layout Masters. Edit specific layouts (Title Slide, Content, etc.) to customize just those."),
            ContentItem.NumberedStep(4, "Add a logo", "Insert a logo image on the Slide Master — it will appear on every slide automatically."),
            ContentItem.NumberedStep(5, "Close Slide Master", "Slide Master → Close Master View."),
            ContentItem.TipBox("Use the Slide Master to add your company logo and brand colors once — it propagates to the entire presentation instantly."),
            ContentItem.ScreenshotItem("Slide Master View", "Slide Master view showing the main master slide at top and layout slides below, with a logo placeholder in the bottom-left corner"),
        )
    )

    private fun pptTextAndObjects() = BookSection(
        tabName = "Content",
        tabIcon = R.drawable.insert_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Text & Objects", "Text boxes, images, shapes, SmartArt, charts, and tables"),
            ContentItem.ScreenshotItem("Insert Tab in PowerPoint", "PowerPoint Insert tab showing Tables, Images, Illustrations, Add-ins, Links, Comments, Text, and Media groups"),

            ContentItem.SectionHeading("Text Boxes & Formatting"),
            ContentItem.NumberedStep(1, "Click a text placeholder", "Click 'Click to add text' directly on the slide."),
            ContentItem.NumberedStep(2, "Insert a custom text box", "Insert → Text Box → draw a box on the slide."),
            ContentItem.NumberedStep(3, "Format text", "Select text → Home tab → change font, size, bold, italic, color, alignment."),
            ContentItem.TipBox("Keep text minimal on slides — aim for 6×6 rule: max 6 bullet points, max 6 words per bullet. Slides support your speech; they're not a teleprompter."),

            ContentItem.SectionHeading("Images & Icons"),
            ContentItem.NumberedStep(1, "Insert → Pictures", "Choose This Device, Stock Images, or Online Pictures."),
            ContentItem.NumberedStep(2, "Remove background", "Select image → Picture Format → Remove Background → mark areas to keep/remove."),
            ContentItem.NumberedStep(3, "Apply a picture style", "Picture Format → Picture Styles → choose frames, shadows, reflections, and 3D effects."),
            ContentItem.NumberedStep(4, "Insert icons", "Insert → Icons — search Microsoft's icon library (SVG format, recolorable)."),

            ContentItem.SectionHeading("Shapes & SmartArt"),
            ContentItem.NumberedStep(1, "Insert shapes", "Insert → Shapes → choose from 150+ shapes."),
            ContentItem.NumberedStep(2, "Format shapes", "Shape Format → Fill, Outline, Effects. Use Format Painter to copy styling."),
            ContentItem.NumberedStep(3, "Group objects", "Select multiple objects → right-click → Group → Group. Move and resize together."),
            ContentItem.NumberedStep(4, "SmartArt", "Insert → SmartArt → perfect for org charts, process flows, and comparison lists."),

            ContentItem.SectionHeading("Tables and Charts"),
            ContentItem.NumberedStep(1, "Insert a Table", "Insert → Table → select rows × columns. Use Table Design tab to apply styles."),
            ContentItem.NumberedStep(2, "Insert a Chart", "Insert → Chart → choose type → enter data in the Excel-style data editor → close editor."),
            ContentItem.NoteBox("Charts in PowerPoint are linked to an embedded Excel spreadsheet. Double-click the chart → Edit Data to update the values."),
        )
    )

    private fun pptAnimations() = BookSection(
        tabName = "Animations",
        tabIcon = R.drawable.draw_tab,
        levelTag = "Intermediate → Advanced",
        content = listOf(
            ContentItem.ChapterHeader("Transitions & Animations", "Add motion to slides and objects professionally"),
            ContentItem.ScreenshotItem("Transitions Tab", "Transitions tab showing the Transition gallery with Fade, Push, Wipe, Split, Reveal, Cut, and more — with Effect Options and Timing controls"),

            ContentItem.SectionHeading("Slide Transitions"),
            ContentItem.BodyText("Transitions are animations between one slide and the next. Apply them to individual slides or all slides at once."),
            ContentItem.NumberedStep(1, "Select a slide", "Click the slide thumbnail in the Slides panel."),
            ContentItem.NumberedStep(2, "Transitions tab", "Choose a transition: Fade, Push, Wipe, Split, Cover, Flash, Zoom, etc."),
            ContentItem.NumberedStep(3, "Effect Options", "Click 'Effect Options' to adjust direction (From Left, From Top, etc.)."),
            ContentItem.NumberedStep(4, "Set duration", "Transitions → Duration — controls speed (0.5s = fast, 2s = slow)."),
            ContentItem.NumberedStep(5, "Apply to All", "Transitions → Apply to All — applies the same transition to every slide."),
            ContentItem.WarningBox("Use one consistent transition throughout your presentation. Mixing many different transitions looks unprofessional."),

            ContentItem.SectionHeading("Object Animations"),
            ContentItem.BodyText("Animations control how individual objects (text, images, shapes) appear or move on a slide."),
            ContentItem.NumberedStep(1, "Select an object", "Click the text box, image, or shape you want to animate."),
            ContentItem.NumberedStep(2, "Animations tab", "Choose an animation category:"),
            ContentItem.BulletItem("Entrance — How the object appears: Fade, Fly In, Bounce, Zoom"),
            ContentItem.BulletItem("Emphasis — Draws attention to an existing object: Pulse, Spin, Grow/Shrink"),
            ContentItem.BulletItem("Exit — How the object disappears: Fade Out, Fly Out, Shrink"),
            ContentItem.BulletItem("Motion Path — Object moves along a custom drawn path"),
            ContentItem.NumberedStep(3, "Open Animation Pane", "Animations → Animation Pane — see all animations in order, drag to reorder."),
            ContentItem.NumberedStep(4, "Set trigger", "Each animation can start: On Click, With Previous (simultaneously), or After Previous (automatically in sequence)."),
            ContentItem.ScreenshotItem("Animation Pane", "Animation Pane showing a sequence of animations: Title (Fade), Bullet 1 (Fly In On Click), Bullet 2 (Fly In After Previous)"),
            ContentItem.TipBox("For bullet points, click 'Effect Options' → 'By Paragraph' to make each bullet appear one at a time on click — this keeps the audience focused on each point."),
        )
    )

    private fun pptSlideShow() = BookSection(
        tabName = "Slide Show",
        tabIcon = R.drawable.view_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Slide Show & Sharing", "Present confidently and share your work"),
            ContentItem.ScreenshotItem("Slide Show Tab", "Slide Show tab showing Start Slide Show, Set Up, and Monitors groups with Presenter View toggle"),

            ContentItem.SectionHeading("Present Your Slides"),
            ContentItem.NumberedStep(1, "Start from beginning", "Press F5 or Slide Show → From Beginning."),
            ContentItem.NumberedStep(2, "Start from current slide", "Press Shift+F5 or Slide Show → From Current Slide."),
            ContentItem.NumberedStep(3, "Navigate slides", "Press → or Page Down for next, ← or Page Up for previous."),
            ContentItem.NumberedStep(4, "Jump to a slide", "During presentation, type the slide number and press Enter."),
            ContentItem.NumberedStep(5, "End the show", "Press Esc to exit the presentation."),
            ContentItem.KeyShortcut("F5", "Start from beginning"),
            ContentItem.KeyShortcut("Shift+F5", "Start from current slide"),
            ContentItem.KeyShortcut("B", "Black screen (pause audience)"),
            ContentItem.KeyShortcut("W", "White screen"),
            ContentItem.KeyShortcut("Ctrl+P", "Pen annotation mode during slide show"),

            ContentItem.SectionHeading("Presenter View"),
            ContentItem.BodyText("Presenter View shows your current slide, next slide preview, speaker notes, and a timer — visible only to you on a second screen."),
            ContentItem.NumberedStep(1, "Enable Presenter View", "Slide Show → check 'Use Presenter View'."),
            ContentItem.NumberedStep(2, "Connect a projector", "Connect HDMI/DisplayPort → Windows detects second screen → PowerPoint automatically uses Presenter View."),
            ContentItem.NumberedStep(3, "Use the tools", "Draw on slides with the pen tool, zoom into any area, and read your notes while the audience sees only the slides."),
            ContentItem.ScreenshotItem("Presenter View", "Presenter View showing: current slide (large), next slide preview (top right), speaker notes (bottom), and timer running"),

            ContentItem.SectionHeading("Rehearse & Record"),
            ContentItem.NumberedStep(1, "Rehearse timings", "Slide Show → Rehearse Timings — records how long you spend on each slide."),
            ContentItem.NumberedStep(2, "Record narration", "Slide Show → Record → record your voice-over for each slide (creates a self-running presentation)."),

            ContentItem.SectionHeading("Export & Share"),
            ContentItem.NumberedStep(1, "Save as PDF", "File → Save As → PDF — creates a static version safe for sharing."),
            ContentItem.NumberedStep(2, "Export as video", "File → Export → Create a Video — choose resolution (1080p/4K) and whether to use recorded timings."),
            ContentItem.NumberedStep(3, "Package for CD/USB", "File → Export → Package Presentation for CD — bundles all linked media files with the presentation."),
            ContentItem.NumberedStep(4, "Share via OneDrive", "File → Share → Share → upload to OneDrive and invite collaborators with View or Edit access."),
        )
    )

    // ═══════════════════════════════════════════════════════════════
    //  MS OUTLOOK
    // ═══════════════════════════════════════════════════════════════

    private fun getOutlookApp() = OfficeApp(
        appName = "MS Outlook",
        appIcon = R.drawable.ic_outlook,
        primaryColor = 0xFF0078D4L,
        sections = listOf(outlookEmail(), outlookCalendar())
    )

    private fun outlookEmail() = BookSection(
        tabName = "Email",
        tabIcon = R.drawable.mailings_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Outlook Email", "Send, receive, and organize emails professionally"),
            ContentItem.ScreenshotItem("Outlook Interface", "Outlook window showing the folder list (left), email list (center), and reading pane (right) with the Home tab ribbon at top"),

            ContentItem.SectionHeading("Compose & Send Email"),
            ContentItem.NumberedStep(1, "New Email", "Press Ctrl+N or Home → New Email."),
            ContentItem.NumberedStep(2, "Enter recipients", "Type in the To field — Outlook auto-suggests from your address book. Press Tab to add CC."),
            ContentItem.NumberedStep(3, "Subject line", "Type a clear, concise subject line."),
            ContentItem.NumberedStep(4, "Write your message", "Click in the body area and type. Use the Message Format tab for formatting."),
            ContentItem.NumberedStep(5, "Attach files", "Message → Attach File → browse for the file, or drag and drop a file into the email body."),
            ContentItem.NumberedStep(6, "Send", "Click Send or press Ctrl+Enter (after confirming the setting)."),
            ContentItem.KeyShortcut("Ctrl+N", "New email"),
            ContentItem.KeyShortcut("Ctrl+R", "Reply"),
            ContentItem.KeyShortcut("Ctrl+Shift+R", "Reply All"),
            ContentItem.KeyShortcut("Ctrl+F", "Forward"),
            ContentItem.WarningBox("Always double-check Reply All before sending — reply-all storms waste everyone's time and can expose private information."),

            ContentItem.SectionHeading("Organize Your Inbox"),
            ContentItem.NumberedStep(1, "Create folders", "Right-click your inbox → New Folder → name it (e.g., 'Projects', 'Finance', 'Clients')."),
            ContentItem.NumberedStep(2, "Create rules", "Home → Rules → Manage Rules & Alerts → New Rule → set conditions to auto-move/label emails."),
            ContentItem.NumberedStep(3, "Focused Inbox", "View → Focused Inbox — Outlook learns which emails are important and separates them from 'Other'."),
            ContentItem.NumberedStep(4, "Search emails", "Use the Search bar at top — type sender name, subject keywords, or date ranges."),
            ContentItem.TipBox("Right-click any email and choose 'Create Rule' to automatically sort similar emails into folders without opening Rules & Alerts."),
        )
    )

    private fun outlookCalendar() = BookSection(
        tabName = "Calendar",
        tabIcon = R.drawable.ic_outlook,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Outlook Calendar", "Schedule meetings, set reminders, and manage your time"),
            ContentItem.ScreenshotItem("Outlook Calendar", "Outlook Calendar in Week view showing meetings, appointments, and a mini monthly calendar in the left panel"),

            ContentItem.SectionHeading("Create Appointments & Meetings"),
            ContentItem.NumberedStep(1, "Switch to Calendar", "Click the Calendar icon in the navigation bar (bottom left)."),
            ContentItem.NumberedStep(2, "New Appointment", "Press Ctrl+N or double-click a time slot."),
            ContentItem.NumberedStep(3, "New Meeting", "Home → New Meeting — same as an appointment but with a To field to invite others."),
            ContentItem.NumberedStep(4, "Fill in details", "Subject, Location (or Teams meeting link), Start time, End time, and notes in the body."),
            ContentItem.NumberedStep(5, "Set a reminder", "Choose reminder time from the dropdown (15 min, 1 hour, 1 day, etc.)."),
            ContentItem.NumberedStep(6, "Send invites", "For meetings, click Send — attendees receive an invite they can Accept, Tentative, or Decline."),
            ContentItem.KeyShortcut("Ctrl+N", "New appointment"),
            ContentItem.KeyShortcut("Ctrl+Shift+Q", "New meeting request"),

            ContentItem.SectionHeading("Calendar Views"),
            ContentItem.BulletItem("Day view — Detailed hourly view of one day"),
            ContentItem.BulletItem("Work Week — Monday to Friday view"),
            ContentItem.BulletItem("Week — Full 7-day week view"),
            ContentItem.BulletItem("Month — Traditional monthly calendar overview"),
            ContentItem.BulletItem("Schedule view — List-style view of all upcoming events"),
            ContentItem.TipBox("Share your calendar with colleagues: Home → Share Calendar → enter their email → choose whether they see all details or just free/busy status."),
        )
    )

    // ═══════════════════════════════════════════════════════════════
    //  MS ONENOTE
    // ═══════════════════════════════════════════════════════════════

    private fun getOneNoteApp() = OfficeApp(
        appName = "MS OneNote",
        appIcon = R.drawable.ic_onenote,
        primaryColor = 0xFF7719AAL,
        sections = listOf(oneNoteBasics(), oneNoteOrganization())
    )

    private fun oneNoteBasics() = BookSection(
        tabName = "Basics",
        tabIcon = R.drawable.ic_onenote,
        levelTag = "Beginner",
        content = listOf(
            ContentItem.ChapterHeader("Microsoft OneNote", "Your digital notebook for notes, ideas, and research"),
            ContentItem.ScreenshotItem("OneNote Interface", "OneNote window showing the notebook list (left panel), section tabs (top), page list (right panel), and the free-form note canvas in the center"),

            ContentItem.SectionHeading("OneNote Structure"),
            ContentItem.BodyText("OneNote organizes content in three levels: Notebooks → Sections → Pages."),
            ContentItem.BulletItem("Notebook — The top level (e.g., 'Work', 'School', 'Personal')"),
            ContentItem.BulletItem("Section — A tab within a notebook (e.g., 'Meeting Notes', 'Project A', 'Ideas')"),
            ContentItem.BulletItem("Page — An individual note page within a section (e.g., 'Jan 15 meeting', 'Budget notes')"),

            ContentItem.SectionHeading("Create and Take Notes"),
            ContentItem.NumberedStep(1, "Create a new notebook", "File → New → choose OneDrive or local storage → name it → Create."),
            ContentItem.NumberedStep(2, "Add a section", "Click the + beside the section tabs → name the section."),
            ContentItem.NumberedStep(3, "Add a page", "Click '+ Page' at the top of the page list panel."),
            ContentItem.NumberedStep(4, "Type anywhere", "Click anywhere on the canvas — a text box appears wherever you click."),
            ContentItem.NumberedStep(5, "Draw and ink", "Home → Draw → use pen or highlighter tools to draw or annotate."),
            ContentItem.TipBox("OneNote auto-saves continuously. There's no Save button — your notes are always preserved."),

            ContentItem.SectionHeading("Insert Content"),
            ContentItem.BulletItem("Insert → Picture — Add photos from device or internet"),
            ContentItem.BulletItem("Insert → File Attachment — Attach documents, PDFs, or spreadsheets to a page"),
            ContentItem.BulletItem("Insert → Audio/Video Recording — Record meetings directly into OneNote"),
            ContentItem.BulletItem("Insert → Screen Clipping (Win+Shift+S) — Capture any part of your screen"),
            ContentItem.BulletItem("Insert → Table — Add a table for structured notes"),
            ContentItem.KeyShortcut("Ctrl+1", "Apply Heading 1 tag"),
            ContentItem.KeyShortcut("Ctrl+2", "Apply Heading 2 tag"),
            ContentItem.KeyShortcut("Ctrl+Shift+1", "Apply To Do tag (checkbox)"),
        )
    )

    private fun oneNoteOrganization() = BookSection(
        tabName = "Organization",
        tabIcon = R.drawable.review_tab,
        levelTag = "Intermediate",
        content = listOf(
            ContentItem.ChapterHeader("OneNote Organization", "Tags, search, and collaboration"),
            ContentItem.ScreenshotItem("OneNote Tags", "OneNote page showing tagged content: To Do checkboxes (checked and unchecked), Important star tags, and Question mark tags"),

            ContentItem.SectionHeading("Tags"),
            ContentItem.BodyText("Tags are visual markers that help you categorize and find important content quickly."),
            ContentItem.NumberedStep(1, "Apply a tag", "Home → Tags → choose To Do, Important, Question, Remember for later, etc. Or press Ctrl+1 through Ctrl+9."),
            ContentItem.NumberedStep(2, "Search by tag", "Home → Find Tags — opens the Tags Summary pane, grouping all tagged items across the entire notebook."),
            ContentItem.NumberedStep(3, "Custom tags", "Home → Tags → Customize Tags → create tags with custom names, symbols, and highlight colors."),

            ContentItem.SectionHeading("Search"),
            ContentItem.NumberedStep(1, "Search all notes", "Press Ctrl+F → type keywords. OneNote searches across all notebooks, sections, and pages."),
            ContentItem.NumberedStep(2, "Search scope", "Use the dropdown next to the search box to limit search to a specific notebook or section."),
            ContentItem.TipBox("OneNote can search inside images (OCR) and recognize handwritten text for search — making all your handwritten notes findable."),

            ContentItem.SectionHeading("Collaboration & Sharing"),
            ContentItem.NumberedStep(1, "Share a notebook", "File → Share → choose the notebook → enter email addresses and choose View or Edit permission."),
            ContentItem.NumberedStep(2, "Real-time co-authoring", "Multiple people can edit the same page simultaneously. Changes sync automatically via OneDrive."),
            ContentItem.NumberedStep(3, "See who changed what", "History → Page Versions — see all previous versions of a page and who made each change."),
            ContentItem.NoteBox("OneNote is available on Windows, Mac, iOS, Android, and the web — all synced via OneDrive."),
        )
    )
}
