package Pack.Controller;

import Pack.Entity.User;
import Pack.Service.KafkaConsumer;
import Pack.Service.KafkaProducer;
import Pack.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class KafkaController {

  @Autowired
  private KafkaConsumer kafkaConsumer;

  @Autowired
  private KafkaProducer kafkaProducer;

  @GetMapping("/kafka/send/{message}")
  public void send(@PathVariable String message) {
    kafkaProducer.sendMessage(message);
  }
}
