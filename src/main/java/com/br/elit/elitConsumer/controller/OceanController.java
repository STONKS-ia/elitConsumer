package com.br.elit.elitConsumer.controller;

import java.util.List;

import com.br.elit.elitConsumer.model.OceanModel;
import com.br.elit.elitConsumer.repository.OceanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ocean")
public class OceanController {
    @Autowired
    public OceanRepository oceanRepository;

    @GetMapping
    public ResponseEntity<List<OceanModel>> getAll(){
        List<OceanModel> ocean = oceanRepository.findAll();
        return ResponseEntity.ok(ocean);
    }
}
