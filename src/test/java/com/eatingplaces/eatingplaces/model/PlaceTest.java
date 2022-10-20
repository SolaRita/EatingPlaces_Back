
package com.eatingplaces.eatingplaces.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.hasProperty;

class PlaceTest {
    @Test
    void PlaceHaveId(){
     Place place = new Place();
     assertThat(place,hasProperty("id"));
     assertThat(place,hasProperty("name"));
     assertThat(place,hasProperty("city"));
     assertThat(place,hasProperty("category"));
     assertThat(place,hasProperty("shortDescription"));
     assertThat(place,hasProperty("longDescription"));
     assertThat(place,hasProperty("district"));
     assertThat(place,hasProperty("price"));
     assertThat(place,hasProperty("doNotMiss"));
     assertThat(place,hasProperty("highlight"));
    }




}