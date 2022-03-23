package com.eatingplaces.eatingplaces.service;

import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.model.Place;
import com.eatingplaces.eatingplaces.repository.PlaceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PlaceServiceImplTest {

    @Mock
    private PlaceRepository placeRepository;

    @InjectMocks
    private PlaceServiceImpl placeService;

    private Place place;
    private Category category;



    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        place = new Place();
        place.setId(new Long(1));
        place.setName("Pepito");

/*        ArrayList<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category( 1, "Bonito"));
        categoryList.add(new Category( 2, "Barato"));*/


    }
    @Test
    void testWhenCallGetAllPlacesReturnAllPlacesList() {
        when(placeRepository.findAll()).thenReturn(Arrays.asList(place));
        assertNotNull(placeService.getAllPlaces());

    }

   /* @Test
    void testWhenCallGetAllPlacesByCategoryServiceReturnPlacesByCategoryList() {
        when(placeRepository.findAllByCategory()).thenReturn(categoryList);

    }*/


}