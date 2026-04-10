FROM eclipse-temurin:21-jdk-alpine
WORKDIR /aplicaciones/prueba
COPY /target/catalogos.jar catalogos.jar
ENTRYPOINT [ "java","-jar", "catalogos.jar" ]