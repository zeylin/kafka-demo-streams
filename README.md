### kafka-demo-streams

A demo application for reading and writing to Kafka with Spring Cloud Stream.

Adapted to Spring Boot 2.1.X from the [Spring Cloud Stream With Kafka](https://dzone.com/articles/spring-cloud-stream-with-kafka) sample project.

### Key Dependencies

- Spring Cloud Stream:

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-stream</artifactId>
</dependency>
```

- Apache Kafka binder:

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-stream-binder-kafka</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.kafka</groupId>
    <artifactId>spring-kafka</artifactId>
</dependency>
```

### Instructions

To try the project locally, first install and start Zookeeper and Kafka, and create a topic to bind the streams to. Then run the application, and go to http://localhost:8080/greetings?message=hello to send some messages to the topic.

Notes:

- Configurations for the Kafka binder are located in `application.yaml`.
- Instructions to install Kafka on Mac can be found [here](https://medium.com/@Ankitthakur/apache-kafka-installation-on-mac-using-homebrew-a367cdefd273).