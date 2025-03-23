plugins {
    application
}

dependencies {
    implementation(project(":api"))
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.3")
}

application {
    mainClass.set("com.example.app.App")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = application.mainClass.get()
    }
}

