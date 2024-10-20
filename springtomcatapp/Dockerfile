FROM gcr.io/distroless/java21-debian12

ARG artifact=target/springtomcatapp-1.0.jar

WORKDIR /opt/app

COPY ${artifact} app.jar

ENTRYPOINT ["java","-jar","app.jar"]
