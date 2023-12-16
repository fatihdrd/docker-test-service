FROM openjdk:18-jdk-alpine
EXPOSE 8081
ADD target/docker-test-service.jar docker-test-service.jar
ENTRYPOINT ["java","-jar","/docker-test-service.jar"]