FROM openjdk:8-alpine
#run with non-root
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
#assumes one jar is present in target directory
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
