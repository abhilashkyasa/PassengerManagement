FROM eclipse-temurin:17-jre
LABEL maintainer="com.Springboot"
ADD target/*.jar SpringbootDocker.jar
ENTRYPOINT  ["java","-jar","SpringbootDocker.jar"]
