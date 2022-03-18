package com.eatingplaces.eatingplaces.controller;
import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/category")

@CrossOrigin
public class CategoryController {

    @Autowired()
    private CategoryService categoryService;

    @GetMapping("")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

   /* @GetMapping("/barcelona")
    public List<Category> getAllCategoriesBarcelona() {
        return categoryService.getAllCategoriesBarcelona();
    }*/
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }

}
