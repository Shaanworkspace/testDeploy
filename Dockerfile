# Build
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Spring Cloud Function settings
ENV SPRING_CLOUD_FUNCTION_DEFINITION=tasks
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=8080"]