FROM openjdk:11
EXPOSE 8080
ADD target/jpa-0.0.1-SNAPSHOT.jar docker-demo.jar
ENTRYPOINT ["java","-jar","docker-demo.jar"]