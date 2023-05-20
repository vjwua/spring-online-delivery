package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.OrderDto;
import com.pnudev.springonlinedelivery.dto.OrderUpdateDto;
import com.pnudev.springonlinedelivery.mapper.OrderMapper;
import com.pnudev.springonlinedelivery.models.Order;
import com.pnudev.springonlinedelivery.models.Status;
import com.pnudev.springonlinedelivery.repos.OrderRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private static final String ORDER_MESSAGE = "Order with ID %d is not found";

    @Override
    public List<OrderDto> getOrders() {
        List<Order> orders = orderRepository.findAll();

        return orders.stream()
                .map(orderMapper::entityToDto)
                .toList();
    }

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = orderMapper.dtoToEntity(orderDto);
        Order savedOrder = orderRepository.save(order);
        return orderMapper.entityToDto(savedOrder);
    }

    @Override
    public OrderDto updateOrder(Long id, OrderUpdateDto orderUpdateDto) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ORDER_MESSAGE.formatted(id)));
        orderMapper.updateOrderFromDto(orderUpdateDto, order);
        return orderMapper.entityToDto(orderRepository.save(order));
    }

    @Override
    public void cancelOrder(Long id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ORDER_MESSAGE.formatted(id)));
        order.setStatus(Status.DONE);
        orderRepository.save(order);
    }
}
