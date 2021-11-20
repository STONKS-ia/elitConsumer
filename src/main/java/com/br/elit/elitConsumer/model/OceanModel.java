package com.br.elit.elitConsumer.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="Ocean")
public class OceanModel {
    private int idOcean;
    private String nameOcean;

    public OceanModel() {
    }

    public OceanModel(int idOcean, String nameOcean) {
        this.idOcean = idOcean;
        this.nameOcean = nameOcean;
    }

    @Id
    @Column(name = "ID_OCEAN")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OCEAN_SEQ")
    public int getIdOcean() {
        return idOcean;
    }

    public void setIdOcean(int idOcean) {
        this.idOcean = idOcean;
    }

    @Column(name = "NOME_OCEAN")
    @Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 40 caracteres")
    public String getNameOcean() {
        return nameOcean;
    }

    public void setNameOcean(String nameOcean) {
        this.nameOcean = nameOcean;
    }
}
