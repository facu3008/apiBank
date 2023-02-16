package com.ironhack.proyect.finalproyect.controller.dto;

import com.ironhack.proyect.finalproyect.model.users.Role;

import java.util.List;

public class AdminDTO {
    private Long id;
    private String name;
    private String password;

    public AdminDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
