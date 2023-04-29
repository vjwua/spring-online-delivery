package com.pnudev.springonlinedelivery.service;

import com.pnudev.springonlinedelivery.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getUsers();
}
