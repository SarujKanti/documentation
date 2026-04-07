package com.skd.documentation.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skd.documentation.R
import com.skd.documentation.data.model.BookSection
import com.skd.documentation.data.model.ContentItem

@Composable
fun BookPageRenderer(
    section: BookSection,
    appColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 32.dp)
    ) {
        // Section level badge at top
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(appColor.copy(alpha = 0.08f))
                .padding(horizontal = 16.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(section.tabIcon),
                contentDescription = null,
                tint = appColor,
                modifier = Modifier.size(16.dp)
            )
            Spacer(Modifier.width(6.dp))
            Text(
                text = section.tabName,
                style = MaterialTheme.typography.labelMedium,
                color = appColor,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.weight(1f))
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = appColor.copy(alpha = 0.15f)
            ) {
                Text(
                    text = section.levelTag,
                    style = MaterialTheme.typography.labelSmall,
                    color = appColor,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                )
            }
        }

        // Content items
        section.content.forEach { item ->
            ContentItemView(item = item, appColor = appColor)
        }
    }
}

@Composable
fun ContentItemView(item: ContentItem, appColor: Color) {
    when (item) {

        is ContentItem.ChapterHeader -> {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(appColor)
                    .padding(20.dp)
            ) {
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                if (item.subtitle.isNotEmpty()) {
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = item.subtitle,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.White.copy(alpha = 0.85f)
                    )
                }
            }
        }

        is ContentItem.SectionHeading -> {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)) {
                Spacer(Modifier.height(12.dp))
                Text(
                    text = item.text,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = appColor
                )
                Spacer(Modifier.height(4.dp))
                HorizontalDivider(
                    color = appColor.copy(alpha = 0.3f),
                    thickness = 2.dp,
                    modifier = Modifier.fillMaxWidth(0.4f)
                )
            }
        }

        is ContentItem.SubHeading -> {
            Text(
                text = item.text,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp)
            )
        }

        is ContentItem.BodyText -> {
            Text(
                text = item.text,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.85f),
                lineHeight = 22.sp,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
            )
        }

        is ContentItem.NumberedStep -> {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 5.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    // Step number badge
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(32.dp)
                            .clip(CircleShape)
                            .background(appColor)
                    ) {
                        Text(
                            text = item.number.toString(),
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = item.title,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        if (item.body.isNotEmpty()) {
                            Spacer(Modifier.height(4.dp))
                            Text(
                                text = item.body,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.75f),
                                lineHeight = 18.sp
                            )
                        }
                    }
                }
            }
        }

        is ContentItem.BulletItem -> {
            Row(
                modifier = Modifier.padding(
                    start = (16 + item.level * 16).dp,
                    end = 16.dp,
                    top = 2.dp,
                    bottom = 2.dp
                ),
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .padding(top = 7.dp)
                        .size(6.dp)
                        .clip(CircleShape)
                        .background(appColor)
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    text = item.text,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.85f),
                    lineHeight = 20.sp,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        is ContentItem.ScreenshotItem -> {
            ScreenshotFrame(item = item, appColor = appColor)
        }

        is ContentItem.TipBox -> {
            val tipColor = Color(0xFF2E7D32)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9))
            ) {
                Row(modifier = Modifier.padding(12.dp), verticalAlignment = Alignment.Top) {
                    Icon(
                        painter = painterResource(R.drawable.ic_tip),
                        contentDescription = null,
                        tint = tipColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "TIP",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = tipColor,
                            letterSpacing = 0.5.sp
                        )
                        Spacer(Modifier.height(2.dp))
                        Text(
                            text = item.text,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFF1B5E20),
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }

        is ContentItem.NoteBox -> {
            val noteColor = Color(0xFF1565C0)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE3F2FD))
            ) {
                Row(modifier = Modifier.padding(12.dp), verticalAlignment = Alignment.Top) {
                    Icon(
                        painter = painterResource(R.drawable.ic_note),
                        contentDescription = null,
                        tint = noteColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "NOTE",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = noteColor,
                            letterSpacing = 0.5.sp
                        )
                        Spacer(Modifier.height(2.dp))
                        Text(
                            text = item.text,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFF0D47A1),
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }

        is ContentItem.WarningBox -> {
            val warnColor = Color(0xFFE65100)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0))
            ) {
                Row(modifier = Modifier.padding(12.dp), verticalAlignment = Alignment.Top) {
                    Icon(
                        painter = painterResource(R.drawable.ic_warning),
                        contentDescription = null,
                        tint = warnColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "WARNING",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = warnColor,
                            letterSpacing = 0.5.sp
                        )
                        Spacer(Modifier.height(2.dp))
                        Text(
                            text = item.text,
                            style = MaterialTheme.typography.bodySmall,
                            color = Color(0xFFBF360C),
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }

        is ContentItem.KeyShortcut -> {
            Row(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 3.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Parse keys separated by "+"
                val parts = item.keys.split("+").map { it.trim() }
                parts.forEachIndexed { index, key ->
                    KeyBadge(key = key)
                    if (index < parts.lastIndex) {
                        Text(
                            text = "+",
                            modifier = Modifier.padding(horizontal = 4.dp),
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
                Spacer(Modifier.width(8.dp))
                Text(
                    text = "→",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                )
                Spacer(Modifier.width(6.dp))
                Text(
                    text = item.action,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.85f)
                )
            }
        }

        is ContentItem.FormulaItem -> {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E2E))
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = item.formula,
                        fontFamily = FontFamily.Monospace,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color(0xFF50FA7B),
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        text = item.description,
                        style = MaterialTheme.typography.bodySmall,
                        color = Color(0xFFCDD6F4).copy(alpha = 0.75f),
                        lineHeight = 16.sp
                    )
                }
            }
        }

        is ContentItem.SectionDivider -> {
            Spacer(Modifier.height(8.dp))
            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                color = MaterialTheme.colorScheme.outlineVariant
            )
            Spacer(Modifier.height(8.dp))
        }
    }
}

// ── Realistic MS Office window mockup ────────────────────────────────────────

@Composable
private fun ScreenshotFrame(item: ContentItem.ScreenshotItem, appColor: Color) {

    // Determine which ribbon tab is active from the stepTitle
    val allTabs = listOf("File", "Home", "Insert", "Design", "Layout",
        "References", "Mailings", "Review", "View", "Draw", "Help")
    val activeTab = allTabs.firstOrNull { tab ->
        item.stepTitle.contains(tab, ignoreCase = true) ||
        item.navigationPath.contains(tab, ignoreCase = true)
    } ?: "Home"

    // Ribbon groups per tab
    val ribbonGroups = mapOf(
        "Home"       to listOf("Clipboard", "Font", "Paragraph", "Styles", "Editing"),
        "Insert"     to listOf("Pages", "Tables", "Illustrations", "Links", "Text", "Symbols"),
        "Design"     to listOf("Themes", "Document Formatting", "Page Background"),
        "Layout"     to listOf("Page Setup", "Paragraph", "Arrange"),
        "References" to listOf("Table of Contents", "Footnotes", "Citations", "Captions", "Index"),
        "Mailings"   to listOf("Create", "Start Mail Merge", "Write & Insert Fields", "Preview", "Finish"),
        "Review"     to listOf("Proofing", "Comments", "Tracking", "Changes", "Compare", "Protect"),
        "View"       to listOf("Views", "Show", "Zoom", "Window", "Macros"),
        "Draw"       to listOf("Drawing Tools", "Insert Ink", "Convert"),
        "Help"       to listOf("Help", "Show Training", "Feedback"),
        "File"       to listOf("New", "Open", "Save", "Print", "Export", "Close")
    )
    val groups = ribbonGroups[activeTab] ?: listOf("Clipboard", "Font", "Paragraph", "Styles")

    // Determine app name for title bar
    val combined = "${item.stepTitle} ${item.navigationPath} ${item.caption}"
    val appName = when {
        combined.contains("Excel", ignoreCase = true)
            || combined.contains("Pivot", ignoreCase = true)
            || combined.contains("Spreadsheet", ignoreCase = true) -> "Microsoft Excel"
        combined.contains("PowerPoint", ignoreCase = true)
            || combined.contains("Slide", ignoreCase = true)
            || combined.contains("Presentation", ignoreCase = true) -> "Microsoft PowerPoint"
        combined.contains("Outlook", ignoreCase = true)
            || combined.contains("Calendar", ignoreCase = true)
            || combined.contains("Inbox", ignoreCase = true) -> "Microsoft Outlook"
        combined.contains("OneNote", ignoreCase = true)
            || combined.contains("Notebook", ignoreCase = true) -> "Microsoft OneNote"
        else -> "Microsoft Word"
    }

    val surfaceColor   = Color(0xFFF3F2F1)
    val tabStripColor  = Color(0xFFEFEFEF)
    val ribbonBg       = Color.White
    val borderColor    = Color(0xFFD0D0D0)
    val docLineColor   = Color(0xFFD8D8D8)
    val onDarkText     = Color.White
    val tabText        = Color(0xFF323130)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 10.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = surfaceColor)
    ) {
        Column {

            // ── 1. Title bar ─────────────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(appColor)
                    .padding(horizontal = 10.dp, vertical = 5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // App icon dot
                Box(
                    modifier = Modifier
                        .size(14.dp)
                        .clip(RoundedCornerShape(3.dp))
                        .background(Color.White.copy(alpha = 0.25f))
                )
                Spacer(Modifier.width(6.dp))
                Text(
                    text = "Document1 — $appName",
                    color = onDarkText,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.weight(1f)
                )
                // Window control buttons
                Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    listOf("−", "□", "✕").forEach { btn ->
                        Text(text = btn, color = onDarkText.copy(alpha = 0.85f), fontSize = 10.sp)
                    }
                }
            }

            // ── 2. Quick Access Toolbar (thin strip) ─────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFE8E8E8))
                    .padding(horizontal = 10.dp, vertical = 3.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                listOf("💾", "↩", "↪").forEach { icon ->
                    Text(text = icon, fontSize = 8.sp)
                }
                Spacer(Modifier.width(8.dp))
                Text(
                    text = "AutoSave  ●  OFF",
                    fontSize = 7.sp,
                    color = Color(0xFF666666)
                )
            }

            // ── 3. Ribbon tab strip ───────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(tabStripColor)
                    .padding(horizontal = 4.dp, vertical = 0.dp)
            ) {
                allTabs.take(8).forEach { tab ->
                    val isActive = tab == activeTab
                    Text(
                        text = tab,
                        fontSize = 9.sp,
                        fontWeight = if (isActive) FontWeight.Bold else FontWeight.Normal,
                        color = if (isActive) appColor else tabText,
                        modifier = Modifier
                            .background(
                                color = if (isActive) ribbonBg else Color.Transparent,
                                shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp)
                            )
                            .border(
                                width = if (isActive) 0.5.dp else 0.dp,
                                color = if (isActive) borderColor else Color.Transparent,
                                shape = RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp)
                            )
                            .padding(horizontal = 7.dp, vertical = 4.dp)
                    )
                }
            }

            // ── 4. Ribbon groups ─────────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(ribbonBg)
                    .border(BorderStroke(0.5.dp, borderColor))
                    .padding(horizontal = 6.dp, vertical = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                groups.take(4).forEach { group ->
                    Column(
                        modifier = Modifier
                            .border(0.5.dp, borderColor, RoundedCornerShape(3.dp))
                            .padding(horizontal = 6.dp, vertical = 4.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Group button row (represented as small colored dots)
                        Row(horizontalArrangement = Arrangement.spacedBy(3.dp)) {
                            repeat(3) {
                                Box(
                                    modifier = Modifier
                                        .size(width = 12.dp, height = 8.dp)
                                        .background(
                                            if (it == 0) appColor.copy(alpha = 0.7f)
                                            else appColor.copy(alpha = 0.2f),
                                            RoundedCornerShape(1.dp)
                                        )
                                )
                            }
                        }
                        Spacer(Modifier.height(3.dp))
                        Text(
                            text = group,
                            fontSize = 6.5.sp,
                            color = Color(0xFF555555),
                            textAlign = TextAlign.Center,
                            lineHeight = 8.sp
                        )
                    }
                }
            }

            // ── 5. Document content area ──────────────────────────────────────
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFEAEAEA))
                    .padding(10.dp)
            ) {
                // Simulated document page
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(horizontal = 12.dp, vertical = 8.dp)
                ) {
                    // Title line
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(0.55f)
                            .height(6.dp)
                            .background(Color(0xFFBBBBBB), RoundedCornerShape(3.dp))
                    )
                    Spacer(Modifier.height(5.dp))
                    // Body lines
                    listOf(0.9f, 0.82f, 0.95f, 0.72f, 0.88f).forEach { fraction ->
                        Spacer(Modifier.height(3.dp))
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(fraction)
                                .height(4.dp)
                                .background(docLineColor, RoundedCornerShape(2.dp))
                        )
                    }
                }
            }

            // ── 6. Navigation path ────────────────────────────────────────────
            if (item.navigationPath.isNotEmpty()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(appColor.copy(alpha = 0.07f))
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_screenshot),
                        contentDescription = null,
                        tint = appColor,
                        modifier = Modifier.size(12.dp)
                    )
                    Spacer(Modifier.width(6.dp))
                    Text(
                        text = "Navigation:  ${item.navigationPath}",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium,
                        color = appColor,
                        lineHeight = 14.sp
                    )
                }
            }

            // ── 7. Figure caption ─────────────────────────────────────────────
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(horizontal = 14.dp, vertical = 10.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .clip(CircleShape)
                            .background(appColor)
                    )
                    Spacer(Modifier.width(7.dp))
                    Text(
                        text = "Fig: ${item.stepTitle}",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A1A1A)
                    )
                }
                Spacer(Modifier.height(5.dp))
                Text(
                    text = item.caption,
                    fontSize = 11.sp,
                    color = Color(0xFF444444),
                    lineHeight = 17.sp,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )
            }
        }
    }
}

@Composable
private fun KeyBadge(key: String) {
    Surface(
        shape = RoundedCornerShape(4.dp),
        color = MaterialTheme.colorScheme.surfaceVariant,
        shadowElevation = 2.dp,
        modifier = Modifier.border(
            width = 1.dp,
            color = MaterialTheme.colorScheme.outline.copy(alpha = 0.4f),
            shape = RoundedCornerShape(4.dp)
        )
    ) {
        Text(
            text = key,
            style = MaterialTheme.typography.labelSmall,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(horizontal = 7.dp, vertical = 3.dp),
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}
