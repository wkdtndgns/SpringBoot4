package Pack.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @KafkaListener(topics = "test", groupId = "testGroup")
  public void consume(String message) {
    System.out.println("Consumed message: " + message);
  }
}
