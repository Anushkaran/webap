FROM eclipse-temurin:17
COPY target/webap.jar webap.jar
CMD ["java","-jar","webap.jar"]