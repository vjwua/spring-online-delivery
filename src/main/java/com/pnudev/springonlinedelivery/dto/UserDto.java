package com.pnudev.springonlinedelivery.dto;

import com.pnudev.springonlinedelivery.models.Role;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private String password;
    private Role role;
}
