package com.demoty.controller;

import com.demoty.model.User;
import com.demoty.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/add-user")
    public User addNewUser(User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/delete-user")
    public void deleteUser(Integer id) {
        userService.deleteUser(id);
    }
}
