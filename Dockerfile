FROM  maven:latest as maven
LABEL MAINTAINER="paps.com"
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn package

FROM eclipse-temurin:latest  
ARG JAR_FILE=paps.jar
WORKDIR /opt/app
COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/

ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","paps.jar"]
EXPOSE 8080


