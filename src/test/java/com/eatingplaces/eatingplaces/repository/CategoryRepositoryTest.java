package com.eatingplaces.eatingplaces.repository;
import com.eatingplaces.eatingplaces.model.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.junit.jupiter.api.Assertions.*;



@DataJpaTest
class CategoryRepositoryTest {
    @Autowired
    TestEntityManager entityManager;
    @Autowired
    CategoryRepository categoryRepository;

    @Test
    void findAllCategoiesReturnsAllCategoriesList(){
        var category = new Category();
        entityManager.persist(category);
        entityManager.flush();
        assertEquals(1, categoryRepository.findAll().size());


    }

    /*@Test
    void findAllCategoiesReturnsAllCategoriesList(){
        var category1 = new Category(1L,"asian");
        var category2 = new Category(2L,"mexican");
        categoryRepository.save(category1);
        categoryRepository.save(category2);

        assertEquals(2, categoryRepository.findAll().size());


    }*/


}