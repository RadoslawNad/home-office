package com.nadolny.billsv2.applicaton.service;

import com.nadolny.billsv2.applicaton.dto.PayerDto;

import java.util.List;

public interface BillsService {
    void addBills(PayerDto payerDto);
    List getBills();
}
