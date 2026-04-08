package com.skd.documentation.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.skd.documentation.data.model.OfficeApp
import com.skd.documentation.ui.components.BookPageRenderer
import com.skd.documentation.viewmodel.DocumentationViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DocumentationScreen(
    viewModel: DocumentationViewModel = viewModel()
) {
    val apps by viewModel.apps.collectAsState()
    val selectedAppIndex by viewModel.selectedAppIndex.collectAsState()
    val selectedApp = apps[selectedAppIndex]
    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {

        // ── App Selector Bar ─────────────────────────────────────────────────
        AppSelectorBar(
            apps = apps,
            selectedIndex = selectedAppIndex,
            onSelect = { index ->
                viewModel.selectApp(index)
            }
        )

        // ── Tab row + pager (keyed so pager resets on app switch) ────────────
        key(selectedAppIndex) {
            val pagerState = rememberPagerState { selectedApp.sections.size }
            val appColor = Color(selectedApp.primaryColor)

            // Tab row
            ScrollableTabRow(
                selectedTabIndex = pagerState.currentPage,
                containerColor = appColor,
                contentColor = Color.White,
                edgePadding = 8.dp,
                indicator = { tabPositions ->
                    if (pagerState.currentPage < tabPositions.size) {
                        TabRowDefaults.SecondaryIndicator(
                            Modifier.tabIndicatorOffset(tabPositions[pagerState.currentPage]),
                            color = Color.White,
                            height = 3.dp
                        )
                    }
                }
            ) {
                selectedApp.sections.forEachIndexed { index, section ->
                    Tab(
                        selected = pagerState.currentPage == index,
                        onClick = { scope.launch { pagerState.animateScrollToPage(index) } },
                        modifier = Modifier.height(48.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 4.dp)
                        ) {
                            Icon(
                                painter = painterResource(section.tabIcon),
                                contentDescription = null,
                                modifier = Modifier.size(16.dp),
                                tint = if (pagerState.currentPage == index)
                                    Color.White else Color.White.copy(alpha = 0.7f)
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                text = section.tabName,
                                fontSize = 13.sp,
                                fontWeight = if (pagerState.currentPage == index)
                                    FontWeight.Bold else FontWeight.Normal,
                                color = if (pagerState.currentPage == index)
                                    Color.White else Color.White.copy(alpha = 0.7f)
                            )
                        }
                    }
                }
            }

            // Pager
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) { index ->
                BookPageRenderer(
                    section = selectedApp.sections[index],
                    appColor = appColor
                )
            }
        }
    }
}

@Composable
private fun AppSelectorBar(
    apps: List<OfficeApp>,
    selectedIndex: Int,
    onSelect: (Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        // App name header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 10.dp,
                    bottom = 2.dp
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Microsoft Office",
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A1A2E),
                letterSpacing = 0.3.sp
            )
            Spacer(Modifier.weight(1f))
            Text(
                text = "Learning Guide",
                style = MaterialTheme.typography.labelSmall,
                color = Color(0xFF6B7280)
            )
        }

        // App chips row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            apps.forEachIndexed { index, app ->
                val isSelected = index == selectedIndex
                val appColor = Color(app.primaryColor)
                val shortName = app.appName.removePrefix("MS ")

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .weight(1f)
                        .clip(RoundedCornerShape(10.dp))
                        .background(
                            if (isSelected) appColor else Color(0xFFF3F4F6)
                        )
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null
                        ) { onSelect(index) }
                        .padding(vertical = 8.dp, horizontal = 4.dp)
                ) {
                    Icon(
                        painter = painterResource(app.appIcon),
                        contentDescription = app.appName,
                        tint = if (isSelected) Color.White else appColor,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = shortName,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = if (isSelected) Color.White else Color(0xFF374151),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

        HorizontalDivider(color = Color(0xFFE5E7EB))
    }
}
