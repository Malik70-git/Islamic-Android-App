# Islamic Android App 🕌

ایک خوبصورت، سادہ اور صارف دوست Islamic Android ایپ لیکشن

A beautiful, simple and user-friendly Islamic Android application.

## ✨ خصوصیات | Features

### 📖 قرآن مجید | Quran
- عربی متن کے ساتھ مکمل قرآن
- اردو اور انگریزی ترجمے
- سورتوں کی فہرست اور تلاش
- روزانہ ایک آیت

### 📚 احادیث | Hadith
- صحیح البخاری
- صحیح مسلم
- احادیث کی تلاش

### 🕌 نماز کے اوقات | Prayer Times
- موجودہ مقام کے لیے نماز کے اوقات
- GPS کی بنیاد پر خودکار شہر کی شناخت
- اطلاع کی سہولت

### 🧭 قبلہ کی سمت | Qibla Direction
- کمپاس کی بنیاد پر قبلہ کی سمت
- سچی سمت درست کرنا

### 📆 اسلامی کیلنڈر | Islamic Calendar
- ہجری اور میلادی کیلنڈر
- اہم اسلامی تاریخیں
- عیدوں کی تاریخیں

### 🤲 روزانہ دعا | Daily Dua
- مختلف دعائیں
- ہر دعا کا معنی اور ترجمہ

### 📿 تسبیح کاؤنٹر | Tasbeeh Counter
- ڈیجیٹل تسبیح کاؤنٹر
- مختلف تسبیحات

### ✡️ اللہ کے 99 نام | 99 Names of Allah
- اردو اور انگریزی میں
- ہر نام کا معنی

### 🌅 صبح و شام کی آذکار | Morning & Evening Azkar
- صبح کی آذکار
- شام کی آذکار
- رات کی دعائیں

### 📢 اسلامی یادیں | Islamic Reminders
- روزانہ اسلامی یادیں
- اہم تاریخیں

### 🎨 صاف ستھرا ڈیزائن | Clean Design
- خوبصورت رنگ (سبز اور سونے جیسے)
- سادہ اور آسان نیویگیشن
- تمام عمر کے صارفین کے لیے موزوں

## 📊 Google AdMob Integration

اشتہارات احتیاط کے ساتھ رکھے گئے ہیں:
- ہوم اسکرین پر
- مناسب سیکشنز کے درمیان

**اہم:** قرآن، احادیث، دعا، نماز کی معلومات اور دوسری اہم اسلامی معلومات پر کوئی اشتہار نہیں۔

## 🔧 تکنیکی معلومات | Technical Details

- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Minimum SDK:** API 24 (Android 7.0)
- **Target SDK:** API 34 (Android 14)
- **Architecture:** MVVM
- **Database:** Room
- **API Integration:** Retrofit + Gson
- **Ads:** Google Mobile Ads SDK (AdMob)
- **Location:** Google Play Services Location
- **Dependency Injection:** Hilt

## 📦 Dependencies

```gradle
- Jetpack Compose
- Jetpack Navigation
- Room Database
- Retrofit
- Google Mobile Ads SDK
- Google Play Services Location
- Hilt
- Coroutines
```

## 🚀 کیسے شروع کریں | Getting Started

### Prerequisites
- Android Studio (Giraffe یا اس سے نیا)
- Android SDK API 34
- Gradle 8.0+

### Steps

1. **Repository کو Clone کریں:**
```bash
git clone https://github.com/Malik70-git/Islamic-Android-App.git
cd Islamic-Android-App
```

2. **Android Studio میں کھولیں:**
```bash
android-studio .
```

3. **Gradle Sync:**
- File → Sync Now

4. **AdMob Unit ID تبدیل کریں (اختیاری):**
- `AndroidManifest.xml` میں اپنی AdMob Unit ID ڈالیں
- یا تجربے کے لیے ڈیفالٹ ID استعمال کریں

5. **Run the App:**
- Run → Run 'app'
- یا Shift + F10 دبائیں

## 🏗️ Project Structure

```
app/
├── src/main/
│   ├── java/com/islamic/app/
│   │   ├── MainActivity.kt
│   │   ├── ui/
│   │   │   ├── navigation/
│   │   │   │   └── Screen.kt
│   │   │   ├── screens/
│   │   │   │   ├── HomeScreen.kt
│   │   │   │   ├── QuranScreen.kt
│   │   │   │   ├── HadithScreen.kt
│   │   │   │   ├── PrayerTimesScreen.kt
│   │   │   │   ├── IslamicCalendarScreen.kt
│   │   │   │   └── AzkarScreen.kt
│   │   │   └── theme/
│   │   │       ├── Color.kt
│   │   │       ├── Type.kt
│   │   │       └── Theme.kt
│   │   └── data/
│   │       ├── models/
│   │       ├── repository/
│   │       └── api/
│   └── AndroidManifest.xml
└── build.gradle.kts
```

## 📱 APK بنانا | Building APK

### Release APK
```bash
./gradlew assembleRelease
```

APK فائل یہاں ہوگی:
```
app/build/outputs/apk/release/app-release.apk
```

### Debug APK
```bash
./gradlew assembleDebug
```

APK فائل یہاں ہوگی:
```
app/build/outputs/apk/debug/app-debug.apk
```

## 📋 Google Play Store پر شائع کرنا | Publishing to Play Store

1. **Google Play Console میں سائن اپ کریں**
2. **نیا ایپ بنائیں**
3. **Release APK بنائیں:**
   ```bash
   ./gradlew bundleRelease
   ```
4. **اپ لوڈ کریں:** `app/build/outputs/bundle/release/app-release.aab`
5. **تفصیلات، اسکرین شاٹ اور اشتہارات شامل کریں**
6. **اپ لوڈ کریں اور شائع کریں**

## 🎨 رنگ اور ڈیزائن | Colors & Design

- **Primary Green:** `#2D5016` (گہرا سبز)
- **Light Green:** `#4CAF50` (روشن سبز)
- **Secondary Gold:** `#D4AF37` (سونا)
- **Background:** `#FAFAFA` (روشن سفید)
- **Text Dark:** `#212121` (گہرا)
- **Text Light:** `#757575` (ہلکا)

## 📄 لائسنس | License

یہ پروجیکٹ Apache License 2.0 کے تحت ہے - تفصیلات کے لیے [LICENSE](LICENSE) فائل دیکھیں۔

## 🤝 تعاون | Contributing

تعاون کا خیر مقدم ہے! براہ کرم:

1. Fork the repository
2. Feature branch بنائیں (`git checkout -b feature/AmazingFeature`)
3. اپنی تبدیلیاں Commit کریں (`git commit -m 'Add some AmazingFeature'`)
4. Branch کو Push کریں (`git push origin feature/AmazingFeature`)
5. Pull Request کھولیں

## 📞 رابطہ | Contact

- GitHub: [@Malik70-git](https://github.com/Malik70-git)
- Email: malik@example.com

## 🙏 دعائیں | Prayers

اس ایپلیکیشن کو بہتر بنانے میں اپنا کردار ڈالیں۔ آپ کی دعائیں ہمیں حوصلہ دیں گی۔

---

**اللہ ہمیں خدمت اسلام کی توفیق دے۔** 🕌

May Allah accept from us and guide us to the path of righteousness. Ameen! 🤲