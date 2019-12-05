FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY build/libs/azure-devops-demo-*-all.jar azure-devops-demo.jar
#EXPOSE 8087
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar azure-devops-demo.jar