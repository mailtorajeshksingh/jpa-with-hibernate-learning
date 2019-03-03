package com.example.demo.repository;

import com.example.demo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * Created by Rajesh Singh 3/3/2019
 **/
@Repository
@Transactional
public class CourseRepository {
    @Autowired
    EntityManager entityManager;

    public Course findById(Long id){
        return entityManager.find(Course.class, id);
    }

    // Insert and Update a course
    public Course save(Course course){
        return  null;
    }

    public void delete(Long id){

    }
}
