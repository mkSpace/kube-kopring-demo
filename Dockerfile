FROM openjdk:13-alpine
ARG JAR_FILE=build/libs/kube-kopring-demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]