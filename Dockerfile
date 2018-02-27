FROM frolvlad/alpine-oraclejdk8
WORKDIR /home/dev/code
COPY build/libs/spring-boot-microservice-1.0-SNAPSHOT.jar spring-boot-microservice-1.0.jar
COPY src/main/resources/application.properties .

EXPOSE 8080 8080

CMD ["java", "-jar","-Xms256m", "-Xmx768m","spring-boot-microservice-1.0.jar"]

