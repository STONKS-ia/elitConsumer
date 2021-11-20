package com.br.elit.elitConsumer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "REPORTS_CONSUMER")
public class ReportModel {

    @Id
    @Column(name = "REPORT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REPORT_SEQUENCE")
    @SequenceGenerator(name = "REPORT_SEQUENCE", sequenceName = "REPORT_SEQ", allocationSize = 1)
    private String id;

    @Column(name = "NAME")
    @NotNull(message = "The creation date is mandatory")
    private String name;

    private OceanModel ocean;

    public ReportModel(String name, OceanModel ocean) {
        this.name = name;
        this.ocean = ocean;
    }

    public ReportModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String creationAt) {
        this.name = name;
    }

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "ID_OCEAN", nullable = false)
    public OceanModel getOcean() {
        return ocean;
    }

    public void setOcean(OceanModel ocean) {
        this.ocean = ocean;
    }
}
