package com.valdir.spring_learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

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
}
