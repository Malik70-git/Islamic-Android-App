package com.islamic.app.ui.navigation

seal class Screen(val route: String) {
    object Home : Screen("home")
    object Quran : Screen("quran")
    object Hadith : Screen("hadith")
    object PrayerTimes : Screen("prayer_times")
    object IslamicCalendar : Screen("islamic_calendar")
    object Azkar : Screen("azkar")
    object NamesOfAllah : Screen("names_of_allah")
    object Tasbeeh : Screen("tasbeeh")
    object Dua : Screen("dua")
    object Qibla : Screen("qibla")
}