FROM eclipse-temurin:17
COPY target/luffy.jar zoro.jar
CMD ["java","-jar","zoro.jar"]