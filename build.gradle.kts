plugins {
    id("java")
    id("application")
}
application {
    mainClass.set("SI2026Lab2Main")
}
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
//    testImplementation(platform("org.junit:junit-bom"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.test {
    useJUnitPlatform()
}

