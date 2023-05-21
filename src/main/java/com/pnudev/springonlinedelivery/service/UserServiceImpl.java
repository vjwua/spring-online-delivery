package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.dto.UserDto;
import com.pnudev.springonlinedelivery.dto.UserUpdateDto;
import com.pnudev.springonlinedelivery.mapper.UserMapper;
import com.pnudev.springonlinedelivery.models.User;
import com.pnudev.springonlinedelivery.repos.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    private static final String USER_MESSAGE = "User with ID %d is not found";
    @Override
    public List<UserDto> getUsers() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(userMapper::entityToDto)
                .toList();
    }

    @Override
    public UserDto updateUser(Long id, UserUpdateDto userUpdateDto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(USER_MESSAGE.formatted(id)));
        userMapper.updateUserFromDto(userUpdateDto, user);
        return userMapper.entityToDto(userRepository.save(user));
    }
}
