package com.eatingplaces.eatingplaces.controller;
import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.List;


@RestController
@RequestMapping("/category")

@CrossOrigin
public class CategoryController {

    @Autowired()
    private CategoryService categoryService;

    @GetMapping("")
    public List<Category> getAllCategorys() {
        return categoryService.getAllCategorys();
    }
}
