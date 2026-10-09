package com.example.questtugaslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questtugaslayout.ui.theme.QuestTugasLayoutTheme
import com.example.questtugaslayout.ui.theme.CardPorto

val BackgroundApp = Color(0xFFF9FAFB)
val TextTitleColor = Color(0xFF111827)
val TextSubtitleColor = Color(0xFF6B7280)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestTugasLayoutTheme {
                MainScreen()
            }
        }
    }
}
@Composable
fun MainScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundApp)
            .padding(
                top = 64.dp,
                bottom = 20.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = stringResource(id = R.string.header_title),
                fontSize = 26.sp,
                fontWeight = FontWeight.ExtraBold,
                color = TextTitleColor,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

        }
    }
}

