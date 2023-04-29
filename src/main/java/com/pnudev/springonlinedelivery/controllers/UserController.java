package com.pnudev.springonlinedelivery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pnudev.springonlinedelivery.models.User;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @GetMapping
    public List<User> getUsers() {
        return null;
    }
}
