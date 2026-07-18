package com.skd.documentation.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.skd.documentation.data.model.OfficeApp
import com.skd.documentation.ui.components.BookPageRenderer
import com.skd.documentation.viewmodel.DocumentationViewModel
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue
import kotlin.math.sign

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun DocumentationScreen(
    viewModel: DocumentationViewModel = viewModel()
) {
    val apps            by viewModel.apps.collectAsState()
    val selectedAppIndex by viewModel.selectedAppIndex.collectAsState()
    val selectedApp     = apps[selectedAppIndex]
    val scope           = rememberCoroutineScope()
    var showAppSheet    by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6F7F9))
            .navigationBarsPadding()        // keeps content above gesture nav bar
    ) {
        // ── Slim top bar with ☰ hamburger ─────────────────────────────────────
        AppTopBar(
            selectedApp  = selectedApp,
            onMenuClick  = { showAppSheet = true }
        )
        // ── Tab row + pager — keyed so pager resets on app switch ────────────
        key(selectedAppIndex) {
            val pagerState = rememberPagerState { selectedApp.sections.size }
            val appColor   = Color(selectedApp.primaryColor)
            // derivedStateOf: tab labels only recompose when the page number
            // changes, NOT on every frame during a swipe gesture.
            val currentPage by remember { derivedStateOf { pagerState.currentPage } }
            
            // Scrollable tab row
            ScrollableTabRow(
                selectedTabIndex = currentPage,
                containerColor   = appColor,
                contentColor     = Color.White,
                edgePadding      = 12.dp,
                indicator        = { tabPositions ->
                    // Smooth interpolated indicator — slides continuously with
                    // the user's finger instead of jumping on page snap.
                    if (tabPositions.isNotEmpty() && currentPage < tabPositions.size) {
                        val fraction   = pagerState.currentPageOffsetFraction
                        val targetPage = (currentPage + fraction.sign.toInt())
                            .coerceIn(0, tabPositions.lastIndex)
                        val from = tabPositions[currentPage]
                        val to   = tabPositions[targetPage]
                        val t    = fraction.absoluteValue   // 0 → 1 during swipe
                        Box(
                            Modifier
                                .wrapContentSize(Alignment.BottomStart)
                                .offset(x = lerp(from.left, to.left, t) + 10.dp)
                                .width(
                                    (lerp(from.width, to.width, t) - 20.dp)
                                        .coerceAtLeast(0.dp)
                                )
                                .height(3.dp)
                                .clip(RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp))
                                .background(Color.White)
                        )
                    }
                },
                divider = {}
            ) {
                selectedApp.sections.forEachIndexed { index, section ->
                    val isSelected = currentPage == index
                    Tab(
                        selected = isSelected,
                        onClick  = { scope.launch { pagerState.animateScrollToPage(index) } },
                        modifier = Modifier.height(46.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier          = Modifier.padding(horizontal = 6.dp)
                        ) {
                            Icon(
                                painter            = painterResource(section.tabIcon),
                                contentDescription = null,
                                modifier           = Modifier.size(15.dp),
                                tint               = if (isSelected) Color.White
                                                     else Color.White.copy(alpha = 0.6f)
                            )
                            Spacer(Modifier.width(5.dp))
                            Text(
                                text          = section.tabName,
                                fontSize      = 12.5.sp,
                                fontWeight    = if (isSelected) FontWeight.Bold
                                               else FontWeight.Normal,
                                color         = if (isSelected) Color.White
                                               else Color.White.copy(alpha = 0.6f),
                                letterSpacing = 0.2.sp
                            )
                        }
                    }
                }
            }

            // Page content
            // beyondBoundsPageCount = 0 → only the visible page is composed.
            // Default pre-composes 1 page either side, tripling the layout work.
            HorizontalPager(
                state               = pagerState,

                modifier            = Modifier.fillMaxSize()
            ) { index ->
                // graphicsLayer runs entirely on the GPU render thread —
                // a subtle fade during swipe with zero CPU cost.
                val pageOffset = (
                    (pagerState.currentPage - index) +
                    pagerState.currentPageOffsetFraction
                ).absoluteValue
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .graphicsLayer {
                            // Fade pages slightly as they leave/enter (max 12% dim)
                            alpha = 1f - (pageOffset * 0.12f).coerceIn(0f, 0.12f)
                        }
                ) {
                    BookPageRenderer(
                        section  = selectedApp.sections[index],
                        appColor = appColor
                    )
                }
            }
        }
    }

    // ── App selector bottom sheet ─────────────────────────────────────────────
    if (showAppSheet) {
        ModalBottomSheet(
            onDismissRequest = { showAppSheet = false },
            containerColor   = Color.White,
            shape            = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
            dragHandle       = {
                Box(
                    modifier = Modifier
                        .padding(top = 14.dp, bottom = 6.dp)
                        .size(width = 36.dp, height = 4.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFD1D5DB))
                )
            }
        ) {
            AppSelectorSheet(
                apps          = apps,
                selectedIndex = selectedAppIndex,
                onSelect      = { index ->
                    viewModel.selectApp(index)
                    showAppSheet = false
                }
            )
        }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
//  Slim top bar
// ─────────────────────────────────────────────────────────────────────────────

@Composable
private fun AppTopBar(
    selectedApp: OfficeApp,

    onMenuClick: () -> Unit
) {
    val appColor = Color(selectedApp.primaryColor)
    Surface(
        color           = Color.White,
        shadowElevation = 4.dp,
        modifier        = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier          = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 8.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // ☰ Hamburger button
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication        = null
                    ) { onMenuClick() }
            ) {
                Column(
                    modifier             = Modifier.size(width = 18.dp, height = 13.dp),
                    verticalArrangement  = Arrangement.SpaceBetween
                ) {
                    repeat(3) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(2.dp)
                                .background(appColor, CircleShape)
                        )
                    }
                }
            }

            Spacer(Modifier.width(4.dp))

            // App icon
            Icon(
                painter           = painterResource(selectedApp.appIcon),
                contentDescription = null,
                tint              = appColor,
                modifier          = Modifier.size(22.dp)
            )
            Spacer(Modifier.width(10.dp))
            // Title stack
            Column {
                Text(
                    text       = selectedApp.appName.removePrefix("MS "),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize   = 16.sp,
                    color      = appColor,
                    letterSpacing = 0.1.sp
                )
                Text(
                    text     = "Microsoft Office",
                    fontSize = 10.sp,
                    color    = Color(0xFF9CA3AF),
                    letterSpacing = 0.2.sp
                )
            }
            Spacer(Modifier.weight(1f))

            // Badge
            Surface(
                shape = RoundedCornerShape(20.dp),
                color = Color(0xFFF3F4F6)
            ) {
                Text(
                    text      = "Learning Guide",
                    fontSize  = 10.sp,
                    color     = Color(0xFF6B7280),
                    fontWeight = FontWeight.Medium,
                    modifier  = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                )
            }
        }
    }
}

// ─────────────────────────────────────────────────────────────────────────────
//  App selector bottom sheet content
// ─────────────────────────────────────────────────────────────────────────────

@Composable
private fun AppSelectorSheet(
    apps: List<OfficeApp>,
    selectedIndex: Int,
    onSelect: (Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(bottom = 16.dp)
    ) {
        // Sheet header
        Column(
            modifier = Modifier.padding(start = 22.dp, end = 22.dp, top = 4.dp, bottom = 16.dp)
        ) {
            Text(
                text       = "Switch Application",
                fontWeight = FontWeight.ExtraBold,
                fontSize   = 18.sp,
                color      = Color(0xFF111827)
            )
            Spacer(Modifier.height(2.dp))
            Text(
                text     = "Microsoft Office Learning Guide",
                fontSize = 12.sp,
                color    = Color(0xFF9CA3AF)
            )
        }

        HorizontalDivider(color = Color(0xFFF3F4F6))
        Spacer(Modifier.height(6.dp))

        // App rows
        apps.forEachIndexed { index, app ->
            val isSelected = index == selectedIndex
            val appColor   = Color(app.primaryColor)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication        = null
                    ) { onSelect(index) }
                    .background(
                        if (isSelected) appColor.copy(alpha = 0.07f) else Color.Transparent
                    )
                    .padding(horizontal = 22.dp, vertical = 13.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Icon circle
                Box(
                    contentAlignment = Alignment.Center,
                    modifier         = Modifier
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(
                            if (isSelected) appColor else appColor.copy(alpha = 0.10f)
                        )
                ) {
                    Icon(
                        painter           = painterResource(app.appIcon),
                        contentDescription = null,
                        tint              = if (isSelected) Color.White else appColor,
                        modifier          = Modifier.size(24.dp)
                    )
                }
                Spacer(Modifier.width(16.dp))
                // Labels
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text       = app.appName.removePrefix("MS "),
                        fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.SemiBold,
                        fontSize   = 15.sp,
                        color      = if (isSelected) appColor else Color(0xFF111827)
                    )
                    Text(
                        text     = "${app.sections.size} topics available",
                        fontSize = 11.sp,
                        color    = Color(0xFF9CA3AF)
                    )
                }
                // Selected checkmark
                if (isSelected) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(26.dp)
                            .clip(CircleShape)
                            .background(appColor)
                    ) {
                        Text(
                            text       = "✓",
                            fontSize   = 13.sp,
                            color      = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                } else {
                    Box(
                        modifier = Modifier
                            .size(26.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFF3F4F6))
                    )
                }
            }
        }
    }

}

