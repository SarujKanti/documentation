package com.skd.documentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.skd.documentation.data.model.WordContentItem
import com.skd.documentation.data.model.WordDocPage

@Composable
fun BookPage(
    page: WordDocPage,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {

            // 🔹 Title
            Text(
                text = page.title,
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(Modifier.height(12.dp))

            // 🔹 Ordered content (Text / Image / Text / Image)
            page.content.forEach { item ->
                when (item) {
                    is WordContentItem.Text -> {
                        Text(
                            text = item.value,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Spacer(Modifier.height(8.dp))
                    }

                    is WordContentItem.Image -> {
                        Image(
                            painter = painterResource(id = item.resId),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                        )
                        Spacer(Modifier.height(12.dp))
                    }
                }
            }

            Spacer(Modifier.height(12.dp))

            // 🔹 Steps section
            page.steps.forEach {
                Text("• $it")
            }
        }
    }
}