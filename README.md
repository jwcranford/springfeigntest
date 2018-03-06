# springfeigntest

A test project to experiment with spring boot support for Netflix Feign, following documentation at https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html.

## Build

```
$ mvn package
```

## Run

In a separate window, launch the server-side of the experiment.

```
$ git clone https://github.com/spring-guides/gs-rest-service.git
$ cd gs-rest-service/complete
$ gradle bootRun
```

Now go back to the springfeigntest directory and execute:

```
$ java -jar target/springfeigntest-1.0-SNAPSHOT.jar
```
