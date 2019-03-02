package com.example.database;

import com.example.database.entity.Person;
import com.example.database.jdbc.PersonJdbcDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

import java.util.Date;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao personJdbcDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("\n All Person Data {}", personJdbcDao.findAll());

        logger.info("\nFind a person {} ",personJdbcDao.findById(10001));

        logger.info("\nDelete person id 10002 {} ", personJdbcDao.deleteById(10002));

        logger.info(" \n All Person Data {}", personJdbcDao.findAll());

        logger.info("\n Inserting 10007 {}", personJdbcDao.insert(new Person(10007, "Tara",
                "Berlin", new Date())));

        logger.info("\n Update 10006 {}", personJdbcDao.update(new Person(10006, "Vijay Rajesh",
                "Berlin", new Date())));
    }
}
