# ... (Build stage same rahegi) ...

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# JVM Flags startup fast karne ke liye
ENV JAVA_OPTS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1"

# Oracle Functions dynamic port deta hai environment variable 'FN_LISTENER' me
# Hum Spring Boot ko usi port par bind karenge
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Dserver.port=${FN_LISTENER:-8080} -jar app.jar"]