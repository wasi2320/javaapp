FROM openjdk:11
COPY target/demo-0.0.1-SNAPSHOT.jar SpringBootFormExample-1.0.war
ENTRYPOINT ["java", "-jar", "/SpringBootFormExample-1.0.war"]
