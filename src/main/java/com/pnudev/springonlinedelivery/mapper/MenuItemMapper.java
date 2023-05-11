package com.pnudev.springonlinedelivery.mapper;

import com.pnudev.springonlinedelivery.dto.MenuItemDto;
import com.pnudev.springonlinedelivery.models.MenuItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface MenuItemMapper {

    MenuItemMapper INSTANCE = Mappers.getMapper(MenuItemMapper.class);

    @Mapping(source = "menuItemDto.id", target = "id")
    MenuItem dtoToEntity(MenuItemDto menuItemDto);

    @Mapping(source = "menuItem.id", target = "id")
    MenuItemDto entityToDto(MenuItem menuItem);
}