FROM docker.1ms.run/library/maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package -DskipTests

FROM docker.1ms.run/library/eclipse-temurin:17.0.17_10-jre
COPY --from=build /app/target/mytest.jar /usr/local/
WORKDIR /usr/local
CMD java -jar mytest.jar
