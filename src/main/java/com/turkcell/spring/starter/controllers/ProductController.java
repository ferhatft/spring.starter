package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

//    Endpoint yönet

    private List<Product> productList = new ArrayList<>();
    @PostMapping
    public String add(@RequestBody Product product)
    {
        return "ekleme işlemi gerçekleşti";
    }

    @GetMapping
    public List<Product> get(){
        return productList;

    }
}
