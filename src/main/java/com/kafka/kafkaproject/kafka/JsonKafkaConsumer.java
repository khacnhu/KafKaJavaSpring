package com.kafka.kafkaproject.kafka;

import com.kafka.kafkaproject.payload.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consume(User user) {
        System.out.println("Json kafka lister user " + user);
    }


}
