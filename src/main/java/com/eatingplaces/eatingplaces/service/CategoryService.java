package com.eatingplaces.eatingplaces.service;
import com.eatingplaces.eatingplaces.model.Category;
import java.util.List;


public interface CategoryService {
    public Category saveCategory (Category category);
    public List<Category> getAllCategories();
/*    public List<Category> getAllCategoriesBarcelona();*/
    public Category getCategoryById (Long id);
}
