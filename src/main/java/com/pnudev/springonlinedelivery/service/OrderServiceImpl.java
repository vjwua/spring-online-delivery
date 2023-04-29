package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.models.Order;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public List<Order> getOrders() {
        return Collections.emptyList();
    }
    // TODO Add implementation of the list of orders
}
