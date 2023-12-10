FROM openjdk:18-jdk-alpine
COPY target/docker-test-service-0.0.1-SNAPSHOT.jar docker-test-service.jar
ENTRYPOINT ["java","-jar","/docker-test-service.jar"]