package com.turkcell.spring.starter.repositories.concretes;

import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.repositories.abstracts.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class SqlProductRepositoryImpl implements ProductRepository{
    private List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return productList;
    }
}
