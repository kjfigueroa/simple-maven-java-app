# Simple Java Project based on Maven

This repository is intended to create a simple `hello-world` application using the Java-based **Spring Boot** framework.

Using the Spring guide https://start.spring.io/ to generate a new project:
- Languaje: `Java`
- Project: `Maven`
- Spring Boot: `4.0.2`
- Project Metadata:
  - Artifact: demo-1
  - Name: demo-1
  - Description: A simple demo project
  - Package name: `com.example.demo-1`
  - Packaging: `jar`
  - Configuration (Properties): `Java - 21`
 
I going to use a Docker Image in order to get the following features:

Element|Provider
---|---
OS|Alpine
JDK|eclipse-temurin
Build Tool|maven

For this, the [maven:3.9.12-eclipse-temurin-21-alpine](https://hub.docker.com/layers/library/maven/3.9.12-eclipse-temurin-21-alpine/images/sha256-c4fff1164b5ee8e2e626f70bc73a5bc8b4733ba5b341ba45a367f5a71274c9a4) will be helpful. 

This image bring to me a solid build chain with **Maven** `3.9.12` alongside **Eclipse-Temurin-21**, both running in a Linux Alpine `amd64`.

Then, this could be for:
1. Reproducible (get bit-for-bit identical artifacts) builds
2. A simple environment to deploy a modern Java (21) feature, using Maven (mvn)
3. With low operational overhead
4. Reliability

> Why `eclipse-temuring`, because its have a trusted JDK (widely used in enterprises). And why `Alpine`, because is intended to be just a build container.
