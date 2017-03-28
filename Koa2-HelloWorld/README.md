# Hello Worl with Koa 2

This is a simple project with two endpoints:
* /health
* /hello

## How can I run the application?

You can run either with the code of the application or
with a dockerfile:

With the code:

```
npm install
```
```
npm start
```

with docker:

```
docker build -t {username}/ko2-hello-world .
```
```
sudo docker run -p 49160:4000 -d {username}}/koa2-hello-world
```

