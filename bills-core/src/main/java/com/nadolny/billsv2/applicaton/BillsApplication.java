package com.nadolny.billsv2.applicaton;

import com.nadolny.billsv2.applicaton.dto.PayerDto;
import com.nadolny.billsv2.applicaton.service.BillsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
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
                 BigDecimal dec=new BigDecimal(3.66);
                PayerDto user = new PayerDto(name);
                billsService.addBills(user);
            });
            billsService.getBills().forEach(System.out::println);
        };
    }
}
