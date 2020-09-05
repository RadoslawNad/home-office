package com.nadolny.billsv2.applicaton.dto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Payers")
public class PayerDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "payer", cascade = CascadeType.ALL)
    private List<BillsValuesDto> bills;

    public PayerDto() {
    }

    public PayerDto(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
