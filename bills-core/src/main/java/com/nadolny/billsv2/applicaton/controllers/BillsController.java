package com.nadolny.billsv2.applicaton.controllers;

import com.nadolny.billsv2.applicaton.dto.PayerDto;
import com.nadolny.billsv2.applicaton.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
class BillsController {

    private final BillsService billsService;

    @Autowired
    BillsController(BillsService billsService) {
        this.billsService = billsService;
    }

    @PostMapping("/addBills")
    @ResponseStatus(HttpStatus.CREATED)
    void addBills(@RequestBody PayerDto payerDto){
        billsService.addBills(payerDto);
    }

    @GetMapping("/calculate")
    String calculate(){
         return billsService.calculate();
    }
}
