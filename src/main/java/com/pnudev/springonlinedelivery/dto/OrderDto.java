package com.pnudev.springonlinedelivery.dto;

import com.pnudev.springonlinedelivery.models.MenuItem;
import com.pnudev.springonlinedelivery.models.Status;
import com.pnudev.springonlinedelivery.models.User;
import lombok.Data;

@Data
public class OrderDto {
    private long id;
    private double price;
    private Status status;
    private User user;
    private MenuItem menuItem;
}
