package com.example.customerfrontthymeleafapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private double prix;
    private int quantity;
}
