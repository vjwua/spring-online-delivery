package com.pnudev.springonlinedelivery.dto;

import com.pnudev.springonlinedelivery.models.Order;
import lombok.Data;

@Data
public class MenuItemDto {
    private long id;
    private String name;
    private String summary;
    private double size;
    private double price;
    private Order order;
}
