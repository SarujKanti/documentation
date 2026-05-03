package com.skd.documentation.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.F
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skd.documentation.R
import com.skd.documentation.data.model.BookSection
import com.skd.documentation.data.model.ContentItem

// ─────────────────────────────────────────────────────────────────────────────
//  Entry point
// ─────────────────────────────────────────────────────────────────────────────

@Composable
fun BookPageRenderer(
    section: BookSection,
    appColor: Color,
    modifier: Modifier = Modifier
) {
    // LazyColumn only composes items that are actually on screen.
    // Replaces Column+verticalScroll which composed ALL 80+ items upfront,
    // causing jank during pager swipes on every Android version.
    val listState = rememberLazyListState()

    LazyColumn(
        state          = listState,
        modifier       = modifier
            .fillMaxSize()
            .background(Color(0xFFF6F7F9)),
        contentPadding = PaddingValues(bottom = 40.dp)
    ) {
        itemsIndexed(
            items       = section.content,
            // Stable keys let Compose skip recomposition for unchanged items
            key         = { index, _ -> index },
            // Content types let Compose reuse node slots across different item
            // types, reducing allocation during fast scrolling
            contentType = { _, item -> item::class.simpleName }
        ) { _, item ->
            ContentItemView(item = item, appColor = appColor)
        }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
//  Content item dispatcher
// ─────────────────────────────────────────────────────────────────────────────

@Composable
fun ContentItemView(item: ContentItem, appColor: Color) {
    when (item) {

        // ── Chapter Header ────────────────────────────────────────────────────
        is ContentItem.ChapterHeader -> {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(horizontal = 18.dp, vertical = 20.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .size(width = 36.dp, height = 4.dp)
                            .background(appColor, RoundedCornerShape(2.dp))
                    )
                    Spacer(Modifier.height(10.dp))
                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color(0xFF1A1A2E)
                    )
                    if (item.subtitle.isNotEmpty()) {
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = item.subtitle,
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color(0xFF6B7280),
                            lineHeight = 22.sp
                        )
                    }
                    Spacer(Modifier.height(12.dp))
                    HorizontalDivider(color = Color(0xFFE5E7EB))
                }
            }
        }

        // ── Section Heading ───────────────────────────────────────────────────
        is ContentItem.SectionHeading -> {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 18.dp, end = 18.dp, top = 24.dp, bottom = 6.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(width = 4.dp, height = 22.dp)
                            .background(appColor, RoundedCornerShape(2.dp))
                    )
                    Spacer(Modifier.width(10.dp))
                    Text(
                        text = item.text,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF111827)
                    )
                }
                Spacer(Modifier.height(8.dp))
            }
        }

        // ── Sub-Heading ────────────────────────────────────────────────────────
        is ContentItem.SubHeading -> {
            Text(
                text = item.text,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.SemiBold,
                color = appColor,
                modifier = Modifier.padding(start = 18.dp, end = 18.dp, top = 14.dp, bottom = 4.dp)
            )
        }

        // ── Body Text ─────────────────────────────────────────────────────────
        is ContentItem.BodyText -> {
            Text(
                text = item.text,
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF374151),
                lineHeight = 24.sp,
                modifier = Modifier.padding(horizontal = 18.dp, vertical = 4.dp)
            )
        }

        // ── Numbered Step ─────────────────────────────────────────────────────
        is ContentItem.NumberedStep -> {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp, vertical = 5.dp),
                verticalAlignment = Alignment.Top
            ) {
                // Step number badge
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                        .background(appColor)
                ) {
                    Text(
                        text = item.number.toString(),
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
                Spacer(Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF111827)
                    )
                    if (item.body.isNotEmpty()) {
                        Spacer(Modifier.height(3.dp))
                        Text(
                            text = item.body,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFF6B7280),
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }

        // ── Bullet Item ───────────────────────────────────────────────────────
        is ContentItem.BulletItem -> {
            Row(
                modifier = Modifier.padding(
                    start = (18 + item.level * 16).dp,
                    end = 18.dp,
                    top = 3.dp,
                    bottom = 3.dp
                ),
                verticalAlignment = Alignment.Top
            ) {
                if (item.level == 0) {
                    Box(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .size(6.dp)
                            .clip(CircleShape)
                            .background(appColor)
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .size(5.dp)
                            .clip(CircleShape)
                            .background(appColor.copy(alpha = 0.45f))
                    )
                }
                Spacer(Modifier.width(9.dp))
                Text(
                    text = item.text,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color(0xFF374151),
                    lineHeight = 20.sp,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        // ── Screenshot Item ───────────────────────────────────────────────────
        is ContentItem.ScreenshotItem -> {
            ScreenshotFrame(item = item, appColor = appColor)
        }

        // ── Tip Box ───────────────────────────────────────────────────────────
        is ContentItem.TipBox -> {
            InfoBox(
                label = "TIP",
                text = item.text,
                bgColor = Color(0xFFECFDF5),
                borderColor = Color(0xFF10B981),
                labelColor = Color(0xFF059669),
                textColor = Color(0xFF065F46),
                iconRes = R.drawable.ic_tip
            )
        }

        // ── Note Box ──────────────────────────────────────────────────────────
        is ContentItem.NoteBox -> {
            InfoBox(
                label = "NOTE",
                text = item.text,
                bgColor = Color(0xFFEFF6FF),
                borderColor = Color(0xFF3B82F6),
                labelColor = Color(0xFF2563EB),
                textColor = Color(0xFF1E40AF),
                iconRes = R.drawable.ic_note
            )
        }

        // ── Warning Box ───────────────────────────────────────────────────────
        is ContentItem.WarningBox -> {
            InfoBox(
                label = "WARNING",
                text = item.text,
                bgColor = Color(0xFFFFFBEB),
                borderColor = Color(0xFFF59E0B),
                labelColor = Color(0xFFD97706),
                textColor = Color(0xFF92400E),
                iconRes = R.drawable.ic_warning
            )
        }

        // ── Keyboard Shortcut ─────────────────────────────────────────────────
        is ContentItem.KeyShortcut -> {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val parts = item.keys.split("+").map { it.trim() }
                parts.forEachIndexed { i, key ->
                    KeyBadge(key)
                    if (i < parts.lastIndex) {
                        Text(
                            text = "+",
                            modifier = Modifier.padding(horizontal = 3.dp),
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF6B7280)
                        )
                    }
                }
                Spacer(Modifier.width(10.dp))
                Text(text = "→", color = Color(0xFF9CA3AF), fontSize = 12.sp)
                Spacer(Modifier.width(6.dp))
                Text(
                    text = item.action,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color(0xFF374151)
                )
            }
        }

        // ── Formula Item ──────────────────────────────────────────────────────
        is ContentItem.FormulaItem -> {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp, vertical = 6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E2E))
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Text(
                        text = "fx",
                        fontFamily = FontFamily.Monospace,
                        fontSize = 11.sp,
                        color = Color(0xFF6272A4),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 2.dp, end = 10.dp)
                    )
                    Column {
                        Text(
                            text = item.formula,
                            fontFamily = FontFamily.Monospace,
                            fontSize = 13.sp,
                            color = Color(0xFF50FA7B),
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(Modifier.height(6.dp))
                        Text(
                            text = item.description,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFFCDD6F4).copy(alpha = 0.75f),
                            lineHeight = 17.sp
                        )
                    }
                }
            }
        }

        // ── Section Divider ───────────────────────────────────────────────────
        is ContentItem.SectionDivider -> {
            Spacer(Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                HorizontalDivider(modifier = Modifier.weight(1f), color = Color(0xFFE5E7EB))
            }
            Spacer(Modifier.height(10.dp))
        }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
//  Info box (Tip / Note / Warning)
// ─────────────────────────────────────────────────────────────────────────────

@Composable
private fun InfoBox(
    label: String,
    text: String,
    bgColor: Color,
    borderColor: Color,
    labelColor: Color,
    textColor: Color,
    iconRes: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 18.dp, vertical = 5.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(bgColor)
            .border(
                width = 1.dp,
                color = borderColor.copy(alpha = 0.5f),
                shape = RoundedCornerShape(8.dp)
            )
            .padding(start = 0.dp),
        verticalAlignment = Alignment.Top
    ) {
        // Left accent strip
        Box(
            modifier = Modifier
                .width(4.dp)
                .fillMaxHeight()
                .background(borderColor)
        )
        Spacer(Modifier.width(12.dp))
        Icon(
            painter = painterResource(iconRes),
            contentDescription = null,
            tint = labelColor,
            modifier = Modifier
                .size(18.dp)
                .padding(top = 12.dp)
        )
        Spacer(Modifier.width(8.dp))
        Column(modifier = Modifier.weight(1f).padding(top = 10.dp, bottom = 10.dp, end = 12.dp)) {
            Text(
                text = label,
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.ExtraBold,
                color = labelColor,
                letterSpacing = 0.8.sp
            )
            Spacer(Modifier.height(3.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.bodySmall,
                color = textColor,
                lineHeight = 19.sp
            )
        }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
//  Screenshot frame — realistic MS Office window mockup
// ─────────────────────────────────────────────────────────────────────────────

/** Returns (activeGroupName, list of button labels) for the given screenshot title. */
private fun getSpecificContent(title: String): Pair<String, List<String>> = when {
    title.contains("Clipboard", ignoreCase = true) ->
        "Clipboard" to listOf("✂ Cut", "📋 Copy", "Paste ▾", "🖌 Format Painter")
    title.contains("Font Group", ignoreCase = true) ->
        "Font" to listOf("Calibri ▾", "12 ▾", "B", "I", "U", "S̶", "x₂", "x²", "A▾", "🎨▾")
    title.contains("Paragraph Group", ignoreCase = true) ->
        "Paragraph" to listOf("≡L", "≡C", "≡R", "≡J", "☰•", "1.", "↑¶", "↓¶", "↕▾", "¶")
    title.contains("Styles", ignoreCase = true) ->
        "Styles" to listOf("Normal", "No Spacing", "Heading 1", "Heading 2", "Title", "Subtitle", "▾ More")
    title.contains("Find", ignoreCase = true) || title.contains("Replace", ignoreCase = true) ->
        "Editing" to listOf("Find what: ___", "Replace with: ___", "Match case ☐", "Whole words ☐", "Replace", "Replace All")
    title.contains("Insert Tab Ribbon", ignoreCase = true) ->
        "Insert" to listOf("Cover Page", "Table ▾", "Pictures▾", "Shapes▾", "Icons", "SmartArt", "Chart", "Hyperlink")
    title.contains("Table Grid", ignoreCase = true) || title.contains("Insert Table", ignoreCase = true) ->
        "Tables" to listOf("• • • •", "• • • •", "• • • •", "Insert Table…", "Draw Table", "Quick Tables▾")
    title.contains("Wrap Text", ignoreCase = true) ->
        "Picture Format" to listOf("In Line", "Square", "Tight", "Through", "Top & Bottom", "Behind Text", "In Front")
    title.contains("SmartArt", ignoreCase = true) ->
        "Illustrations" to listOf("List", "Process", "Cycle", "Hierarchy", "Relationship", "Matrix", "Pyramid")
    title.contains("Design Tab Ribbon", ignoreCase = true) ->
        "Document Formatting" to listOf("Themes▾", "Colors▾", "Fonts▾", "Spacing▾", "Effects▾", "Set as Default")
    title.contains("Theme", ignoreCase = true) ->
        "Themes" to listOf("Office", "Facet", "Integral", "Ion", "Retrospect", "Slice", "Wisp", "Customize…")
    title.contains("Watermark", ignoreCase = true) ->
        "Page Background" to listOf("Watermark▾", "Page Color▾", "Page Borders")
    title.contains("Layout Tab Ribbon", ignoreCase = true) ->
        "Page Setup" to listOf("Margins▾", "Orientation▾", "Size▾", "Columns▾", "Breaks▾", "Line Numbers▾", "Hyphenation▾")
    title.contains("Page Setup", ignoreCase = true) ->
        "Page Setup" to listOf("Normal", "Narrow", "Moderate", "Wide", "Mirrored", "── Custom Margins…")
    title.contains("Break", ignoreCase = true) ->
        "Page Setup" to listOf("──PAGE BREAKS──", "Page  Ctrl+Enter", "Column", "Text Wrapping", "──SECTION──", "Next Page", "Continuous", "Even/Odd Page")
    title.contains("References Tab", ignoreCase = true) ->
        "Table of Contents" to listOf("TOC▾", "Add Text▾", "Update Table", "| Footnotes▾", "| Citations▾", "| Captions▾")
    title.contains("Table of Contents", ignoreCase = true) ->
        "Table of Contents" to listOf("Automatic Table 1", "Automatic Table 2", "Manual Table", "── Custom TOC…", "Update Table", "Remove TOC")
    title.contains("Bibliography", ignoreCase = true) ->
        "Citations & Bibliography" to listOf("Insert Citation▾", "Manage Sources", "Style: APA▾", "Bibliography▾", "Update Citations")
    title.contains("Mailings Tab", ignoreCase = true) ->
        "Start Mail Merge" to listOf("Letters", "Email Messages", "Envelopes", "Labels", "Directory", "Step-by-Step Wizard")
    title.contains("Recipients", ignoreCase = true) ->
        "Start Mail Merge" to listOf("Type a New List", "Use an Existing List ✓", "Choose from Outlook Contacts", "Edit Recipient List…")
    title.contains("Merge Fields", ignoreCase = true) ->
        "Write & Insert Fields" to listOf("«Address Block»", "«Greeting Line»", "Insert Merge Field▾", "Rules▾", "Match Fields", "Update Labels")
    title.contains("Review Tab", ignoreCase = true) ->
        "Proofing" to listOf("Spelling & Grammar F7", "Thesaurus", "Word Count", "| Track Changes▾", "| Comments▾", "| Compare▾")
    title.contains("Comments in", ignoreCase = true) ->
        "Comments" to listOf("New Comment", "Delete▾", "Previous", "Next", "Show Comments", "Resolve", "Reply")
    title.contains("Track Changes", ignoreCase = true) ->
        "Tracking" to listOf("Track Changes▾ ●ON", "All Markup▾", "Show Markup▾", "Reviewing Pane▾")
    title.contains("View Tab", ignoreCase = true) ->
        "Views" to listOf("Print Layout ●", "Web Layout", "Outline", "Draft", "Read Mode", "| Ruler ☑", "| Navigation Pane ☑")
    title.contains("Navigation Pane", ignoreCase = true) ->
        "Show" to listOf("☑ Ruler", "☑ Navigation Pane", "☐ Gridlines", "☐ Formula Bar", "| Navigation Pane")
    title.contains("Draw Tab", ignoreCase = true) ->
        "Drawing Tools" to listOf("✏ Pen ▾", "✏ Pencil ▾", "🖌 Highlighter ▾", "⌫ Eraser▾", "📐 Ruler", "| Ink to Math")
    title.contains("Draw Toolbar", ignoreCase = true) ->
        "Pen Options" to listOf("Color: ⬛▾", "Thickness: ●▾", "Effects: ─▾", "Galaxy", "Rainbow", "Lava", "+ Add Pen")
    title.contains("Help Tab", ignoreCase = true) ->
        "Help" to listOf("? Help  F1", "Show Training", "What's New", "Contact Support", "Feedback▾")
    title.contains("Excel Interface", ignoreCase = true) ->
        "Home" to listOf("Name Box: A1", "fx Formula Bar", "A  B  C  D  E", "1  2  3  4  5", "Sheet1  Sheet2  +")
    title.contains("AutoFill", ignoreCase = true) ->
        "Editing" to listOf("Monday →", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday  ← Fill")
    title.contains("Excel Home", ignoreCase = true) ->
        "Number" to listOf("General▾", "$ ▾", "% ", ", ", "+.0", "-.0", "│ Conditional Formatting▾", "Format as Table▾")
    title.contains("Number Format", ignoreCase = true) ->
        "Number" to listOf("General", "Number: 1,234.00", "Currency: $1,234", "Accounting", "Short Date", "Long Date", "Percentage: 95%", "Scientific: 1.23E+3", "Text")
    title.contains("Conditional Formatting", ignoreCase = true) ->
        "Styles" to listOf("Highlight Rules▾", "Top/Bottom Rules▾", "Data Bars▾", "Color Scales▾", "Icon Sets▾", "── Manage Rules…")
    title.contains("Formulas Tab Overview", ignoreCase = true) ->
        "Formulas Ribbon" to listOf("Σ AutoSum▾", "📋 Recently Used▾", "$ Financial▾", "✓ Logical▾", "📅 Date & Time▾", "🔍 Lookup▾", "∑ Math & Trig▾", "More Functions▾")
    title.contains("AutoSum", ignoreCase = true) ->
        "Function Library" to listOf("Σ AutoSum ●", "Sum", "Average", "Count Numbers", "Max", "Min", "── More Functions…")
    title.contains("VLOOKUP Example", ignoreCase = true) ->
        "Lookup & Reference" to listOf("VLOOKUP ●", "HLOOKUP", "XLOOKUP", "INDEX", "MATCH", "OFFSET", "INDIRECT", "CHOOSE")
    title.contains("HLOOKUP", ignoreCase = true) ->
        "Lookup & Reference" to listOf("HLOOKUP ●", "VLOOKUP", "XLOOKUP", "INDEX", "MATCH", "ROW", "COLUMN", "CHOOSE")
    title.contains("INDEX MATCH", ignoreCase = true) || title.contains("INDEX+MATCH", ignoreCase = true) ->
        "Lookup & Reference" to listOf("INDEX ●", "MATCH ●", "XLOOKUP", "OFFSET", "INDIRECT", "ROW", "COLUMN", "ROWS")
    title.contains("Dynamic Array", ignoreCase = true) ->
        "Function Library" to listOf("FILTER ●", "SORT▾", "SORTBY", "UNIQUE", "SEQUENCE", "XMATCH", "XLOOKUP", "RANDARRAY")
    title.contains("Date Function", ignoreCase = true) ->
        "Date & Time" to listOf("TODAY ●", "NOW", "DATE▾", "DATEDIF", "DAYS", "EDATE", "EOMONTH", "NETWORKDAYS", "WORKDAY")
    title.contains("Formula Bar", ignoreCase = true) || title.contains("VLOOKUP", ignoreCase = true) ->
        "Function Library" to listOf("Σ AutoSum▾", "Recently Used▾", "Financial▾", "Logical▾", "Lookup & Reference▾", "Math▾", "More Functions▾")
    title.contains("Excel Data Tab", ignoreCase = true) ->
        "Sort & Filter" to listOf("↑↓ Sort", "▽ Filter", "Clear", "Reapply", "Advanced", "│ Text to Columns", "│ Flash Fill  Ctrl+E", "│ Remove Duplicates")
    title.contains("Sort Dialog", ignoreCase = true) ->
        "Sort & Filter" to listOf("Sort by:  Column▾", "Then by: Column▾", "Order: A→Z▾", "Add Level", "Delete Level", "▲ ▼ Move", "My data has headers ☑")
    title.contains("Data Validation", ignoreCase = true) ->
        "Data Tools" to listOf("Allow: List▾", "Data: between▾", "Source: =$F$1:$F$10", "Input Message", "Error Alert: Stop▾", "Circle Invalid Data")
    title.contains("Chart Types", ignoreCase = true) ->
        "Charts" to listOf("Column▾", "Line▾", "Pie▾", "Bar▾", "Area▾", "Scatter▾", "Map▾", "Stock▾", "Combo▾", "── All Charts…")
    title.contains("Chart with Labels", ignoreCase = true) ->
        "Chart Design" to listOf("Add Chart Element▾", "Data Labels▾", "Chart Title▾", "Legend▾", "Gridlines▾", "Change Chart Type", "Switch Row/Column")
    title.contains("Pivot Table Overview", ignoreCase = true) ->
        "PivotTable" to listOf("PivotTable▾", "Recommended PivotTables", "│ Filters", "Columns", "Rows", "Values", "Refresh▾")
    title.contains("PivotTable Field List", ignoreCase = true) ->
        "PivotTable Fields" to listOf("☑ Region", "☑ Product", "☑ Sales", "── Drag to zones ──", "FILTERS:", "COLUMNS:", "ROWS:", "VALUES: SUM(Sales)")
    title.contains("Slicer", ignoreCase = true) ->
        "Filter" to listOf("Insert Slicer", "Insert Timeline", "Filter Connections", "│ North ●", "│ South ●", "│ East", "│ West", "✕ Clear Filter")
    title.contains("PowerPoint Interface", ignoreCase = true) ->
        "Home" to listOf("New Slide▾", "Layout▾", "Reset", "│ Font▾", "│ Paragraph▾", "│ Drawing▾", "│ Editing▾")
    title.contains("Design Tab", ignoreCase = true) && title.contains("PowerPoint", ignoreCase = true) ->
        "Themes" to listOf("Office Theme ●", "Facet", "Ion", "Retrospect", "Slice", "│ Variants: ■■■■", "│ Slide Size▾", "│ Format Background")
    title.contains("Theme Variants", ignoreCase = true) ->
        "Variants" to listOf("Variant 1 ●", "Variant 2", "Variant 3", "Variant 4", "Colors▾", "Fonts▾", "Effects▾", "Background Styles▾")
    title.contains("Slide Master", ignoreCase = true) ->
        "Master Views" to listOf("Slide Master", "Handout Master", "Notes Master", "│ Insert Placeholder▾", "│ Insert Layout", "│ Close Master View")
    title.contains("Insert Tab in PowerPoint", ignoreCase = true) ->
        "Insert" to listOf("New Slide▾", "Table▾", "Pictures▾", "Shapes▾", "Icons", "SmartArt", "Chart", "Video▾", "Audio▾")
    title.contains("Transitions", ignoreCase = true) ->
        "Transition Gallery" to listOf("None ●", "Cut", "Fade", "Push", "Wipe", "Split", "Reveal", "Random Bars", "Shape", "Drape", "Cube", "── More…")
    title.contains("Animation Pane", ignoreCase = true) ->
        "Animation" to listOf("None", "Appear", "Fade ●", "Fly In", "Float In", "Split", "Wipe", "│ Effect Options▾", "│ Timing▾")
    title.contains("Slide Show Tab", ignoreCase = true) ->
        "Start Slide Show" to listOf("▶ From Beginning  F5", "▷ From Current  ⇧F5", "Custom Slide Show▾", "│ Set Up Slide Show", "│ Rehearse Timings", "│ Record Slide Show▾")
    title.contains("Presenter View", ignoreCase = true) ->
        "Monitors" to listOf("Monitor: Extend ●", "☑ Use Presenter View", "│ Current Slide: ◼ ◼", "│ Next: → Slide 2", "│ Notes: Speaker notes…", "│ Timer: 00:04:23 ⏸")
    title.contains("Outlook Interface", ignoreCase = true) ->
        "Home" to listOf("New Email", "New Items▾", "│ Reply", "Reply All", "Forward", "│ Delete▾", "│ Move▾", "│ Tags▾")
    title.contains("Outlook Calendar", ignoreCase = true) ->
        "Home" to listOf("New Appointment", "New Meeting", "New Items▾", "│ Day", "Work Week ●", "Week", "Month", "│ Today", "│ Next 7 Days")
    title.contains("OneNote Interface", ignoreCase = true) ->
        "Home" to listOf("New Page", "New Section", "│ Styles▾", "Tags▾", "│ Search  Ctrl+F", "│ Sync▾")
    title.contains("OneNote Tags", ignoreCase = true) ->
        "Tags" to listOf("☑ To Do  Ctrl+1", "★ Important  Ctrl+2", "? Question  Ctrl+3", "↓ Remember  Ctrl+4", "Def  Ctrl+5", "🖊 Highlight  Ctrl+6", "── Find Tags…")
    title.contains("Home Tab", ignoreCase = true) && title.contains("Ribbon", ignoreCase = true) ->
        "Home — 5 Groups" to listOf("✂ Clipboard", "Aa Font", "≡ Paragraph", "¶ Styles", "🔍 Editing")
    title.contains("Home Tab", ignoreCase = true) ->
        "Home Ribbon" to listOf("✂ Clipboard", "Aa Font", "≡ Paragraph", "¶ Styles", "🔍 Editing")
    title.contains("Ribbon", ignoreCase = true) ->
        "Ribbon Tabs" to listOf("File", "Home ●", "Insert", "Design", "Layout", "References", "Mailings", "Review", "View")
    else ->
        "Commands" to listOf("File", "Home ●", "Insert", "Design", "Layout", "References", "Review", "View")
}

@Composable
private fun ScreenshotFrame(item: ContentItem.ScreenshotItem, appColor: Color) {
    val title = item.stepTitle

    // ── All expensive string operations wrapped in remember ──────────────────
    // Without remember, these run on EVERY recomposition (including during
    // pager swipes and scroll). remember caches them until the item changes.

    val combined = remember(item.stepTitle, item.navigationPath, item.caption) {
        "$title ${item.navigationPath} ${item.caption}"
    }

    val (appName, docName) = remember(combined) {
        when {
            combined.contains("Excel", ignoreCase = true)
                || combined.contains("Pivot", ignoreCase = true)
                || combined.contains("Spreadsheet", ignoreCase = true)
                || combined.contains("VLOOKUP", ignoreCase = true)
                || combined.contains("Formula", ignoreCase = true) ->
                "Microsoft Excel" to "Workbook1.xlsx"
            combined.contains("PowerPoint", ignoreCase = true)
                || combined.contains("Slide", ignoreCase = true)
                || combined.contains("Presentation", ignoreCase = true) ->
                "Microsoft PowerPoint" to "Presentation1.pptx"
            combined.contains("Outlook", ignoreCase = true)
                || combined.contains("Calendar", ignoreCase = true)
                || combined.contains("Inbox", ignoreCase = true) ->
                "Microsoft Outlook" to "Inbox"
            combined.contains("OneNote", ignoreCase = true)
                || combined.contains("Notebook", ignoreCase = true) ->
                "Microsoft OneNote" to "My Notebook"
            else ->
                "Microsoft Word" to "Document1.docx"
        }
    }

    val activeTab = remember(item.navigationPath, title) {
        val allTabs = listOf("File", "Home", "Insert", "Design", "Layout",
            "References", "Mailings", "Review", "View", "Draw", "Help",
            "Transitions", "Animations", "Slide Show")
        allTabs.firstOrNull { tab ->
            item.navigationPath.startsWith(tab, ignoreCase = true) ||
            item.navigationPath.contains(" $tab ", ignoreCase = true) ||
            title.contains("$tab Tab", ignoreCase = true)
        } ?: "Home"
    }

    val (groupName, buttons) = remember(title) { getSpecificContent(title) }

    val isDialog = remember(title) {
         title.contains("Pane", ignoreCase = true)
        || title.contains("AutoFill", ignoreCase = true)
    }

    val windowBg = Color(0xFFEFEFEF)
    val ribbonBg = Color.White
    val tabBg = Color(0xFFE8E8E8)
    val borderClr = Color(0xFFCCCCCC)
    val textDark = Color(0xFF1A1A1A)
    val textGrey = Color(0xFF555555)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 10.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
        colors = CardDefaults.cardColors(containerColor = windowBg)
    ) {
        Column {

            // ── 1. Title bar ──────────────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(appColor)
                    .padding(horizontal = 10.dp, vertical = 5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(RoundedCornerShape(2.dp))
                        .background(Color.White.copy(alpha = 0.3f))
                )
                Spacer(Modifier.width(6.dp))
                Text(
                    text = "$docName  —  $appName",
                    color = Color.White,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.weight(1f),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    listOf("─", "□", "✕").forEach { btn ->
                        Text(text = btn, color = Color.White.copy(alpha = 0.85f), fontSize = 9.sp)
                    }
                }
            }

            // ── 2. Ribbon tab strip ────────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(tabBg)
                    .border(BorderStroke(0.5.dp, borderClr))
            ) {
                val displayTabs = when (appName) {
                    "Microsoft Excel" -> listOf("File", "Home", "Insert", "Page Layout", "Formulas", "Data", "Review", "View")
                    "Microsoft PowerPoint" -> listOf("File", "Home", "Insert", "Design", "Transitions", "Animations", "Slide Show", "Review")
                    "Microsoft Outlook" -> listOf("File", "Home", "Send/Receive", "Folder", "View", "Help")
                    else -> listOf("File", "Home", "Insert", "Design", "Layout", "References", "Review", "View")
                }
                displayTabs.take(7).forEach { tab ->
                    val isActive = tab.equals(activeTab, ignoreCase = true)
                    Box(
                        modifier = Modifier
                            .background(
                                if (isActive) ribbonBg else Color.Transparent,
                                RoundedCornerShape(topStart = 2.dp, topEnd = 2.dp)
                            )
                            .border(
                                width = if (isActive) 0.5.dp else 0.dp,
                                color = if (isActive) borderClr else Color.Transparent,
                                shape = RoundedCornerShape(topStart = 2.dp, topEnd = 2.dp)
                            )
                            .padding(horizontal = 7.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = tab,
                            fontSize = 8.sp,
                            fontWeight = if (isActive) FontWeight.Bold else FontWeight.Normal,
                            color = if (isActive) appColor else textGrey
                        )
                    }
                }
            }

            // ── 3. Ribbon content: specific buttons ────────────────────────────
            if (!isDialog) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(ribbonBg)
                        .border(BorderStroke(0.5.dp, borderClr))
                        .padding(8.dp)
                ) {
                    // Group label
                    Text(
                        text = groupName,
                        fontSize = 7.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = appColor,
                        letterSpacing = 0.5.sp
                    )
                    Spacer(Modifier.height(5.dp))
                    // Button chips — single horizontally scrollable row (no wrapping)
                    Row(
                        modifier = Modifier.horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        buttons.forEach { btn ->
                            val isSeparator = btn.startsWith("──") || btn.startsWith("│")
                            val isActive    = btn.contains("●") || btn.contains("☑")
                            if (isSeparator) {
                                Text(
                                    text     = btn.removePrefix("│ ").removePrefix("── "),
                                    fontSize = 7.sp,
                                    color    = Color(0xFF999999),
                                    fontStyle = FontStyle.Italic,
                                    modifier = Modifier.padding(horizontal = 2.dp, vertical = 2.dp)
                                )
                            } else {
                                Surface(
                                    shape  = RoundedCornerShape(3.dp),
                                    color  = if (isActive) appColor.copy(alpha = 0.15f) else Color(0xFFF0F0F0),
                                    border = BorderStroke(
                                        0.5.dp,
                                        if (isActive) appColor.copy(alpha = 0.6f) else borderClr
                                    )
                                ) {
                                    Text(
                                        text       = btn,
                                        fontSize   = 7.5.sp,
                                        fontWeight = if (isActive) FontWeight.Bold else FontWeight.Normal,
                                        color      = if (isActive) appColor else textDark,
                                        modifier   = Modifier.padding(horizontal = 5.dp, vertical = 3.dp),
                                        maxLines   = 1
                                    )
                                }
                            }
                        }
                    }
                }
            } else {
                // Dialog mockup
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(ribbonBg)
                        .border(BorderStroke(0.5.dp, borderClr))
                        .padding(10.dp)
                ) {
                    Text(
                        text = "⊞  $groupName",
                        fontSize = 8.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = textDark
                    )
                    Spacer(Modifier.height(6.dp))
                    // Show buttons as dialog fields/options
                    buttons.take(6).forEach { btn ->
                        val isSeparator = btn.startsWith("──") || btn.startsWith("│")
                        if (!isSeparator) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 2.dp)
                                    .background(Color(0xFFF8F8F8), RoundedCornerShape(2.dp))
                                    .border(0.5.dp, borderClr, RoundedCornerShape(2.dp))
                                    .padding(horizontal = 6.dp, vertical = 3.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(text = btn, fontSize = 7.5.sp, color = textDark)
                                if (btn.endsWith("▾")) {
                                    Spacer(Modifier.weight(1f))
                                    Text(text = "▾", fontSize = 7.sp, color = textGrey)
                                }
                            }
                        }
                    }
                }
            }

            // ── 4. Document / content area (compact) ──────────────────────────
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFE0E0E0))
                    .padding(horizontal = 8.dp, vertical = 6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(horizontal = 12.dp, vertical = 7.dp)
                ) {
                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.40f)
                                .height(4.dp)
                                .background(Color(0xFFBBBBBB), RoundedCornerShape(3.dp))
                        )
                        Spacer(Modifier.height(4.dp))
                        listOf(0.85f, 0.72f, 0.90f).forEach { frac ->
                            Spacer(Modifier.height(3.dp))
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth(frac)
                                    .height(3.dp)
                                    .background(Color(0xFFDDDDDD), RoundedCornerShape(2.dp))
                            )
                        }
                    }
                }
            }

            // ── 5. Navigation path ─────────────────────────────────────────────
            if (item.navigationPath.isNotEmpty()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(appColor.copy(alpha = 0.06f))
                        .padding(horizontal = 12.dp, vertical = 7.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_screenshot),
                        contentDescription = null,
                        tint = appColor,
                        modifier = Modifier.size(11.dp)
                    )
                    Spacer(Modifier.width(5.dp))
                    // Render nav path as breadcrumb chips
                    val steps = item.navigationPath.split("→").map { it.trim() }
                    steps.forEachIndexed { i, step ->
                        if (i > 0) {
                            Text(" › ", fontSize = 9.sp, color = appColor.copy(alpha = 0.5f))
                        }
                        Surface(
                            shape = RoundedCornerShape(4.dp),
                            color = if (i == steps.lastIndex) appColor.copy(alpha = 0.15f) else Color.Transparent
                        ) {
                            Text(
                                text = step,
                                fontSize = 9.sp,
                                fontWeight = if (i == steps.lastIndex) FontWeight.SemiBold else FontWeight.Normal,
                                color = appColor,
                                modifier = Modifier.padding(horizontal = if (i == steps.lastIndex) 5.dp else 2.dp, vertical = 1.dp)
                            )
                        }
                    }
                }
            }

            // ── 6. Figure caption (compact — 3-line max) ──────────────────────
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(horizontal = 14.dp, vertical = 10.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(6.dp)
                            .clip(CircleShape)
                            .background(appColor)
                    )
                    Spacer(Modifier.width(7.dp))
                    Text(
                        text       = item.stepTitle,
                        fontSize   = 11.sp,
                        fontWeight = FontWeight.Bold,
                        color      = Color(0xFF1A1A1A)
                    )
                }
                if (item.caption.isNotEmpty()) {
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text       = item.caption,
                        fontSize   = 10.5.sp,
                        color      = Color(0xFF6B7280),
                        lineHeight = 15.sp,
                        maxLines   = 3,
                        overflow   = androidx.compose.ui.text.style.TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
//  Key badge
// ─────────────────────────────────────────────────────────────────────────────

@Composable
private fun KeyBadge(key: String) {
    Surface(
        shape = RoundedCornerShape(4.dp),
        color = Color(0xFFF3F4F6),
        shadowElevation = 1.dp,
        modifier = Modifier.border(
            width = 1.dp,
            color = Color(0xFFD1D5DB),
            shape = RoundedCornerShape(4.dp)
        )
    ) {
        Text(
            text = key,
            style = MaterialTheme.typography.labelSmall,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp),
            color = Color(0xFF1F2937)
        )
    }
}
