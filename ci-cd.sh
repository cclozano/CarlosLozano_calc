mvn clean install

docker build -t cclozano/calculadora-api .

docker push cclozano/calculadora-api

docker-compose up
