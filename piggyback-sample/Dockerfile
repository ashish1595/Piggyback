FROM tomcat:8.5-alpine
VOLUME /tmp
ARG DEPENDENCY=target
COPY ${DEPENDENCY}/demoApplication-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
ENTRYPOINT [ "sh", "-c", "java -jar /usr/local/tomcat/webapps/demoApplication-0.0.1-SNAPSHOT.war" ]