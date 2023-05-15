package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.dto.MenuItemUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuItemService {
    List<MenuItemDto> getMenuItems();

    MenuItemDto createMenuItem(MenuItemDto menuItemDto);

    MenuItemDto updateMenuItem(Long id, MenuItemUpdateDto menuItemUpdateDto);

    void deleteMenuItem(Long id);
}