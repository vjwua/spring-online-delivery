package com.pnudev.springonlinedelivery.controllers;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.dto.MenuItemUpdateDto;
import com.pnudev.springonlinedelivery.service.MenuItemService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MenuItemUpdateDto postMenuItem(@Valid @RequestBody MenuItemDto menuItemDto) {
        return menuItemService.postMenuItem(menuItemDto);
    }

    @PutMapping(path = "/{id}")
    public MenuItemUpdateDto putMenuItem(@PathVariable Integer id, @RequestBody MenuItemUpdateDto menuItemUpdateDto){
        return menuItemService.putMenuItem(id, menuItemUpdateDto);
    }

    @DeleteMapping(path = "/cancel")
    public void cancelMenuItem(@PathVariable Integer id) {
        menuItemService.cancelMenuItem(id);
    }
}
