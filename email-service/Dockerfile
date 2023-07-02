FROM openjdk:17-jdk-alpine
EXPOSE 8081
WORKDIR /app
COPY target/email-service-0.0.1.jar /app
CMD ["java", "-jar", "/app/email-service-0.0.1.jar"]