package com.mohamedtamer.springbootrestapi.controller;


import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/usersPath/{id}")
    public String helloPath(@PathVariable("id") String uuid) {
        return "Hello!" + uuid;
    }

    // Query Parameters
    @GetMapping("/usersQuery/{id}")
    public String helloQuery(@PathVariable("id") String uuid,
                             @RequestParam String name,
                             @RequestParam(required = false, defaultValue = "", name = "email") String userEmail) {
        return "Hello!" + name + "__" + userEmail;
    }

}
