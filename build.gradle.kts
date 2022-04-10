// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        maven("https://jitpack.io")
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.5")

    }
}



tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}