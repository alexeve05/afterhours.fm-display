package com.example.cs411projectone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cs411projectone.ui.theme.Cs411ProjectOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cs411ProjectOneTheme {
                AfterhoursScreen()
            }
        }
    }
}
@Composable
fun AfterhoursScreen() {
    val backgroundColor = Color(0xFF17151A)
    val creamColor = Color(0xFFF2ECE7)
    val mutedColor = Color(0xFFAAA1A8)
    val accentColor = Color(0xFFC49AAE)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "afterhours.fm",
            color = creamColor,
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = "91.3 FM  •  LATE NIGHT RADIO",
            color = mutedColor,
            fontSize = 14.sp,
            letterSpacing = 2.sp
        )
        Spacer(modifier = Modifier.height(28.dp))
        Image(
            painter = painterResource(id = R.drawable.keshi_album),
            contentDescription = "Requiem album cover by keshi",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(290.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "NOW PLAYING",
            color = accentColor,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 3.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Like That",
            color = creamColor,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "keshi",
            color = mutedColor,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(22.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "02:14",
                color = mutedColor,
                fontSize = 13.sp
            )
            Text(
                text = "━━━━━━━━━━━━●━━━━━━",
                color = accentColor,
                fontSize = 14.sp
            )
            Text(
                text = "03:37",
                color = mutedColor,
                fontSize = 13.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "<-",
                color = creamColor,
                fontSize = 35.sp
            )
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "▶",
                color = creamColor,
                fontSize = 38.sp
            )
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "->",
                color = creamColor,
                fontSize = 35.sp
            )
        }
        Spacer(modifier = Modifier.height(22.dp))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            shape = RoundedCornerShape(26.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = accentColor,
                contentColor = backgroundColor
            )
        ) {
            Text(
                text = "♡  SAVE SONG",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 2.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "AFTER HOURS",
                color = mutedColor,
                fontSize = 15.sp,
                letterSpacing = 2.sp
            )
            Text(
                text = "● LIVE",
                color = accentColor,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun AfterhoursPreview() {
    Cs411ProjectOneTheme {
        AfterhoursScreen()
    }
}