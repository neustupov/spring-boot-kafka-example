package ru.neustupov.springbootkafkaexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.neustupov.springbootkafkaexample.model.User;

@RestController
@RequestMapping("kafka")
public class UserResource {

  private KafkaTemplate<String, User> kafkaTemplate;

  @Autowired
  public UserResource(KafkaTemplate<String, User> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  private static final String TOPIC = "Kafka_Example";

  @GetMapping("/publish/{name}")
  public String post(@PathVariable("name") final String name){

    kafkaTemplate.send(TOPIC, new User(name, "Systematic", 12000L));

    return "Published successfully";
  }
}
