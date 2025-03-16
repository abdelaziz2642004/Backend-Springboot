FROM eclipse-temurin:17-jdk-alpine

# Create a writable directory instead of using VOLUME
RUN mkdir -p /app/tmp && chmod -R 777 /app/tmp

# Copy the JAR file into the container
COPY target/*.jar /app/app.jar

# Set the working directory
WORKDIR /app

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
