rootProject.name = "gradle-issue-include-build"

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.8.0")
}

includeBuild("build-logic")
include("application")
