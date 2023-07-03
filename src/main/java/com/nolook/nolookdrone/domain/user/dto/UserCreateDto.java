package com.nolook.nolookdrone.domain.user.dto;

import lombok.Data;

@Data
public class UserCreateDto {
    private String userId;
    private String userPassword;
    private String phone;
    private String email;
}
