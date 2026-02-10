# Usar uma imagem base com JDK 21
FROM openjdk:21-jdk

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o arquivo JAR da sua aplicação para o container
COPY target/sboot-atomico-mcp-serve-0.0.1-SNAPSHOT.jar app.jar

# Especificar o comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
