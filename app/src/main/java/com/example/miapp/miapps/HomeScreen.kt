package com.example.miapp.miapps

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.miapp.miapps.component.RecentItem
import com.example.miapp.miapps.component.TrendingItem
import com.example.miapp.navigation.Screen
import com.example.miapp.data.DummyData
import com.example.miapp.model.Recent
import com.example.miapp.model.Trending

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    trending: List<Trending> = DummyData.miTrending,
    recent: List<Recent> = DummyData.miRecent
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(trending, key = { it.id }) {
                    TrendingItem(trending = it) {trendingId ->
                        navController.navigate(Screen.Profile.route + "/$trendingId")
                    }
                }
            }
        }
        items(recent, key = { it.id }) {
            RecentItem(recent = it, modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
        }