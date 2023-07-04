package com.nolook.nolookdrone.domain.user.service;

import com.nolook.nolookdrone.domain.user.dto.UserCreateDto;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    UserService userService;

    @BeforeEach
    void setUp() {

    }

    @DisplayName("유저 인풋 값 유효성 테스트")
    @Test
    void inputValidationTest() {
        UserCreateDto userCreateDto1 = new UserCreateDto(
                "h1", "s1!", "hyunseok", "SeongNam",
                "01012341234", "hyun@naver.com", Integer.valueOf(20), Character.valueOf('M')
        );

        UserCreateDto userCreateDto2 = new UserCreateDto(
                "h1", "s1", "hyunseok", "SeongNam",
                "01012341234", "hyun@naver.com", Integer.valueOf(20), Character.valueOf('M')
        );

        UserCreateDto userCreateDto3 = new UserCreateDto(
                "h1", "s1!", "hyunseok", "SeongNam",
                "0101234", "hyun@naver.com", Integer.valueOf(20), Character.valueOf('M')
        );

        UserCreateDto userCreateDto4 = new UserCreateDto(
                "h1", "s1!", "hyunseok", "SeongNam",
                "01012341234", "hyun.naver.com", Integer.valueOf(20), Character.valueOf('M')
        );

        UserCreateDto userCreateDto5 = new UserCreateDto(
                "h1", "s1!", "hyunseok", "SeongNam",
                "01012341234", "hyun@naver", Integer.valueOf(20), Character.valueOf('M')
        );

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(userService.inputValidation(userCreateDto1)).as("전부 유효한 케이스")
                .isTrue();
        softly.assertThat(userService.inputValidation(userCreateDto2)).as("비밀번호가 틀린 케이스")
                .isFalse();
        softly.assertThat(userService.inputValidation(userCreateDto3)).as("전화번호가 틀린 케이스")
                .isFalse();
        softly.assertThat(userService.inputValidation(userCreateDto4)).as("이메일이 틀린 케이스")
                .isFalse();
        softly.assertThat(userService.inputValidation(userCreateDto5)).as("이메일이 틀린 케이스2")
                .isFalse();
        softly.assertAll();
    }
}