FROM eclipse-temurin:17-jdk-alpine
LABEL maintainer="Luisa-API livros"
ADD target/LivrosApi-0.0.1-SNAPSHOT.jar app.jar
CMD [ "java", "-jar",  "/app.jar", "--spring.profiles.active=prod"]
EXPOSE 8080


# Permite que a configuração fique dinamica - Var de ambiente
# ENV SPRING_DATASOURCE_URL=jdbc:oracle:thin:@0.0.0.0:1521/XE
# ENV SPRING_DATASOURCE_USERNAME=system
# ENV SPRING_DATASOURCE_PASSWORD=oracle



