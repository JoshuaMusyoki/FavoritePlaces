plugins {
   `kotlin-dsl`
}

group = "com.nerds.convention"

java {
   sourceCompatibility = JavaVersion.VERSION_17
   targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
   compileOnly(libs.android.tools.build.gradle.plugin)
   compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
   plugins {
      register("sample.android.application ") {
         id = "sample.android.application"
         implementationClass = "AndroidApplicationConventionPlugin"
      }
      register("sampleAndroidLibrary") {
         id = "sample.android.library"
         implementationClass = "AndroidLibraryConventionPlugin"
      }
      register("sampleAndroidTest") {
         id = "sample.android.test"
         implementationClass = "AndroidTestConventionPlugin"
      }
      register("sampleCompose") {
         id = "sample.compose"
         implementationClass = "ComposeConventionPlugin"
      }
      register("sampleDynamic") {
         id = "sample.dynamic"
         implementationClass = "DynamicFeatureConventionPlugin"
      }
   }
}