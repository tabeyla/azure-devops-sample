FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
COPY build/libs/app.jar app.jar
EXPOSE 80
CMD java -jar app.jar