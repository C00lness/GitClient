package com.example.gitclient.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gitclient.R

@Composable
fun UserCard(htmlUrl: String, avatarUrl: String, name: String, color: Color)
{
    val localUriHandler = LocalUriHandler.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clickable { localUriHandler.openUri(htmlUrl) },
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = color,
            contentColor =  MaterialTheme.colorScheme.onPrimary
        ),
        content = {
            Row()
            {
                ImageItem(url = avatarUrl)
                Text(
                    text = name, fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(20.dp)
                        .align(Alignment.CenterVertically)
                )

                Column(horizontalAlignment = Alignment.End, modifier = Modifier.fillMaxSize())
                {
                    Image(
                        painter = painterResource(R.drawable.baseline_keyboard_arrow_right_24),
                        contentDescription = null,
                        modifier = Modifier.size(36.dp)
                    )
                }
            }
        }
    )
}