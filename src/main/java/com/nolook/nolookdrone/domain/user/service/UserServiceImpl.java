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
//        if (!(
//                userCreateDto.getUserId().matches(Regex.USER_ID_REGEX.getRegex()) &&
//                userCreateDto.getPhone().matches(Regex.PHONE_REGEX.getRegex()) &&
//                userCreateDto.getUserPassword().matches(Regex.USER_PASSWORD_REGEX.getRegex()) &&
//                userCreateDto.getEmail().matches(Regex.EMAIL_REGEX.getRegex()))) {
//            return false;
//        }
//        return true;
        // 기존 코드는 조건에서 !을 붙어 조건 해석시에 실수 방지 및 코드 리팩토링 진행
        return userCreateDto.matchRegex(userCreateDto.getUserId(), Regex.USER_ID_REGEX.getRegex()) &&
                userCreateDto.matchRegex(userCreateDto.getUserPassword(), Regex.USER_PASSWORD_REGEX.getRegex()) &&
                userCreateDto.matchRegex(userCreateDto.getEmail(), Regex.EMAIL_REGEX.getRegex()) &&
                userCreateDto.matchRegex(userCreateDto.getPhone(), Regex.PHONE_REGEX.getRegex());
    }
}
