package com.eatingplaces.eatingplaces.controller;

import com.eatingplaces.eatingplaces.model.City;
import com.eatingplaces.eatingplaces.model.Place;
import com.eatingplaces.eatingplaces.repository.PlaceRepository;
import com.eatingplaces.eatingplaces.service.PlaceService;
import com.eatingplaces.eatingplaces.service.PlaceServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlaceControllerTest {

    @Test
    void add() {
    }

    @Test
    void getAllPlaces() {
        //given - arrange
        Place place = new Place(1L,"Moli", new City(),new ArrayList<>(),"shortDesc", "LongDesc", "Gracia", "€€", "donotmiss", "high");
        List<Place> expected = List.of(place);
        PlaceRepository placeRepository = Mockito.mock(PlaceRepository.class);
        Mockito.when(placeRepository.findAll()).thenReturn(expected);
        PlaceService placeService = new PlaceServiceImpl(placeRepository);
        PlaceController placeController = new PlaceController(placeService);
        //when - act
        List<Place> result = placeController.getAllPlaces();
        //then - assert
        Assertions.assertTrue(expected.size() == result.size() && expected.containsAll(result) && result.containsAll(expected));
    }

    @Test
    void getPlaceById() {
    }
}