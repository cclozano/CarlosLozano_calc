FROM openjdk:11
COPY /target/calculadora-0.0.1-SNAPSHOT.jar /app/app.jar
CMD java -Dapp.home=/app/ -jar /app/app.jar