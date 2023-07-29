FROM maven:3.6.0-jdk-11-slim AS build
COPY . ./
RUN mvn clean
RUN mvn package
FROM adoptopenjdk/adoptopenjdk/openjdk11:jdk-11.0.9.1_1
COPY --from=build /target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
