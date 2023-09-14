FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/pet-clinic-demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /application.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/application.jar"]