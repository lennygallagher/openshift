FROM jboss/keycloak-adapter-wildfly:3.4.3.Final

MAINTAINER Robert Brem <robert.brem@adesso.ch>

# copy application source code into container
COPY . .
RUN yum install maven -y
RUN mvn clean install

RUN cp target/*.war /opt/jboss/wildfly/standalone/deployments/