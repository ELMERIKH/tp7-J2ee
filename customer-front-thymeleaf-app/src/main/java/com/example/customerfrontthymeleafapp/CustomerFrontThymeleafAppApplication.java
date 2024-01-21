package com.example.customerfrontthymeleafapp;

import com.example.customerfrontthymeleafapp.entities.Customer;
import com.example.customerfrontthymeleafapp.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Rana").email("rana@gmail.com").build());
            customerRepository.save(Customer.builder().name("Imane").email("imane@gmail.com").build());
            customerRepository.save(Customer.builder().name("asmaa").email("asmaa@gmail.com").build());
        };
    }

}
