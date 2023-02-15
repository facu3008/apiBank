package com.ironhack.proyect.finalproyect.controller.impl;


import com.ironhack.proyect.finalproyect.controller.interfaces.UserController;
import com.ironhack.proyect.finalproyect.model.users.User;
import com.ironhack.proyect.finalproyect.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
