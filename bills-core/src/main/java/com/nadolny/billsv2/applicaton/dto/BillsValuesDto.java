package com.nadolny.billsv2.applicaton.dto;

import javax.persistence.*;

@Entity
@Table(name = "BILLS_VALUES")
public class BillsValuesDto {

    @Id
    private String id;
    private String value;

    @ManyToOne
    @JoinColumn(name="payer_id", nullable=false)
    private PayerDto payer;

    public BillsValuesDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
