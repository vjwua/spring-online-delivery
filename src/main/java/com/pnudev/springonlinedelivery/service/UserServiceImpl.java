package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.UserDto;
import com.pnudev.springonlinedelivery.mapper.UserMapper;
import com.pnudev.springonlinedelivery.models.User;
import com.pnudev.springonlinedelivery.repos.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public List<UserDto> getUsers() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(userMapper::entityToDto)
                .toList();
    }
}
