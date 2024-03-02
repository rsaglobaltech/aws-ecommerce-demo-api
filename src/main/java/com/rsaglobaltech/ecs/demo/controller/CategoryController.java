package com.rsaglobaltech.ecs.demo.controller;

import com.rsaglobaltech.ecs.demo.entity.Category;
import com.rsaglobaltech.ecs.demo.entity.Product;
import com.rsaglobaltech.ecs.demo.inputs.AddCategoryInput;
import com.rsaglobaltech.ecs.demo.inputs.UpdateCategoryInput;
import com.rsaglobaltech.ecs.demo.service.CategoryService;

import com.rsaglobaltech.ecs.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Category findById(@PathVariable(value = "id") int id) {
        return categoryService.getCategoryById(id);
    }

    @RequestMapping(path = "/{id}/products",method = RequestMethod.GET)
    public Collection<Product> getProductsByCategoryId(@PathVariable(value = "id") int id) {
        return productService.getProductsByCategoryId(id);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCategory(@PathVariable(value = "id") int id, @RequestBody UpdateCategoryInput input) {
        categoryService.updateCategory(id, input.getName());
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCategory(@RequestBody AddCategoryInput input) {
        categoryService.insertCategory(input.getName());
    }
}
