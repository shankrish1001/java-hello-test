# Dockerfile
FROM tomcat:10.1-jdk17

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy our JSP webapp to ROOT
COPY ./webapps /usr/local/tomcat/webapps/
