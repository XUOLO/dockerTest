#FROM maven:3.8.3-openjdk-17 as build
#COPY . .
#RUN mvn clean install
#
#FROM eclipse-temurin:17-jdk
#COPY --from=build /target/Rest-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]

# Stage 1: Build
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/Xuolo.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]



#FROM openjdk:17
#VOLUME /tmp
#ADD target/Rest-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]