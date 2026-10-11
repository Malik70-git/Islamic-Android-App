package com.islamic.app.data.models

data class Ayah(
    val surah: Int,
    val ayah: Int,
    val text: String,
    val translation: String,
    val transliteration: String
)

data class Surah(
    val number: Int,
    val name: String,
    val urduName: String,
    val englishName: String,
    val numberOfAyahs: Int,
    val revelation: String
)

data class Hadith(
    val id: Int,
    val title: String,
    val content: String,
    val narrator: String,
    val source: String
)

data class Dua(
    val id: Int,
    val arabicText: String,
    val urduTranslation: String,
    val englishTranslation: String,
    val category: String
)

data class PrayerTime(
    val name: String,
    val urduName: String,
    val time: String,
    val isJamaah: Boolean = false
)

data class Azkar(
    val id: Int,
    val category: String,
    val arabicText: String,
    val urduTranslation: String,
    val englishTranslation: String,
    val count: Int = 1
)

data class NameOfAllah(
    val arabicName: String,
    val urduMeaning: String,
    val englishMeaning: String,
    val number: Int
)

data class IslamicDate(
    val hijri: String,
    val gregorian: String,
    val arabicDate: String
)