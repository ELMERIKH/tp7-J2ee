package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Phone").quantity(11).prix(4300).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Computer").quantity(18).prix(12000).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Printer").quantity(2).prix(800).build());
        };
    }
}
