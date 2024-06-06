plugins {
    kotlin("jvm") version "1.9.23"
    id ("com.diffplug.spotless") version ("6.11.0")
    id ("com.github.johnrengelman.shadow") version ("7.1.1")
}

group = "dev.carlos.kotlin.games.rpg"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "papermc-repo"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
    maven {
        name = "sonatype"
        url = uri("https://oss.sonatype.org/content/groups/public/")
    }
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.28")
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    annotationProcessor("org.projectlombok:lombok:1.18.26")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}


kotlin {
    jvmToolchain(17)
}