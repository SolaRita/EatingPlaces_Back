package com.eatingplaces.eatingplaces.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Place {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    @Column (nullable = false)
    private String name;
    @ManyToOne
    private City city;
    @ManyToMany
    private List<Category> category;
    private String shortDescription;
    private String longDescription;
    private String district;
    private String price;
    private String doNotMiss;
    private String highlight;

    }



