// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:{{cookiecutter.kotlin_version}}")

        classpath("com.vanniktech:gradle-maven-publish-plugin:0.14.2")
        // For Kotlin projects, you need to add Dokka.
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:0.10.1")
    }
}

subprojects {
    repositories {
        maven("https://mirrors.tencent.com/nexus/repository/maven-public/")
    }
}

tasks.register<Delete>(name = "clean") {
    group = "build"
    delete(rootProject.buildDir)
}
