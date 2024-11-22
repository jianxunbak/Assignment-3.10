package com.skillsunion.springbootdemo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/products")
public class ProductsController {

    public ArrayList<Product> products = new ArrayList<>();

    public ProductsController() {
        products.add(new Product("Wireless Bluetooth Earbuds!!!",
                "Compact and lightweight earbuds with noise cancellation, 6-hour battery life, and water-resistant design. Ideal for workouts and commutes.",
                59.99));
        products.add(new Product("Smart Fitness Watch!!!!",
                "Track your health and fitness with a sleek smartwatch featuring heart rate monitoring, sleep tracking, GPS, and a customizable display. Compatible with iOS and Android.",
                129.99));
        products.add(new Product("Adjustable Ergonomic Office Chair!!!!",
                "Comfortable office chair with adjustable height, lumbar support, breathable mesh back, and 360-degree swivel wheels for ultimate productivity.",
                249.99));
    }

    @GetMapping("")
    public ArrayList<Product> getMethodName() {
        return products;
    }

    @PostMapping("")
    public Product createOneProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }
}