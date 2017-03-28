# Eureka Server

This simple project is a eureka server in a spring boot application


## Install Eureka

You have two ways to install eureka, both with the same result; you can run a eureka server either with our dockerfile or run the application
as a Spring Boot Application, you choose.

Steps with docker:
```
sudo docker build -t {username}/eurekaserver .
```
Building the image ....

```
sudo docker run -p 49161:8761 -d {username}/eurekaserver
```

Running our eureka server....


Steps with the application:

```
Run as application in your IDE listen in 8761 port
```
OR

```
java -jar target/eurekaserver.1.0-SNAPSHOT.jar
```
OR with maven

```
mvn spring-boot:run
```

