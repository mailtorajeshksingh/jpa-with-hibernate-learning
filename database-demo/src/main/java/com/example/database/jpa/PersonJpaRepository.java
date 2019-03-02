package com.example.database.jpa;

import com.example.database.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

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

    public List<Person> findAll(){
       TypedQuery<Person> namedQuary =  entityManager.createNamedQuery("find_all_person", Person.class);
       return namedQuary.getResultList();
    }
}
