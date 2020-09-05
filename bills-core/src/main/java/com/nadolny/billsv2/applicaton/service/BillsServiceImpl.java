package com.nadolny.billsv2.applicaton.service;

import com.nadolny.billsv2.applicaton.dao.BillsDaoCrud;
import com.nadolny.billsv2.applicaton.dto.PayerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class BillsServiceImpl implements BillsService {

    private final BillsDaoCrud billsDaoCrud;

    @Autowired
    BillsServiceImpl(BillsDaoCrud billsDaoCrud) {
        this.billsDaoCrud = billsDaoCrud;
    }

    @Transactional
    @Override
    public void addBills(PayerDto payerDto) {
        billsDaoCrud.save(payerDto);
    }

    @Override
    public void deleteById(Long id) {
        billsDaoCrud.deleteById(id);
    }

    @Transactional
    @Override
    public String calculate() {
        return null;
    }
}
