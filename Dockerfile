FROM eclipse-temurin:24.0.2_12-jdk-alpine-3.22  AS builder
LABEL authors="aperalta"


# Set the working directory
WORKDIR  /app

#Copy the application code

RUN ./mvnw clean install  -Dmaven.test.skip=true


FROM eclipse-temurin:24.0.2_12-jre-alpine-3.22

#Set the working directory
WORKDIR /app

# Copy The JAR FILE From the build stage
COPY --from=builder /app/target/*.jar app.jar

# EXPOSE  the port the app will  run on
EXPOSE 8080

ENTRYPOINT ["java", "-jar","app.jar"]