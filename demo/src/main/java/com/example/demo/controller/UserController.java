package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @GetMapping(value = "/user")
    public User getUserInfo() {
        User user = new User();

        user.setUserName("admin");
        user.setPassword("1234");

        return user;
    }
}
