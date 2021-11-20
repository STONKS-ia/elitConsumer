package com.br.elit.tests;

import com.br.elit.elitConsumer.ElitConsumerApplication;
import com.br.elit.elitConsumer.model.OceanModel;
import com.br.elit.elitConsumer.model.ReportModel;
import com.br.elit.elitConsumer.repository.OceanRepository;
import com.br.elit.elitConsumer.repository.ReportRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= ElitConsumerApplication.class)
public class ConsumerRepoTest {

    @Mock
    public OceanRepository oceanRepository;

    @Mock
    public ReportRepository reportRepository;
    @Test
    public void successTestSaveOcean() {

        // GIVEN
        oceanRepository.save(new OceanModel(1, "Teste_Ocean"));

        // THEN findById(Mockito.anyLong())).thenReturn(Optional.of(oceanModel)
        Assertions.assertEquals("Teste_Ocean", oceanRepository.findById(1L).get().getNameOcean());


    }


    @Test
    public void successTestReportModel() {

        OceanModel oceanModel = new OceanModel(2, "Teste2-Ocean");
        // GIVEN
        reportRepository.save(new ReportModel("teste", oceanModel));

        // THEN
        Assertions.assertEquals("teste", reportRepository.findById(1L).get().getName());


    }





}
