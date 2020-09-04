package com.nadolny.billsv2.applicaton.service;

import com.nadolny.billsv2.applicaton.dao.BillsDaoCrud;
import com.nadolny.billsv2.applicaton.dto.PayerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BillsServiceImpl implements BillsService {

    private final BillsDaoCrud billsDaoCrud;

    @Autowired
    public BillsServiceImpl(BillsDaoCrud billsDaoCrud) {
        this.billsDaoCrud = billsDaoCrud;
    }

    @Transactional
    @Override
    public void addBills(PayerDto payerDto) {
        billsDaoCrud.save(payerDto);
    }

    @Transactional
    @Override
    public List getBills() {
        return (List) billsDaoCrud.findAll();
    }
}
