package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.OrderDto;
import com.pnudev.springonlinedelivery.dto.OrderRemoveDto;
import com.pnudev.springonlinedelivery.dto.OrderUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<OrderDto> getOrders();

    OrderDto createOrder(OrderDto orderDto);

    OrderDto updateOrder(Long id, OrderUpdateDto orderUpdateDto);

    void removeOrder(OrderRemoveDto orderRemoveDto);
}
