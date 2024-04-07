FROM arm64v8/openjdk:17-ea-16-jdk

WORKDIR /app

COPY ./target/springboot-drone-test-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java","-jar","app.jar"]