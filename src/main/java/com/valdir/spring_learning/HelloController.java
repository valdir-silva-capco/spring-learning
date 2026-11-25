package com.valdir.spring_learning;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController 
public class HelloController {
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

    @GetMapping ("/people")
    public List<Person> getPeople() {
        return List.of(
            new Person("Alice", 25),
            new Person("Bob", 28),
            new Person("Charlie", 32)
        );
    }
}
