FROM tomcat:8.0.51-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/BanqueSI-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/app.war
CMD ["catalina.sh","run"]
