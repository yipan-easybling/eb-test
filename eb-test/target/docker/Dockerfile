FROM docker.1ms.run/library/eclipse-temurin:17.0.17_10-jre
WORKDIR /app
ARG JAR_FILE=mytest.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
