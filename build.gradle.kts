
plugins {
    java
    id("org.springframework.boot") version "2.4.2"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    id("com.netflix.dgs.codegen") version "4.0.12"
}

group = "org.example"
version = "1.0-SNAPSHOT"
//java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter:3.0.10")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    compileOnly("org.projectlombok:lombok:1.18.8")
    annotationProcessor("org.projectlombok:lombok:1.18.8")
}


@OptIn(kotlin.ExperimentalStdlibApi::class)
tasks.withType<com.netflix.graphql.dgs.codegen.gradle.GenerateJavaTask> {
    generateClient = true
    packageName = "com.example.chatserver"
}


//tasks.withType<JavaCompile> {
//    java {
//        targetCompatibility = JavaVersion.VERSION_11
//        sourceCompatibility = JavaVersion.VERSION_11
//    }
//}

tasks.withType<Test> {
    useJUnitPlatform()
}


