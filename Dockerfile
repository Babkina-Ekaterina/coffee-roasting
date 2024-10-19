FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY target/coffee-roasting-0.0.1-SNAPSHOT.jar coffee-roasting.jar
ENTRYPOINT ["java","-jar","/coffee-roasting.jar"]
