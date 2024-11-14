package com.example.miapp.miapps.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miapp.R
import com.example.miapp.model.Trending
import com.example.miapp.ui.theme.MiAppTheme

@Composable
fun TrendingItem(
    trending: Trending,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(trending.id)
        }
    ) {
        Image(
            painter = painterResource(id = trending.photo),
            contentDescription = trending.name, modifier = Modifier
                .size(230.dp)
        )
        Text(
            text = trending.name,
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(100.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TrendingItemHorizontalPreview() {
    MiAppTheme {
        TrendingItem(
            trending = Trending(1, "Reza Kurniawan", R.drawable.bg),
            onItemClicked = { trendingId ->
                println("Trending Id : $trendingId")
            }
        )
    }
}