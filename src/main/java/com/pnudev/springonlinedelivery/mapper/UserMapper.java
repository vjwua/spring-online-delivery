package com.pnudev.springonlinedelivery.mapper;

import com.pnudev.springonlinedelivery.dto.UserDto;
import com.pnudev.springonlinedelivery.dto.UserUpdateDto;
import com.pnudev.springonlinedelivery.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User dtoToEntity (UserDto userDto);
    UserDto entityToDto(User user);

    void updateUserFromDto(UserUpdateDto updateUserGetDTO, @MappingTarget User user);
}
