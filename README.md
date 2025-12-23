# Store Spring Boot Basic

A minimal Spring Boot starter project using Maven — preconfigured with the Maven Wrapper to make it easy to build and run locally.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Tech stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Run locally](#run-locally)
- [Build](#build)
- [Tests](#tests)
- [Project structure](#project-structure)
- [Configuration](#configuration)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [Author](#author)
- [License](#license)

## Overview

This repository contains a lightweight Spring Boot application set up using Apache Maven and the Maven Wrapper. It is intended as a simple starting point for building REST APIs, experimenting with Spring Boot features, or teaching core concepts.

## Features

- Spring Boot application starter
- Maven Wrapper included (no global Maven required)
- Ready to build into an executable JAR
- Placeholder for adding REST endpoints, persistence, and security

## Tech stack

- Java (JDK 17+ recommended)
- Spring Boot
- Maven
- Maven Wrapper

## Prerequisites

- Java JDK 17 or newer
- Git
- (Optional) Docker — if you plan to add containerization later

## Run locally

1. Clone the repository

   git clone https://github.com/Avinash2k4/Store-spring-boot-basic.git
   cd Store-spring-boot-basic

2. Run with Maven Wrapper

   Linux / macOS
   ./mvnw spring-boot:run

   Windows
   mvnw.cmd spring-boot:run

3. Open http://localhost:8080 (or the port configured in application.properties)

## Build

Build an executable JAR using the wrapper:

Linux / macOS
./mvnw clean package

Windows
mvnw.cmd clean package

Run the generated JAR:

java -jar target/*.jar

## Tests

Execute unit tests with:

./mvnw test

## Project structure

.  
├── .mvn/                      # Maven wrapper files
├── mvnw, mvnw.cmd             # Maven wrapper scripts
├── pom.xml                    # Maven configuration
├── src/main/java/             # Application source
├── src/main/resources/        # Application resources (application.properties)
└── target/                    # Build output (generated)

## Configuration

Edit src/main/resources/application.properties (or application.yml) to change server port, datasource settings and other properties.

## Roadmap

Planned enhancements:

- Add sample REST endpoints for a store (products, orders, customers)
- Integrate with a database (H2 / MySQL / PostgreSQL)
- Add Spring Security for authentication and authorization
- Containerize with Docker

## Contributing

Contributions are welcome. Please open an issue or submit a pull request describing your changes.

## Author

Avinash P — Aspiring Software Engineer

## License

This project is provided under the MIT License. See LICENSE for details.
