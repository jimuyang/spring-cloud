FROM openjdk:8-jre-alpine
ADD target/config-server-1.0-SNAPSHOT.jar app.jar
LABEL maintainer="Jimu Yang"
VOLUME /tmp
EXPOSE 9999
ENTRYPOINT ["java","-jar","/app.jar"]
