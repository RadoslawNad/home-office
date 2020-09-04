package com.nadolny.billsv2.applicaton.dao;

import com.nadolny.billsv2.applicaton.dto.PayerDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsDaoCrud extends CrudRepository<PayerDto, Long> {}
