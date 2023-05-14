package com.pnudev.springonlinedelivery.mapper;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.models.MenuItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuItemMapper {
    MenuItem dtoToEntity (MenuItemDto menuItemDto);
    MenuItemDto entityToDto(MenuItem menuItem);
}
