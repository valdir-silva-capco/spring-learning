package com.valdir.spring_learning.service;

import org.springframework.stereotype.Service;
import com.valdir.spring_learning.Person;

@Service
public class PersonService {
    public Person createPerson(Person person) {
        System.out.println("Creating person: " + person.getName() + ", Age: " + person.getAge());
        return person;
    }
}
 