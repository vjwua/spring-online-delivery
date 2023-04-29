package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.models.User;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUsers() {
        return Collections.emptyList();
    }
    // TODO Add implementation of the list of users
}
