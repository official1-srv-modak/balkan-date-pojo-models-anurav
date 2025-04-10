# Use an official OpenJDK 17 image as the base
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Maven-generated JAR file into the container
COPY target/balkan-date-pojo-models-*.jar app.jar

# Copy application.properties to the container.
COPY src/main/resources/application.properties ./application.properties

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]