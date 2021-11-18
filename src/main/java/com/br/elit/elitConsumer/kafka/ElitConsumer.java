package com.br.elit.elitConsumer.kafka;

import com.br.elit.elitConsumer.repository.OceanRepository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class ElitConsumer {

    @Autowired
    public OceanRepository repository;

    @KafkaListener(topics = "fiap.ocean", groupId = "fiap-group-id")
    public void consume(ConsumerRecord<String, String> record) {

        System.out.println(record.key());
        System.out.println(record.value());

    }
}
