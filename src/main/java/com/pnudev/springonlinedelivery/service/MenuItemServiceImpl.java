package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.dto.MenuItemUpdateDto;
import com.pnudev.springonlinedelivery.mapper.MenuItemMapper;
import com.pnudev.springonlinedelivery.models.MenuItem;
import com.pnudev.springonlinedelivery.repos.MenuItemRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository menuItemRepository;
    private final MenuItemMapper menuItemMapper;
    private static final String MENU_ITEM_MESSAGE = "Menu item with ID %d is not found";

    @Override
    public List<MenuItemDto> getMenuItems() {
        List<MenuItem> menuItems = menuItemRepository.findAll();

        return menuItems.stream()
                .map(menuItemMapper::entityToDto)
                .toList();
    }

    @Override
    public MenuItemDto postMenuItem(MenuItemDto menuItemDto) {
        MenuItem menuItem = menuItemMapper.dtoToEntity(menuItemDto);
        MenuItem savedMenuItem = menuItemRepository.save(menuItem);
        return menuItemMapper.entityToDto(savedMenuItem);
    }

    @Override
    public MenuItemDto putMenuItem(Long id, MenuItemUpdateDto menuItemUpdateDto) {
        MenuItem menuItem = menuItemRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format(MENU_ITEM_MESSAGE, id)));
        menuItemMapper.updateMenuItemFromDto(menuItemUpdateDto, menuItem);
        return menuItemMapper.entityToDto(menuItemRepository.save(menuItem));
    }

    @Override
    public void cancelMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }

    // TODO Add implementation of the list of dishes
}
