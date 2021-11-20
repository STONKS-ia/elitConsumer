package com.br.elit.elitConsumer.kafka;

import com.br.elit.elitConsumer.model.OceanModel;
import com.br.elit.elitConsumer.model.ReportModel;
import com.br.elit.elitConsumer.repository.OceanRepository;
import com.br.elit.elitConsumer.repository.ReportRepository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class ElitConsumer {

    @Autowired
    public ReportRepository repository;

    @KafkaListener(topics = "fiap.ocean", groupId = "fiap-group-id")
    public void consume(ConsumerRecord<String, String> record) {

        System.out.println(record.key());
        System.out.println(record.value());

        OceanModel ocean = new OceanModel();
        ocean.setIdOcean(1);

        ReportModel reportModel = new ReportModel();
        reportModel.setId(record.key().toString());
        reportModel.setName(record.value().toString());
        reportModel.setOcean(ocean);

        repository.save(reportModel);
    }
}
