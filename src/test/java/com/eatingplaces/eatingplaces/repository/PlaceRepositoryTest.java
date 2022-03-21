package com.eatingplaces.eatingplaces.repository;

import com.eatingplaces.eatingplaces.model.Place;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;



@DataJpaTest
class PlaceRepositoryTest {
    @Autowired
    TestEntityManager entityManager;
    @Autowired
    PlaceRepository placeRepository;

    @Test
    void findAllPlacesRetrunsAllPlacesList(){
        var place = new Place();
        entityManager.persist(place);
        entityManager.flush();

        assertEquals(10, placeRepository.findAll().size());
        assertEquals(place, placeRepository.findAll().get(0));
    }




 /*   @Test
    void findAllByCategoryReturnsAllPlacesByCategory() {
        var place = new Place();
        entityManager.persist(place);
        entityManager.flush();

        assertEquals(5, placeRepository.findAllByCategory().size());
        assertEquals(place, placeRepository.findAllByCategory().get(0));
    }*/
}