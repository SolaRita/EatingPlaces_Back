package com.eatingplaces.eatingplaces.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Category {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

  public Category(Long id, String name) {
  }


}

