package com.pnudev.springonlinedelivery.dto;

import com.pnudev.springonlinedelivery.models.Role;
import lombok.Data;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private Role role;
}
