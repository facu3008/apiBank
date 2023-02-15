package com.ironhack.proyect.finalproyect.controller.interfaces;

import com.ironhack.proyect.finalproyect.model.users.User;

import java.util.List;

public interface UserController {
    List<User> getUsers();
    void saveUser(User user);
}
