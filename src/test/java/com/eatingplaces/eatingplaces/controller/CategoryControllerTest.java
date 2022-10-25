package com.eatingplaces.eatingplaces.controller;

import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.repository.CategoryRepository;
import com.eatingplaces.eatingplaces.service.CategoryService;
import com.eatingplaces.eatingplaces.service.CategoryServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CategoryControllerTest {

    @Test
    void getAllCategories() {
        //given
        Category category = new Category();
        List<Category> expected = List.of(category);
        CategoryRepository categoryRepository = Mockito.mock(CategoryRepository.class);
        Mockito.when(categoryRepository.findAll()).thenReturn(expected);
        CategoryService categoryService = new CategoryServiceImpl(categoryRepository);
        CategoryController categoryController = new CategoryController(categoryService);
        //when
        List<Category> result = categoryController.getAllCategories();
        //then
        Assertions.assertTrue(expected.size() == result.size() && expected.containsAll(result) && result.containsAll(expected));
    }


    @Test
    void getCategoryById() {
    }

    @Test
    void getAllPlacesByCategory() {
    }
}