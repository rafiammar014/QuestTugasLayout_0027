package com.example.questtugaslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
val TextSubtitleColor = Color(0xFF447CB9)

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
fun SkillChip(@StringRes textRes: Int) {
    Box(
        modifier = Modifier
            .padding(end = 8.dp)
            .background(
                color = Color(0xFFE5E7EB), // Warna abu-abu background chip
                shape = RoundedCornerShape(50) // Lengkungan penuh menyerupai pil
            )
            .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
        Text(
            text = stringResource(id = textRes),
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF374151) // Warna teks sedikit gelap
        )
    }
}

@Composable
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.background),
        contentDescription = "Background App",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()

            .padding(top = 64.dp, bottom = 20.dp),
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
        }

        item {
            CardPorto(
                imageRes = R.drawable.profile,
                titleRes = R.string.card_title_identitas,
                subtitleRes = R.string.card_desc_identitas
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                // Jangan lupa tambahkan string-nya di strings.xml
                SkillChip(textRes = R.string.skill_android) // misal: "Android"
                SkillChip(textRes = R.string.skill_uiux)    // misal: "UI/UX & Canva"
                SkillChip(textRes = R.string.skill_sport)   // misal: "Pencak Silat"
            }

            CardPorto(
                imageRes = R.drawable.profile2,
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
            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = TextTitleColor)
            ) {
                Text(
                    text = stringResource(id = R.string.btn_contact),
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
