package com.turkcell.spring.starter.services.concretes;

import com.turkcell.spring.starter.entities.Product;
import com.turkcell.spring.starter.services.abstracts.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
//    iş akışını yönet

//        gerekli durumda DataAcces'e pasla
    public  void  add(Product product)
    {
        if(product.getUnitPrice()<0)
            throw new RuntimeException("Ütün fiyatı 0'dan küçük olamaz");

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
