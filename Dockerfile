FROM maven:3.8.7-eclipse-temurin-19-alpine
LABEL maintainer="Luisa-API livros"
WORKDIR /app
# Será copiado para o container
COPY . .
# Permite que a configuração fique dinamica - Var de ambiente
ENV DATASOURCE_URL=jdbc:oracle:thin:@0.0.0.0:1521/XE
ENV DATASOURCE_USERNAME=system
ENV DATASOURCE_PASSWORD=oracle
EXPOSE 8080
CMD [ "java", "-jar",  "target/application.jar", "--spring.profiles.active=prod"]




