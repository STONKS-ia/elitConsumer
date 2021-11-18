package com.br.elit.elitConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.elit.elitConsumer.model.OceanModel;

@Repository
public interface OceanRepository extends JpaRepository<OceanModel, Long> {

}
