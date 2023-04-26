package com.productms.controller;

import com.productms.app.BAUtils;
import com.productms.entity.Category;
import com.productms.entity.Product;
import com.productms.service.CategoryService;
import com.productms.service.ProductService;

import java.util.Optional;

public class ProductController {

    private ProductService productService;
    private CategoryService categoryService;
    public ProductController(){
        this.productService = new ProductService();
        this.categoryService = new CategoryService();
    }

    public void save(){
        String productName = BAUtils.readString("Product Name: ");
        double price = BAUtils.readDouble("Product Price: ");
        int stock = BAUtils.readInt("Product Stock: ");

        long categoryId = BAUtils.readInt("CategoryId: ");
        Optional<Category> optionalCategory = categoryService.findById(categoryId);
        if(optionalCategory.isPresent()){
            Product product = new Product();
            product.setName(productName);
            product.setPrice(price);
            product.setStock(stock);
            product.setCategory(optionalCategory.get());
            productService.save(product);
        }else{
            System.out.println("Böyle bir kategori bulunmamaktadır.");
        }
    }
}
