package com.eatingplaces.eatingplaces.controller;

import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.model.Place;
import com.eatingplaces.eatingplaces.service.CategoryService;
import com.eatingplaces.eatingplaces.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/categories")

@CrossOrigin
public class CategoryController {

    @Autowired()
    private CategoryService categoryService;
    @Autowired()
    private PlaceService placeService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @GetMapping("/{category}/places")
    public List<Place> getAllPlacesByCategory(@PathVariable Category category) {
        return placeService.getAllPlacesByCategory(category);
    }
}
