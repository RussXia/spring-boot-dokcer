FROM maven:3.6.0-jdk-8
MAINTAINER Russ Xia <xzy199400@foxmail.com>


COPY src /home/app/src
COPY pom.xml /home/app

RUN mvn -f /home/app/pom.xml clean package
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/home/app/target/ROOT.jar"]