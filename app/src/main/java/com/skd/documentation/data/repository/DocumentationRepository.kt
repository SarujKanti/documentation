package com.skd.documentation.data.repository

import com.skd.documentation.R
import com.skd.documentation.data.model.BookSection
import com.skd.documentation.data.model.ContentItem
import com.skd.documentation.data.model.OfficeApp

class DocumentationRepository {

    fun getAllApps(): List<OfficeApp> = listOf(
        getWordApp(),
        getExcelApp(),
        getPowerPointApp(),
        getOutlookApp(),
        getOneNoteApp()
    )

    // ═══════════════════════════════════════════════════════════════
    //  MS WORD
    // ═══════════════════════════════════════════════════════════════

    private fun getWordApp() = OfficeApp(
        appName = "MS Word",
        appIcon = R.drawable.ic_word,
        primaryColor = 0xFF2B579AL,
        sections = listOf(
            wordHomeTab(), wordInsertTab(), wordDesignTab(),
            wordLayoutTab(), wordReferencesTab(), wordMailingsTab(),
            wordReviewTab(), wordViewTab(), wordDrawTab(), wordHelpTab()
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
