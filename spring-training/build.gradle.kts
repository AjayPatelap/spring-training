val springBootVersion: String by project
val MySQLVersion: String by project


plugins {
	id ("io.spring.dependency-management") version "1.0.14.RELEASE"
	id("org.springframework.boot") version "2.7.4"
	id("java")
}

group = "com.example.springtraining"
version = "0.0.1-SNAPSHOT"


allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects{
	apply(plugin = "io.spring.dependency-management")
	apply(plugin = "org.springframework.boot")
	dependencyManagement{
		dependencies{
			dependency ("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
			dependency ("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
			dependency ("mysql:mysql-connector-java:$MySQLVersion")
			dependency ("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
		}
	}
}



