FROM maven:3.6.0-jdk-8
MAINTAINER Russ Xia <xzy199400@foxmail.com>

ADD ./target/ROOT.jar demo.jar
ENTRYPOINT ["java", "-jar", "demo.jar"]