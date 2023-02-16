package com.ironhack.proyect.finalproyect.service.interfaces;


import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.User;

import java.util.List;

public interface AdminService {
    Admin getAdminById(Long id);
    List<Admin> getAdmins();
    AdminDTO saveAdmin(AdminDTO adminDTO);
    void deleteAdmin(Long admin);
}
