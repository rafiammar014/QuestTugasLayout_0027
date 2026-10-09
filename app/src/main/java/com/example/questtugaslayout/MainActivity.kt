package com.example.questtugaslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.text.style.TextAlign
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
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = stringResource(id = R.string.header_subtitle),
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = TextSubtitleColor,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))
            item {
                CardPorto(
                    imageRes = R.drawable.ic_launcher_background, // Ganti dengan R.drawable.fotokamu jika ada
                    titleRes = R.string.card_title_identitas,
                    subtitleRes = R.string.card_desc_identitas
                )

                CardPorto(
                    imageRes = R.drawable.ic_launcher_foreground,
                    titleRes = R.string.card_title_about,
                    subtitleRes = R.string.card_desc_about
                )

                CardPorto(
                    imageRes = R.drawable.ic_launcher_background,
                    titleRes = R.string.card_title_skills,
                    subtitleRes = R.string.card_desc_skills
                )

                CardPorto(
                    imageRes = R.drawable.ic_launcher_foreground,
                    titleRes = R.string.card_title_contact,
                    subtitleRes = R.string.card_desc_contact
                )
            }
        }
    }
}

