package com.alt.kafkaservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> template;

    private String kafkaTopic="alteesTopic";

    public void send(String msg){
        template.send(kafkaTopic,msg);

    }
}
