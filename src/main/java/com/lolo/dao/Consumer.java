package com.lolo.dao;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Author: gordon  Email:gordon_ml@163.com
 * @Date: 3/22/2020
 * @Description:
 * @version: 1.0
 */
@Component
public class Consumer {

    @KafkaListener(topics = {"test-kafka"})
    public void listen(ConsumerRecord<?, ?> record) {

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("---->" + record);
            System.out.println("---->" + message);
        }
    }
}
