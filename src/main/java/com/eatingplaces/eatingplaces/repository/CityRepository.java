package com.eatingplaces.eatingplaces.repository;

import com.eatingplaces.eatingplaces.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface CityRepository extends JpaRepository <City, Long> {

}
