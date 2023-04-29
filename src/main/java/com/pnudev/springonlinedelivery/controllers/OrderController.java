package com.pnudev.springonlinedelivery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pnudev.springonlinedelivery.models.Order;

import java.util.List;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
    @GetMapping
    public List<Order> getOrders() {
        return null;
    }
}
