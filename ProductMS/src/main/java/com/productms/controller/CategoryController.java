package com.productms.controller;

import com.productms.app.BAUtils;
import com.productms.entity.Category;
import com.productms.service.CategoryService;

public class CategoryController {

    private CategoryService categoryService;
    public CategoryController(){
        this.categoryService = new CategoryService();
    }

    public void save(){
        String categoryName = BAUtils.readString("Category Name: ");
        Category category = new Category();
        category.setName(categoryName);
        categoryService.save(category);
    }
}
