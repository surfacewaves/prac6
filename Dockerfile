FROM openjdk:17-oracle
COPY target/prac6-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
#RUN microdnf update && microdnf install -y maven
#WORKDIR app
#COPY pom.xml /app/
#COPY src/ /app/src/
#RUN mvn install