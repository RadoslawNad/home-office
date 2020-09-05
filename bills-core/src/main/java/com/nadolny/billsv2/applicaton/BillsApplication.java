package com.nadolny.billsv2.applicaton;

import com.nadolny.billsv2.applicaton.dto.BillsValuesDto;
import com.nadolny.billsv2.applicaton.dto.PayerDto;
import com.nadolny.billsv2.applicaton.service.BillsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class BillsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BillsApplication.class, args);
    }

    @Bean
    CommandLineRunner init(BillsService billsService) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                PayerDto user = new PayerDto(name);
                BillsValuesDto dec = new BillsValuesDto("3.66", "opis", user);
                user.setBills(Arrays.asList(dec));
                System.out.println(user);
                billsService.addBills(user);
            });
            System.out.println(billsService.calculate());
            billsService.deleteById(3L);
            billsService.deleteById(5L);
        };
    }
}
