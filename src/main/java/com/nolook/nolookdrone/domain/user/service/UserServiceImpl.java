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
        // Regex Enum 활용 코드 리팩토링
        return Regex.USER_ID_REGEX.matchRegex(userCreateDto.getUserId()) &&
                Regex.USER_PASSWORD_REGEX.matchRegex(userCreateDto.getUserPassword()) &&
                Regex.EMAIL_REGEX.matchRegex(userCreateDto.getEmail()) &&
                Regex.PHONE_REGEX.matchRegex(userCreateDto.getPhone());
    }
}
