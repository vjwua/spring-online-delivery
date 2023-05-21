package com.pnudev.springonlinedelivery.controllers;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.dto.MenuItemUpdateDto;
import com.pnudev.springonlinedelivery.service.MenuItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/menu-items")
public class MenuItemController {

    private final MenuItemService menuItemService;

    @Operation(summary = "Get all menu items")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found menu items",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = MenuItemDto.class))}),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    @GetMapping
    public List<MenuItemDto> getMenuItems() {
        return menuItemService.getMenuItems();
    }

    @Operation(summary = "Add menu item to database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Menu item is added"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createMenuItem(@Valid @RequestBody MenuItemDto menuItemDto) {
        menuItemService.createMenuItem(menuItemDto);
    }

    @Operation(summary = "Update menu item")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found and updated menu item",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = MenuItemDto.class))}),
            @ApiResponse(responseCode = "404", description = "Menu item is not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MenuItemDto updateMenuItem(@PathVariable Long id, @RequestBody MenuItemUpdateDto menuItemUpdateDto){
        return menuItemService.updateMenuItem(id, menuItemUpdateDto);
    }

    @Operation(summary = "Delete menu item from database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Menu item is deleted"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMenuItem(@PathVariable Long id) {
        menuItemService.deleteMenuItem(id);
    }
}