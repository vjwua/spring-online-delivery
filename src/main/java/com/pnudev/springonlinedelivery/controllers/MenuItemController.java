package com.pnudev.springonlinedelivery.controllers;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.repos.MenuItemRepository;
import com.pnudev.springonlinedelivery.service.MenuItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/menu-items")
public class MenuItemController {

    private final MenuItemService menuItemService;

    @GetMapping
    public List<MenuItemDto> getMenuItems() {
        return menuItemService.getMenuItems();
    }

    private MenuItemRepository menuItemRepository;
}
