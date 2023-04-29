package com.pnudev.springonlinedelivery.controllers;

import com.pnudev.springonlinedelivery.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/menu-items")
public class MenuItemController {
    @GetMapping
    public List<User> getUsers() {
        return null;
    }
}
