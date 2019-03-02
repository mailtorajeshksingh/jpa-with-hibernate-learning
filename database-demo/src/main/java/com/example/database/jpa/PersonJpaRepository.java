package com.example.database.jpa;

import com.example.database.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Rajesh Singh 3/2/2019
 **/

@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id){
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person){
       return entityManager.merge(person);
    }

    public Person insert(Person person){
       return entityManager.merge(person);
    }

    public  void deleteById(int id){
        Person person = findById(id);
        entityManager.remove(person);
    }
}
