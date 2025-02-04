package com.nerds.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion

@Suppress("UnstableApiUsage")

internal fun configureAndroid(commonExtension: CommonExtension<*, *, *, *, *, *>) {
    commonExtension.apply {
        compileSdk = 33

        defaultConfig {
            minSdk = 30
            testInstrumentationRunner = "com.nerds.convention.testing.HiltTestRunner"
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }

        buildFeatures.buildConfig = false
    }
}