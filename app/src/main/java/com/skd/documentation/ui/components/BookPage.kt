package com.skd.documentation.ui.components

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
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
                ),
                border = CardDefaults.outlinedCardBorder()
            ) {
                Column {
                    // Header bar
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(appColor.copy(alpha = 0.12f))
                            .padding(horizontal = 12.dp, vertical = 7.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_screenshot),
                            contentDescription = null,
                            tint = appColor,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(Modifier.width(6.dp))
                        Text(
                            text = "SCREENSHOT",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = appColor,
                            letterSpacing = 1.sp
                        )
                    }
                    // Screenshot body
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_screenshot),
                            contentDescription = null,
                            tint = appColor.copy(alpha = 0.4f),
                            modifier = Modifier.size(40.dp)
                        )
                        Spacer(Modifier.height(8.dp))
                        Text(
                            text = item.stepTitle,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.SemiBold,
                            color = MaterialTheme.colorScheme.onSurface,
                            textAlign = TextAlign.Center
                        )
                        Spacer(Modifier.height(4.dp))
                        Text(
                            text = item.caption,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.65f),
                            textAlign = TextAlign.Center,
                            lineHeight = 16.sp
                        )
                    }
                }
            }
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
