package com.eatingplaces.eatingplaces.service;
import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category saveCategory (Category category) {return categoryRepository.save(category);}

    @Override
    public List<Category> getAllCategories(){return categoryRepository.findAll();}

    @Override
    public Category getCategoryById (Long id) {return categoryRepository.findById(id).get();}
}

