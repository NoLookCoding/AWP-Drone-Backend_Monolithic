package com.nolook.nolookdrone.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserCreateDto {
    private String userId;
    private String userPassword;
    private String userName;
    private String address;
    private String phone;
    private String email;
    private Integer age;
    private Character sex;

    public Boolean matchRegex(String col, String regex) {
        return col.matches(regex);
    }

//    public Boolean idMatchRegex(String regex) {
//        return userId.matches(regex);
//    }
//
//    public Boolean pwdMatchRegex(String regex) {
//        return userPassword.matches(regex);
//    }
//
//    public Boolean phoneMatchRegex(String regex) {
//        return phone.matches(regex);
//    }
//
//    public Boolean emailMatchRegex(String regex) {
//        return email.matches(regex);
//    }
}
