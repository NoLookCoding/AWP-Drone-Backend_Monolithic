package com.nolook.nolookdrone.domain.user.controller;

import com.nolook.nolookdrone.domain.user.domain.User;
import com.nolook.nolookdrone.domain.user.dto.UserCreateDto;
import com.nolook.nolookdrone.domain.user.service.UserService;
import com.nolook.nolookdrone.domain.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = new UserServiceImpl();
    }

    @PostMapping("/")
    public ResponseEntity<Object> createUser(@RequestBody UserCreateDto userCreateDto) {
        userService.createUser(userCreateDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/validation")
    public ResponseEntity<Object> inputValidation(@RequestBody UserCreateDto userCreateDto) {
        userService.inputValidation(userCreateDto);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
