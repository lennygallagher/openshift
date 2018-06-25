FROM jboss/keycloak-adapter-wildfly:3.4.3.Final

MAINTAINER Leonhard Gallagher <leonhard.gallagher@adesso.ch>

# copy application source code into container
COPY . .

USER root
RUN yum install maven -y

USER jboss
RUN mvn clean package &\
  cp target/*.war /opt/jboss/wildfly/standalone/deployments/ &\
  rm -rf src &\
  rm -rf target
