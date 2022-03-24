package com.eatingplaces.eatingplaces.repository;
import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.model.City;
import com.eatingplaces.eatingplaces.model.Place;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



@DataJpaTest
class PlaceRepositoryTest {
    @Autowired
    TestEntityManager entityManager;
    @Autowired
    PlaceRepository placeRepository;




    @Test
    void findAllPlacesReturnsAllPlacesList(){

        var place = new Place();
        entityManager.persist(place);
        entityManager.flush();

        assertEquals(1, placeRepository.findAll().size());
        assertEquals(place, placeRepository.findAll().get(0));
    }




 @Test
    void findAllByCategoryReturnsAllPlacesByCategory() {
        var category = new Category();
        var place = new Place();
        place.addCategory(category);
        entityManager.persist(place);
        entityManager.persist(category);
        entityManager.flush();

        assertEquals(1, placeRepository.findAllByCategory(category).size());
       assertEquals(place, placeRepository.findAllByCategory(category).get(0));
    }

}