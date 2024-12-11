FROM openjdk:17
WORKDIR /app
COPY build/libs/soap_project.jar .
EXPOSE 8080
CMD ["java", "-jar", "soap_project.jar"]
