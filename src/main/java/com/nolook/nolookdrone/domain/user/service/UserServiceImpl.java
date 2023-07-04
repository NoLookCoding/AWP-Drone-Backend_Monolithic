package com.nolook.nolookdrone.domain.user.service;

import com.nolook.nolookdrone.domain.user.dto.UserCreateDto;
import com.nolook.nolookdrone.global.common.Regex;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Transactional
    @Override
    public void createUser(UserCreateDto userCreateDto) {

    }

    @Override
    public Boolean inputValidation(UserCreateDto userCreateDto) {
        if (!(userCreateDto.getUserId().matches(Regex.userIdRegex.getRegex()) &&
                userCreateDto.getPhone().matches(Regex.phoneRegex.getRegex()) &&
                userCreateDto.getUserPassword().matches(Regex.passwordRegex.getRegex()) &&
                userCreateDto.getEmail().matches(Regex.emailRegex.getRegex()))) {
            return false;
        }

        return true;
    }
}
