package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.models.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    public List<Order> getOrders();
}
