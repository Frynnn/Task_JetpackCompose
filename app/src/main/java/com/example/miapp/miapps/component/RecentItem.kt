package com.example.miapp.miapps.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miapp.R
import com.example.miapp.model.Recent
import com.example.miapp.ui.theme.MiAppTheme

@Composable
fun RecentItem(
    recent: Recent,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = recent.photo),
            contentDescription = recent.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = recent.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = " - ${recent.time}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecentItemPreview() {
    MiAppTheme {
        RecentItem(
            recent = Recent(
                1,
                "Nama Mentee",
                "10.00 PM",
                R.drawable.bg
            )
        )
    }
}