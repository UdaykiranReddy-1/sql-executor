FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/sql-executor.jar sql-executor.jar
ENTRYPOINT ["java", "-jar", "sql-executor.jar"]
