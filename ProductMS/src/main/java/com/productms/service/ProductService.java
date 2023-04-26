package com.productms.service;


import com.productms.entity.Product;
import com.productms.repository.ProductRepository;
import com.productms.util.MyFactoryService;

public class ProductService extends MyFactoryService<ProductRepository, Product, Long> {
    public ProductService(){
        super(new ProductRepository());
    }
}
