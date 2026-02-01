package com.skd.documentation.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.skd.documentation.data.model.WordDocPage
import kotlin.math.absoluteValue

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BookPagerCube(
    pages: List<WordDocPage>,
    pagerState: PagerState
) {
    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { index ->

        val pageOffset =
            (pagerState.currentPage - index) +
                    pagerState.currentPageOffsetFraction

        BookPage(
            page = pages[index],
            modifier = Modifier.graphicsLayer {
                rotationY = pageOffset * 45f
                transformOrigin = androidx.compose.ui.graphics.TransformOrigin(
                    pivotFractionX = if (pageOffset > 0) 0f else 1f,
                    pivotFractionY = 0.5f
                )
                cameraDistance = 24.dp.toPx()
            }
        )
    }
}