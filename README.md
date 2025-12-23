🚀 Spring Boot Maven Application
📌 Overview

This repository contains a Spring Boot application built using Apache Maven.
The project follows standard Maven conventions and includes the Maven Wrapper, ensuring easy setup without requiring Maven to be installed globally.

🛠️ Tech Stack

Java

Spring Boot

Apache Maven

Maven Wrapper

Git

📂 Project Structure
.
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.jar
├── mvnw
├── mvnw.cmd
├── pom.xml
├── .gitignore
├── .gitattributes
├── HELP.md
└── target/ (generated after build)

Important Files

pom.xml – Manages dependencies, plugins, and build configuration

mvnw / mvnw.cmd – Maven Wrapper scripts (Linux/macOS & Windows)

.gitignore – Prevents unnecessary files from being committed

HELP.md – Reference documentation for Maven and Spring Boot

⚙️ Prerequisites

Java JDK 17+

Git

✅ Maven installation is not required (Maven Wrapper is included)

▶️ How to Run the Project
Clone the Repository
git clone <repository-url>
cd <project-folder>

Build the Project

Windows

mvnw.cmd clean install


Linux / macOS

./mvnw clean install

Run the Application
./mvnw spring-boot:run


or

java -jar target/*.jar

🧪 Run Tests
./mvnw test

📦 Build Output

After a successful build:

Compiled files → target/classes

Executable JAR → target/

🧾 Maven Parent Overrides

The project disables inherited metadata like:

<license>

<developers>

This avoids unwanted parent POM inheritance.
You can remove these overrides if inheritance is needed.

📚 Useful References

Apache Maven Documentation

Spring Boot Maven Plugin Guide

Spring Boot OCI Image Creation

(Links available in HELP.md)

🚧 Future Enhancements

REST API development

Database integration (MySQL / PostgreSQL)

Spring Security

Docker support

Cloud deployment

👤 Author

Avinash P
Aspiring Software Engineer | Interested in Cloud & Backend Development
