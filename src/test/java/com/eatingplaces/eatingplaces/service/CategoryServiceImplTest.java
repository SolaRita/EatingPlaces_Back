package com.eatingplaces.eatingplaces.service;
import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.repository.CategoryRepository;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class CategoryServiceImplTest {
    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryServiceImpl categoryService;

 private Category category;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        category = new Category(1L,"Asian" );
        ArrayList<Category> categoryList = new ArrayList<>();
        categoryList.add(category);
    }
  @Test
    void getAllCategories() {
        when(categoryRepository.findAll()).thenReturn(Arrays.asList(category));
        assertNotNull(categoryService.getAllCategories());}



/*   @Test
    void getCategoryById() {
        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));

       assertThat(category), equalTo("Asian");
    }*/
}