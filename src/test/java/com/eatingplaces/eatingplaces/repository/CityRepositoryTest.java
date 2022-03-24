package com.eatingplaces.eatingplaces.repository;

import com.eatingplaces.eatingplaces.model.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CityRepositoryTest {
    @Autowired
    TestEntityManager entityManager;
    @Autowired
    CityRepository cityRepository;

    @Test
    void findAllCitiesReturnAllCitiesList(){
        var city = new City();
        entityManager.persist(city);
        entityManager.flush();
        assertEquals(1, cityRepository.findAll().size());
    }

}