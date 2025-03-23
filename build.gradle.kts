plugins {
    java
    application
}

allprojects {
    group = "com.example"
    version = "1.0.0"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    }

    tasks.test {
        useJUnitPlatform()
    }
}

