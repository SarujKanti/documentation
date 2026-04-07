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
    }
}
