
package com.eatingplaces.eatingplaces.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.hasProperty;

class PlaceTest {
    @Test
    void RestaurantHaveId(){
     Place restaurant = new Place();
     assertThat(restaurant,hasProperty("id"));



    }



}