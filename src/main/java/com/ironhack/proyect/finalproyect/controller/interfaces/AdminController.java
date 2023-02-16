package com.ironhack.proyect.finalproyect.controller.interfaces;


import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.User;

import java.util.List;

public interface AdminController {
    List<Admin> findAll();
    Admin findById(Long id);
    AdminDTO store(AdminDTO adminDTO);
}
