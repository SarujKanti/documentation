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
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
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

    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF6F7F9))) {

        // ── App Navigation Bar ───────────────────────────────────────────────
        AppNavigationBar(
            apps = apps,
            selectedIndex = selectedAppIndex,
            onSelect = { index -> viewModel.selectApp(index) }
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
                edgePadding = 12.dp,
                indicator = { tabPositions ->
                    if (pagerState.currentPage < tabPositions.size) {
                        Box(
                            Modifier
                                .tabIndicatorOffset(tabPositions[pagerState.currentPage])
                                .fillMaxWidth()
                                .height(3.dp)
                                .padding(horizontal = 12.dp)
                                .clip(RoundedCornerShape(topStart = 3.dp, topEnd = 3.dp))
                                .background(Color.White)
                        )
                    }
                },
                divider = {}
            ) {
                selectedApp.sections.forEachIndexed { index, section ->
                    val isSelected = pagerState.currentPage == index
                    Tab(
                        selected = isSelected,
                        onClick = { scope.launch { pagerState.animateScrollToPage(index) } },
                        modifier = Modifier.height(46.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 6.dp)
                        ) {
                            Icon(
                                painter = painterResource(section.tabIcon),
                                contentDescription = null,
                                modifier = Modifier.size(15.dp),
                                tint = if (isSelected) Color.White else Color.White.copy(alpha = 0.65f)
                            )
                            Spacer(Modifier.width(5.dp))
                            Text(
                                text = section.tabName,
                                fontSize = 12.5.sp,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                color = if (isSelected) Color.White else Color.White.copy(alpha = 0.65f),
                                letterSpacing = 0.2.sp
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
private fun AppNavigationBar(
    apps: List<OfficeApp>,
    selectedIndex: Int,
    onSelect: (Int) -> Unit
) {
    Surface(
        color = Color.White,
        shadowElevation = 6.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            // ── Header strip ──────────────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 18.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Microsoft Office",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF111827),
                    letterSpacing = 0.3.sp
                )
                Spacer(Modifier.weight(1f))
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = Color(0xFFF3F4F6)
                ) {
                    Text(
                        text = "Learning Guide",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color(0xFF6B7280),
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    )
                }
            }

            // ── App selector tiles ────────────────────────────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
                    .padding(bottom = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                apps.forEachIndexed { index, app ->
                    val isSelected = index == selectedIndex
                    val appColor = Color(app.primaryColor)
                    val shortName = app.appName.removePrefix("MS ")

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(12.dp))
                            .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = null
                            ) { onSelect(index) }
                            .padding(vertical = 10.dp, horizontal = 2.dp)
                    ) {
                        // Icon circle
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(44.dp)
                                .shadow(
                                    elevation = if (isSelected) 4.dp else 0.dp,
                                    shape = CircleShape,
                                    ambientColor = appColor,
                                    spotColor = appColor
                                )
                                .clip(CircleShape)
                                .background(
                                    if (isSelected) appColor
                                    else appColor.copy(alpha = 0.10f)
                                )
                        ) {
                            Icon(
                                painter = painterResource(app.appIcon),
                                contentDescription = app.appName,
                                tint = if (isSelected) Color.White else appColor,
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        Spacer(Modifier.height(5.dp))

                        // App name label
                        Text(
                            text = shortName,
                            fontSize = 10.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                            color = if (isSelected) appColor else Color(0xFF9CA3AF),
                            textAlign = TextAlign.Center,
                            maxLines = 1
                        )

                        Spacer(Modifier.height(6.dp))

                        // Selection dot indicator
                        Box(
                            modifier = Modifier
                                .size(width = if (isSelected) 20.dp else 4.dp, height = 3.dp)
                                .clip(CircleShape)
                                .background(
                                    if (isSelected) appColor else Color.Transparent
                                )
                        )
                    }
                }
            }
        }
    }
}
