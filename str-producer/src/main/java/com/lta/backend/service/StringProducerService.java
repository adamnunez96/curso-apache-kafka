package com.lta.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StringProducerService {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send("str-topic", message).whenComplete((result, ex) -> {
            if (ex != null) {
                log.error("Failed to send message: {}", ex.getMessage());
            } 
            log.info("Message sent succefully: {}", result.getProducerRecord().value());
            log.info("Partition: {}, Offset: {}", result.getRecordMetadata().partition(), result.getRecordMetadata().offset());
        });
    }

}
