package com.islamic.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.admanager.GoogleAdManagerBannerAdView
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.islamic.app.ui.navigation.Screen
import com.islamic.app.ui.theme.PrimaryGreen
import com.islamic.app.ui.theme.SecondaryGold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.WatchLater
import androidx.compose.material.icons.filled.Book

@Composable
fun HomeScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFAFAFA))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            // Header with Islamic greeting
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "السلام عليكم ورحمة الله",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryGreen
                )
                Text(
                    text = "Assalamu Alaikum",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            }
        }

        item {
            // Daily Ayah Card
            DailyAyahCard()
        }

        item {
            // Prayer Times Card
            FeatureCard(
                title = "نماز کے اوقات",
                subtitle = "Prayer Times",
                icon = Icons.Default.WatchLater,
                onClick = { navController.navigate(Screen.PrayerTimes.route) }
            )
        }

        item {
            // Islamic Calendar Card
            FeatureCard(
                title = "اسلامی کیلنڈر",
                subtitle = "Islamic Calendar",
                icon = Icons.Default.DateRange,
                onClick = { navController.navigate(Screen.IslamicCalendar.route) }
            )
        }

        item {
            // Qibla Direction Card
            FeatureCard(
                title = "قبلہ کی سمت",
                subtitle = "Qibla Direction",
                icon = Icons.Default.LocationOn,
                onClick = { navController.navigate(Screen.Qibla.route) }
            )
        }

        item {
            // Quick Access Grid
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "سریع رسائی",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryGreen,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    QuickAccessButton(
                        title = "قرآن",
                        modifier = Modifier.weight(1f),
                        onClick = { navController.navigate(Screen.Quran.route) }
                    )
                    QuickAccessButton(
                        title = "حدیث",
                        modifier = Modifier.weight(1f),
                        onClick = { navController.navigate(Screen.Hadith.route) }
                    )
                }
                
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    QuickAccessButton(
                        title = "دعا",
                        modifier = Modifier.weight(1f),
                        onClick = { navController.navigate(Screen.Dua.route) }
                    )
                    QuickAccessButton(
                        title = "آذکار",
                        modifier = Modifier.weight(1f),
                        onClick = { navController.navigate(Screen.Azkar.route) }
                    )
                }
            }
        }

        item {
            // AdMob Banner Ad - Bottom of Home Screen
            BannerAdView()
        }
    }
}

@Composable
fun DailyAyahCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "آج کی آیت",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryGreen
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ",
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "In the name of Allah, the Most Merciful, the Most Compassionate",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

@Composable
fun FeatureCard(
    title: String,
    subtitle: String,
    icon: androidx.compose.material.icons.materialIcon,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 4.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryGreen
                )
                Text(
                    text = subtitle,
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = SecondaryGold,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Composable
fun QuickAccessButton(
    title: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = PrimaryGreen
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}

@Composable
fun BannerAdView() {
    // Google AdMob Banner Ad
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Google AdMob Ad Placeholder",
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}