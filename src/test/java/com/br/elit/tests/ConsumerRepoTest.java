package com.br.elit.tests;

import com.br.elit.elitConsumer.ElitConsumerApplication;
import com.br.elit.elitConsumer.model.OceanModel;
import com.br.elit.elitConsumer.repository.OceanRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Optional;

@DataJpaTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes= ElitConsumerApplication.class)
public class ConsumerRepoTest {

    @Mock
    public OceanRepository oceanRepository;

    @Test
    public void successTestSaveOcean() {

        // GIVEN
        oceanRepository.save(new OceanModel(1, "Teste_Ocean"));

        // THEN findById(Mockito.anyLong())).thenReturn(Optional.of(oceanModel)
        Assertions.assertEquals("Teste_Ocean", oceanRepository.findById(1L).get().getNameOcean());
    }





}
