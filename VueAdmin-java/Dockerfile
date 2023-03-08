FROM openjdk:8

EXPOSE 8081

ADD VueAdmin-java-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java", "-jar", "/app.jar", "--spring.profiles.active=link"]