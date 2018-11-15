FROM centos
RUN echo "Installing Java"
# RUN apt-get -y update
# RUN apt-get -y upgrade
# RUN apt-get install apt-file
RUN yum install -y wget

RUN wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u191-b12/2787e4a523244c269598db4e85c51e0c/jdk-8u191-linux-x64.rpm"

RUN yum install -y jdk-8u191-linux-x64.rpm

RUN java -version

RUN mkdir /opt/bootapp

RUN ls -lR /opt

COPY simple-rest-1.0.0-SNAPSHOT.jar /opt/bootapp/

EXPOSE 8080

# RUN apt-get install python-software-properties
# RUN add-apt-repository ppa:webupd8team/java
# RUN apt-get update
# RUN apt-get install oracle-java8-installer
# RUN java -version
CMD [ "java", "-jar", "/opt/bootapp/simple-rest-1.0.0-SNAPSHOT.jar", "--spring.cloud.consul.host=consul"]
