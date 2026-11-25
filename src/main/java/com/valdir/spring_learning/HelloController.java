package com.valdir.spring_learning;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.valdir.spring_learning.service.PersonService;

@RestController 
public class HelloController {

    private final PersonService personService;

    public HelloController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping ("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping ("/hello/{name}")
    public String helloByName(
        @PathVariable String name
    ) {
        return "Hello " + name + "!";
    }

    @GetMapping ("/users/{id}")
    public String getUser(
        @PathVariable Long id
    ) {
        return "User ID: " + id;
    }

    @GetMapping ("/search")
    public String searchUser(
        @RequestParam String name,
        @RequestParam(required = false) Integer age
    ) {
        if (age == null) {
            return "Searching user: " + name;
        }

        return "Searching user: " + name + ", Age: " + age;
    }

    @GetMapping ("/person") 
    public Person getPerson() {
        return new Person("John", 30);
    }

    @PostMapping ("/person")
    public Person createPerson(
        @RequestBody Person person
    ) {
        return personService.createPerson(person);
    }

    @GetMapping ("/people")
    public List<Person> getPeople() {
        return List.of(
            new Person("Alice", 25),
            new Person("Bob", 28),
            new Person("Charlie", 32)
        );
    }
}
