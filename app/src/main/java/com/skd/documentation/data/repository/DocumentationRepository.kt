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
            ContentItem.ScreenshotItem("Home Tab Ribbon", "The Home tab contains five key groups: Clipboard (Cut/Copy/Paste/Format Painter), Font (typeface, size, Bold/Italic/Underline, highlight, text color, text effects), Paragraph (alignment, line spacing, bullets, numbering, indent, borders), Styles gallery (Normal, Heading 1-3, Title, Subtitle — one-click consistent formatting), and Editing (Find, Replace, Select All).", "Click Home tab in the ribbon"),

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
            ContentItem.ScreenshotItem("Clipboard Group", "Four essential tools: Paste (Ctrl+V) inserts clipboard content; right-click Paste for special options (Values Only, Formats, Transpose). Cut (Ctrl+X) moves selected content to clipboard. Copy (Ctrl+C) duplicates without removing. Format Painter — single-click copies formatting once; double-click locks it to apply repeatedly; press Esc to release.", "Home Tab → Clipboard group (top-left of ribbon)"),
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
            ContentItem.ScreenshotItem("Font Group", "Complete character-level formatting: Font name dropdown (default Calibri) with live preview. Point size box. Bold (Ctrl+B), Italic (Ctrl+I), Underline (Ctrl+U). Strikethrough, Subscript (x2), Superscript (x2). Font Highlight Color (background color). Font Color (text color). Change Case dropdown. Clear All Formatting. The dialog launcher opens the full Font dialog with kerning, spacing, and OpenType settings.", "Home Tab → Font group → select text first, then apply formatting"),
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
            ContentItem.ScreenshotItem("Paragraph Group", "Block-level formatting controls: four alignment buttons (Left Ctrl+L, Center Ctrl+E, Right Ctrl+R, Justify Ctrl+J). Bullets and Numbering start lists; Multilevel List for outlines. Decrease/Increase Indent shift paragraphs. Line and Paragraph Spacing (1.0, 1.5, 2.0 options). Show/Hide paragraph marks (Ctrl+*). Borders dropdown. Shading (background color for paragraph).", "Home Tab → Paragraph group → select paragraph(s) first"),
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
            ContentItem.ScreenshotItem("Styles Gallery", "Visual thumbnail swatches of named paragraph styles. Normal is default body text. Heading 1, 2, 3 create a document hierarchy used for automatic Table of Contents generation. Title and Subtitle style cover page text. No Spacing removes extra paragraph spacing. Click the More arrow (bottom-right of gallery) to expand all styles. Right-click any style to Modify, Update to Match Selection, or Remove from gallery.", "Home Tab → Styles group → click desired style thumbnail"),
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
            ContentItem.ScreenshotItem("Find & Replace Dialog", "Three tabs: Find (Ctrl+F), Replace (Ctrl+H), Go To. Find what field accepts text, wildcards, or special characters. Replace with field holds replacement text. Click More >> to reveal advanced options: Match case, Find whole words only, Use wildcards (regex patterns), Find all word forms. Replace swaps the current match; Replace All changes every instance in the document simultaneously.", "Home Tab → Editing group → Replace  OR  press Ctrl+H"),
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
            ContentItem.ScreenshotItem("Insert Tab Ribbon", "The Insert tab groups: Pages (Cover Page, Blank Page, Page Break Ctrl+Enter). Tables (grid picker). Illustrations (Pictures, Online Pictures, Shapes, Icons, 3D Models, SmartArt, Chart, Screenshot). Links (Hyperlink Ctrl+K, Bookmark, Cross-reference). Comments. Header & Footer with Page Numbers. Text group (Text Box, WordArt, Drop Cap, Signature Line, Object). Symbols (Equation, Symbol).", "Click Insert tab in the ribbon"),

            ContentItem.SectionHeading("Tables"),
            ContentItem.NumberedStep(1, "Click Insert → Table", "Open the Table grid picker."),
            ContentItem.NumberedStep(2, "Hover to select size", "Hover over the grid to highlight the number of rows × columns."),
            ContentItem.NumberedStep(3, "Click to insert", "Click the grid to insert the table at the cursor."),
            ContentItem.NumberedStep(4, "Style the table", "The Table Design and Layout tabs appear — use them to set borders, shading, and row/column sizes."),
            ContentItem.ScreenshotItem("Insert Table Grid", "Clicking the Table button reveals a hover grid up to 10x8 cells. Moving the mouse previews the table live in the document and shows the selected size above (e.g., 4x3 Table). Click to confirm insertion. For tables larger than 10x8, click Insert Table below the grid to open a dialog for exact row and column counts plus AutoFit behavior (Fixed Column Width, AutoFit to Contents, AutoFit to Window).", "Insert Tab → Tables group → Table button → hover over grid to select size"),
            ContentItem.TipBox("Use 'Quick Tables' for pre-built calendar and formatted table styles. Use 'Insert Table' dialog for exact row/column counts."),

            ContentItem.SectionHeading("Pictures"),
            ContentItem.NumberedStep(1, "Insert → Pictures → This Device", "Browse your computer for an image file (PNG, JPG, GIF, etc.)."),
            ContentItem.NumberedStep(2, "Resize the image", "Drag the corner handles to resize. Hold Shift to keep proportions."),
            ContentItem.NumberedStep(3, "Set text wrapping", "Click the image → Picture Format tab → Wrap Text → choose Square, Tight, or Through."),
            ContentItem.NumberedStep(4, "Crop", "Picture Format → Crop → drag the crop handles."),
            ContentItem.ScreenshotItem("Picture Wrap Text Menu", "Wrap Text controls how text flows around a picture. In Line with Text: image sits on the text baseline. Square: text flows in a rectangle around the image. Tight: text follows the actual image shape boundary. Through: text fills concave areas of the shape. Top and Bottom: text stops above and below, leaving sides clear. Behind Text and In Front of Text ignore text flow. Access via Picture Format tab or the Layout Options button (appears when image is selected).", "Click image → Picture Format tab → Arrange group → Wrap Text dropdown"),
            ContentItem.BulletItem("Stock Images — Microsoft's royalty-free photo library"),
            ContentItem.BulletItem("Online Pictures — Bing image search (check licensing)"),
            ContentItem.BulletItem("Screenshots — Capture any open window or screen region"),

            ContentItem.SectionHeading("Shapes & SmartArt"),
            ContentItem.NumberedStep(1, "Insert → Shapes", "Choose from lines, rectangles, circles, arrows, callouts, and more."),
            ContentItem.NumberedStep(2, "Draw the shape", "Click and drag on the document. Hold Shift for perfect squares or circles."),
            ContentItem.NumberedStep(3, "Add text", "Right-click the shape → Add Text."),
            ContentItem.NumberedStep(4, "SmartArt", "Insert → SmartArt → pick a category (Process, Hierarchy, Cycle, etc.) → fill in text pane."),
            ContentItem.ScreenshotItem("SmartArt Gallery", "Seven SmartArt categories: List (non-sequential items), Process (sequential steps), Cycle (recurring flows), Hierarchy (org charts and tree structures), Relationship (Venn diagrams, Gear, Funnel — connections and overlaps), Matrix (2x2 quadrant models), Pyramid (proportional or stacked layers). A Description panel explains the best use case for each layout. After inserting, type text in the Text Pane (left side) or click directly inside shape placeholders.", "Insert Tab → Illustrations group → SmartArt button"),

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
            ContentItem.ScreenshotItem("Design Tab Ribbon", "The Design tab applies document-wide visual styling. Document Formatting gallery: click any style set to restyle all headings and body text throughout the document instantly. Colors: changes all theme colors simultaneously. Fonts: changes the heading/body font pair. Paragraph Spacing presets (No Space, Compact, Tight, Open, Relaxed, Double) adjust spacing document-wide. Page Background group: Watermark, Page Color, Page Borders.", "Click Design tab in the ribbon"),

            ContentItem.SectionHeading("Document Themes"),
            ContentItem.BodyText("A Theme applies a coordinated set of fonts and colors to the entire document at once — headings, body text, tables, SmartArt, and charts all update instantly."),
            ContentItem.NumberedStep(1, "Click Design tab", "Navigate to the Design tab in the ribbon."),
            ContentItem.NumberedStep(2, "Hover over themes", "Live preview shows changes in your document as you hover."),
            ContentItem.NumberedStep(3, "Click to apply", "Click any theme to apply it globally."),
            ContentItem.ScreenshotItem("Themes Gallery", "A Theme bundles a coordinated color palette, font pair (heading font + body font), and shape effects package. Hovering over a theme thumbnail previews it live. The Office theme (default) uses Calibri Light + Calibri with blue accents. Themes sync across Word, Excel, and PowerPoint for brand consistency. Click Customize Theme to build a custom color palette and save it for reuse.", "Design Tab → Document Formatting group → Themes button"),
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
            ContentItem.ScreenshotItem("Watermark Dialog", "Custom Watermark (Design → Watermark → Custom Watermark) offers two types. Picture Watermark: insert any image, set scale, enable washout (fades it). Text Watermark: enter custom text (DRAFT, CONFIDENTIAL, DO NOT COPY), choose font, size, color, then select Diagonal (45 degrees) or Horizontal layout. The Semitransparent checkbox makes the watermark fade so it does not obscure body text. Watermarks appear on every page anchored in the header layer.", "Design Tab → Page Background group → Watermark → Custom Watermark"),

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
            ContentItem.ScreenshotItem("Layout Tab Ribbon", "The Layout tab controls page dimensions and positioning. Page Setup: Margins (preset and custom), Orientation (Portrait/Landscape), Size (A4, Letter, Legal, custom), Columns (one, two, three, or custom with spacing), Breaks (Page, Column, Section break types), Line Numbers, Hyphenation. Paragraph group: Left/Right indent and Before/After spacing as numeric values. Arrange group: Position, Wrap Text, Bring Forward, Send Backward, Align, Group, Rotate for selected objects.", "Click Layout tab in the ribbon"),

            ContentItem.SectionHeading("Page Setup"),
            ContentItem.NumberedStep(1, "Set Margins", "Layout → Margins → choose Normal (1\" all sides), Narrow (0.5\"), Wide (2\" sides), or Custom Margins for exact values."),
            ContentItem.NumberedStep(2, "Set Orientation", "Layout → Orientation → Portrait (tall) or Landscape (wide)."),
            ContentItem.NumberedStep(3, "Set Paper Size", "Layout → Size → Letter (8.5×11\"), A4 (210×297mm), Legal, or custom."),
            ContentItem.ScreenshotItem("Page Setup Group", "Three primary controls in Page Setup. Margins gallery: Normal (1 inch all sides), Narrow (0.5 inch), Moderate (1 inch top/bottom, 0.75 inch sides), Wide (1 inch top/bottom, 2 inch sides), Mirrored (inside/outside for double-sided printing). Custom Margins at the bottom opens the full Page Setup dialog. Orientation: Portrait (tall page) or Landscape (wide page). Size: A4, Letter, Legal, plus custom width and height.", "Layout Tab → Page Setup group → Margins / Orientation / Size"),
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
            ContentItem.ScreenshotItem("Breaks Menu", "Two categories of breaks. Page Breaks: Page Break (Ctrl+Enter) forces text to the next page; Column Break pushes text into the next column; Text Wrapping Break wraps around floating objects. Section Breaks allow different page setups within one document: Next Page starts a new section on the next page (for landscape pages within a portrait document); Continuous starts a new section on the same page (for varying column counts); Even Page and Odd Page start sections on specific page parity for book layouts.", "Layout Tab → Page Setup group → Breaks dropdown"),

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
            ContentItem.ScreenshotItem("References Tab Ribbon", "References tab groups: Table of Contents (auto-generate TOC, Add Text, Update Table). Footnotes (Insert Footnote Alt+Ctrl+F, Insert Endnote, Show Notes). Citations and Bibliography (Insert Citation, Manage Sources, Style selector APA/MLA/Chicago/IEEE, Bibliography). Captions (Insert Caption for figures/tables/equations, Cross-reference, Table of Figures). Index (Mark Entry, Insert Index). Table of Authorities (legal documents).", "Click References tab in the ribbon"),

            ContentItem.SectionHeading("Table of Contents"),
            ContentItem.BodyText("A TOC is automatically built from Heading styles. Apply Heading 1, 2, and 3 styles to your section titles before inserting a TOC."),
            ContentItem.NumberedStep(1, "Apply Heading styles", "Select each section title → Home tab → click Heading 1, Heading 2, or Heading 3 in the Styles Gallery."),
            ContentItem.NumberedStep(2, "Position cursor", "Click at the very beginning of the document (or after the cover page)."),
            ContentItem.NumberedStep(3, "Insert → Table of Contents", "References → Table of Contents → choose Automatic Table 1 or 2."),
            ContentItem.NumberedStep(4, "Update the TOC", "After editing: click on the TOC → click 'Update Table' → 'Update entire table'."),
            ContentItem.ScreenshotItem("Table of Contents", "An automatic TOC is generated from paragraphs styled with Heading 1, 2, and 3 styles. The TOC shows heading text on the left with a dotted tab leader (....) and the page number on the right. Heading 1 entries are flush left; Heading 2 is indented once; Heading 3 is indented twice. When edits change page numbers, right-click the TOC and choose Update Field then Update entire table to refresh all entries and page numbers.", "References Tab → Table of Contents group → Table of Contents → Automatic Table 1"),
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
            ContentItem.ScreenshotItem("Bibliography", "The Bibliography list is generated from sources added through Manage Sources. Each source stores structured data (author, year, title, publisher, URL, DOI). Switching the Style dropdown automatically reformats all in-text citations and the bibliography simultaneously: APA uses author-date citations and a References list with hanging indent; MLA uses author-page and Works Cited; Chicago uses footnotes with a Bibliography. Click Update Citations and Bibliography after adding new sources.", "References Tab → Citations and Bibliography group → Bibliography dropdown"),

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
            ContentItem.ScreenshotItem("Mailings Tab Ribbon", "The Mailings tab runs the mail merge workflow. Create: Envelopes and Labels. Start Mail Merge: choose document type (Letters, Email Messages, Envelopes, Labels, Directory) and connect a data source. Write and Insert Fields: Insert Merge Field, Address Block, Greeting Line, and field rules (If Then Else). Preview Results: browse merged records using navigation arrows. Finish and Merge: Print Documents, Send Email Messages, or Edit Individual Documents.", "Click Mailings tab in the ribbon"),

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
            ContentItem.ScreenshotItem("Select Recipients", "After choosing the document type, click Select Recipients then Use an Existing List. A file browser opens — navigate to your data file (Excel .xlsx, .csv, Access .accdb). For Excel files, a Select Table dialog lists all sheets and named ranges — choose the sheet containing recipient data. Check First row of data contains column headers if row 1 has header labels. After connecting, click Edit Recipient List to filter, sort, or de-select specific records before merging.", "Mailings Tab → Start Mail Merge group → Select Recipients → Use an Existing List"),

            ContentItem.SectionHeading("Insert Merge Fields"),
            ContentItem.NumberedStep(1, "Click in document", "Click where you want a personalized field (e.g., after 'Dear ')."),
            ContentItem.NumberedStep(2, "Insert Merge Field", "Mailings → Insert Merge Field → choose a field (e.g., «FirstName»)."),
            ContentItem.NumberedStep(3, "Build the letter", "Example: 'Dear «FirstName» «LastName»,' then your letter body."),
            ContentItem.NumberedStep(4, "Address Block", "Mailings → Address Block — inserts a full formatted address with one click."),
            ContentItem.NumberedStep(5, "Greeting Line", "Mailings → Greeting Line — inserts 'Dear Mr. Smith,' with name format options."),
            ContentItem.TipBox("Click 'Highlight Merge Fields' to see all merge fields highlighted yellow in your document."),
            ContentItem.ScreenshotItem("Merge Fields in Document", "Merge fields appear as chevron-bracketed placeholders in the document: FirstName, LastName, City. Insert them using the Insert Merge Field dropdown (Mailings → Write and Insert Fields group). The composite AddressBlock field combines name and postal address automatically. GreetingLine inserts a formatted salutation. Click Preview Results to replace all fields with actual data from the first recipient record. Use navigation arrows to step through each record and verify layout before final merge.", "Mailings Tab → Write and Insert Fields group → Insert Merge Field"),

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
            ContentItem.ScreenshotItem("Review Tab Ribbon", "Review tab groups: Proofing (Spelling and Grammar F7, Thesaurus Shift+F7, Word Count). Accessibility (Check Accessibility for screen reader compatibility). Language (Translate, Set Proofing Language for multilingual docs). Comments (New Comment, Delete, Previous, Next, Show Comments, Resolve/Reopen). Tracking (Track Changes Ctrl+Shift+E, Display for Review modes: Simple/All Markup/Original/No Markup, Show Markup). Changes (Accept/Reject individual or all). Compare (Compare, Combine two docs). Protect (Restrict Editing, Block Authors).", "Click Review tab in the ribbon"),

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
            ContentItem.ScreenshotItem("Comments in Document", "Comment balloons are connected to selected text by a dotted leader line. Each balloon shows the reviewer profile picture or initials, display name, date, time, and comment text. Two action buttons: Reply (starts a threaded conversation visible to all reviewers) and Resolve (marks the thread as resolved, collapsing it to grey while preserving history for audit). In Simple Markup view, comments show as a small margin icon instead of a full balloon, keeping the document readable.", "Review Tab → Comments group → New Comment  OR  right-click selected text → New Comment"),

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
            ContentItem.ScreenshotItem("Track Changes", "With Track Changes enabled (Ctrl+Shift+E), every edit is recorded with author name, date, and time. Insertions appear underlined in the reviewer color (first reviewer blue, second red, third green). Deletions appear with strikethrough in the same color. Moved text shows double-underline at destination and double-strikethrough at origin. Formatting changes are noted in margin balloons. A vertical change bar in the left margin marks every line containing a tracked change.", "Review Tab → Tracking group → Track Changes button  OR  Ctrl+Shift+E"),
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
            ContentItem.ScreenshotItem("View Tab Ribbon", "View tab groups: Views (Print Layout default, Web Layout, Outline for restructuring, Draft for fast editing, Read Mode for full-screen reading). Immersive Reader (accessibility-focused reading environment with text spacing, syllables, parts of speech highlighting). Show (Ruler, Gridlines, Navigation Pane checkboxes). Zoom (Zoom%, 100%, One Page, Multiple Pages, Page Width). Window (New Window, Arrange All, Split, View Side by Side, Synchronous Scrolling, Switch Windows). Macros (View Macros, Record Macro).", "Click View tab in the ribbon"),

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
            ContentItem.ScreenshotItem("Navigation Pane", "The Navigation Pane has three tabs. Headings tab: clickable outline of all Heading 1, 2, 3 styled paragraphs — click any heading to jump there instantly; right-click to Promote/Demote, move the entire section up/down, or delete the section. Pages tab: thumbnail images of every page — click to jump. Results tab: search results with yellow highlights in the document and snippet previews in the pane. Type in the search box at the top to activate the Results tab.", "View Tab → Show group → Navigation Pane checkbox  OR  press Ctrl+F"),

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
            ContentItem.ScreenshotItem("Draw Tab Ribbon", "The Draw tab provides digital inking tools. Drawing Tools gallery: Pen (smooth strokes), Pencil (textured sketchy look), Highlighter (semi-transparent annotation). Each tool has customizable color and thickness. Eraser tools: Point Eraser (removes stroke segments), Stroke Eraser (removes entire strokes). Ruler: on-screen straight-edge for drawing lines. Insert Ink group: Ink to Math (converts handwritten equations), Ink to Shape (rough shapes to precise geometry), Ink to Text (handwriting to typed text). Toggle Draw with Mouse/Touch.", "Click Draw tab in the ribbon"),

            ContentItem.SectionHeading("Drawing Tools"),
            ContentItem.NumberedStep(1, "Enable drawing mode", "Draw → Draw with Mouse (or use a stylus on a touchscreen)."),
            ContentItem.NumberedStep(2, "Choose a tool", "Select Pen (solid lines), Pencil (textured/sketchy), or Highlighter (semi-transparent)."),
            ContentItem.NumberedStep(3, "Customize the pen", "Double-click any pen icon to set its Color, Thickness (0.25–6mm), and special effects (Rainbow, Galaxy, Gold, etc.)."),
            ContentItem.NumberedStep(4, "Erase", "Draw → Eraser → Stroke Eraser (removes a whole stroke) or Segment Eraser (removes only the part you touch)."),
            ContentItem.ScreenshotItem("Draw Toolbar", "Click the dropdown arrow on any pen, pencil, or highlighter to open the customization flyout. The top section shows a 40-color palette. The Thickness slider ranges from 0.25 mm to 6 mm for pens and pencils, and 2 mm to 16 mm for highlighters. Pens also offer an Effects dropdown (Rainbow, Galaxy, Lava, Ocean, Rose Gold, Gold). The tool thumbnail in the ribbon updates with your chosen color and thickness dot. Add up to 16 custom tools using + Add Pen. Settings sync via Microsoft account.", "Draw Tab → Drawing Tools gallery → click dropdown arrow on any pen tool"),

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
            ContentItem.ScreenshotItem("Help Tab Ribbon", "Help Tab (F1): opens the Help task pane — type any question to get Microsoft Docs articles and step-by-step guides. Show Training: free Microsoft online training courses organized by skill level (Beginner, Intermediate, Advanced). Whats New: panel highlighting recently added Word features. Contact Support: chat or phone callback (requires Microsoft 365 subscription). Feedback: Submit a Frown to report a problem with screenshot, Submit a Smile for positive feedback, Suggest a Feature. Account info shows your Microsoft account, subscription type, and Office build number.", "Click Help tab in the ribbon  OR  press F1"),

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
            ContentItem.ScreenshotItem("Excel Interface", "Key Excel interface zones: Ribbon (Home, Insert, Page Layout, Formulas, Data, Review, View tabs). Name Box left of formula bar shows active cell address (e.g., B3) — type a cell address here to navigate directly. Formula Bar shows raw cell content — formulas display as =SUM(A1:A10) even when the cell shows the calculated result. Column headers: A through XFD (16,384 columns). Row headers: 1 through 1,048,576. Sheet tabs at the bottom — right-click to rename, color, move, or copy. Status bar at the bottom shows Sum, Average, Count of selected cells plus zoom slider.", "Open Microsoft Excel → observe the interface layout zones"),

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
            ContentItem.ScreenshotItem("AutoFill in Action", "AutoFill recognizes patterns and series. The Fill Handle is the small square at the bottom-right corner of a selected cell — hover over it to change the cursor from a white selection plus to a thin black fill crosshair. Recognized series: days of the week (Mon/Monday), months (Jan/January), quarters (Q1 Q2), and custom lists. For numbers, select two cells to set the step pattern (2 then 4 fills 6, 8, 10). Right-click and drag to choose Fill Days, Fill Weekdays, Fill Months, Fill Years, or Linear/Growth trend.", "Type a series starter in a cell → hover the bottom-right corner → drag the Fill Handle"),
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
            ContentItem.ScreenshotItem("Excel Home Tab", "Excel Home tab groups: Clipboard (Cut/Copy/Paste with Paste Special options: Values Only, Formulas, Transpose, Paste Link). Font (face, size, Bold, Italic, Underline, Borders dropdown with 13 types, Fill Color, Font Color). Alignment (horizontal/vertical align, Wrap Text, Merge and Center, Orientation, Indent). Number (format selector: General to Text, decimal buttons, comma separator). Styles (Conditional Formatting, Format as Table, Cell Styles). Cells (Insert/Delete/Format for rows, columns, and sheets). Editing (AutoSum, Fill series, Clear, Sort and Filter, Find and Select).", "Click Home tab in Excel ribbon"),

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
            ContentItem.ScreenshotItem("Number Format Dropdown", "The Number Format dropdown (Home → Number group) controls how cell values display without changing the stored value. General: as entered. Number: decimal places and thousands separator (1,234.56). Currency: currency symbol flush against the number. Accounting: aligns currency symbols in a column. Short Date: 12/31/2024. Long Date: Tuesday December 31 2024. Percentage: multiplies by 100 and adds % (0.05 displays as 5%). Scientific: 1.23E+06. Text: treats numbers as text, preventing calculations. More Number Formats opens the full Format Cells dialog with custom format codes.", "Home Tab → Number group → click the Number Format dropdown"),
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
            ContentItem.ScreenshotItem("Conditional Formatting", "Conditional Formatting (Home → Styles group) applies visual rules automatically based on cell values. Highlight Cell Rules: Greater Than, Less Than, Between, Equal To, Text Contains, Duplicate Values. Top/Bottom Rules: Top 10 Items, Bottom 10 Items, Above Average, Below Average. Data Bars: fills each cell with a bar proportional to the cell value — ideal for instant visual comparison of a column. Color Scales: two- or three-color gradient (e.g., red-yellow-green). Icon Sets: arrows, traffic lights, stars, flags based on thresholds. Manage Rules shows all rules and lets you set evaluation priority order.", "Home Tab → Styles group → Conditional Formatting → choose rule type"),
        )
    )

    private fun excelFormulas() = BookSection(
        tabName = "Formulas",
        tabIcon = R.drawable.references_tab,
        levelTag = "Beginner → Advanced",
        content = listOf(
            ContentItem.ChapterHeader("Excel Formulas", "From basic arithmetic to advanced lookup functions"),
            ContentItem.ScreenshotItem("Formula Bar", "The formula bar displays raw cell contents. For a cell showing 1,234.56 the bar shows 1234.56 without formatting. For a formula cell, it shows the formula text such as =VLOOKUP(A2,Sheet2!A:C,2,FALSE). Click in the bar to edit directly. The X button cancels the edit (same as pressing Escape). The checkmark confirms the entry (same as pressing Enter). The fx button opens the Function Arguments dialog — a guided form showing each argument description and current computed value, making complex functions much easier to enter correctly.", "Click any cell → look at the formula bar above the grid  OR  click the fx button"),

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
            ContentItem.ScreenshotItem("VLOOKUP Example", "VLOOKUP syntax: =VLOOKUP(lookup_value, table_array, col_index_num, range_lookup). lookup_value: the value to find (e.g., Employee ID in cell A2). table_array: the range to search — VLOOKUP always searches the leftmost column (e.g., Sheet2!A:D). col_index_num: which column number in the table to return (3 returns the 3rd column). range_lookup: FALSE for exact match (required for most lookups); TRUE for approximate match (requires sorted data, used for tiered grades or pricing). Common errors: N/A means value not found; REF! means col_index_num exceeds the table width.", "Type =VLOOKUP( in any cell  OR  Formulas tab → Lookup and Reference → VLOOKUP"),
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
            ContentItem.ScreenshotItem("Excel Data Tab", "Excel Data tab groups: Get and Transform Data (From Text/CSV, From Web, From Table/Range for Power Query data cleaning, From Workbook). Queries and Connections (manage existing Power Query connections). Sort and Filter (Sort multi-level dialog, Filter/AutoFilter toggle, Advanced Filter with criteria range). Data Tools (Text to Columns, Flash Fill Ctrl+E, Remove Duplicates, Data Validation, What-If Analysis: Goal Seek/Scenario Manager/Data Table, Relationships). Forecast (time-series Forecast Sheet). Outline (Group, Ungroup, Subtotal for collapsible row and column groups).", "Click Data tab in Excel ribbon"),

            ContentItem.SectionHeading("Sort Data"),
            ContentItem.NumberedStep(1, "Click inside your data range", "Click any cell in the column you want to sort."),
            ContentItem.NumberedStep(2, "Data → Sort A to Z or Z to A", "For a quick single-column sort."),
            ContentItem.NumberedStep(3, "Multi-column sort", "Data → Sort → click 'Add Level' to sort by multiple columns (e.g., sort by Department, then by Last Name within each department)."),
            ContentItem.ScreenshotItem("Sort Dialog", "The Sort dialog (Data → Sort or Home → Sort and Filter → Custom Sort) allows multi-level sorting. Each level has three settings: Column (chosen from your header row), Sort On (Values, Cell Color, Font Color, or Conditional Formatting Icon), and Order (A to Z, Z to A, or Custom List for months/days). Add Level adds secondary sort criteria to break ties in the previous level. Delete Level removes a criterion. Drag levels up/down to change priority. My data has headers checkbox includes or excludes the header row from sorting.", "Data Tab → Sort and Filter group → Sort button"),

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
            ContentItem.ScreenshotItem("Data Validation Dropdown", "Data Validation (Data → Data Tools → Data Validation) restricts what users can enter in a cell. Settings tab Allow choices: Whole Number, Decimal, List (enter values comma-separated OR reference a range like =$F$1:$F$5 to create a dropdown menu), Date, Time, Text Length, Custom (a formula like =ISNUMBER(A1)). Input Message tab shows a helpful tooltip when the cell is selected. Error Alert tab: Stop (blocks invalid entry), Warning (allows with a warning dialog), Information (allows with an info notice). Circle Invalid Data marks existing cells that violate their rules with red circles.", "Data Tab → Data Tools group → Data Validation → Settings tab → Allow: List"),

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
            ContentItem.ScreenshotItem("Chart Types Gallery", "Chart categories: Column and Bar (compare values across categories — Column is vertical, Bar is horizontal). Line (trends over time). Pie and Doughnut (parts of a whole — use only when values sum to 100%). Area (like line but filled, emphasizing cumulative volume). XY Scatter (correlation between two numeric variables with no category axis). Bubble (scatter plot where bubble size represents a third variable). Map (geographical data by country or region). Stock (OHLC financial data). Radar (multi-category spider/web comparisons). Treemap, Sunburst, Histogram, Box and Whisker, Waterfall, Funnel (modern Excel chart types added in Excel 2016). Combo (two chart types combined, often columns plus a line on a secondary axis).", "Insert Tab → Charts group → click a chart type  OR  click the dialog launcher for all types"),

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
            ContentItem.ScreenshotItem("Chart with Labels", "After inserting a chart, Chart Design and Format tabs appear. Chart Design tab: Change Chart Type, Switch Row/Column (transposes data series), Select Data (add/remove/edit series and axis labels), Quick Layout (preset label/axis combinations), Change Colors, Chart Styles gallery. Double-click the Chart Title to edit it. Data Labels: Chart Design → Add Chart Element → Data Labels → choose position (Center, Inside End, Outside End, Data Callout). Right-click any chart element and choose Format to open the Format pane with Fill, Border, Effects, Size and Properties options.", "Select chart → Chart Design tab → Add Chart Element → Data Labels / Chart Title / Legend"),
        )
    )

    private fun excelPivotTables() = BookSection(
        tabName = "Pivot Tables",
        tabIcon = R.drawable.design_tab,
        levelTag = "Advanced",
        content = listOf(
            ContentItem.ChapterHeader("Pivot Tables", "Summarize thousands of rows of data in seconds"),
            ContentItem.ScreenshotItem("Pivot Table Overview", "A PivotTable transforms flat data (rows of records with column headers) into a dynamic cross-tabular summary. Source data requirements: one row per record, column headers in row 1, no blank rows or merged cells. The PivotTable aggregates numeric fields (SUM, COUNT, AVERAGE, MAX, MIN). Multiple PivotTables can connect to the same source. Right-click and choose Refresh (or Data → Refresh All) to update after source changes. PivotTables are non-destructive — they never modify the source data.", "Insert Tab → Tables group → PivotTable → select source range and destination"),

            ContentItem.SectionHeading("What is a Pivot Table?"),
            ContentItem.BodyText("A Pivot Table is an interactive summary table that lets you group, count, sum, and analyze large datasets without formulas. It's the most powerful analysis tool in Excel."),
            ContentItem.NoteBox("Pivot Tables do not change your original data. They create a separate summary view that you can rearrange at any time."),

            ContentItem.SectionHeading("Create a Pivot Table"),
            ContentItem.NumberedStep(1, "Prepare clean data", "Your data must have column headers in row 1, no blank rows, and no merged cells."),
            ContentItem.NumberedStep(2, "Click inside your data", "Any cell in the data range."),
            ContentItem.NumberedStep(3, "Insert → PivotTable", "Excel selects the data range automatically. Choose New Worksheet → OK."),
            ContentItem.NumberedStep(4, "The PivotTable pane opens", "The PivotTable Field List appears on the right side."),
            ContentItem.ScreenshotItem("PivotTable Field List", "The Field List pane has two sections. Top: all available fields from the source table as checkboxes. Bottom: four drop zones. Filters area: fields here appear as a dropdown filter above the PivotTable. Columns area: fields here become column headers (Quarter → Q1, Q2, Q3, Q4). Rows area: fields here become row labels (e.g., ProductCategory). Values area: numeric fields here are aggregated — right-click and choose Value Field Settings to select Sum, Count, Average, Max, Min, StdDev. Drag fields between zones to instantly reorganize. Checking a text field checkbox defaults to Rows; checking a numeric field defaults to Values.", "Click anywhere inside the PivotTable → PivotTable Field List pane appears on the right"),

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
            ContentItem.ScreenshotItem("Pivot Table with Slicer", "A Slicer is a visual filter panel. Insert via PivotTable Analyze → Filter group → Insert Slicer → check the field to slice by. The Slicer panel shows clickable filter buttons. Click a button to filter the PivotTable; Ctrl+click to select multiple values; click the Clear Filter icon (funnel with X, top-right) to remove all filters. Slicers can connect to multiple PivotTables — right-click the slicer → Report Connections → check all PivotTables that should respond. Use the Slicer tab in the ribbon to change the Slicer Style, set the number of button Columns, and resize the panel.", "Click PivotTable → PivotTable Analyze tab → Filter group → Insert Slicer"),
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
            ContentItem.ScreenshotItem("PowerPoint Interface", "PowerPoint has five main zones: Ribbon (Home, Insert, Design, Transitions, Animations, Slide Show, Review, View tabs). Slides panel (left): thumbnail strip — click to navigate, drag to reorder, right-click for slide operations. Editing canvas (center): click placeholder boxes to type content, drag objects to position them, resize by dragging handles. Notes panel (bottom): speaker notes per slide, visible in Presenter View and printed Notes Pages. Status bar (bottom): current slide/total slides, theme name, zoom slider, view buttons (Normal, Slide Sorter, Reading View, Slide Show).", "Open Microsoft PowerPoint → observe the five interface zones"),

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
            ContentItem.ScreenshotItem("Design Tab", "PowerPoint Design tab: Themes gallery shows thumbnail previews of built-in themes — each bundles a background, color palette, font pair, and shape effects. Hover for live preview. Variants panel shows 4 color variations of the selected theme. Customize group: Slide Size (Widescreen 16:9, Standard 4:3, or Custom dimensions) and Format Background (solid, gradient, picture, pattern, or texture fills). The Designer button opens the AI-powered PowerPoint Designer pane which suggests professional slide layouts based on your content.", "Click Design tab in PowerPoint ribbon"),

            ContentItem.SectionHeading("Apply a Theme"),
            ContentItem.NumberedStep(1, "Click Design tab", "The Themes gallery shows all built-in PowerPoint themes."),
            ContentItem.NumberedStep(2, "Hover to preview", "Hovering applies a live preview to all slides simultaneously."),
            ContentItem.NumberedStep(3, "Click to apply", "Applies the theme to every slide in the presentation."),
            ContentItem.NumberedStep(4, "Choose a Variant", "Each theme has 4 color variants shown in the Variants panel — click one to change the color palette while keeping the layout."),
            ContentItem.ScreenshotItem("Theme Variants", "Variants are four preset color-and-effect combinations for the active theme. Hover over each for a live preview on the current slide. The More arrow on the Variants panel reveals sub-menus: Colors (change only the palette), Fonts (change only the heading/body font pair), Effects (change only shadow/reflection/glow/bevel on shapes), Background Styles (12 preset background fills). This allows mixing theme components — e.g., applying the Organic theme with the Red Violet color palette and Franklin Gothic font pair.", "Design Tab → Variants group → hover over variant thumbnails"),

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
            ContentItem.ScreenshotItem("Slide Master View", "Slide Master view (View → Master Views → Slide Master) shows the template hierarchy. The large top thumbnail is the Slide Master (parent) — objects placed here appear on every layout. Below are Layout slides (Title Slide, Title and Content, Two Content, Blank, etc.). Changes to the Master cascade to all layouts unless a layout overrides them. To add a logo to every slide, insert it on the Slide Master. Use Insert Placeholder to add new placeholder types (Content, Text, Picture, Chart) to a layout. Click Close Master View when done to return to Normal view.", "View Tab → Master Views group → Slide Master button"),
        )
    )

    private fun pptTextAndObjects() = BookSection(
        tabName = "Content",
        tabIcon = R.drawable.insert_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Text & Objects", "Text boxes, images, shapes, SmartArt, charts, and tables"),
            ContentItem.ScreenshotItem("Insert Tab in PowerPoint", "PowerPoint Insert tab: Tables (grid picker). Images (This Device, Stock Images, Online Pictures, Screenshot of open windows). Illustrations (Shapes gallery, Icons, 3D Models, SmartArt, Chart). Links (Hyperlink Ctrl+K, Action for on-click or mouse-over button behaviors). Comments. Text group (Text Box, Header and Footer, WordArt, Date and Time, Slide Number, Object). Media group (Video from This Device/Online/Stock, Audio from This Device/Record Audio, Screen Recording). Add-ins (Office Store third-party extensions).", "Click Insert tab in PowerPoint ribbon"),

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
            ContentItem.ScreenshotItem("Transitions Tab", "Transitions control how PowerPoint moves between slides. Transition gallery groups: Subtle (Cut, Fade, Push, Wipe, Split, Reveal, Shape, Flash), Exciting (Drape, Curtains, Wind, Page Curl, Cube, Doors, Box, Zoom, and more), Dynamic Content (Pan, Ferris Wheel, Orbit, Fly Through). Effect Options: changes direction or flavor of the transition (e.g., Wipe → From Left/Right/Up/Down). Timing group: Sound (add audio), Duration (speed in seconds), Apply To All (copies settings to every slide), Advance Slide (On Mouse Click or After N seconds for automatic slide shows.", "Click Transitions tab → click a transition thumbnail to apply it"),

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
            ContentItem.ScreenshotItem("Animation Pane", "The Animation Pane (Animations → Advanced Animation → Animation Pane) lists all animations on the current slide in time order. Each entry shows a trigger icon (mouse cursor = On Click, clock icon = After/With Previous), the object name, the effect name, and a duration bar on a timeline. Click an entry to select it and its object on the slide. The dropdown arrow beside each entry offers Effect Options (direction, sound, text animation), Timing (start trigger, delay in seconds, duration, repeat count), and Remove. Drag entries up/down to reorder the animation sequence.", "Animations Tab → Advanced Animation group → Animation Pane button"),
            ContentItem.TipBox("For bullet points, click 'Effect Options' → 'By Paragraph' to make each bullet appear one at a time on click — this keeps the audience focused on each point."),
        )
    )

    private fun pptSlideShow() = BookSection(
        tabName = "Slide Show",
        tabIcon = R.drawable.view_tab,
        levelTag = "All Levels",
        content = listOf(
            ContentItem.ChapterHeader("Slide Show & Sharing", "Present confidently and share your work"),
            ContentItem.ScreenshotItem("Slide Show Tab", "Slide Show tab groups: Start Slide Show (From Beginning F5, From Current Slide Shift+F5, Present Online via browser link, Custom Slide Show for a named slide subset). Set Up group (Set Up Slide Show for Full Screen/Window/Kiosk mode and looping, Hide Slide excludes a slide without deleting it, Rehearse Timings records per-slide pacing, Record Slide Show records audio/video narration per-slide). Monitors group (Monitor selector for dual-display setups, Use Presenter View toggle for the presenter dashboard on a second screen).", "Click Slide Show tab  OR  press F5 to start the presentation from the beginning"),

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
            ContentItem.ScreenshotItem("Presenter View", "Presenter View gives the presenter a private dashboard on a second monitor or projector. Zones: Current slide (large center — what the audience sees). Next slide preview (top-right thumbnail to prepare for transitions). Speaker notes (bottom half with scroll bar and A+/A- font size controls for readability). Timer (top-left with Pause and Restart buttons for pacing management). Navigation: large back/forward arrows and a slide grid icon for non-linear navigation. Annotation tools: pen, highlighter, and eraser for on-screen markup during the presentation. Black screen button temporarily blanks the audience display.", "Press F5 to start → Slide Show tab → Use Presenter View (requires a second display)"),

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
            ContentItem.ScreenshotItem("Outlook Interface", "Outlook three-panel layout: Left Navigation Pane shows Inbox, Drafts, Sent Items, Deleted Items, Junk Email, Archive, and custom folders; below are Calendar, People, Tasks, Notes switchers. Center Message List shows emails with sender name, subject line, preview snippet, date, and icons (attachment paperclip, flag, read/unread indicator dot). Right Reading Pane shows the full email body — click any email in the message list to preview it. Double-click an email to open it in its own window. Right-click an email for quick actions: Reply, Reply All, Forward, Delete, Move, Categorize, Flag, Mark as Read/Unread.", "Open Microsoft Outlook → observe the three-panel navigation layout"),

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
            ContentItem.ScreenshotItem("Outlook Calendar", "Outlook Calendar (press Ctrl+2 or click the Calendar icon in the Navigation Pane) shows time blocks as colored appointment rectangles. View options: Day (single day hour-by-hour grid), Work Week (Monday-Friday), Week (all 7 days), Month (calendar grid), Schedule View (horizontal Gantt-style timeline). The mini monthly calendar in the left panel lets you jump to any date by clicking — bold dates have appointments. New appointment: double-click any time slot or press Ctrl+N. Meeting requests include the Scheduling Assistant which shows all invitees availability as Busy, Tentative, or Free blocks so you can find a time that works for everyone.", "Click Calendar icon in Outlook Navigation Pane  OR  press Ctrl+2"),

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
            ContentItem.ScreenshotItem("OneNote Interface", "OneNote three-level hierarchy: Notebooks (top level shown in a dropdown or left panel — each notebook is a file or OneDrive location). Sections (color-coded tabs across the top of the notebook — right-click a tab to Rename, Move, Color, or Password Protect). Pages (listed in the right panel — right-click to Rename, Move, Copy, or Delete). The note canvas is free-form — click anywhere on the canvas to start a new text container; drag containers by their top bar to reposition; resize by dragging the right edge. Unlike Word there is no page flow — content containers can be placed freely and even overlap. Notes sync automatically to OneDrive when using Microsoft 365.", "Open Microsoft OneNote → observe the notebook/section/page hierarchy"),

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
            ContentItem.ScreenshotItem("OneNote Tags", "OneNote Tags (Home → Tags gallery) annotate individual paragraphs for later searching and review. To Do (Ctrl+1): inserts a checkbox — check it when the action is complete, ideal for meeting action items. Important (Ctrl+2): yellow star marks critical information. Question (Ctrl+3): purple question mark for follow-up items. Remember for later (Ctrl+4). Definition (Ctrl+5). Highlight (Ctrl+6). The Find Tags feature (Home → Tags → Find Tags) generates a Tag Summary task pane that collects all tagged items across all notebooks, organized by tag type, section, title, or date for easy review.", "Home Tab → Tags group → click a tag type  OR  use Ctrl+1 through Ctrl+6 shortcuts"),

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
