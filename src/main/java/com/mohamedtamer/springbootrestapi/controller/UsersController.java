package com.mohamedtamer.springbootrestapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping("/userget")
    public String helloGet(){
        return "Hello(Get)!";
    }

    @PostMapping("/userpost")
    public String helloPost(){
        return "Hello(Post)!";
    }

}
