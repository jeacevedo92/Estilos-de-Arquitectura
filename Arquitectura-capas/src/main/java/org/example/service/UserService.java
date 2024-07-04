package org.example.service;

import org.example.model.User;
import org.example.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public User getUserById(String id) {
        return userRepository.getUserById(id);
    }

    public void saveUser(User user) {
        userRepository.saveUser(user);
    }
}