package com.islamic.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.ads.MobileAds
import com.islamic.app.ui.navigation.Screen
import com.islamic.app.ui.screens.HomeScreen
import com.islamic.app.ui.screens.QuranScreen
import com.islamic.app.ui.screens.HadithScreen
import com.islamic.app.ui.screens.PrayerTimesScreen
import com.islamic.app.ui.screens.IslamicCalendarScreen
import com.islamic.app.ui.screens.AzkarScreen
import com.islamic.app.ui.theme.IslamicAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Initialize Google Mobile Ads SDK
        MobileAds.initialize(this)
        
        setContent {
            IslamicAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    IslamicApp()
                }
            }
        }
    }
}

@Composable
fun IslamicApp() {
    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.Quran.route) {
            QuranScreen(navController)
        }
        composable(Screen.Hadith.route) {
            HadithScreen(navController)
        }
        composable(Screen.PrayerTimes.route) {
            PrayerTimesScreen(navController)
        }
        composable(Screen.IslamicCalendar.route) {
            IslamicCalendarScreen(navController)
        }
        composable(Screen.Azkar.route) {
            AzkarScreen(navController)
        }
    }
}