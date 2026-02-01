package com.skd.documentation.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.skd.documentation.ui.components.BookPagerCube
import com.skd.documentation.viewmodel.DocumentationViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DocumentationScreen(
    viewModel: DocumentationViewModel = viewModel()
) {
    val pages = viewModel.pages.collectAsState()
    val pagerState = rememberPagerState { pages.value.size }
    val scope = rememberCoroutineScope()

    Column {

        // 🔹 TOP TABS
        ScrollableTabRow(
            selectedTabIndex = pagerState.currentPage
        ) {
            pages.value.forEachIndexed { index, page ->
                Tab(
                    selected = pagerState.currentPage == index,
                    onClick = {
                        scope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    },
                    text = { Text(page.title) }
                )
            }
        }

        // 🔹 BOOK PAGER
        BookPagerCube(
            pages = pages.value,
            pagerState = pagerState
        )
    }
}