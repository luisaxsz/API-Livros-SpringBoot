FROM maven:3.8.7-eclipse-temurin-19-alpine
LABEL maintainer="Luisa-API livros"
WORKDIR /app
# Será copiado para o container
COPY . .
# Permite que a configuração fique dinamica - Var de ambiente
ENV DATASOURCE_URL=jdbc:oracle:thin:@localhost:1521:XE
ENV DATASOURCE_USERNAME=livros
ENV DATASOURCE_PASSWORD=livros
EXPOSE 8080
CMD [ "java", "-jar",  "target/application.jar", "--spring.profiles.active=prod"]




