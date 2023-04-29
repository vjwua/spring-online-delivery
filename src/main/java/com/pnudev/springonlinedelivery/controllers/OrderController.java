package com.pnudev.springonlinedelivery.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pnudev.springonlinedelivery.models.Order;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/orders")
public class OrderController {
    @GetMapping
    public List<Order> getOrders() {
        return Collections.emptyList();
    }
}
