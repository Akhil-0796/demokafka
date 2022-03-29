package com.example.kafka.demokafka.controller;

import com.example.kafka.demokafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaapp")
public class Controller {
    @Autowired
    Producer producer;

    @PostMapping(value = "/post")
    public void sendMessage(@RequestParam("message") String message){
        producer.publishToTopic(message);
    }
}
