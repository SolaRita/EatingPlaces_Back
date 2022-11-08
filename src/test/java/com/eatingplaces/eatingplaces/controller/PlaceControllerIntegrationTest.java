/*
package com.eatingplaces.eatingplaces.controller;

import com.eatingplaces.eatingplaces.EatingplacesApplication;
import com.eatingplaces.eatingplaces.model.City;
import com.eatingplaces.eatingplaces.model.Place;
import com.eatingplaces.eatingplaces.repository.PlaceRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.ArrayList;

import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {EatingplacesApplication.class })
@WebAppConfiguration(value="src/main/test/com/eatingplaces/eatingplaces")


class PlaceControllerIntegrationTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private PlaceRepository placeRepository;

    private MockMvc mockMvc;
    @BeforeEach
    public void setup() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void givenWac_whenServletContext_thenItProvidesGreetController() {
        ServletContext servletContext = webApplicationContext.getServletContext();

        Assertions.assertNotNull(servletContext);
        Assertions.assertTrue(servletContext instanceof MockServletContext);
        Assertions.assertNotNull(webApplicationContext.getBean("PlaceController"));
    }

    @Test
    void add() {
    }

    @Test
    void getAllPlaces() {
    }

    @Test
    void getPlaceById() {
        //giving
        Long id = 1L;
        Place place = new Place(id,"Moli", new City(),new ArrayList<>(),"shortDesc", "LongDesc", "Gracia", "€€", "donotmiss", "high");
        given(placeRepository.getById(id)).willReturn(place);
        //when
        //mvc.perform(getPlaceById("/places/1"););
        //then
        //assertThat(place,hasProperty(id=Integer.valueOf(1)));
    }
}*/
