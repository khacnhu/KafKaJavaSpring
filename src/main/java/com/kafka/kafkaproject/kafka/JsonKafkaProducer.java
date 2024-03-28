package com.kafka.kafkaproject.kafka;


import com.kafka.kafkaproject.payload.User;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(User data){
        Message<User> message = MessageBuilder.withPayload(data).setHeader(
                KafkaHeaders.TOPIC,
                "javaguides_json"
        ).build();

        kafkaTemplate.send(message);

    }




}
