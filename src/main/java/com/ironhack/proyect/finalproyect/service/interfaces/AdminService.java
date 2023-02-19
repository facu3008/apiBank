package com.ironhack.proyect.finalproyect.service.interfaces;


import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.controller.dto.CheckingDTO;
import com.ironhack.proyect.finalproyect.controller.dto.SavingsDTO;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.Role;
import com.ironhack.proyect.finalproyect.model.users.User;

import java.util.List;

public interface AdminService {
//    Admin getAdminById(Long id);
//    List<Admin> getAdmins();
    AdminDTO save(AdminDTO adminDTO);
//    SavingsDTO save(SavingsDTO savingsDTO);
//    CheckingDTO save(CheckingDTO checkingDTO);

//    void deleteAdmin(Long admin);


    /*Si voy a modificar y crear cuentas creo que aca debo de poner los DTO de las cuentas

    tambien tengo que actualizar los saldos y verlos... tiene que or aca y crear una variable de balances
     */
}
