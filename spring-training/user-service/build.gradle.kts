plugins {
    id("java")
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly ("mysql:mysql-connector-java")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
}

