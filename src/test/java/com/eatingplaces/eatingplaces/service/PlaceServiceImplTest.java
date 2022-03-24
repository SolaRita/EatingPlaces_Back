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
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
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
        place.setId(1L);
        place.setName("Pepito");
        category = new Category( 1L, "Bonito");

       ArrayList<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category( 1L, "Bonito"));
        categoryList.add(new Category( 2L, "Barato"));



    }

    @Test
    void testWhenCallGetAllPlacesReturnAllPlacesList() {
        when(placeRepository.findAll()).thenReturn(Arrays.asList(place));
        assertNotNull(placeService.getAllPlaces());

    }

@Test
    void testWhenCallGetAllPlacesByCategoryServiceReturnPlacesByCategoryList() {
       when(placeRepository.findAllByCategory(category)).thenReturn(List.of(place));
       assertThat(placeService.getAllPlacesByCategory(category).size(),equalTo(1));

    }




}