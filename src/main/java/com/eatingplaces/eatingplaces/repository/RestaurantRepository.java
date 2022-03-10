package com.eatingplaces.eatingplaces.repository;

import com.eatingplaces.eatingplaces.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantRepository extends JpaRepository <Restaurant, Long> {
}
