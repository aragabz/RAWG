plugins {
    androidLibrary()
    kotlinAndroid()
    kotlinKapt()
    daggerHilt()
    kotlinParcelize()
}
android {
    compileSdk = ProjectConfiguration.COMPILE_SDK
    defaultConfig {
        minSdk = ProjectConfiguration.MIN_SDK
        targetSdk = ProjectConfiguration.TARGET_SDK
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}
dependencies {
    addCoreDependencies()
}

