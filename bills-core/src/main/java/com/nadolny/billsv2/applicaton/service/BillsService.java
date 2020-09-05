package com.nadolny.billsv2.applicaton.service;

import com.nadolny.billsv2.applicaton.dto.PayerDto;

public interface BillsService {
    void addBills(PayerDto payerDto);
    void deleteById(Long id);
    String  calculate();
}
