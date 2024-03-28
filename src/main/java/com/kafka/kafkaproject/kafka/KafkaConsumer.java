package com.kafka.kafkaproject.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consume(String message) {
        System.out.println("listen MESSAGE LÀ: " + String.format("Message listen -> %s", message));
    }


}
