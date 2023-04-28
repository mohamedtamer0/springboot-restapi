package com.mohamedtamer.springbootrestapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping("/userget")
    public String helloGet() {
        return "Hello(Get)!";
    }

    @PostMapping("/userpost")
    public String helloPost() {
        return "Hello(Post)!";
    }


    // Path Parameters
    @GetMapping("/users/{id}")
    public String helloPath(@PathVariable("id") String uuid) {
        return "Hello!" + uuid;
    }

}
