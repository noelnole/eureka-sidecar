# Eureka Server with Netflix Sidecar in a poliglote environment

The goal of this project is check the eureka server with a node application, so we have implemented an application with sidecar to listen the node (with koa framework) application, anyway, this is a very simple project and sidecar is not really neccesary but is perfect to use in a polyglot environment.

You have to do three steps to install the project:


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



## Install Sidecar

Sidecar is a netflix proyect able to register ports in the eureka server.
As in eurkea, you have two ways to install the sidecar project either docker or as spring boot application.


Steps with docker:
```
sudo docker build -t {username}/clientenodeeureka .
```
Building the image ....

```
sudo docker run -p 49162:5678 -d {username}/clientenodeeureka
```

Running our eureka server....


Steps with the application:

```
Run as application in your IDE listen in 5678 port
```
OR

```
java -jar target/eurekaserver.1.0-SNAPSHOT.jar
```
OR with maven

```
mvn spring-boot:run
```

## Install Hello World in koa

This is a hello world application with koa, it has two endpoints: 
* /hello
* /health --> This endpoit is use by sidecar project.

As in eureka and sidecar you can install : 

```
sudo docker build -t noel/ko2-hello-world .
```
Building the image ....
```
docker run -p 49160:4000 -d noel/koa2-hello-world
```
Running the image ....

But if you want download and run the project you can do: 


```
npm install
```
Download the libraries and dependencies

```
npm start
```
Run the application in port 4000

