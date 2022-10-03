plugins {
	id 'org.springframework.boot' version '2.7.4'
	id 'io.spring.dependency-management' version '1.0.14.RELEASE'
	id 'java'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17'

repositories {
	mavenCentral()
}

dependencies {
	implementation group: 'javax.persistence', name: 'javax.persistence-api', version: '2.2'
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa:'
	implementation 'org.springframework.boot:spring-boot-starter-web:'
	runtimeOnly 'mysql:mysql-connector-java'
	testImplementation 'org.springframework.boot:spring-boot-starter-test:'
}

