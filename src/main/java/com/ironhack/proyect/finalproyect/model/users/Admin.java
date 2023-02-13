package com.ironhack.proyect.finalproyect.model.users;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Admin extends User {
    public Admin() {
    }

    public Admin(String name, String password) {
        super(name, password);
    }
}
