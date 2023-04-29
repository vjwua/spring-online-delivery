package com.pnudev.springonlinedelivery.controllers;

import com.pnudev.springonlinedelivery.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pnudev.springonlinedelivery.models.User;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/users")
public class UserController {

    private UserService userService;
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
