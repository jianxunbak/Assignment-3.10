package com.skillsunion.springbootdemo;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private final String id = UUID.randomUUID().toString();
    private String name;
    private String description;
    private double price;

}
