/*
 * This is the Gradle build file. The only important line for you (to select the libstorytree version) is surrounded by
 * comment lines.
 */

import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.40")
}

repositories {
    jcenter()
    maven("https://jitpack.io")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    /*********************************************************************/
    // This line should read
    //      implementation("com.github.utybo.StoryFX:libstorytree:VERSION")
    // Replace VERSION by the version you want. It can be a fully qualified version number or a Git hash (a string
    // of strange looking numbers and letters).
    // To update libstorytree, simply change the VERSION to the latest release
    implementation("com.github.utybo.StoryFX:libstorytree:73f9544a92")
    /*********************************************************************/
}

sourceSets {
    main {
        withConvention(KotlinSourceSet::class) {
            kotlin.srcDir("src")
        }
    }
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "1.8"