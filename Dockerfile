FROM openjdk:17

WORKDIR /app

COPY target/product-app.jar /app/product-app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","product-app.jar"]