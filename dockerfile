FROM java:8

EXPOSE 8081

ADD target/course-api-data-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]