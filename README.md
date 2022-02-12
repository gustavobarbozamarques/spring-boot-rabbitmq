# Spring Boot RabbitMQ

This project demonstrates a simple microservice that uses Spring Boot and RabbitMQ.

### Run project

``` docker-compose build ```

``` docker-compose up ``` 

And access: ``` http://localhost:8080/ ``` 

### Example

Access Swagger and make a request: ``` http://localhost:8080/swagger-ui.html ```

![Alt text](docs/swagger.png?raw=true "Swagger Request")

Access RabbitMQ console (http://localhost:15672/) and see 'email_queue' queue:

![Alt text](docs/rabbitmq_console.png?raw=true "RabbitMQ Console")

Check message received on java output console:

![Alt text](docs/listener.png?raw=true "Listener")