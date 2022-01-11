package com.demoty.controller;

import com.demoty.model.User;
import com.demoty.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserLoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/logged")
    public User findUserByLogin(String login) {
        return userService.getUser(login);
    }
}
