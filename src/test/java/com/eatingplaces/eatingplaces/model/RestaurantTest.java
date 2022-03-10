
package com.eatingplaces.eatingplaces.model;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.hasProperty;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    @Test
    void RestaurantHaveId(){
     Restaurant restaurant = new Restaurant();
     assertThat(restaurant,hasProperty("id"));



    }



}