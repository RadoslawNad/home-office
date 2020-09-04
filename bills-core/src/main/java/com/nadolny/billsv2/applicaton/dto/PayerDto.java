package com.nadolny.billsv2.applicaton.dto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PAYER")
public class PayerDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy="payer", fetch = FetchType.EAGER)
    private List<BillsValuesDto> bills;

    public PayerDto() {
    }

    public PayerDto(String name) {
        this.name = name;
    }

    public PayerDto(String name, List<BillsValuesDto> bills) {
        this.name = name;
        this.bills = bills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BillsValuesDto> getBills() {
        return bills;
    }

    public void setBills(List<BillsValuesDto> bills) {
        this.bills = bills;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bills=" + bills +
                '}';
    }
}
