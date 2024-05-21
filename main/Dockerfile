FROM openjdk:17
MAINTAINER abhishek
WORKDIR ./
COPY ./target/main-0.0.1-SNAPSHOT.jar ./server.jar
EXPOSE 9092
ENTRYPOINT ["java","-jar","server.jar"]