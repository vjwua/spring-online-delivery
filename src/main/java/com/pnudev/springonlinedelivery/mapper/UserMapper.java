package com.pnudev.springonlinedelivery.mapper;

import com.pnudev.springonlinedelivery.dto.UserDto;
import com.pnudev.springonlinedelivery.models.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User dtoToEntity (UserDto userDto);
    UserDto entityToDto(User user);
}
