package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.UserDto;
import com.pnudev.springonlinedelivery.dto.UserUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDto> getUsers();

    UserDto updateUser(Long id, UserUpdateDto userUpdateDto);
}
