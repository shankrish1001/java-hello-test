FROM tomcat:9.0-jdk17

# Remove default web apps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy our app
COPY ./hello /usr/local/tomcat/webapps/hello
