package com.alt.kafkaservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {


    @KafkaListener(topics = "alteesTopic",groupId = "alteesGroup")
    public void consumeKafkaTopic(String msg){
        System.out.println(msg);

    }
}
