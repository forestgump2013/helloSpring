FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD hello-demo.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]