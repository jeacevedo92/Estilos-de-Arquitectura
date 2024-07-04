package org.example;

import org.example.controller.UserController;
import org.example.model.User;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        // Create a new user
        User newUser = new User("1", "John Doe", "john.doe@example.com");
        userController.saveUser(newUser);

        // Retrieve the user
        User retrievedUser = userController.getUserById("1");
        System.out.println("Retrieved User: " + retrievedUser.getName() + ", " + retrievedUser.getEmail());
    }
}
