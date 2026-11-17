package com.example;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<String> getAllProducts() {
        return List.of("Laptop", "Smartphone", "Headphones");
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable Long id) {
        return "Product details for ID: " + id;
    }
}
