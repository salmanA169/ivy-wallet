import com.ivy.buildsrc.Hilt
import com.ivy.buildsrc.Testing

apply<com.ivy.buildsrc.IvyComposePlugin>()

plugins {
    `android-library`
    `kotlin-android`
}

dependencies {
    Hilt()
    implementation(project(":common:main"))
    implementation(project(":design-system"))
    implementation(project(":core:domain"))
    implementation(project(":core:ui"))
    implementation(project(":core:data-model"))
    implementation(project(":core:persistence"))
    implementation(project(":navigation"))
    implementation(project(":backup:old"))
    implementation(project(":drive:google-drive"))
    implementation(project(":backup:impl"))
    Testing()
}