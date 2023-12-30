plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}
//Properties properties = new Properties()
//properties.load(project.rootProject.file('local.properties').newDataInputStream())

android {
    namespace = "com.example.simya"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.simya"
        minSdk = (29)
        targetSdk = (33)
        versionCode = (1)
        versionName = "1.0"

//        buildConfigField "String","SIMYA_SERVER_URL",properties['simya_server_url']
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release"){
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
    configurations {
        implementation.get().exclude(mapOf("group" to "org.jetbrains", "module" to "annotations"))
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        dataBinding = true
    }
}


dependencies {

//    // Java language implementation
//    implementation("androidx.fragment:fragment:1.5.5")
//    // Kotlin
//    implementation("androidx.fragment:fragment-ktx:1.5.5")
//    // Testing Fragments in Isolation
//    debugImplementation("androidx.fragment:fragment-testing:1.5.5")


    implementation ("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.appcompat:appcompat:1.5.1")
    implementation ("com.google.android.material:material:1.7.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.3")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    // Navigation
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation ("androidx.navigation:navigation-ui:2.5.3")

    // CircleImageView
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    // Rating Review
    implementation ("com.github.Inconnu08:android-ratingreviews:1.2.0")
    // Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    implementation ("com.github.jetradarmobile:android-snowfall:1.2.0")
    // Retrofit2
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.google.code.gson:gson:2.8.6")

    // navigation component
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.3")
    // stomp
    implementation ("com.github.bishoybasily:stomp:2.0.5")

    // ExpandableTextView
    implementation ("com.ms-square:expandableTextView:0.1.4")

    // loading
    implementation ("com.github.ybq:Android-SpinKit:1.4.0")

    // okhttp-logging-interceptor
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")

    // coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")

    // Image cropper
    implementation ("com.github.takusemba:cropme:2.0.8")

    // Swipe Refresh
    implementation ("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
}