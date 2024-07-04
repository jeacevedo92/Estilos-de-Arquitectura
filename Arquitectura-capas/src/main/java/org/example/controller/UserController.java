package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public User getUserById(String id) {
        return userService.getUserById(id);
    }

    public void saveUser(User user) {
        userService.saveUser(user);
    }
}