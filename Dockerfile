FROM microportal/openjdk-kong:11-jre-slim

ENV APP_JAR=portal-app1-service.jar

ADD target/${APP_JAR} /opt/

WORKDIR /opt
