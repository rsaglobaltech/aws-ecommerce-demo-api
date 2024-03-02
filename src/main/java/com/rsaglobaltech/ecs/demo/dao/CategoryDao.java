package com.rsaglobaltech.ecs.demo.dao;

import com.rsaglobaltech.ecs.demo.entity.Category;

import java.util.Collection;

public interface CategoryDao {
    Collection<Category> getAllCategories();
    Category getCategoryById(int id);
    void addCategory(String name);
    void updateCategoryName(int id, String name);
}
