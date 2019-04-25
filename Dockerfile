FROM openjdk:8u131-jdk-alpine

MAINTAINER Angel GA "angel.g.alamilla@gmail.com"

EXPOSE 8080

ADD ./target/spring-boot-backend-api-rest-0.0.1-SNAPSHOT.jar webapp.jar

ENTRYPOINT ["java","-jar","webapp.jar"]
