package com.nolook.nolookdrone.domain.user.service;

import com.nolook.nolookdrone.domain.user.dto.UserCreateDto;

public interface UserService {
    void createUser(UserCreateDto userCreateDto);

    Boolean inputValidation(UserCreateDto userCreateDto);
}
