FROM eclipse-temurin:17-jre
LABEL maintainer="com.Springboot"
ADD target/com.database-4.0.0.1-SNAPSHOT.jar SpringbootDocker.jar
ENTRYPOINT  ["java","-jar","SpringbootDocker.jar"]
