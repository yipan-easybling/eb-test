# 第一阶段：编译打包
FROM docker.1ms.run/library/maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# 第二阶段：运行镜像
FROM docker.1ms.run/library/eclipse-temurin:17-jre
COPY --from=builder /build/target/*.jar /usr/local/mytest.jar
WORKDIR /usr/local
CMD ["java", "-jar", "mytest.jar"]