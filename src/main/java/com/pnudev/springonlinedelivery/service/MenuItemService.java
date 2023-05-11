package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.models.MenuItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuItemService {
    List<MenuItemDto> getMenuItems();

    void postMenuItem(MenuItem menuItem);

    void putMenuItem(MenuItem menuItem);

    void cancelMenuItem(MenuItem menuItem);
}