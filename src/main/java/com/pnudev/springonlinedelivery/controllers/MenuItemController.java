package com.pnudev.springonlinedelivery.controllers;

import com.pnudev.springonlinedelivery.models.MenuItem;
import com.pnudev.springonlinedelivery.service.MenuItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/menu-items")
public class MenuItemController {

    private MenuItemService menuItemService;
    @GetMapping
    public List<MenuItem> getMenuItems() {
        return menuItemService.getMenuItems();
    }
}
