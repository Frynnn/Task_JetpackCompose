package com.example.miapp.miapps

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.miapp.R
import com.example.miapp.data.DummyData
import com.example.miapp.model.Trending

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailTrendingScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    trendingId: Int?
) {
    val newTrendingsList= DummyData.miTrending.filter { trending ->
        trending.id == trendingId
    }
    Column(modifier = modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Trending Details") },
            navigationIcon = {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }
        )
        DetailTrendingContent(newTrendingsList = newTrendingsList)
    }
}

@Composable
private fun DetailTrendingContent(
    newTrendingsList: List<Trending>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newTrendingsList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Poster"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newTrendingsList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailTrendingContentPreview() {
    DetailTrendingContent(newTrendingsList = DummyData.miTrending)
}