package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.mapper.MenuItemMapper;
import com.pnudev.springonlinedelivery.models.MenuItem;
import com.pnudev.springonlinedelivery.repos.MenuItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository menuItemRepository;
    private final MenuItemMapper menuItemMapper;

    @Override
    public List<MenuItemDto> getMenuItems() {
        List<MenuItem> menuItems = menuItemRepository.findAll();

        return menuItems.stream()
                .map(menuItemMapper::entityToDto)
                .toList();
    }

    @Override
    public void postMenuItem(MenuItem menuItem) {
        // TODO TBW
    }

    @Override
    public void putMenuItem(MenuItem menuItem) {
        // TODO TBW
    }

    @Override
    public void cancelMenuItem(MenuItem menuItem) {
        // TODO TBW
    }

    // TODO Add implementation of the list of dishes
}
