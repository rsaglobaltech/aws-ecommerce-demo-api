# Use a base image optimized for ARM64 architecture
FROM adoptopenjdk:11-jdk-hotspot-bionic
WORKDIR /app
COPY pom.xml .
COPY src src
# Install Maven
RUN apt-get update && apt-get install -y maven
RUN mvn package -DskipTests
# Expose the port your Spring Boot application runs on (typically 8080)
EXPOSE 8080
RUN ls * -r
CMD ["java", "-jar", "target/app-0.0.1-RC.jar"]
