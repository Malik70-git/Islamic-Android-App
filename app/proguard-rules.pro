# Add project specific ProGuard rules here.

# AdMob
-keep class com.google.android.gms.** { *; }
-dontwarn com.google.android.gms.**
-keep class com.google.android.gms.ads.** { *; }

# Retrofit
-keep class retrofit2.** { *; }
-dontwarn retrofit2.**
-keepattributes Exceptions

# Gson
-keep class com.google.gson.** { *; }
-dontwarn com.google.gson.**

# Room
-keep class androidx.room.** { *; }
-dontwarn androidx.room.**

# General
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile