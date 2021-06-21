FROM openjdk:16-slim-buster
COPY target/*.jar /var/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/var/app.jar"]
