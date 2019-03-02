package com.example.database;

import com.example.database.entity.Person;
import com.example.database.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

/**
 * Created by Rajesh Singh 3/2/2019
 **/

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonJpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        {
            logger.info("\n Person for id 10001 {}", repository.findById(10001));

            logger.info("\n Inserting 10007 {}", repository.insert(new Person("Tara",
                    "Berlin", new Date())));

            logger.info("\n Update 10006 {}", repository.update(new Person(10006, "Vijay Rajesh",
                    "Berlin", new Date())));

            repository.deleteById(10006);

            logger.info("\n All Users -> {}", repository.findAll());
        }

    }
}
