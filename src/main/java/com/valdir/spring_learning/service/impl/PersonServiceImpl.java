package com.valdir.spring_learning.service.impl;

import org.springframework.stereotype.Service;
import com.valdir.spring_learning.Person;
import com.valdir.spring_learning.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
    @Override 
    public Person createPerson(Person person) {
        System.out.println("Creating person: " + person.getName());
        return person;
    }
}
