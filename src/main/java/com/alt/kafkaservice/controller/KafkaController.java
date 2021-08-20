package com.alt.kafkaservice.controller;

import com.alt.kafkaservice.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/send")
    public String sendMessageToKafkaTopic(@RequestParam("message") String message) {
        kafkaService.send(message);
        return " message sent";
    }
}
