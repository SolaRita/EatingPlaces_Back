package com.eatingplaces.eatingplaces.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Place {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private City city;
    @ManyToMany
    private List<Category> category = new ArrayList<>();
    private String shortDescription;
    private String longDescription;
    private String district;
    private String price;
    private String doNotMiss;
    private String highlight;


    public void addCategory(Category category){
        this.category.add(category);
    }
}



