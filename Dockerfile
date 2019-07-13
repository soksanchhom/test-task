FROM openjdk:8-jdk-alpine
WORKDIR /usr/app
COPY . .
RUN ./gradlew build
ENTRYPOINT ["java","-jar","build/libs/app-0.0.1.jar"]
