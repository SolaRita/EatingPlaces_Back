package com.eatingplaces.eatingplaces.service;
import com.eatingplaces.eatingplaces.model.Category;
import com.eatingplaces.eatingplaces.model.Place;
import java.util.List;


public interface PlaceService {
    public Place savePlace(Place place);
    public List<Place> getAllPlaces();
    public Place getPlaceById (Long id);
    public List<Place> getAllPlacesByCategory(Category category);
}
