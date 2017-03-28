# Client Node Eureka

This project is based in sidecar netflix project, with this project we will be able to connect any project in any languaje
to an eureka server.

## How can I Install this project?

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

## How does it work?

Is easy, you just configure a application.yml file. In this file you configure the sidecar port,
the url home of your application and the url health. And don'f forget the application name of the
application you want listen.

