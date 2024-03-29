package com.rsaglobaltech.ecs.demo.service;

import com.rsaglobaltech.ecs.demo.dao.CategoryDao;
import com.rsaglobaltech.ecs.demo.entity.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategoryService {

    @Autowired
    @Qualifier("categories")
    private CategoryDao categoryDao;

    public Collection<Category> getAllCategories() {
        return categoryDao.getAllCategories();
    }

    public void insertCategory(String name) {
        categoryDao.addCategory(name);
    }

    public Category getCategoryById(int id) {
        return categoryDao.getCategoryById(id);
    }

    public void updateCategory(int id, String name) {
        categoryDao.updateCategoryName(id,name);
    }
}
