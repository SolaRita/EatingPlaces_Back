package com.eatingplaces.eatingplaces.service;

import com.eatingplaces.eatingplaces.model.Place;
import com.eatingplaces.eatingplaces.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public Place savePlace(Place place) {
       return placeRepository.save(place);
    }

    @Override
    public List<Place> getAllPlaces(){return placeRepository.findAll();}

    @Override
    public Place getPlaceById(Long id) {return placeRepository.findById(id).get();}


}
