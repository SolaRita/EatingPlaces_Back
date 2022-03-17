package com.eatingplaces.eatingplaces.repository;
import com.eatingplaces.eatingplaces.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
}
