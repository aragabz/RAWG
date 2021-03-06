dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        maven { url = uri("https://jitpack.io") }
    }
}


rootProject.name = "RAWG"


include(
    ":app", ":core", ":domain", ":data", ":models"
)
