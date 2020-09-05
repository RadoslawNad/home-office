package com.nadolny.billsv2.applicaton.dto;

import javax.persistence.*;

@Entity
@Table(name = "Bills_values")
public class BillsValuesDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;
    private String description;
    @ManyToOne
    @JoinColumn(name = "payer_id", nullable = false)
    private PayerDto payer;

    public BillsValuesDto() {
    }

    public BillsValuesDto(String value, String description, PayerDto payer) {
        this.value = value;
        this.description = description;
        this.payer = payer;
    }

    public BillsValuesDto(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PayerDto getPayer() {
        return payer;
    }

    public void setPayer(PayerDto payer) {
        this.payer = payer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BillsValuesDto{" +
                "value='" + value + '\'' +
                '}';
    }
}
