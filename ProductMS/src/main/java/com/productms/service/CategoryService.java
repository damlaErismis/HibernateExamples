package com.productms.service;

import com.productms.entity.Category;
import com.productms.repository.CategoryRepository;
import com.productms.util.MyFactoryService;

public class CategoryService extends MyFactoryService<CategoryRepository, Category, Long> {

    public CategoryService(){
        super(new CategoryRepository());

    }
}
