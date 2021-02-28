plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter:3.0.10")
    compileOnly("org.projectlombok:lombok:1.18.8")
    annotationProcessor("org.projectlombok:lombok:1.18.8")
}

tasks.withType<Test> {
    useJUnitPlatform()
}



