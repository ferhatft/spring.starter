package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.services.abstracts.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//    Endpoint yönet
@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public String add(@RequestBody Product product)
    {

        productService.add(product);
        return "ekleme işlemi gerçekleşti";

    }

    @GetMapping
    public List<Product> get(){
        return productService.getAll();

    }
}


