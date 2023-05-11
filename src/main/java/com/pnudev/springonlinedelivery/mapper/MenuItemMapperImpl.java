package com.pnudev.springonlinedelivery.mapper;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.models.MenuItem;

public class MenuItemMapperImpl implements MenuItemMapper {
    @Override
    public MenuItem dtoToEntity(MenuItemDto menuItemDto) {
        if (menuItemDto == null) {
            return null;
        }
        MenuItem menuItem = new MenuItem();
        menuItem.setId(menuItemDto.getId());
        menuItem.setName(menuItemDto.getName());
        menuItem.setSummary(menuItemDto.getSummary());
        menuItem.setSize(menuItemDto.getSize());
        menuItem.setPrice(menuItemDto.getPrice());
        menuItem.setOrder(menuItemDto.getOrder());
        return menuItem;
    }

    @Override
    public MenuItemDto entityToDto(MenuItem menuItem) {
        if (menuItem == null ) {
            return null;
        }
        MenuItemDto menuItemDto = new MenuItemDto();
        menuItemDto.setId(menuItem.getId());
        menuItemDto.setName(menuItem.getName());
        menuItemDto.setSummary(menuItem.getSummary());
        menuItemDto.setSize(menuItem.getSize());
        menuItemDto.setPrice(menuItem.getPrice());
        menuItemDto.setOrder(menuItem.getOrder());
        return menuItemDto;
    }
}
