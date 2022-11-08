package com.eatingplaces.eatingplaces.repository;

import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PlaceRepository extends JpaRepository <Place, Long> {
    List<Place>findAllByCategory(Category category);

}
