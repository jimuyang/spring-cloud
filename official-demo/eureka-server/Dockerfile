ARG JAR_VERSION=1.0-SNAPSHOT
FROM openjdk:8-jre-alpine
ADD target/eureka-server-1.0-SNAPSHOT.jar app.jar
LABEL maintainer="Jimu Yang"
VOLUME /tmp
#VOLUME /target
#RUN bash -c 'touch /app.jar'
EXPOSE 9000
ENTRYPOINT ["java","-jar","/app.jar"]
