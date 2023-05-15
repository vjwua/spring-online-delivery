package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.dto.MenuItemUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuItemService {
    List<MenuItemDto> getMenuItems();

    MenuItemUpdateDto postMenuItem(MenuItemDto menuItemDto);

    MenuItemUpdateDto putMenuItem(Integer id, MenuItemUpdateDto menuItemUpdateDto);

    void cancelMenuItem(Integer id);
}