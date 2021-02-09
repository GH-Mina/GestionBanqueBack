FROM openjdk:latest
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/BanqueSI-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]
EXPOSE 8080
