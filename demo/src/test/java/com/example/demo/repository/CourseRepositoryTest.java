package com.example.demo.repository;

import com.example.demo.entity.Course;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Rajesh Singh 3/3/2019
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void findById() {
        Course course = courseRepository.findById(10001L);
        assertEquals("JPA is 50 steps",course.getName());
    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }
}